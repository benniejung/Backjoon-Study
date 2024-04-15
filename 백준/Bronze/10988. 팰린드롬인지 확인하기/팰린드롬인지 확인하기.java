import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void run() throws Exception {
        String str = br.readLine();
        boolean ispel = true;
        for(int i =0; i<str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-i-1)) {
                ispel = false;
                break;
            }

        }
        if(ispel == true) System.out.println("1");
        else System.out.println("0");

    }

    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}