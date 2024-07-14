public class fibonacci {
    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int result = fibonacci(13);
        System.out.println("13-е число Фибоначчи: ");
        System.out.println(+ result);
    }
}

