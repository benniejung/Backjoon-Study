import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();

    public static int[][] APT = new int[15][15];

    public void run() throws Exception {
        int T = (Integer.parseInt(br.readLine()));
        int k, n;
        make_APT(); // 아파트 생성

        // 해당 호수가 몇명인지 출력
        for(int i =0; i<T; i++) {
            k = (Integer.parseInt(br.readLine()));
            n = (Integer.parseInt(br.readLine()));
            sb.append(APT[k][n]).append('\n');
        }
        System.out.println(sb);
    }
    public void make_APT() {
        // 0층의 i호와 i층의 1호
        for(int i =0; i<15; i++) {
            APT[0][i] = i;
            APT[i][1] = 1;
        }

        // 나머지 층과 호
        for(int i = 1; i<15; i++) {
            for(int j = 2; j<15; j++) {
                APT[i][j] = APT[i][j-1] + APT[i-1][j];
            }
        }
    }

    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}