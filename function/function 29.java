import java.util.Scanner;
public class Main {
    public static float calculateArea(int r) {
        return (float)(3.14 * r * r);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.printf("%.2f", calculateArea(r));
    }
}