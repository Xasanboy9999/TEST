import javax.script.SimpleScriptContext;
import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class while4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" kirit n soni = ");
         int n= scanner.nextInt();
         int i=1;
         int natija=1;
         while (natija<n){
             natija*=3;
             i++;
         }
         if (natija==n){
             System.out.println(" 3 - darajasi ");
         }
         else {
             System.out.println(" 3- darajasi emas");

         }    }
}
