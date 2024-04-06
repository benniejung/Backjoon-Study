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
        int month, date;
        st = new StringTokenizer(br.readLine(), " ");
        month = Integer.parseInt(st.nextToken());
        date = Integer.parseInt(st.nextToken());

        LocalDate dt = LocalDate.of(2007, month, date);
        DayOfWeek dayOfWeek = dt.getDayOfWeek();
        int dayOfWeekNumber = dayOfWeek.getValue();

        String result = "";
        switch(dayOfWeekNumber) {
            case 1:
                result = "MON";
                break;
            case 2:
                result = "TUE";
                break;
            case 3:
                result = "WED";
                break;
            case 4:
                result = "THU";
                break;
            case 5:
                result = "FRI";
                break;
            case 6:
                result = "SAT";
                break;
            case 7:
                result = "SUN";
                break;

        }
        System.out.println(result);


    }

    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}