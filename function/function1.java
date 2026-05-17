import java.util.Scanner;
public class Main {
    public static void fibonacci(int n) {
        int first = 0, second = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(first);
            if (i != n - 1) {
                System.out.print(" ");
            }
            int next = first + second;
            first = second;
            second = next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci(n);
    }
}