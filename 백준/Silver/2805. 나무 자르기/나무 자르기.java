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
        int min = 0;
        int max = 0;
        st = new StringTokenizer(br.readLine(), " ");
        for(int i =0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

            if(max < arr[i]) max = arr[i];
        }

        while(min <= max) {
            int mid = (min + max)/2;
            long sum = 0;
            for(int treeHeight : arr) {
                if(treeHeight > mid) {
                    sum+=(treeHeight-mid);
                }
            }

            if(sum >= m) {
                min = mid+1;
            } else {
                max = mid -1;
            }
        }
        System.out.println(max);

    }


    public static void main(String[] args) throws Exception {
        new Main().run();
    }
}
