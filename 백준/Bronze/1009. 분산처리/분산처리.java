import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();

    public void run() throws Exception {
        int T = Integer.parseInt(br.readLine());
        for(int i =0; i<T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            // a를 b만큼 제곱한 값을 total에 저장한다
            int total = 1;
            for(int j = 0; j<b; j++) {
                total *=a;
                total %=10;
            }
            // 10으로 나눈 나머지를 출력한다
            if(total == 0) {
                sb.append(10 + "\n");
            } else {
                sb.append(total + "\n");
            }
        }
        System.out.println(sb);

    }

    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}