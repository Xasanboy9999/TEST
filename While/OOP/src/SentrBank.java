public class SentrBank {
    public static void main(String[] args) {
        Bank sqb=new SQB();
        Bank nbubank=new NBUbank();
        Bank kapitalbank=new Kapitalbank();
        sqb.rate();
        nbubank.rate();
        kapitalbank.rate();
        kapitalbank.getMsg();

    }
}
