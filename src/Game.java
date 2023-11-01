import java.util.Random;
import java.util.Scanner;

public class Game {
    public void  playGame(){
        Random r =new Random();
        int hisob=0;
        int s=0;
        boolean tf= true;
        System.out.println("O`yinni nech songacha o`ynaysiz ?");
        int scanner= new Scanner(System.in).nextInt();
        while(tf){

        int random1=r.nextInt(0,scanner);
        int random2=r.nextInt(0,scanner);
        System.out.print(random1+"+"+random2+"=");
        int javob=new Scanner(System.in).nextInt();
        if(javob==random1+random2){
            hisob++;
            s++;
            System.out.println("javob to`gri,hisobingiz: "+hisob);

        }
        else { hisob-=2;
            int a=random1+random2;
            s++;
            System.out.println("Siz xato javob berdingiz. \n Javob" +" " + a  +" "+"edi.");
         if(s!=0&&hisob<=0){
             tf=false;
             s=0;
         }
        }
        }
        System.out.println("Siz o`yinda yutqazdingiz sababi siz juda ko`p xato qildingiz");
    }


    }

