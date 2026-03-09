import java.util.Scanner;
public class InventoryStockManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int lowStockCount = 0;
        int criticalCount = 0;
        int totalReorder = 0;
        for (int i = 1; i <= n; i++) {
            String name = sc.next();
            int currentStock = sc.nextInt();
            int minimumStock = sc.nextInt();
            String status;
            int reorder = 0;
            if (currentStock >= minimumStock) {
                status = "Adequate";
                reorder = 0;
            } 
            else if (currentStock >= minimumStock / 2) {
                status = "Low Stock";
                reorder = (minimumStock - currentStock) + (minimumStock / 2);
                lowStockCount++;
            } 
            else {
                status = "Critical";
                reorder = (minimumStock - currentStock) + (int)(minimumStock * 1.5);
                criticalCount++;
            }
            totalReorder += reorder;
            System.out.println("Product: " + name);
            System.out.println("Current Stock: " + currentStock);
            System.out.println("Minimum Stock: " + minimumStock);
            System.out.println("Status: " + status);
            System.out.println("Reorder Quantity: " + reorder);
        }
        System.out.println("Total Products: " + n);
        System.out.println("Low Stock Items: " + lowStockCount);
        System.out.println("Critical Items: " + criticalCount);
        System.out.println("Total Reorder Quantity: " + totalReorder);
    }
}