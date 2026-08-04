import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        // 모든 원소의 곱
        int result1 = Arrays.stream(num_list).reduce(1, (a,b) -> a*b);
    
        // 합의 제곱
        int result2 = Arrays.stream(num_list).sum();
        result2*=result2;
        // 비교
        answer = result1 < result2 ? 1 : 0;
        return answer;
    }
}