import java.util.Scanner;
public class BankTransaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double deposits = 0;
        double withdrawals = 0;
        double transfers = 0;
        double payments = 0;
        for (int i = 1; i <= n; i++) {
            String type = sc.next();
            double amount = sc.nextDouble();
            String category;
            if (type.equals("Deposit")) {
                category = "Credit";
                deposits += amount;
            } 
            else if (type.equals("Withdrawal")) {
                category = "Debit";
                withdrawals += amount;
            } 
            else if (type.equals("Transfer")) {
                category = "Debit";
                transfers += amount;
            } 
            else {
                category = "Debit";
                payments += amount;
            }
            System.out.println("Transaction " + i + ": " + type);
            System.out.println("Amount: $" + amount);
            System.out.println("Category: " + category);
            System.out.println();
        }
        double net = deposits - (withdrawals + transfers + payments);
        System.out.println("Total Transactions: " + n);
        System.out.println("Total Deposits: $" + deposits);
        System.out.println("Total Withdrawals: $" + withdrawals);
        System.out.println("Total Transfers: $" + transfers);
        System.out.println("Total Payments: $" + payments);
        System.out.println("Net Balance Change: $" + net);
    }
}