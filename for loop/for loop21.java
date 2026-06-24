import java.util.Scanner;
public class RestaurantOrderSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int totalItems = 0;
        double subtotal = 0;
        for (int i = 1; i <= N; i++) {
            String itemName = sc.next();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();
            double itemSubtotal = price * quantity;
            System.out.println("Item: " + itemName);
            System.out.println("Price: $" + price + " x " + quantity);
            System.out.println("Subtotal: $" + itemSubtotal);
            subtotal += itemSubtotal;
            totalItems += quantity;
        }
        double tax = subtotal * 0.08;
        double serviceCharge = subtotal * 0.10;
        double grandTotal = subtotal + tax + serviceCharge;
        System.out.println("Total Items: " + totalItems);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax (8%): $" + tax);
        System.out.println("Service Charge (10%): $" + serviceCharge);
        System.out.println("Grand Total: $" + grandTotal);
    }
}