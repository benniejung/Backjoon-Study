import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public void run() throws Exception {
        long n = Integer.parseInt(br.readLine());
        System.out.println(n*4);

    }
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}