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
        st = new StringTokenizer(br.readLine(), " "); // 입력받은 문자열을 공백으로 나누는 StringTokenizer 생성
        int cnt = 0;
        while(st.hasMoreTokens()) {
            st.nextToken(); // 다음 토큰으로 이동
            cnt++;
        }
        System.out.println(cnt);

    }
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}