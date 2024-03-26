import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();

    public void run() throws Exception {
        int N;
        int small, big;
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[N];
        int index = 0;
        while(st.hasMoreTokens()) {
            arr[index] = Integer.parseInt(st.nextToken());
            index++;
        }
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[N-1]);
    }
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}