import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    private StringTokenizer st;
//    private StringBuilder sb = new StringBuilder();

    public void run() throws Exception {
        int N;
        N = Integer.parseInt(br.readLine());
        for(int i =N; i>0; i--) {
            System.out.println(i);
        }

    }
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}