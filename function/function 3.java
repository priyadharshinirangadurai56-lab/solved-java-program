import java.util.Scanner;
public class EvenOddCheck {
    public static String checkNumber(int n) {
        if (n % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        System.out.println(checkNumber(n)); 
    }
}