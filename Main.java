public class Main {

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }

        int a = 0;
        int b = 1;
        int result = 0;

        for (int i = 2; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }

        return result;
    }

    public static void main(String[] args) {
        // Przykłady testowe
        System.out.println(fib(0));
        System.out.println(fib(1));
        System.out.println(fib(4));
        System.out.println(fib(9));
        System.out.println(fib(12));
    }
}
