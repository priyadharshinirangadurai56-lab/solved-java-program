import java.util.Scanner;
public class ProductDiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  
        int totalItems = 0;
        double originalTotal = 0;
        double finalTotal = 0;
        for (int i = 1; i <= N; i++) {
            String productName = sc.next();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();
            double discount = 0;
            if (quantity == 1) {
                discount = 0;
            } 
            else if (quantity >= 2 && quantity <= 4) {
                discount = 10;
            } 
            else if (quantity >= 5 && quantity <= 9) {
                discount = 15;
            } 
            else {
                discount = 20;
            }
            double original = price * quantity;
            double subtotal = original * (1 - discount / 100);
            System.out.println("Product: " + productName);
            System.out.println("Unit Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + (int)discount + "%");
            System.out.println("Subtotal: $" + subtotal);
            totalItems += quantity;
            originalTotal += original;
            finalTotal += subtotal;
        }
        double totalDiscount = originalTotal - finalTotal;
        double savings = (totalDiscount / originalTotal) * 100;
        System.out.println("Total Items: " + totalItems);
        System.out.println("Original Total: $" + originalTotal);
        System.out.println("Total Discount: $" + totalDiscount);
        System.out.println("Final Total: $" + finalTotal);
        System.out.println("Savings: " + savings + "%");
    }
}