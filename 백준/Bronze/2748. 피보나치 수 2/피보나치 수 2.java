import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Math.sqrt;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();

    static long[] arr;
    public static long fibonacchi(int n) {
        if(n==0) arr[0] = 0;
        if(n==1) arr[1] = 1;
        if(arr[n] == -1) {
            arr[n] = fibonacchi(n - 1) + fibonacchi(n - 2);
        }
        return arr[n];
    }
    public void run() throws Exception {
        int n = Integer.parseInt(br.readLine());
        arr = new long[n+1];
        for(int i = 0; i < n+ 1; i++) {
            arr[i] = -1;
        }
        System.out.println(fibonacchi(n));

    }
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}