import java.util.Scanner;
public class basic5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalBill = sc.nextDouble();
        double servicePercent = sc.nextDouble();
        double gstPercent = sc.nextDouble();
        int people = sc.nextInt();
        double serviceAmount = totalBill * servicePercent / 100;
        double gstAmount = totalBill * gstPercent / 100;
        double finalBill = totalBill + serviceAmount + gstAmount;
        double perPerson = finalBill / people;
        System.out.println("Amount Per Person = " + perPerson);
    }
    
}
