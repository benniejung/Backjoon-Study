import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();

    public void run() throws Exception {
        int N;
        int k;
        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        int[] scores = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i =0; i<N; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(scores); // 작은 수에서 큰수로 정렬됨
        System.out.println(scores[N-k]);

    }

    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}