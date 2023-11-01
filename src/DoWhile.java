import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n= scanner.nextInt();
        int i=2;
        do{
i++;
            System.out.println(i);

        } while (n>i);
        System.out.println("   natija ");
        int k=5;
        while (n>k){
            k++;
            System.out.println(k);
        }

    }
}
