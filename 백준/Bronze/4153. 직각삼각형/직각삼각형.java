import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Math.sqrt;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;

    public void run() throws Exception {
        while(true) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a==0 && b==0 && c==0) break;
            if(a*a == (b*b)+(c*c)) {
                System.out.println("right");
            } else if(b*b == (a*a)+(c*c)) {
                System.out.println("right");
            } else if(c*c == (a*a)+(b*b)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }

    }
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}