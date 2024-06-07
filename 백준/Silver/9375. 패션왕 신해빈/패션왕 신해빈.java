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
        int T = Integer.parseInt(br.readLine());
        while(T>0) {
            // 새로운 테스트케이스가 실행될 때마다 해시맵 생성
            HashMap<String, Integer> hashMap = new HashMap<>();
            int n = Integer.parseInt(br.readLine());
            for(int i =0; i<n; i++) {
                // 해시맵에 의상의 이름과 종류를 넣는다
                st = new StringTokenizer(br.readLine(), " ");
                st.nextToken(); // 옷 이름은 필요없기 때문에 다음으로 넘긴다
                String clothes_type = st.nextToken();
                if(hashMap.containsKey(clothes_type)) { // 해시맵에 해당 종류의 옷이 있다면 값 1증가
                    hashMap.put(clothes_type, hashMap.get(clothes_type)+1);
                } else {
                    hashMap.put(clothes_type, 1);
                }
            }
            int result = 1;
            // 수학개념 '조합'을 활용하는 문제
            for(int v:hashMap.values()) {
                result*= (v + 1);
            }
            sb.append(result-1).append("\n");

            T--;
        }
        System.out.println(sb);
    }


    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}