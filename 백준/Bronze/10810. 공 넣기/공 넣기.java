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
        int i,j,k;
        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int arr[] = new int[N];
        for(int s = 0;s<N; s++) {
            arr[s] = 0;
        }
        while(M>0) {
            st = new StringTokenizer(br.readLine(), " ");
            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            for(int s = i; s<=j; s++) {
                arr[s-1] = k;
            }
            M--;
        }
        for(int s = 0; s<N; s++) {
            if(arr[s]!=0) {
                sb.append(arr[s]).append(" ");
            } else {
                sb.append("0").append(" ");
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}