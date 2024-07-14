import java.util.Scanner;

public class MaxOf3Numbers {
        public static int MaxOf3Numbers(int x, int y, int z) {
            int max = x;
            if (y > max) max = y;
            if (z > max) max = z;
            System.out.println("Наибольшее число: " + max);
            return max;
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Пожалуйста, введите три числа");

            int x = input.nextInt();
            int y = input.nextInt();
            int z = input.nextInt();
            int maxNumb = MaxOf3Numbers(x, y, z);
        }
    }