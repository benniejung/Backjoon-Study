import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringBuilder sb = new StringBuilder();

    public void run() throws Exception {
        int N = Integer.parseInt(br.readLine());
        for(int i =1; i<=N; i++) {
            // 공백 만들기
            for(int j = i; j<=N-1; j++) {
                sb.append(" ");
            }
            // 별찍기
            for(int k = 0; k<i*2-1; k++) {
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