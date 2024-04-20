import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void run() throws Exception {
        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int range = 2;
        if(N>1) {
            while(range<=N) {
                range = range + (6*count);
                count++;
            }
        } else if(N==1) count = 1;

        System.out.println(count);
    }
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}