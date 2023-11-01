import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Iltimos, Fibonacci sonlarini nechanchi tartibdagi sonigacha hisoblashni kiriting: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci sonlari:");
        for (int i = 0; i <= n; i++) {
            int fibonacciNumber = fibonacci(i);
            System.out.print(fibonacciNumber + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}