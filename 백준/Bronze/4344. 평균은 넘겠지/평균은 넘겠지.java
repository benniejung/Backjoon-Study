import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;

    public void run() throws Exception {
        int C;
        // C만큼 반복하여 입력을 받는다.
        C = Integer.parseInt(br.readLine());
        for(int i =0; i<C; i++) {
            double sum = 0;
            int student[]; // 학생 점수 담는 배열
            st = new StringTokenizer(br.readLine(), " ");

            int N = Integer.parseInt(st.nextToken()); // 학생 수 N입력 받는다
            student = new int[N];
            for(int j = 0; j<N; j++) {
                student[j] = Integer.parseInt(st.nextToken());
                sum+=student[j];
            }
            double avg = sum/N;
            double cnt = 0;
            for(int k = 0;k<N; k++) {
                if(student[k]>avg) {
                    cnt++;
                }
            }
            System.out.printf("%.3f%%\n",(cnt/N)*100);
        }


    }
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}