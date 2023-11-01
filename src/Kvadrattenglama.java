import java.util.Scanner;

public class Kvadrattenglama {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("kvadrat tenglamaga a ni kirting: ");
        double a= scanner.nextDouble();
        System.out.println("kvadrat tenglamaga b ni kirting: ");
        double b= scanner.nextDouble();
        System.out.println("kvadrat tenglamaga c ni kirting: ");
        double c= scanner.nextDouble();
        double diskriminant= b*b-4*a*c;
        if(diskriminant>0){
            double x1 = (-b + Math.sqrt(diskriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(diskriminant)) / (2 * a);
            System.out.println("Tenglama ikkita yechimga ega:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (diskriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("Tenglama bir yechimga ega:");
            System.out.println("x = " + x);
        } else {
            System.out.println("Tenglama yechimga ega emas.");
        }
    }
}
