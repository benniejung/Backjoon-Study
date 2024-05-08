import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void run() throws Exception {
        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        int count = 0;
        // 문자 입력받기
        String str = br.readLine();
        // 문자 하나씩 croatia배열과 비교하기
        for(int i =0; i<str.length(); i++) {
            char ch = str.charAt(i);
            //
            if(ch == 'c' && i < str.length() - 1) {
                if(str.charAt(i+1) == '=') i++;
                else if(str.charAt(i+1) == '-') i++;

                count++;
            } else if(ch == 'd' && i < str.length() - 1) {
                if(str.charAt(i+1) == 'z' && i < str.length() - 2) {
                    if(str.charAt(i+2) == '=') i+=2;
                }
                else if(str.charAt(i+1) == '-') i++;

                count++;
            } else if((ch == 'l' || ch == 'n') && i < str.length() - 1) {
                if(str.charAt(i+1) == 'j') i++;
                count++;
            } else if((ch == 's' || ch == 'z') && i < str.length() - 1) {
                if(str.charAt(i+1) == '=') i++;
                count++;
            } else {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}