/*This program will accept test scores from a user
to find the minimum, maximum, and average test scores */
import java.util.Scanner;
public class ScoreStatistics {
    public static void main(String args[]) {
        int min = 0, max = 0, sum = 0;
        double avg = 0;
        int score, counter = 0;

        Scanner keybd = new Scanner(System.in);
        System.out.println("Enter a test score. Type -1 to quit.");
        score = keybd.nextInt();
        keybd.nextLine();

        while (score != -1) {
          min = keybd.nextInt();
          max =  keybd.nextInt();

             sum += min;
             sum += max;
             counter++;
        }

        if (counter > 0)
            avg = sum / counter;

        System.out.println("Min: " + min + " Max: " + max + " Avg: " + avg);
    }
}