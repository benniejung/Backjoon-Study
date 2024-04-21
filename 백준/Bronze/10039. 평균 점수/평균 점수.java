import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Math.sqrt;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;

    public void run() throws Exception {
        int sum = 0;
        for(int i =0; i<5; i++) {
            st = new StringTokenizer(br.readLine(), "\n");
            int n = Integer.parseInt(st.nextToken());
            if(n<40) sum+=40;
            else sum+=n;
        }
        System.out.println(sum/5);

    }
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}