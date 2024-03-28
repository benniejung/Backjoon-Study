import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;

    public void run() throws Exception {
        int N; // 과목 개수 담을 변수
        double score;
        double sum = 0;
        // 과목 개수 입력받기
        N = Integer.parseInt(br.readLine());
        double arr[] = new double[N];
        st = new StringTokenizer(br.readLine(), " ");
        // 과목 개수만큼 성적 입력받기
        for(int i =0; i<N; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
        }
        // 최댓값 찾기 위해 배열 정리
        Arrays.sort(arr);

        // 조작하고, 더하기
        for(int i =0; i<N; i++) {
            sum += ((arr[i]/arr[N-1])*100);
        }

        // 평균구하기
        System.out.println(sum/(double)N);

    }
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}