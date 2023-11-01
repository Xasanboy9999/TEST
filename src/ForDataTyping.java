import java.util.Scanner;

public class ForDataTyping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n sonini kiriting = ");
        int n= scanner.nextInt();
        /*int sum=1;
        for (int i = 1; i <=n; i++) {
           /* System.out.println("sum ="+sum+"+ "+i);
            sum=sum+i;
            sum*=i; //sum=sum*i;
        }
        System.out.println(sum);
        for (int i = 0; i < 10; i++) {
            if(i!=4&&i!=6){
                System.out.println(i);
        }
    }
        int sum=0;
        for (int i = 1; i <n; i++) {
            if(i%2==0 && i%3==0){
               System.out.println(i);
               // sum+=i;

        }

        }
       // System.out.println("   6 ga bo`linadigan sonlar yig`indisi = "+sum);

         */
        out:
        for (int i = 2; i <=n; i++) {
            for (int j = 2; j <i/2 ; j++) {
                if(i%j==0){
                    continue  out;
                }

            }
            System.out.println(i);
        }
    }
    }


