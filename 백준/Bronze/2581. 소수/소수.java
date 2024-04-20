import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringBuilder sb = new StringBuilder();

    public void run() throws Exception {
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int small = N;
        for(int i = M; i<=N; i++) {
            int count = 0;
            for(int j =1; j<=i; j++) {
                if(i%j==0) count++;
            }
            if(count==2) { // 소수인 경우
                sum+=i;
                if(small>i) small=i;
            }
        }
        if(sum == 0) System.out.println(-1); // 소수가 없다면 즉, sum에 더해진 소수가 없으면 -1 출력
        else {
            sb.append(sum).append("\n").append(small);
            System.out.println(sb);
        }
    }
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}