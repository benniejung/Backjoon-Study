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
        int sum = 0, max = 0;
        for(int i =0; i<m; i++) {
            sum+=arr[i];
        }
        max = sum; // m까지 더한 거 우선 max에 저장하기

        for(int i = m; i<n; i++) {
            // 지금까지 더한 합계에서 가장 왼쪽 배열 뺴기
            sum = sum - arr[i-m] + arr[i];
            max = Math.max(max,sum);
        }

        System.out.println(max);

    }


    public static void main(String[] args) throws Exception {
        new Main().run();
    }
}
