import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        Set<String> set = new HashSet<>(Arrays.asList(phone_book));
        
        for (String number : phone_book) {
            // 해당 번호의 접두어들을 하나씩 잘라가며 set에 존재하는지 확인
            for (int i = 1; i < number.length(); i++) {
                if (set.contains(number.substring(0, i))) {
                    return false; // 접두어가 존재함
                }
            }
        }
        
        return true;
    }
}