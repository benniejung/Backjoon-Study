import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringBuilder sb = new StringBuilder();

    public void run() throws Exception {
        int[]arr = new int[5];
        int sum = 0;
        for(int i =0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum+=arr[i];
        }
        int avg = sum/5;
        Arrays.sort(arr);
        int med = arr[5/2];

        sb.append(avg + "\n" + med);
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}