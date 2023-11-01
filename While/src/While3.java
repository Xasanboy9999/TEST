import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print(" N soni kiriting = ");
        int N= scanner.nextInt();
        System.out.print(" K soni kiriting = ");
        int K= scanner.nextInt();
        if (N>K) {
            int butun =0;
            int qoldiq=0;
            while (N>K) {
                N-=K;

                qoldiq=N;
                butun++;


            }
            System.out.println("qoldiq = "+qoldiq );
            System.out.println("butun qism = "+butun );
        }
        else {
            System.out.println(N<=K);
        }

    }
}
