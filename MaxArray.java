import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Пожалйста введите 5 чисел массива");
        int[] mass = new int[5];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = input.nextInt();
        }

        int max = mass[0];

        for (int i = 0; i < mass.length; i++)
            if (max < mass[i]) max = mass[i];
        System.out.println("Максимальное число в этом массиве  =  " + max);
    }
}

