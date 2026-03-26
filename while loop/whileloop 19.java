import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        int num = decimal;
        String binary = "";
        while (num > 0) {
            int remainder = num % 2;
            binary = remainder + binary;
            num = num / 2;
        }
        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + binary);
    }
}