import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();

    public void run() throws Exception {
        int[] arr = new int[3];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i =0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        for(int i =0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }


    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}