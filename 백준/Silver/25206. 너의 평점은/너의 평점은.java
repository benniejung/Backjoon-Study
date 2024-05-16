import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();

    public void run() throws Exception {
        double totalSum = 0;
        double scoreSum = 0;
        double avg = 0;
        String gradeList[] = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
        double scoreList[] = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};

        for(int i =0; i<20; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String subject = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String level = st.nextToken();

            for(int j = 0; j<10; j++) {
                if(level.equals(gradeList[j]) && !level.equals("P")) {
                    totalSum += score * scoreList[j];
                    scoreSum +=score;
                }
            }
        }
        avg = totalSum / scoreSum;
        System.out.printf("%.6f\n", avg);

    }

    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}