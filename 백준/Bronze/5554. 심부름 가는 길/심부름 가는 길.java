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
        int total = 0;
        for(int i =0; i<4; i++) {
            total += Integer.parseInt(br.readLine());
        }
        int min = total / 60;
        int second = total % 60;
        sb.append(min).append("\n").append(second);
        System.out.println(sb);

    }

    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}