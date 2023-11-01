public class Main {

    /*
    public  Main (){
        ThisKeywordLesson thisKeywordLesson = new ThisKeywordLesson(this);

    }
    public static void main(String[] args) {
        ThisKeywordLesson thisKeywordLesson =new ThisKeywordLesson(1,"Xasanboy","Ibrohimov");
        System.out.println(thisKeywordLesson.id);
        System.out.println(thisKeywordLesson.name);
        System.out.println(thisKeywordLesson.lastname);
        thisKeywordLesson.insert();

    }*/
    public  int a;
    public  long b;
    public  void test(long b){
        System.out.println(" long b");

    }
    public  void test(int a){
        System.out.println(" int a");
    }

    public static void main(String[] args) {
        Main main=new Main();
        main.test(9*1000000000);
    }
}