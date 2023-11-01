public class ThisKeywordLesson {
    int id;
    String name;
    String lastname;

    public ThisKeywordLesson(int id,String name,String lastname) {
        this.id = id;
        this.name=name;
        this.lastname=lastname;
    }

    public ThisKeywordLesson() {
        this(15);
        System.out.println("birinchi konstroktor");
    }

    public ThisKeywordLesson(int a) {
        System.out.println("ikkinchi konstroktor");
    }

    public  ThisKeywordLesson(Main main){
        System.out.println("main class");
    }

    public  void  update(){
        System.out.println("update");
    }
    public void  insert(){
        this.update();
    }
    public  void callMethod(ThisKeywordLesson thisKeywordLesson){
        System.out.println("argument the method");
    }
    public void callMethod2(){
        callMethod(this);
    }

    public static void main(String[] args) {

        ThisKeywordLesson thisKeywordLesson= new ThisKeywordLesson();
        thisKeywordLesson.callMethod2();
    }
}