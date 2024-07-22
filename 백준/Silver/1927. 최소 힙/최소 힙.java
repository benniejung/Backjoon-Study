import com.sun.security.jgss.GSSUtil;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();

    public void run() throws Exception {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 우선순위 큐 사용
        int n = Integer.parseInt(br.readLine());
        for(int i =0; i<n; i++) {
            int k = Integer.parseInt(br.readLine());
            if(k == 0) {
                if(pq.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(pq.poll());
                }
            } else {
                pq.add(k);
            }
        }

    }


    public static void main(String[] args) throws Exception {
        new Main().run();
    }
}
