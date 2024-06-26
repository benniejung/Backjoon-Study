import com.sun.security.jgss.GSSUtil;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();

    public static int[] arr;
    public void run() throws Exception {
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> li = new ArrayList<>();
        for(int i =0; i<N; i++) {
            int num = Integer.parseInt(br.readLine());
            li.add(num);
        }
        Collections.sort(li);
        for(int val : li) {
            sb.append(val).append("\n");
        }
        System.out.println(sb);


    }

    public static void main(String[] args) throws Exception {
        new Main().run();
    }
}
