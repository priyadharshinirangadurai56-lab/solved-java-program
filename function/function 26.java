import java.util.Scanner;
public class LargestNumber {
    public static int findLargest(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b; 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int result = findLargest(A, B);
        System.out.println(result);
    }
}