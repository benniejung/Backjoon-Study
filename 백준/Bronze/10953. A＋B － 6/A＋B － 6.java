import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();

    static int max = 2001;
    public void run() throws Exception {
        int n = Integer.parseInt(br.readLine());
        while(n>0) {
            st = new StringTokenizer(br.readLine(), ",");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(a+b).append("\n");

            n--;
        }
        System.out.println(sb);


    }
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}