import java.util.Scanner;

public class shartoperatori_amaliy {
    /*
    public static boolean Palindrom(int number) {
        int teskari_son = 0;
        int haqiqiy_son =number;
        while (number!= 0) {
            int bolinma = number % 10;
            teskari_son = teskari_son * 10 + bolinma;
            number /= 10;
        }
        return haqiqiy_son == teskari_son;
    }*/
    public static void main(String[] args) {
       /* int son = 12321;

        if (Palindrom(son)) {
            System.out.println(son + " palindrom son.");
        } else {
            System.out.println(son + " palindrom son emas.");
        } */

        // 2
        Scanner scanner = new Scanner(System.in);

        /*
        System.out.println(" belsini kiring : ");
        char ch=scanner.next().charAt(0);
        String message;
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            message = "Harf unli";
        } else if (Character.isLetter(ch)) {
            message = "Harf - undosh";
        } else {
            message = "Harf emas";
        }

        System.out.println(message);

        scanner.close();
*/

        // 3
        /*
        System.out.print("Butun sonni kiriting: ");
        int son = scanner.nextInt();
        boolean ildiz = son >= 0 && Math.sqrt(son) % 1 == 0;
        System.out.println(ildiz);
        scanner.close();

         */
//4
       /* System.out.print("Jumlayi kiriting: ");
        String sentence = scanner.nextLine();
        String[] sozlar = sentence.split(" ");
        String longestWord = "";
        for (String soz : sozlar) {
            if (soz.length() > longestWord.length()) {
                longestWord = soz;
            }
        }

        System.out.println("Eng uzun so'z: " + longestWord);

        scanner.close();*/
        // 5
        System.out.println(" bolaning yoshi : ");
        int yoshi= scanner.nextInt();
        String natija;
        if (yoshi<=7){
            natija=" bogcha yoshi";
        }
         else if (yoshi<=18) {
             natija="maktabga boradi";

        } else if (yoshi<=35) {
            natija="ovoz berishi va Oliy ta`limga kirishi mumkin ";

        } else
        natija ="prezidentlikka saylanishi mumkin ";

        System.out.println(" Hozirgi holatingi :  "+" "+natija);

    }
}
