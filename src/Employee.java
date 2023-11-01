import static java.awt.SystemColor.text;

public class Employee {
    String  fistname;
    String  lastname;
    /*
public  Employee() {
    // default
    System.out.println(" A am in constructor");
}
    public Employee(String text){
        System.out.println(text); }*/
 public  void  Show(){
     System.out.println("Employee");
 }

public  String getDetail(){
    return  "Salom";
    
}

    @Override
    public String toString() {
        return "Salom 2";
    }
}

