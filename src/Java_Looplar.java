import java.util.Scanner;

public class Java_Looplar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1- topshiriq
        /*
        System.out.print(" sonni kiring = ");
        int n= scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            int  natija=n*i;
            System.out.println(n+"x"+i+"="+natija);


        }   */
        // 2- topshiriq
        /*
        System.out.println(" n ni kiriting = ");
        int n= scanner.nextInt();
        if (n>0){
            int natija =n*n*n;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int k =i; k >=1; k--) {
                System.out.print(k+"");}

                for (int l = 2; l <=i ; l++) {
                    System.out.print(l+"");
                    
                }
                System.out.println();
        }
        }
        else System.out.println(" xatolik yuz berdi ");
*/
        // 3-topshiriq
        /*
        System.out.println(" fibonachi sonni nechanchi tartibgacha hisoblash");
        int n= scanner.nextInt();
        System.out.println(" fibonachi sonlar");
        for (int i = 0; i <=n; i++) {
            int fibonacciNumber=fibonacci(i);
            System.out.print(fibonacciNumber+" ");
            
        }
}
public static int fibonacci(int n){

        if (n <=1)
            return n;
        else
            return fibonacci(n-1)+fibonacci(n-2);
*/
        // 4- topshiriq
        System.out.println(" num = ");
     int num= scanner.nextInt();
     int n=0;
     while (num !=0){
         int s=num%10;
         n=n*10+s;
         num=num/10;
     }
        System.out.println(" teskari son "+n);
    }

}
