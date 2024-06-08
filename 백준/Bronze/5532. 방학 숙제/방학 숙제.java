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
        int L = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());

        // 나머지가 맞아 떨어지지 않았을 때는 날짜를 1일 더해준다
        int kor_day, math_day;
        if(a%c !=0) {
            kor_day = (a/c)+1;
        } else {
            kor_day = a/c;
        }
        if(b%d !=0) {
            math_day = (b/d)+1;
        } else {
            math_day = b/d;
        }
        int day = Math.max(kor_day, math_day);
        System.out.println(L-day);


    }


    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}