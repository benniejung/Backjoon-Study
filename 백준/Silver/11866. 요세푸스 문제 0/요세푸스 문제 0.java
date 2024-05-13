import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();

    public void run() throws Exception {
        st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        Queue<Integer> q = new LinkedList<>();
        for(int i =1; i<=a; i++) {
            q.add(i);
        }
        sb.append('<');
        while(q.size() > 1) {
            // b-1만큼 앞 숫자를 삭제하고, 뒤에 붙여주기
            for(int i = 0; i<b-1; i++) {
                q.offer(q.poll());
            }
            // b번째일 때, 꺼내서 sb에 저장하기
            sb.append(q.poll()).append(", ");
        }
        sb.append(q.poll()).append('>');
        System.out.println(sb);

    }

    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}