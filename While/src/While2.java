import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print(" A soni kirit ");
        int A= scanner.nextInt();
        System.out.print("B soni kirit ");
        int B= scanner.nextInt();
        if (A>B) {
            int soni = 0;
            while (A >= B){
                A-=B;
                soni++;
            }
            System.out.println("  "+ soni+ " marta joylashtirsih mumkin ");
        }
        else {
            System.out.println(A<=B);
        }
    }
}
