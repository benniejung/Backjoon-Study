import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();

    public void run() throws Exception {
        int N, M;
        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int arr[] = new int[N+1];
        for(int i =1; i<arr.length; i++) {
            arr[i] = i;
        }
        int j,k;
        for(int i =0; i<M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            j = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            int temp = arr[k];
            arr[k] = arr[j];
            arr[j] = temp;
        }
        for(int i =1; i<arr.length; i++) {
            sb.append(arr[i]+ " ");
        }
        System.out.println(sb);


    }
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}