import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int length = num_list.length;
        
        int last = num_list[length -1];
        int last_before = num_list[length - 2];
        // 마지막 원소값과 그 전 원소값을 비교해서 추가할 값을 구한다
        int addNum = last > last_before ? last - last_before : last * 2;
        
        // answer은 고정배열이므로 Arrays.copyOf로 배열을 복사한다
        answer = Arrays.copyOf(num_list, length +1);
        answer[length] = addNum;
        
        
        return answer;
    }
}