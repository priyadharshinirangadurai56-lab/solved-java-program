import java.util.Scanner;
public class LibraryFineSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double totalFines = 0;
        int overdueCount = 0;
        for(int i = 1; i <= N; i++) {
            String bookType = sc.next();
            int daysLate = sc.nextInt();
            double dailyFine = 0;
            double cap = 0;
            if(bookType.equalsIgnoreCase("Regular")) {
                dailyFine = 0.5;
                cap = 10;
            }
            else if(bookType.equalsIgnoreCase("Reference")) {
                dailyFine = 1.0;
                cap = 20;
            }
            else if(bookType.equalsIgnoreCase("Magazine")) {
                dailyFine = 0.25;
                cap = 5;
            }
            double calculatedFine = daysLate * dailyFine;
            double actualFine = calculatedFine;
            String capApplied = "No";
            if(calculatedFine > cap) {
                actualFine = cap;
                capApplied = "Yes";
            }
            if(daysLate > 0) {
                overdueCount++;
            }
            totalFines += actualFine;
            System.out.println("Book " + i + ": " + bookType);
            System.out.println("Days Late: " + daysLate);
            System.out.println("Daily Fine: $" + dailyFine);
            System.out.println("Calculated Fine: $" + calculatedFine);
            System.out.println("Actual Fine: $" + actualFine);
            System.out.println("Cap Applied: " + capApplied);
        }
        double averageFine = totalFines / N;
        System.out.println("Total Books: " + N);
        System.out.println("Total Fines Collected: $" + totalFines);
        System.out.println("Books Overdue: " + overdueCount);
        System.out.println("Average Fine: $" + averageFine);
    }
}