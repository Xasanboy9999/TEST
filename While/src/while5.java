import java.util.Scanner;

public class while5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" n soni kirit = ");
        int n= scanner.nextInt();
        int son = 1;
        int daraja = 0;

        while (son < n) {
            son *= 2;
            daraja++;
        }

        if (son == n) {
            System.out.println("k = " + daraja);
        } else {
            System.out.println("k  2 ni darajasi emas  ");
        }
    }
}