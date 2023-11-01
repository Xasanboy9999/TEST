import java.util.Locale;

public class StringDataTyping {
    public static void main(String[] args) {
        String text= " Salom dunyo ";
        System.out.println(text);
        String str="";
        String text1= new String(" Hello world ");
        System.out.println(text1);   // text chiqarish
        System.out.println(text.length());
        String upperCase=text.toUpperCase();
        String lowerCase=text.toLowerCase();
        System.out.println(upperCase); // hamma sozlarni katta harfda chiqarish
        System.out.println(lowerCase);  // hamma sozlarda kichik harfda chiqarish

        String replace = text.replace( "Salom " ,"Hello "); // sozlar o`rnini almashtirish
        System.out.println(replace);
         String  concat = text.concat("").concat(text1);
        System.out.println(concat);    // so`zlarni bir biriga qoshib chiqarish

        String  concat1 =text+text1;   // So`zlarni qoshib chiqarish
        System.out.println(concat1);

        String  concat2 = " SALOM "+ 50  + true;
        System.out.println(concat2);


    }
}
