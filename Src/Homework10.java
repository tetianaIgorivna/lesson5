import java.util.Arrays;
import java.util.Random;

public class Homework10 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] team1;
        team1 = new int[25];
        for (int i = 0; i < team1.length; i++) {
            team1[i] = random.nextInt(40 - 18) + 18;
        }
        System.out.println("Вік гравців першої команди " + Arrays.toString(team1));

        double team1average = 0;
        int team1sum = 0;
        for (int i = 0; i < team1.length; i++) {
            team1sum = team1sum + team1[i];
        }
        team1average = (double) team1sum / team1.length;
        System.out.println("Середній вік гравців першої команди = " + team1average + "\n");

        int[] team2;
        team2 = new int[25];
        for (int i = 0; i < team2.length; i++) {
            team2[i] = random.nextInt(40 - 18) + 18;
        }
        System.out.println("Вік гравців другої команди " + Arrays.toString(team2));

        double team2average = 0;
        int team2sum = 0;
        for (int j = 0; j < team1.length; j++) {
            team2sum = team2sum + team2[j];
        }
        team2average = (double) team2sum / team2.length;
        System.out.println("Середній вік гравців другої команди = " + team2average);
    }
}
