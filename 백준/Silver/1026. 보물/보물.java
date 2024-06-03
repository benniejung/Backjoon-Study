import com.sun.security.jgss.GSSUtil;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;


public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();

    public void run() throws Exception {
        int n;
        n = Integer.parseInt(br.readLine());
        int[] a= new int[n];
        Integer b[] = new Integer[n];
        st = new StringTokenizer(br.readLine());
        for(int i =0; i<n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int j = 0; j<n; j++) {
            b[j] = Integer.parseInt(st.nextToken());
        }
        //A 올림, B 내림
        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());

        int sum = 0;
        for(int k = 0; k<n; k++) {
            sum+= (a[k] * b[k]);
        }
        System.out.println(sum);

    }

    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}