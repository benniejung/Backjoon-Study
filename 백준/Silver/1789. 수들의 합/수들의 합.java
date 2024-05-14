import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();

    public void run() throws Exception {
        long s = Long.parseLong(br.readLine());
        int n = 0;
        long sum = 0;

        while(sum<s) {
            n++;
            sum+=n;
        }
        if(sum > s) { // 합한 값이 s보다 크면
            System.out.println(n-1);
        }else { // 합한 값이 s랑 같다면
            System.out.println(n);
        }

    }

    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}