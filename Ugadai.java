import java.util.Random;
import java.util.Scanner;

public class Ugadai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int max = 100;
        int randomNumber = random.nextInt(100) + 1;
        System.out.println(randomNumber);
        while (true) {
            System.out.println("Угадайте число от 0 до " + max);
            int input_randomNumber = scanner.nextInt();
            if (input_randomNumber == randomNumber) {
                System.out.println("Вы угадали ");
                break;
            } else if (input_randomNumber > randomNumber) {
                System.out.println("Указанное число больше");
            } else {
                System.out.println("Указанное число меньше");
            }
        }
    }
}