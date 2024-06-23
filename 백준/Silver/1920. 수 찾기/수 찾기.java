import com.sun.security.jgss.GSSUtil;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();

    public static int[] arr;
    public void run() throws Exception {
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        // 배열 arr에 숫자 저장하기
        st = new StringTokenizer(br.readLine(), " ");
        for(int i =0; i<N; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
        }
        // 배열을 정렬해준다 <= 이분 탐색을 위해
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        for(int i =0; i<M; i++) {
            // 찾으려는 key값이 배열에 있는 경우
            if(binarySearch(Integer.parseInt(st.nextToken())) >= 0) {
                sb.append(1).append("\n");
            }
            // 찾으려는 key값이 배열에 없는 경우
            else {
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);

    }
    public static int binarySearch(int key) {
        int first = 0;
        int end = arr.length -1;

        // first가 end보다 커지기 전까지 반복한다
        while(first <= end) {
            // 찾으려는 key값이 중간값보다 작은 경우
            int mid = (first + end) / 2;
            if(key < arr[mid]) {
                end = mid-1;
            }
            // key 값이 중간값보다 큰 경우
            else if(key > arr[mid]) {
                first = mid+1;
            }
            // 중간값이 key값일 때
            else {
                return mid;
            }
        }
        // 찾고자하는 key값이 배열에 없는 경우
        return -1;
    }
    public static void main(String[] args) throws Exception {
        new Main().run();
    }
}
