import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

// StringTokenizer클래스의 countTokens 사용하지 않는 다른 방법
public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
//    private StringBuilder sb = new StringBuilder();

    public void run() throws Exception {
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        System.out.println( (A+B)%C );
        System.out.println( (A%C + B%C)%C );
        System.out.println( (A*B)%C );
        System.out.println( (A%C * B%C)%C );

    }
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}