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
        for(int i =1; i<=n; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int k = n-1; k>0; k--) {
            for(int j = 1; j<=k; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}