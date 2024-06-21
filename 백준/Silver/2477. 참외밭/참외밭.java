import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;
    private StringBuilder sb = new StringBuilder();

    public void run() throws Exception {
        int N = Integer.parseInt(br.readLine().trim());
        int[] sides = new int[6]; // 육각형의 각 변의 길이를 저장하기 위한 배열
        int maxWidth = 0, maxWidthLocation = 0, maxHeight = 0, maxHeightLocation = 0;
        int d;

        for (int i = 0; i < 6; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            d = Integer.parseInt(st.nextToken());
            sides[i] = Integer.parseInt(st.nextToken());

            // 가장 긴 가로 길이와 위치 찾기
            if ((d == 1 || d == 2) && maxWidth < sides[i]) {
                maxWidth = sides[i];
                maxWidthLocation = i;
            }
            // 가장 긴 세로 길이와 위치 찾기
            if ((d == 3 || d == 4) && maxHeight < sides[i]) {
                maxHeight = sides[i];
                maxHeightLocation = i;
            }
        }

        int right, left, minWidth, minHeight;

        // 빈 사각형의 세로 길이 계산
        if (maxWidthLocation + 1 == 6) right = 0;
        else right = maxWidthLocation + 1;

        if (maxWidthLocation - 1 == -1) left = 5;
        else left = maxWidthLocation - 1;

        minHeight = Math.abs(sides[right] - sides[left]);

        // 빈 사각형의 가로 길이 계산
        if (maxHeightLocation + 1 == 6) right = 0;
        else right = maxHeightLocation + 1;

        if (maxHeightLocation - 1 == -1) left = 5;
        else left = maxHeightLocation - 1;

        minWidth = Math.abs(sides[right] - sides[left]);

        // 결과 출력
        System.out.println(((maxWidth * maxHeight) - (minHeight * minWidth)) * N);
    }

    public static void main(String[] args) throws Exception {
        new Main().run();
    }
}
