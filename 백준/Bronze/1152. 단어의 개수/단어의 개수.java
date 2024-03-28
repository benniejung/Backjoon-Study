import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;

    public void run() throws Exception {
        String str;
        str = br.readLine();
        st = new StringTokenizer(str, " "); // 객체 생성
        System.out.println(st.countTokens());
    }
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}