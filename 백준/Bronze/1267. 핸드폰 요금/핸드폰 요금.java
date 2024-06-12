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
        int n;
        int younsik = 0, minsik = 0;
        st = new StringTokenizer(br.readLine(), " ");
        while(T-->0) {
            n = Integer.parseInt(st.nextToken());
            younsik += ((n/30 +1)*10);
            minsik += ((n/60 + 1)*15);
        }
        // 비교
        if(younsik == minsik) { // 두 값이 같다면, 둘 다 출력하기
            System.out.println("Y M " + younsik);
        } else { // 두 값이 다르다면, 작은 값 출력하기
            if(younsik > minsik)
                System.out.println("M " + minsik);
            else
                System.out.println("Y " + younsik);
        }
    }


    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}