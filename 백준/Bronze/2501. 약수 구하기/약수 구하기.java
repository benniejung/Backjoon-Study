import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Math.sqrt;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;

    public void run() throws Exception {
        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int count = 0;
        for(int i=1; i<=N; i++) {
            if(N%i==0) {
                count++;
            }
            if(count==k) {
                System.out.println(i);
                break;
            }
        }
        if(k>count) System.out.println(0);

    }
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}