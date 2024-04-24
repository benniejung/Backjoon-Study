import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;

    public void run() throws Exception {
        st = new StringTokenizer(br.readLine(), " ");
        int R1 = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int R2 = (S*2)-R1;

        System.out.println(R2);
    }
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}