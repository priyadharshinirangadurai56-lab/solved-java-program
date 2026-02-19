import java.util.Scanner;
public class basic10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int deliveries = sc.nextInt();
        int payoutPerDelivery = sc.nextInt();
        int incentive = sc.nextInt();
        int fuelCost = sc.nextInt();
        int netEarnings = (deliveries * payoutPerDelivery) + incentive - fuelCost;
        System.out.println("Driver Earnings = " + netEarnings);
    }
}
