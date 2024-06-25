import com.sun.security.jgss.GSSUtil;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();

    public static int[] arr;
    public void run() throws Exception {
        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][2]; // 이차원 배열 생성

        for(int i =0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }
        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for(int i =0; i<N; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }


    }

    public static void main(String[] args) throws Exception {
        new Main().run();
    }
}
