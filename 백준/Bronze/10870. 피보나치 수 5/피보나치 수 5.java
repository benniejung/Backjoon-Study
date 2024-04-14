import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void run() throws Exception {
        int N = Integer.parseInt(br.readLine());
        int[] fibo = new int[N+1]; // 0번째 0까지 포함하기 때문에 1을 더해준다

        for(int i =0; i<fibo.length; i++) {
            if(i==0) fibo[0] = 0;
            else if(i==1) fibo[1] = 1;

            else fibo[i] = fibo[i-1] + fibo[i-2];
        }
        System.out.println(fibo[N]);

    }

    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}