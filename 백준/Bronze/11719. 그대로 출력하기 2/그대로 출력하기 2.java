import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void run() throws Exception {
        String str;
        while((str = br.readLine())!=null) {
            System.out.println(str);
        }

    }
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}