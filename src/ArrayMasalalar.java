import java.lang.Math;

public class ArrayMasalalar{
    public static void main(String[] args) {
        int x1 = 2;
        int y1 = 3;
        int x2 = 5;
        int y2 = 8;
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Masofa: " + distance);
    }
    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        double distance;
        switch (Math.abs(x2 - x1) % 2 + Math.abs(y2 - y1) % 2) {
            case 0:
                distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
                break;
            default:
                distance = Math.abs(x2 - x1) + Math.abs(y2 - y1);
                break;
        }
        return distance;
    }
}