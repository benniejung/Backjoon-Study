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
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        int x = 0;
        int y = 0;
        for(int i =-999; i<1000; i++) {
            for(int j = -999; j<1000; j++) {
                if((a*i+b*j==c) && (d*i+e*j==f)) {
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        System.out.println(x + " " + y);

    }


    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}