import java.util.Scanner;
public class Main {
    public static String checkPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            return "Perfect Number";
        } else {
            return "Not Perfect Number";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkPerfect(n));
    }
}