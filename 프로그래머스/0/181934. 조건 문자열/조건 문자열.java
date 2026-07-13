class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        boolean result = false;
        String operator = ineq + eq;
        
        switch(operator) {
            case "<=":
                result = (n <= m);
                break;
            case ">=":
                result = n >= m;
                break;
            case ">!":
                result = n > m;
                break;
            case "<!":
                result = n < m;
                break;
        }
        
        return result ? 1 : 0;
    }
}