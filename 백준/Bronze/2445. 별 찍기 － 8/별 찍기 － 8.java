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
        for(int i = 0; i<N; i++) {
            for(int j = 0; j<=i; j++) {
                sb.append("*");
            }
            for(int k = 0; k<2*(N-i)-2;k++) {
                sb.append(" ");
            }
            for(int j = 0; j<=i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        for(int i=N-1; i>0; i--) {
            for(int j = i; j>0; j--) {
                sb.append("*");
            }
            for(int k = 0; k<2*(N-i); k++) {
                sb.append(" ");
            }
            for(int j = i; j>0; j--) {
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