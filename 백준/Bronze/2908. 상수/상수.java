import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;

    public void run() throws Exception {
        int[] arr = new int[2];
        int index = 0;
        st = new StringTokenizer(br.readLine(), " ");
        while(st.hasMoreTokens()) {
            int a = Integer.parseInt(st.nextToken());
            int one = a%10;
            int ten = a/10%10;
            int hun = a/10/10;
            arr[index] = (one*100) + (ten*10) + hun;

            index++;
        }
        // 비교
        int big;
        if(arr[0] > arr[1]) big = arr[0];
        else big = arr[1];

        System.out.println(big);
    }

    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}