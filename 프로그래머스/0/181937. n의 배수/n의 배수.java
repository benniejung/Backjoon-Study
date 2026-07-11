class Solution {
    public int solution(int num, int n) {
        int remain = num%n;
        return remain == 0 ? 1 : 0;
    }
}