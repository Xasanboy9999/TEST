public class Constructor_lesson {

    int id;
    String  name;
    public Constructor_lesson(){
        System.out.println(" SALOM DUNYO");
    }
    public Constructor_lesson(int id, String name){
this.id=id;
this.name=name;

    }
public  void print(){
    System.out.println(id+" "+name);
}
    public static void main(String[] args) {
        Student student= new Student(1, "Xasanboy");
        student.print();


    }
}
