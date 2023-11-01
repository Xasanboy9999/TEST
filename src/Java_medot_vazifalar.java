import java.util.Scanner;

public class Java_medot_vazifalar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1-topshiriq
        /*
        int [] a={3,6,9,12};
         int sum=0;
        for (int i = 0; i <a.length ; i++) {
            sum+=a[i];
        }
        double ortacha=(double) sum/a.length;
        System.out.println(" ortacha qiymat "+ortacha); */

        // 2- topshiriq
        /*
        int n = 5;
        int sum=fibonacciSum(n);
        System.out.println("yogindi ="+sum);
    }
    public static int fibonacciSum(int n) {

        if (n <= 0){
            return 0;
        } else if (n==1) {
            return 1;
        }
        else
        return fibonacci(n)+fibonacci(n-1);
}
    public static int fibonacci(int n) {

        if (n <= 0){
            return 0;
        } else if (n==1) {
            return 1;

        }
        else
            return fibonacci(n-1)+fibonacci(n-2); */

        //3-topshiriq
/*

                System.out.print("bir satr kiriting:  ");
                String str = scanner.nextLine();
                if (isPalindrome(str)) {
                    System.out.println(true);
                } else {
                    System.out.println(false);
                }
            }
            public static boolean isPalindrome(String str) {
                String teskariStr = " ";
                for (int i = str.length() - 1; i >= 0; i--) {
                    teskariStr += str.charAt(i);
                }*/

        // 4-topshiriq
/*
                String str = "Hello";
                char ch = 'l';
                int count = satr(str, ch);
                System.out.println("Belgi \"" + ch + "\" satrda " + count + " marta paydo bo'ldi.");
            }
            public static int satr(String str, char ch) {
                int count = 0;
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == ch) {
                        count++;
                    }
                }
                return count;*/

        //5- topshiriq

        System.out.println(" numner kirit :");
        int number= scanner.nextInt();
                long factorial = Faktarial(number);
                System.out.println(number + " ning faktoriali: " + factorial);
            }

            public static long Faktarial(int number) {
                    long factorial = 1;
                    for (int i = 1; i <= number; i++) {
                        factorial *= i;
                    }

                    return factorial;
                }


        }




