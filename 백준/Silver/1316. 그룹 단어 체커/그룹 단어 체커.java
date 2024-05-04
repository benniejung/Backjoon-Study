import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();

    public void run() throws Exception {
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i =0; i<N; i++) {
            // 그룹 단어면 count 증가
            if(check()) {
                count++;
            }
        }
        System.out.println(count);



    }
    public static boolean check() throws Exception {
        boolean[] check = new boolean[26]; // default값 false
        String str = br.readLine();
        int prev = 0;

        for(int i =0; i<str.length(); i++) {
            int cur = str.charAt(i);
            // 앞선 문자와 다른 문자인 경우
            if(prev!=cur) {
                // 해당 문자가 처음 나오는 경우
                if(check[cur-'a'] == false) {
                    check[cur-'a'] = true;
                    prev = cur;
                }
                // 해당 문자가 처음 나오는 경우가 아니라면 -> 그룹단어가 아님!
                else {
                    return false;
                }
            }
            // 앞선 문자와 같은 문자인 경우
            else {
                continue;
            }
        }

        return true;
    }

    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}