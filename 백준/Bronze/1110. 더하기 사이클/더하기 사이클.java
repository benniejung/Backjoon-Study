import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    private StringTokenizer st;
//    private StringBuilder sb = new StringBuilder();

    public void run() throws Exception {
        int N;
        int cycle = 0;
        N = Integer.parseInt(br.readLine());
        int copy = N;
        do {
            N = ((N%10)*10) + (((N/10)+(N%10))%10);
            cycle++;
        } while(N!=copy);
        System.out.println(cycle);
    }
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}