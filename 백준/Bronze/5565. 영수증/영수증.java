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
        int total = Integer.parseInt(br.readLine());
        int current = 0;
        for(int i =0; i<9; i++) {
            current +=Integer.parseInt(br.readLine());
        }
        System.out.println(total-current);

    }


    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}