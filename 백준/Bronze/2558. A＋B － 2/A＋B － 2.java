import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void run() throws Exception {
        int A, B;
        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());
        System.out.println(A+B);

    }
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}