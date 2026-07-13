class Solution {
    public String solution(String code) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int mode = 0;
        
        for(int i =0; i<code.length(); i++) {
            char current = code.charAt(i);
            
            if(current == '1') {
                mode = (mode == 0) ? 1 : 0;
                continue;
            }
            
            if(mode == 0 && i%2==0) sb.append(current);
            if(mode == 1 && i%2 == 1) sb.append(current);
        }
        
        answer = sb.toString();
        return answer == "" ? "EMPTY" : answer;
    }
}