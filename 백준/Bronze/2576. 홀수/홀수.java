import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();

    public void run() throws Exception {
        int min = 100, n;
        int sum = 0;
        for(int i =0; i<7; i++) {
            n = Integer.parseInt(br.readLine());
            if(n%2!=0) {
                sum+=n;
                if(n<min) min = n;
            }
        }
        if(min!=100) {
            sb.append(sum).append("\n").append(min);
            System.out.println(sb);
        } else {
            System.out.println(-1);
        }

    }


    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}