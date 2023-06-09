import java.util.Scanner;
import java.util.Collections;
import java.util.Random;
public class Homework8 {
    public static void main(String[] args){
        System.out.print("Спробуйте вгадати загадане комп'ютером число\n");

        Random random = new Random();
        int riddledNumber = random.nextInt(10);

        System.out.print("Спроба №1. Введіть ваш варіант: ");
        Scanner attempt_1 = new Scanner(System.in);
        int attempt1 = attempt_1.nextInt();

        if (attempt1 == riddledNumber){
            System.out.print("Ви вгадали!");
        }else{
            System.out.print("Ви не вгадали :( \n");
            System.out.print("Спроба №2. Введіть ваш варіант: ");
            Scanner attempt_2 = new Scanner(System.in);
            int attempt2 = attempt_2.nextInt();
            if (attempt2 == riddledNumber){
                System.out.print("Ви вгадали!");
            }else{
                System.out.print("Ви не вгадали :( \n");
                System.out.print("Спроба №3. Введіть ваш варіант: ");
                Scanner attempt_3 = new Scanner(System.in);
                int attempt3 = attempt_3.nextInt();
                if (attempt3 == riddledNumber){
                    System.out.print("Ви вгадали!");
                }else{
                    System.out.print("Ви не вгадали :( \n");
                    System.out.print("Всі спроби вичерпано");
                }
            }
        }
    }
}
