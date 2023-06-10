import java.util.Scanner;
import java.util.Random;

public class Homework8 {
    public static void main(String[] args) {
        System.out.print("Спробуйте вгадати загадане комп'ютером число. Маєте п'ять спроб.");

        Random random = new Random();
        int riddledNumber = random.nextInt(10);
        System.out.print("загадано" + riddledNumber);

        Scanner attempt = new Scanner(System.in);
        int attemptNumber = 0;
        for (int i = 1; i < 6; i++) {
            System.out.print("\nСпроба №" + i + ". Введіть ваш варіант: ");
            attemptNumber = attempt.nextInt();
            if (attemptNumber == riddledNumber) {
                System.out.print("Ви вгадали!");
                break;
            } else {
                System.out.print("Ви не вгадали :( \n");
            }
        }
    }
}

