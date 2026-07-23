import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int sum1 = a + b + c;
        int sum2 = a*a + b*b + c*c;
        int sum3 = a*a*a + b*b*b + c*c*c;
        
        // 다 다른지 판별 -> 0,1,2로 분리 -> 값 구하기
        Set<Integer> set = new HashSet<>();
        set.add(a);
        set.add(b);
        set.add(c);
        int count = set.size();
        
        if(count == 1) {
            // 모두 같은 경우
            answer += sum1 * sum2 * sum3;
        } else if(count == 2) {
            // 두 숫자만 같은 경우
            answer += sum1 * sum2;
        } else if(count == 3) {
            // 모두 다른 경우
            answer += sum1;
        } 
            
            
            
        return answer;
    }
}