import java.util.Scanner;

public class minMax {
    public static int[] minMax(int[] mass) {
        if (mass == null || mass.length == 0) {
            return new int[]{0, 0};
        }
        int min = mass[0];
        int max = mass[0];
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] < min) {
                min = mass[i];
            }
            if (mass[i] > max) {
                max = mass[i];
            }
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Пожалуйста, укажите длину массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Пожалуйста, введите массив: ");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Массив: ");
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
        int[] result = minMax(array);
        System.out.println("MIN число в массиве: ");
        System.out.println(" " + result[0]);
        System.out.println("MAX число в массиве: ");
        System.out.println(" " + result[1]);
    }
}


