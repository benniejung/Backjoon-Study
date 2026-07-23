class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int n = included.length;
        int[] arr = new int[n];
        
        arr[0] = a;
        // 등차수열 배열 만들기
        for(int i =1; i<n; i++) {
            arr[i] = arr[i-1] + d;
        }
        // 등차수열 배열과 included 비교해서 true값만 answer에 더하기
        for(int i = 0; i< n; i++) {
            if(included[i]) {
                answer += arr[i];
            };
        }
        
        return answer;
    }
}