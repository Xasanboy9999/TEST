
public class InkremenDataTyping {
    public static void main(String[] args) {
        int a = 2;
        int a2=a*a;
        int a4=a2*a2;
        System.out.println("aTo4="+a4);
        int b1=a*a;
        int b3=a*b1;
        int b6=b3*b3;
        System.out.println("aTo6="+b6);
        int c2=a*a;
        int c4=c2*c2;
        int c5=a*c4;
        int c10=c5*c5;
        int c15=c10*c5;
        System.out.println("aTo15="+c15);
    }
}
