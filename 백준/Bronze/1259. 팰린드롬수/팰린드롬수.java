import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();

    public void run() throws Exception {
        while(true) {
            String n = br.readLine();
            boolean result = true;

            if(n.equals("0")) break;
            for(int i =0; i<n.length()/2; i++) {
                if(n.charAt(i) != n.charAt(n.length()-i-1)) result = false;
            }
            if(result) sb.append("yes").append("\n");
            else sb.append("no").append("\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}