import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;

    public void run() throws Exception {
        int total = 0;
        int max = 0;
        for(int i =0; i<4; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            total-=x;
            total+=y;
            if(max<total) max = total;
        }
        System.out.println(max);
    }

    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}