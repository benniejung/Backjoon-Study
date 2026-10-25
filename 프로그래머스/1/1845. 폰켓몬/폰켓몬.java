import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        // 1. HashSet을 생성하여 중복을 제거하며 포켓몬 종류 모으기
        Set<Integer> hs = new HashSet<>();
        for (int num : nums) {
            hs.add(num); // push 대신 add 사용
        }
        int length = hs.size();
        
        // 2. 뽑을 수 있는 포켓몬 수를 availableCount에 저장한다.
        int availableCount = nums.length / 2;
        
        // 3. availableCount와 hs.length 수와 비교해서 최종값을 도출한다.
        if (availableCount == length || availableCount > length) {
            return length;
        } else {
            return availableCount;
        }
        
    
    }
}