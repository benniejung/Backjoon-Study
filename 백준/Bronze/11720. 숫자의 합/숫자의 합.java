import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();

    public void run() throws Exception {
        int sum = 0;

        br.readLine();
        for(byte n:br.readLine().getBytes()) {
            sum+=(n-'0');
        }
        System.out.println(sum);
    }
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}