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
        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            st = new StringTokenizer(br.readLine(), " ");
            while(st.hasMoreTokens()) {
                String word = st.nextToken();
                // 한 단어씩 reverse해서 StringBuilder에 넣기
                StringBuilder rev = new StringBuilder(word);
                word = rev.reverse().toString();
                sb.append(word).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);


    }


    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}