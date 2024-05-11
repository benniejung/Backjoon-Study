import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void run() throws Exception {
        int T = Integer.parseInt(br.readLine());
        int init = 2;
        int n = 1;
        int dot = 0;
        for(int i =1; i<=T; i++) {
            if(i ==1) {
                init += n;
                dot = init * init;
            } else {
                n *= 2;
                init +=n;
                dot = init * init;
            }
        }
        System.out.println(dot);




    }

    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}