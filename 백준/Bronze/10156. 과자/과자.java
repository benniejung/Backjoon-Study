import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();

    public void run() throws Exception {
        int k,n,m;
        st = new StringTokenizer(br.readLine(), " ");
        k = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int payment = k*n;
        if(payment <= m) {
            System.out.println(0);
        } else {
            int need = payment-m;
            System.out.println(need);
        }

    }
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}