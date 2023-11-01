public interface Printable {
    int MIN=5;
    void print();
    default  void msg(){
        System.out.println("Hello massage");
    }
    static int sum(int a,int b){
        return a-b;

    }
    private  void test(){
        System.out.println("test");
    }

}
