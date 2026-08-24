import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList();
        
        for(int i = l; i<=r; i++) {
            if(isZeroFive(i)) {
                list.add(i);
            }
        }
        
        if(list.isEmpty()) {
            list.add(-1);
        }
        // List<Integer> -> int[] 변환
        return list.stream().mapToInt(x -> x).toArray();
    }
    
    private boolean isZeroFive(int num) {
        while(num > 0) {
            int digit = num % 10;
            if(digit != 0 && digit != 5) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}