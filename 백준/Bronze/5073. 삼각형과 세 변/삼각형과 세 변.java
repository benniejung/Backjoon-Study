import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();

    public void run() throws Exception {
        while(true) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a == 0 && b==0 && c==0) break;

            // 삼각형의 조건에 부합한지
            if(!((a+b)>c) || !((a+c)>b) || !((b+c)>a)) {
                sb.append("Invalid").append("\n");
            }
            // 세변의 길이가 같은 경우
            else if(a==b && b==c && a==c) {
                sb.append("Equilateral").append("\n");
            }
            // 두변의 길이가 같은 경우
            else if(a==b || b==c || a==c) {
                sb.append("Isosceles").append("\n");
            }
            // 모두 다른 경우
            else {
                sb.append("Scalene").append("\n");
            }


        }
        System.out.println(sb);

    }

    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}