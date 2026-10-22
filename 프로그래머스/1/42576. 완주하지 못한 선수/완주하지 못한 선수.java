import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        
        // 1. 참가자 명단을 순회하며 이름을 키(Key)로, 등장 횟수를 값(Value)으로 저장
        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
        
        // 2. 완주자 명단을 순회하며 등장 횟수를 1씩 차감
        for (String player : completion) {
            map.put(player, map.getOrDefault(player, 0) - 1);
        }
        
        // 3. 값이 0이 아닌(1 이상 남아있는) 선수가 완주하지 못한 선수임
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                return key;
            }
        }
        
        return "";
    }
}