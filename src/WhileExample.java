import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        /*int i=0;
        int number=0;

        while (n>0){
            int q=n%10;
            n=n/10;
            number=number*10+q;

        }
        System.out.println(number);*/

       /* int x = 10;
        int y = 5;
        int natijasi = (x > y) ? x : y;
        System.out.println(natijasi);*/

        // MISOL 1

        int A=15;
        int B=5;

        while (A>0&&B>0) { if (A>B){
            int chiqar=A/B;

            System.out.println( " A kesmaning bo`sh qismi "+chiqar);

        }
            return;
        }

    }
}
