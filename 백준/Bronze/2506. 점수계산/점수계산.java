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
        st = new StringTokenizer(br.readLine(), " ");
        int count = 0;
        int score = 0;

        for(int i =0; i<n; i++) {
            int k = Integer.parseInt(st.nextToken());
            if(k == 1) {
                count++;
                score +=count;
            } else {
                count = 0;
            }
        }
        System.out.println(score);
    }

    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}