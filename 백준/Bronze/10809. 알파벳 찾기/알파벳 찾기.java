import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void run() throws Exception {
        String S;
        S = br.readLine();
        // a~z 배열 생성
        int arr[] = new int[26];
        // 배열 -1로 초기화
        for(int i =0; i<arr.length; i++) {
            arr[i] = -1;
        }
        for(int i =0; i<S.length(); i++) {
            // N의 한 글자씩 확인
            char n = S.charAt(i);
            // n 알파벳에 해당되는 배열에 i를 넣어주기
            if(arr[n-'a'] == -1) {
                arr[n-'a'] = i;
            }
        }
        // 배열을 모두 돌며 배열의 값 출력해준다
        for(int val:arr) { // forEach 구문
            System.out.print(val + " ");
        }


    }
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}