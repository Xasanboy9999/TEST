public class Methot_OverLoading {
    public  void displey(){
        System.out.println("method1");
    }
    public  void display(int a){
        System.out.println("method1"+a);

    }

    public void display(double d){
        System.out.println("method1"+d);

    }

    public  int add(int a,int b){
        return  a+b;


    }
    public  double add( double a,double b){
        return a+b;

    }

    public  void sum(int a,int b){
        System.out.println(" int method");
    }

    public int sum(long a, long b){
        System.out.println("Long method");
return (int ) (a+b);
    }

    public static void main(String[] args) {
        Methot_OverLoading lesson= new Methot_OverLoading();
        lesson.displey();
        lesson.display(112125);
        lesson.display(1.1145);
        lesson.sum(1,2);
        lesson.sum(5L,4L);
        lesson.add(5,6);
        lesson.add(5.2,6.3);
        System.out.println(lesson.add(2,6));
        System.out.println(lesson.sum(4L,5L));






    }
}
