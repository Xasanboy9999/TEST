public class Student {
    int id;
    String name;

    public Student(int id,String name) {
        this.id = id;
        this.name=name;
    }

    public Student() {
    }
    public  void print(){
        System.out.println(id+" "+name);
    }
}
