import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int idx = 0;
        
        // queries 배열에서 마지막 값을 꺼내와서 그 값보다 큰 값을 arr 배열에서 찾는다
        for(int[] query: queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];
            
            int result = Arrays.stream(arr, s, e+1)
                .filter(x -> x > k)
                .min()
                .orElse(-1);
            
            answer[idx++] = result;
            
        }
        return answer;
    }
}