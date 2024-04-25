import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int max = 2001;
    public void run() throws Exception {
        BigInteger a = new BigInteger(br.readLine());
        BigInteger b = new BigInteger(br.readLine());

        System.out.println(a.add(b) + "\n" + a.subtract(b) + "\n" + a.multiply(b));


    }
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}