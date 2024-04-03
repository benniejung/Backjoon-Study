import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

// StringTokenizer클래스의 countTokens 사용하지 않는 다른 방법
public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void run() throws Exception {
        int A,B,C;
        int result = 0;
        int arr[] = new int[10];
        for(int i =0; i<10; i++) {
            arr[i] = 0;
        }
        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());
        C = Integer.parseInt(br.readLine());
        result = A*B*C;
        String str = String.valueOf(result);
        for(int i =0; i<str.length(); i++) {
            arr[str.charAt(i)-48]++;
        }
        // forEach구문
        for(int i:arr) {
            System.out.println(i);
        }

    }
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}