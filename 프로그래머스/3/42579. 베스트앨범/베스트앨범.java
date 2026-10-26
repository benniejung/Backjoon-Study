import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        ArrayList<Integer> answer = new ArrayList<>();

        HashMap<String, Integer> num = new HashMap<>(); // 장르별 총 재생 횟수
        HashMap<String, HashMap<Integer, Integer>> music = new HashMap<>(); // 장르별 (노래 인덱스 -> 재생 횟수)

        for (int i = 0; i < plays.length; i++) {
            if (!num.containsKey(genres[i])) {
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(i, plays[i]);
                music.put(genres[i], map);
                num.put(genres[i], plays[i]);
            } else {
                music.get(genres[i]).put(i, plays[i]);
                num.put(genres[i], num.get(genres[i]) + plays[i]);
            }
        }

        List<String> keySet = new ArrayList<>(num.keySet());
        // 1순위: 장르별 총 재생 횟수 내림차순 정렬
        Collections.sort(keySet, (s1, s2) -> num.get(s2) - num.get(s1));

        for (String key : keySet) {
            HashMap<Integer, Integer> map = music.get(key);
            List<Integer> genre_key = new ArrayList<>(map.keySet());

            // 2순위 & 3순위 정렬조건 수정
            Collections.sort(genre_key, (s1, s2) -> {
                if (map.get(s1).equals(map.get(s2))) {
                    return s1 - s2; // 재생 횟수가 같으면 고유 번호(인덱스) 오름차순
                }
                return map.get(s2) - map.get(s1); // 재생 횟수 내림차순
            });

            answer.add(genre_key.get(0));
            if (genre_key.size() > 1) {
                answer.add(genre_key.get(1));
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}