public class Whilemasala1 {
    public static void main(String[] args) {
        int A = 15; // A soni
        int B = 14;  // B soni
        if (A > B) {
            int qolganqism = A;
            while (qolganqism >= B) {
                qolganqism -= B;
            }
            System.out.println("A kesmaning bo'sh qolgan qismi: " + qolganqism);
        } else {
            System.out.println("A <= B");
        }
    }
}