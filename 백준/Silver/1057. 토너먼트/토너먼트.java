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
        int N = Integer.parseInt(st.nextToken());
        int jimin = Integer.parseInt(st.nextToken());
        int hansu = Integer.parseInt(st.nextToken());
        int round = 0;
        while(jimin!=hansu) {
            jimin = jimin/2 + jimin%2;
            hansu = hansu/2 + hansu%2;
            round++;
        }
        System.out.println(round);


    }


    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}