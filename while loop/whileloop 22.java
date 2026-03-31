import java.util.Scanner;
public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int sum = 0;
        int temp = start; 
        while (temp <= end) {
            if (temp % 2 == 0) {
                sum += temp;
            }
            temp++;
        }
        System.out.println("Sum of even numbers from " + start + " to " + end + ": " + sum);
    }
}