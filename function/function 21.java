import java.util.Scanner;
public class CalculatorFunctions {
    static double add(double a, double b) {
        return a + b;
    }
    static double subtract(double a, double b) {
        return a - b;
    }
    static double multiply(double a, double b) {
        return a * b;
    }
    static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Division by zero is not possible");
            return 0;
        }
        return a / b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
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
                System.out.println(divide(num1, num2));
                break;

            default:
                System.out.println("Invalid Operator");
        }

    }
}