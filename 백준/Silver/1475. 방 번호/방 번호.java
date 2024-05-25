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
        String n = br.readLine();
        int[] set = new int[10];
        // set 배열 초기화
        for(int i =0; i<10; i++) {
            set[i] = 0;
        }
        for(int i = 0; i<n.length(); i++) {
            if(n.charAt(i) == '6') set[9]++;
            else {
                int num = Character.getNumericValue(n.charAt(i));
                set[num]++;
            }
        }
        int nine = 0;
        int max = 0;
        if(set[9] % 2 !=0) nine = set[9]/2 + 1;
        else nine = set[9]/2;
        set[9] = nine;

        for(int k =0; k<set.length; k++) {
            max = Math.max(max, set[k]);
        }
        System.out.println(max);


    }

    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}