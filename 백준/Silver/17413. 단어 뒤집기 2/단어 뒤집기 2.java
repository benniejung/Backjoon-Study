import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringBuilder sb = new StringBuilder();

    public void run() throws Exception {
        String input = br.readLine();
        StringBuilder word = new StringBuilder();
        boolean insideTag = false;

        for (char ch : input.toCharArray()) {
            if (ch == '<') {
                if (word.length() > 0) {
                    sb.append(word.reverse());
                    word.setLength(0);
                }
                insideTag = true;
                sb.append(ch);
            } else if (ch == '>') {
                insideTag = false;
                sb.append(ch);
            } else if (insideTag) {
                sb.append(ch);
            } else {
                if (ch == ' ') {
                    sb.append(word.reverse());
                    sb.append(ch);
                    word.setLength(0);
                } else {
                    word.append(ch);
                }
            }
        }

        if (word.length() > 0) {
            sb.append(word.reverse());
        }

        System.out.println(sb.toString());
    }

    public static void main(String[] args) throws Exception {
        new Main().run();
    }
}
