public class contains {
    public static boolean contains(int[] mass, int target) {
        if (mass == null || mass.length == 0) {
            return false;
        }
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {45, 34, 13, 65, 199};
        boolean contains = contains(numbers, 45);
        System.out.println("Число 45");
        System.out.println(contains);

    }
}

