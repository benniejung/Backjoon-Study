import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
//    private StringBuilder sb = new StringBuilder();

    public void run() throws Exception {
        int N = Integer.parseInt(br.readLine());

        // 역삼각형 코드
        for (int i = 0; i < N; i++) {	// 1 ~ N

            // 공백
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // 별
            for (int k = 0; k < (2 * N - 1) - (2 * i); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // 삼각형 코드
        for (int i = 0; i < N - 1; i++) {	// N+1 ~ 2N-1

            // 공백
            for (int j = 1; j < (N - 1) - i; j++) {
                System.out.print(" ");
            }

            // 별
            for (int k = 0; k < 3 + 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    

    }

    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}