import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;

    static int max = 2001;
    public void run() throws Exception {
        int small_ham = max;
        int small_bev = max;
        for(int i =0; i<3; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            if(n<small_ham) small_ham = n;
        }
        for(int i =0; i<2; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            if(n<small_bev) small_bev = n;
        }
        int price = small_ham + small_bev -50;
        System.out.println(price);


    }
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}