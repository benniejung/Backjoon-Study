import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void run() throws Exception {
        int n = Integer.parseInt(br.readLine());
        for(int i =n; i>0; i--) {
            for(int j=0; j<n-i; j++) System.out.print(" ");
            for(int k=0;k<i;k++) System.out.print("*");
            System.out.println();
        }


    }

    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}