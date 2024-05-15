import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();

    public void run() throws Exception {
        int n = Integer.parseInt(br.readLine());
        int count_cute = 0;
        int count_no = 0;
        for(int i =0; i<n; i++) {
            int answer = Integer.parseInt(br.readLine());
            if(answer == 1) count_cute++;
            else count_no++;
        }
        if(count_cute > count_no) System.out.println("Junhee is cute!");
        else System.out.println("Junhee is not cute!");

    }

    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}