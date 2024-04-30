import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();

    void cal(int m) {
        int div;
        while(m>0) {
            div = m/25;
            sb.append(div + " ");
            m = m%25;

            div = m/10;
            sb.append(div + " ");
            m = m%10;

            div = m/5;
            sb.append(div + " ");
            m = m%5;

            div = m/1;
            sb.append(div + " ");
            m = m%1;
        }
        sb.append("\n");
    }
    public void run() throws Exception {
        int n = Integer.parseInt(br.readLine());
        int money;
        while(n>0) {
            money = Integer.parseInt(br.readLine());
            cal(money);
            n--;
        }
        System.out.println(sb);
    }
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}