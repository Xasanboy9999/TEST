import java.util.Scanner;

public class while6 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print(" n  soni kirit = ");
        int n= scanner.nextInt();
        int son = raqamlar(n);
        System.out.print("Son "  + son + " xonalidir.");
    }
    public static int raqamlar (int n) {
        if (n == 0) {
            return 1;
        }
        int count = 0;

        while (n != 0) {
            n /= 10;
            count++;
        }

        return count;
    }
}