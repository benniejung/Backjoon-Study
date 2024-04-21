import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Math.sqrt;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringBuilder sb = new StringBuilder();

    public void run() throws Exception {
        int N = Integer.parseInt(br.readLine());

        for(int i = 2; i<=sqrt(N); i++) {
            while(N%i==0) {
                sb.append(i).append("\n");
                N/=i;
            }
        }
        if(N!=1)
            sb.append(N).append("\n");

        System.out.println(sb);
    }
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}