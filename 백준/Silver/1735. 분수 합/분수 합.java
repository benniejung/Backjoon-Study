import com.sun.security.jgss.GSSUtil;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;


public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();

    public int GCD(int a, int b) {
        if(a%b ==0) {
            return b;
        }
        return GCD(b, a%b);
    }

    public void run() throws Exception {
        st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        int numerator = (A*D) + (B*C);
        int denominator = B * D;

        int gcd = GCD(numerator, denominator);
        numerator /= gcd;
        denominator/=gcd;

        System.out.println(numerator + " " + denominator);
    }


    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}