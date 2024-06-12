import com.sun.security.jgss.GSSUtil;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;


public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();

    public void run() throws Exception {
        BigInteger num1 = new BigInteger(br.readLine());
        String operator = br.readLine();
        BigInteger num2 = new BigInteger(br.readLine());
        int result = 0;
        switch(operator) {
            case "+":
                System.out.println(num1.add(num2));
                break;
            case "*":
                System.out.println(num1.multiply(num2));
                break;
            default:
                break;
        }
    }


    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}