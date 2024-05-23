import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();

    public void run() throws Exception {
        int n = Integer.parseInt(br.readLine());
        int[] ropes = new int[n];

        for (int i = 0; i < n; i++) {
            ropes[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(ropes);

        int maxWeight = 0;
        for (int i = 0; i < n; i++) {
            int currentWeight = ropes[i] * (n - i);
            if (currentWeight > maxWeight) {
                maxWeight = currentWeight;
            }
        }

        System.out.println(maxWeight);
    }


    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}