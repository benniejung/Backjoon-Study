import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();

    public void run() throws Exception {
        int N = Integer.parseInt(br.readLine());
        for(int i =0; i<=N; i++) {
            // 공백
            for(int j = 0; j<i; j++) {
                sb.append(" ");
            }
            // 별
            for(int k = 1; k<=2*(N-i)-1; k++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);


    }
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}