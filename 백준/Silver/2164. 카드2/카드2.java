import com.sun.security.jgss.GSSUtil;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();

    public static int[] arr;
    public void run() throws Exception {
        int N = Integer.parseInt(br.readLine());
        int[] q = new int[N*2];

        // 배열 초기화
        for(int i =1; i<=N; i++) {
            q[i] = i;
        }
        // 이전 인덱스와 마지막 인덱스
        int prev_index = 1;
        int last_index = N;
        for(int i =0; i<N-1; i++)  {
            // 이전 번호 버리기
            prev_index++;
            // 현재 첫번째 번호를 마지막 번호 다음으로 넘겨주기
            q[last_index+1] = q[prev_index];
            last_index++;
            prev_index++;
        }
        System.out.println(q[prev_index]);


    }

    public static void main(String[] args) throws Exception {
        new Main().run();
    }
}
