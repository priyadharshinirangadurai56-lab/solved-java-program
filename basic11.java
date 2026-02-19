import java.util.Scanner;
public class basic11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        int ratePerKm = sc.nextInt();
        int maintenance = sc.nextInt();
        int allowance = sc.nextInt();
        int subsidy = sc.nextInt();
        int totalFee = (distance * ratePerKm) + maintenance + allowance - subsidy;
        System.out.println("Total Transport Fee = " + totalFee);
    }
}
