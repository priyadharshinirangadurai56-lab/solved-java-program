import java.util.Scanner;
public class ArmstrongChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int originalNumber = number;
        int count = 0;
        int temp = number;
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }
        int sum = 0;
        temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;
            int i = 0;
            while (i < count) {
                power = power * digit;
                i++;
            }
            sum = sum + power;
            temp = temp / 10;
        }
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number");
        }
    }
}