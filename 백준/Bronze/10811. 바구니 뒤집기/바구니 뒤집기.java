import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();

    public void run() throws Exception {
        st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for(int i =0; i<N; i++) {
            arr[i] = i +1;
        }
        for(int i =0; i<M; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());

            while(left < right) {
                int tmp = arr[left-1];
                arr[left-1] = arr[right-1];
                arr[right-1] = tmp;
                left++;
                right--;
            }
        }
        for(int n:arr) {
            sb.append(n + " ");
        }
        System.out.println(sb);

    }
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}