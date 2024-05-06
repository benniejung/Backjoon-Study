import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();

    public void run() throws Exception {
        int[] arr = new int[4];
        String[] a = {"D", "C", "B", "A", "E"};

        for(int i =0; i<3; i++) {
            int r = 0;
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j<arr.length; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                if(arr[j] == 1) r++;
            }
            sb.append(a[r] + "\n");
        }
        System.out.println(sb);
    }


    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}