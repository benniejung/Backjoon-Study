class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ab = Integer.toString(a) + Integer.toString(b);
        String ba = Integer.toString(b) + Integer.toString(a);
        
        int intAB = Integer.parseInt(ab);
        int intBA = Integer.parseInt(ba);
        
        if(intAB > intBA) return intAB;
        
        return intBA;
    }
}