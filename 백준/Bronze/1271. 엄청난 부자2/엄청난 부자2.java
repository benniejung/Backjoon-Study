import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;

    static int max = 2001;
    public void run() throws Exception {
        st = new StringTokenizer(br.readLine(), " ");
        BigInteger m = new BigInteger(st.nextToken());
        BigInteger n = new BigInteger(st.nextToken());

        System.out.println(m.divide(n)+ "\n" + m.remainder(n));

    }
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}