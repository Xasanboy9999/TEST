public class Metod {
    // qiymat qaytarmaydigan
    // qiymat qaytaradigan

    public static void main(String[] args) {

        Metod metod=new Metod();
        metod.getmassege("Alooooo");
        System.out.println(metod.getSum(4,5));
    }

    public  void getmassege(String salom){
        System.out.println("Hello "+salom );
    }
    public  int getSum( int a,int b){

        return a*=b;

    }

}