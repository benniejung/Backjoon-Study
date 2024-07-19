import com.sun.security.jgss.GSSUtil;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();

    public void run() throws Exception {
        st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i =0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int left = 0, right = 0; // 왼쪽 포인터, 오른쪽 포인터
        int sum = 0, count = 0;
        while(true) {
            if(sum < m) {
                if(right == n) break;
                sum+=arr[right++];
            }
            else if(sum > m) {
                sum-=arr[left++];
            }
            // 만약에 sum이 m일때
            if(sum == m) {
                count++;
                sum-=arr[left++];
            }
        }
        System.out.println(count);
    }


    public static void main(String[] args) throws Exception {
        new Main().run();
    }
}
