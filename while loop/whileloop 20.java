import java.util.Scanner;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int original = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            int fact = 1;
            int i = 1;
            while (i <= digit) {
                fact *= i;
                i++;
            }
            sum += fact;
            number /= 10;
        }
        if (sum == original) {
            System.out.println(original + " is a strong number");
        } else {
            System.out.println(original + " is not a strong number");
        }
    }
}