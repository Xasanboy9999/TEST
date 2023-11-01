public class Bike extends Wehicle{
   public void run(){
        System.out.println("Bike running");
    }

    public static void main(String[] args) {
        Bike bike= new Bike();
        bike.run();
        Wehicle wehicle=new Bike();
        wehicle.run();

    }
}
