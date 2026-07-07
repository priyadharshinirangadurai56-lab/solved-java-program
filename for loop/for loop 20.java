import java.util.*;
public class MovieBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        double originalTotal = 0;
        double finalTotal = 0;
        for(int i = 1; i <= n; i++) {
            String seatType = sc.next();
            String customerType = sc.next();
            double basePrice = 0;
            int discount = 0;
            if(seatType.equalsIgnoreCase("Regular"))
                basePrice = 12.0;
            else if(seatType.equalsIgnoreCase("Premium"))
                basePrice = 18.0;
            else if(seatType.equalsIgnoreCase("Recliner"))
                basePrice = 25.0;
            if(customerType.equalsIgnoreCase("Child"))
                discount = 30;
            else if(customerType.equalsIgnoreCase("Senior"))
                discount = 25;
            else
                discount = 0;
            double finalPrice = basePrice * (1 - discount / 100.0);
            originalTotal += basePrice;
            finalTotal += finalPrice;
            System.out.println("Ticket " + i + ": " + seatType + " - " + customerType);
            System.out.println("Base Price: $" + basePrice);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Final Price: $" + finalPrice);
        }
        boolean groupDiscount = false;
        if(n >= 5) {
            finalTotal = finalTotal * 0.9;  
            groupDiscount = true;
        }
        double totalDiscount = originalTotal - finalTotal;
        System.out.println("Total Tickets: " + n);
        System.out.println("Original Total: $" + originalTotal);
        System.out.println("Total Discount: $" + totalDiscount);
        System.out.println("Final Total: $" + finalTotal);
        if(groupDiscount)
            System.out.println("Group Discount Applied: Yes");
        else
            System.out.println("Group Discount Applied: No");
    }
}