import java.util.Scanner;

public class power {
    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Пожалуйста, введите число: ");
        int base = value.nextInt();
        System.out.println("Пожалуйста, введите степень числа: ");
        int exponent = value.nextInt();
        int result = power(base, exponent);
        System.out.println("Число в степени равно");
        System.out.println(result);
    }
}


