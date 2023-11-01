import java.util.Scanner;

public class massiv_amaliyot {
    public static void main(String[] args) {
// hamma topshiriq bir qilib bajarilgan

        // 1- topshiriq
        /*
        int[] a ={2,5,3,8,6};
       // int[] a ={10, 25, 33, 20, 18};
       int son = Integer.MIN_VALUE;
       int ikkinchi_son = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++)

        {
            if (a[i] > son) {
                ikkinchi_son = son;
                son = a[i];
            } else if (a[i] > ikkinchi_son && a[i] != son) {
                ikkinchi_son= a[i];
            }
        }
        System.out.println("Natija3656+" + ikkinchi_son); */

        // 2- topshiriq
/*
        int[] a ={10, 25, 33, 20, 18};
        int sum=0;
        for (int i = 0; i < a.length; i++)
        sum+=a[i];
        System.out.println(sum);
*/
        // 3-topshiriq
        /*
        int[] a ={10, 25, 33, 20, 18};
        //int [] a={100, 150, 175, 200, 250};
        boolean son=true;
        for (int i = 0; i < a.length-1; i++){
            if (a[i]>a[i+1]){
                son=false;
                break;
            }
        }
        System.out.println(son); */

        //5-topshiriq
        /*
        int[] a ={10, 25, 33, 20, 18};
        int max= a[0];
        int min= a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i]>max){
                max=a[i];
            }
            if (a[i]<min){
                min=a[i];
            }

        }
        System.out.println(" eng katta qiymat "+max);
        System.out.println(" eng kichik qiymat  "+min); */




    }
}
