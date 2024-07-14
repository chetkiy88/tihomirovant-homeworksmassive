public class sumArray {
    public static int sumArray(int[] inputArray) {
        int summa = 0;
        for (int i = 0; i < inputArray.length; i++) {
            summa += inputArray[i];
        }
        return summa;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 33};
        int summa = sumArray(arr);
        System.out.println("Сумма массива целых числе: " + summa);
    }
}

