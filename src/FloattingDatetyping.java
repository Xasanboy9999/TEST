import java.util.Scanner;

public class FloattingDatetyping {
    public static void main(String[] args) {
        // double float int
        Scanner scanner =new Scanner(System.in);
        int l= scanner.nextInt();
        double n1= scanner.nextDouble();
        float X2= scanner.nextFloat();

        System.out.println("birinchi son "+(l+n1));
        System.out.println("ikinchi son "+n1);
        System.out.println("uchunchi son "+X2);
        float x=12/4;
        double x1=12.0/4;
        System.out.println(x);
        System.out.println(x1);
        double f=5e-2;
        double k=5e+2;
        System.out.println(f);
        System.out.println(k);
        double w=0.1+0.1+0.1;
        System.out.println(w);

    }
}
