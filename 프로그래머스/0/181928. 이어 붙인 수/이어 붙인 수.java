import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        String odd ="";
        String even = "";
        // 배열에서 홀수와 짝수를 구분해서 각 변수에 담는다.
        odd = Arrays.stream(num_list).filter(x-> x%2 == 1).mapToObj(String::valueOf).reduce("", (a,b)-> a+b);
        even = Arrays.stream(num_list).filter(x-> x%2 == 0).mapToObj(String::valueOf).reduce("", (a,b)-> a+b);;
        
        // 두 변수를 정수형으로 변환 후 더한다.
        answer = Integer.parseInt(odd) + Integer.parseInt(even);
        return answer;
    }
}