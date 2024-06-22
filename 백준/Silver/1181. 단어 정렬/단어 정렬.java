import com.sun.security.jgss.GSSUtil;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();

    public void run() throws Exception {
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for(int i =0; i<N; i++) {
            String str = br.readLine();
            arr[i] = str;
        }
        // 선택정렬
        for(int i =0; i<N; i++) {
            for(int j = i+1; j<N; j++) {
                // 글자 길이가 같은 경우
                if(arr[i].length() == arr[j].length()) {
                    if(arr[i].compareTo(arr[j])>0) { // 자바에서 문자열을 비교할 떄 compareTo를 사용한다
                        String temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                } else { // 글자 길이가 다른 경우
                    if(arr[i].length() > arr[j].length()) { // 앞의 숫자가 뒤숫자보다 길 때
                        String temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }

            }
        }
        // 출력하기
        for(int i =0; i<N; i++) {
            if(i!=0) {
                if(arr[i].compareTo(arr[i-1])!=0) { // 중복제거
                    System.out.println(arr[i]);

                }
            } else {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().run();
    }
}
