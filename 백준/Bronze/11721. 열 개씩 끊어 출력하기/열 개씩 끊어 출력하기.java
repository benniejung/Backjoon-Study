import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();

    public void run() throws Exception {
        String str = br.readLine();
        int count = 0;
        for(int i =0; i<str.length(); i++) {
            if(count % 10 == 0 && count!=0) {
                System.out.print("\n" + str.charAt(i));
            } else {
                System.out.print(str.charAt(i));
            }
            count++;
        }

    }

    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}