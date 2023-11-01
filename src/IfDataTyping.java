import java.util.Scanner;

public class IfDataTyping {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("  Siz toplagan bali= ");
        int bal = scanner.nextInt();
        System.out.print("Grandga otish bali= ");
        int  grandotishbali = scanner.nextInt();
        System.out.print(" kontrakt otish bali= ");
        int kontraktotishbali = scanner.nextInt();


        if ( bal>=grandotishbali){
            System.out.println(" grand asosida talabalikka tavsiya etildingiz");
        } else if (bal>=kontraktotishbali&& bal<grandotishbali) {
            System.out.println("kontrakt asosida talabalikka tavsiya etildingiz");

        } else {
            System.out.println("talabalikka tavsiya etilmadingiz");
        }
    }
}
