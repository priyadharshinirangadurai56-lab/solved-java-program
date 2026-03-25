import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary = sc.nextInt();
        int original = binary;
        int decimal = 0;
        int power = 0;
        while (binary > 0) {
            int lastDigit = binary % 10;          
            decimal += lastDigit * Math.pow(2, power); 
            power++;
            binary = binary / 10;               
        }
        System.out.println("Binary: " + original);
        System.out.println("Decimal: " + decimal);
    }
}