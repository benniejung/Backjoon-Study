class Solution {
    public int[] solution(int[] arr, int[][] queries) {
    
        // queries 열의 수만큼 반복해서 swap 형식으로 arr 값을 뒤바꾼다
        for(int i =0; i<queries.length; i++) {
            int arr_value = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = arr_value;
        }
        
        return arr;
    }
}