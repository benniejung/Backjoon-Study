import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;

    public void run() throws Exception {
        st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[8];
        for(int i =0; i<8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        if(arr[0] == 1) {
            for(int i =1; i<arr.length; i++) {
                if(arr[i] !=arr[i-1] +1) {
                    System.out.println("mixed");
                    return;
                }
            }
            System.out.println("ascending");
        }
        else if(arr[0] == 8) {
            for(int i =1; i<8; i++) {
                if(arr[i] !=arr[i-1] -1) {
                    System.out.println("mixed");
                    return;
                }
            }
            System.out.println("descending");
        }
        else {
            System.out.println("mixed");
        }

    }

    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}