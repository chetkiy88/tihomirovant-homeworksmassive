import java.util.Scanner;

public class Masspolozhit4isel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите 10 чисел");
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("Полученный массив");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("Положительные числа в полученном массиве:");
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                num++;
                System.out.print(array[i] + " ");
            }
        }
    }
}


