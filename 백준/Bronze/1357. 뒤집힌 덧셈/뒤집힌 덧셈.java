import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;


public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();

    public void run() throws Exception {
        st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int reverseX = reverse(x);
        int reverseY = reverse(y);
        int result = reverse(reverseX + reverseY);

        System.out.println(result);

    }
    private int reverse(int n) {
        int reverseNum = 0;
        while(n>0) {
            reverseNum = (reverseNum * 10) + n%10;
            n = n/10;
        }

        return reverseNum;
    }

    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}