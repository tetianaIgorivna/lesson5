import java.util.Arrays;
import java.util.Random;

public class Homework10 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] organizerNumbers;
        organizerNumbers = new int[7];
        for (int i = 0; i < organizerNumbers.length; i++) {
            organizerNumbers[i] = random.nextInt(11);
        }
        System.out.println("Числа фірми-організатора лотереї " + Arrays.toString(organizerNumbers));

        int[] playerNumbers;
        playerNumbers = new int[7];
        for (int j = 0; j < playerNumbers.length; j++) {
            playerNumbers[j] = random.nextInt(11);
        }
        System.out.println("Числа гравця " + Arrays.toString(playerNumbers));
    }
}
