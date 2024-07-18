import com.sun.security.jgss.GSSUtil;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();

    static int n; // 최대 입력 값
    static int[] tanghuru;
    int[] fruits;
    public void run() throws Exception {
        int max = 0; // 탕후루의 최대 개수
        n = Integer.parseInt(br.readLine());
        tanghuru = new int[n];
        fruits = new int[10]; // 과일 종류 10개
        st = new StringTokenizer(br.readLine(), " ");
        for(int i =0; i<n; i++) {
            tanghuru[i] = Integer.parseInt(st.nextToken());
        }
        // 과일 종류 배열 0으로 초기화시키기
        for(int i =0; i<10; i++) {
            fruits[i] = 0;
        }

        // 투포인터 알고리즘 사용
        int left = 0;
        int right = 0;
        int index = 0;
        while(right < n) {
            fruits[tanghuru[right++]]++; // 해당 과일 갯수 증가시키기
            // 만약에 과일 종류가 3개 이상이라면, left를 증가시켜서 해당과일을 뺀다
            if(count(fruits) > 2) fruits[tanghuru[left++]]--;

            max = Math.max(max, right-left);
        }

        System.out.println(max);

    }
    public static int count(int[] arr) {
        int count = 0;
        for(int i:arr) {
            if (i != 0) count++;
        }
        return count;
    }

    public static void main(String[] args) throws Exception {
        new Main().run();
    }
}
