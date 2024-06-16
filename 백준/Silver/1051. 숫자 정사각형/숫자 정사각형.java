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
        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];
        // 2차원 배열 채우기
        for(int i =0; i<N; i++) {
            String str = br.readLine();
            for(int j = 0; j<str.length(); j++) {
                arr[i][j] = str.charAt(j) - '0'; // 배열은 정수형이기 때문에 문자열을 정수형으로 변환해주어야 한다
            }
        }
        // N과 M 중 작은 수
        int len = Math.min(N, M);
        while(len>1) {
            for(int i = 0; i<=N-len; i++) {
                for(int j = 0; j<=M-len; j++) {
                    int num = arr[i][j];
                    if(num==arr[i][j+len-1] && num==arr[i+len-1][j] && num==arr[i+len-1][j+len-1]) {
                        System.out.println(len*len);
                        return;
                    }
                }
            }
            len--;
        }
        System.out.println(len*len);




    }


    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}