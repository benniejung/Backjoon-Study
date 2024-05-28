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
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        st = new StringTokenizer(br.readLine(), " ");
        for(int i =0; i<5; i++) {
            int a = Integer.parseInt(st.nextToken());
            if(a == n) count++;
        }
        System.out.println(count);
        
    }

    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}