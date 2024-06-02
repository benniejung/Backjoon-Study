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
        int index = 0;
        int big_score = 0;
        for(int i =0; i<5; i++) {
            int sum = 0;
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j<4; j++) {
                int score = Integer.parseInt(st.nextToken());
                sum+=score;
            }
            if(big_score < sum) {
                big_score = sum;
                index = i+1;
            }
        }
        System.out.println(index + " " + big_score);

    }

    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}