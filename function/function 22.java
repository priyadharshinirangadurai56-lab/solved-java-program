import java.util.Scanner;
public class CalculatorUsingFunctions {
    static int add(int a, int b) {
        return a + b;
    }
    static int subtract(int a, int b) {
        return a - b;
    }
    static int multiply(int a, int b) {
        return a * b;
    }
    static int divide(int a, int b) {
        return a / b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        char choice = sc.next().charAt(0);
        switch (choice) {
            case '+':
                System.out.println(add(num1, num2));
                break;
            case '-':
                System.out.println(subtract(num1, num2));
                break;
            case '*':
                System.out.println(multiply(num1, num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println(divide(num1, num2));
                } else {
                    System.out.println("Division by zero not possible");
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}