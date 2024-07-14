import java.util.Scanner;

public class isPrime {
    public static boolean isPrime(int a) {
        if (a <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Пожалуйста, введите целое число: ");
        int count = scanner.nextInt();
        boolean isPrime = isPrime(count);

        if (isPrime) {

            System.out.println("Число является простым");
        } else {
            System.out.println("Число НЕ является простым");
        }
    }
}


