import java.util.Random;
import java.util.Scanner;

public class Yoshkalkulyator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1
       /* System.out.print(" a ni kirit =");
        int a= scanner.nextInt();
        System.out.print(" b ni kirit = ");
        int b= scanner.nextInt();
        int yigindi=a+b;
        int ayirma=a-b;
        int kopaytma=a*b;
        double bolinma;
        if(b!=0){
            bolinma=(double )a/b;
        }
        else bolinma=Double.POSITIVE_INFINITY;
        System.out.println(" yigindi  = "+yigindi );
        System.out.println(" ayirma  = "+ayirma );
        System.out.println(" kopaytma  = "+kopaytma);
        System.out.println(" bolinma = "+bolinma);


*/
        // 2
        /*
        System.out.print(" a = ");
        int a = scanner.nextInt();
        System.out.print(" b= ");
        int b = scanner.nextInt();
        if (a%b==0) {
            System.out.println(a+" soni "+b+" soniga ga bolinadi ");

        }
else System.out.println(a+" soni "+b+" soniga bolinmaydi ");*/

        //3
        /*

        String str = "salom dunyo";
        String teskari = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            teskari += str.charAt(i);
        }
        System.out.println("Teskari: " + teskari);*/

        //4
        System.out.print(" a= ");
        int a= scanner.nextInt();
        System.out.print(" b= ");
        int b= scanner.nextInt();
        if (a%2==0){
            System.out.println("juft son ");
        }
        else System.out.println(" toq son ");
        if(b%2==0) {
            System.out.println(" juft son ");
        } else System.out.println(" toq son ");


    }
}