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
        int[] arr = new int[2];

        for(int i =0; i<2; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i] = 0;
            while(st.hasMoreTokens()) {
                arr[i]+=Integer.parseInt(st.nextToken());
            }
        }
        if(arr[0] == arr[1]) System.out.println(arr[0]);
        else {
            int big = Math.max(arr[0], arr[1]);
            System.out.println(big);
        }
    }


    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}