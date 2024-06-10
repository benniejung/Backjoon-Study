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
        st = new StringTokenizer(br.readLine(), " ");
        String a = st.nextToken();
        String b = st.nextToken();
        String c = st.nextToken();
        String d = st.nextToken();
        long newA = Long.parseLong(a+b);
        long newB = Long.parseLong(c+d);
        System.out.println(newA + newB);
    }


    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}