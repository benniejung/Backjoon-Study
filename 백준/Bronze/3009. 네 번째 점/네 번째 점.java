import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;

    public void run() throws Exception {
        int x = 0, y = 0;
        st = new StringTokenizer(br.readLine(), " ");
        int[] coord_1 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine(), " ");
        int[] coord_2 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine(), " ");
        int[] coord_3 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

        // x좌표 비교해서 중복되지 않은 x값 찾기
        if(coord_1[0] == coord_2[0]) {
            x = coord_3[0];
        }
        if(coord_1[0] == coord_3[0]) {
            x = coord_2[0];
        }
        if(coord_2[0] == coord_3[0]) {
            x = coord_1[0];
        }
        // y좌표 비교해서 중복되지 않은 y값 찾기
        if(coord_1[1] == coord_2[1]) {
            y = coord_3[1];
        }
        if(coord_1[1] == coord_3[1]) {
            y = coord_2[1];
        }
        if(coord_2[1] == coord_3[1]) {
            y = coord_1[1];
        }

        System.out.println(x+" " + y);

    }
    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}