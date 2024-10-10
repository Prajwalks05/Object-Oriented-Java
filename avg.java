
import java.util.Arrays;

public class Avg {

    public static void main(String[] args) {
        int days[] = new int[12];
        days[0] = 31;
        days[1] = 28;
        days[2] = 31;
        days[3] = 30;
        days[4] = 31;
        days[5] = 30;
        days[6] = 31;
        days[7] = 31;
        days[8] = 30;
        days[9] = 31;
        days[10] = 30;
        days[11] = 31;
        float total = 0;
        for (int i = 0; i < days.length; i++) {
            total += days[i];
        }

        float avg = total / days.length;
        System.out.println("The average is: " + avg);
    }

}
