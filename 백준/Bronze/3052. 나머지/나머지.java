import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void run() throws Exception {
        HashSet<Integer>hs = new HashSet<Integer>();
        for(int i =0; i<10; i++) {
            hs.add(Integer.parseInt(br.readLine())%42);
        }

        System.out.println(hs.size());

    }
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}