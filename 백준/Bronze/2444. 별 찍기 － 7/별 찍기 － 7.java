import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringBuilder sb = new StringBuilder();

    public void run() throws Exception {
        int N = Integer.parseInt(br.readLine());
        for(int i = 1; i<=N; i++) {
            for(int j =1; j<=N-i; j++) {
                sb.append(" ");
            }
            for(int k = 1; k<=2*i-1; k++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        for(int i = N-1; i>=1; i--) {
            for(int j = 1; j<=N-i; j++) {
                sb.append(" ");
            }
            for(int k = 1; k<=2*i-1; k++) {
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