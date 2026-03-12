import java.util.Scanner;
public class BloodDonorEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int eligibleCount = 0;
        int rejectedCount = 0;
        for (int i = 1; i <= N; i++) {
            String name = sc.next();
            int age = sc.nextInt();
            double weight = sc.nextDouble();
            double hemoglobin = sc.nextDouble();
            String status = "Eligible";
            String reason = "";
            if (age < 18) {
                status = "Not Eligible";
                reason = "Age below 18 years";
            } 
            else if (age > 65) {
                status = "Not Eligible";
                reason = "Age above 65 years";
            } 
            else if (weight < 50) {
                status = "Not Eligible";
                reason = "Weight below 50 kg";
            } 
            else if (hemoglobin < 12.5) {
                status = "Not Eligible";
                reason = "Hemoglobin below 12.5 g/dL";
            }
            if (status.equals("Eligible")) {
                eligibleCount++;
            } else {
                rejectedCount++;
            }
            System.out.println("Donor: " + name);
            System.out.println("Age: " + age + " years");
            System.out.println("Weight: " + weight + " kg");
            System.out.println("Hemoglobin: " + hemoglobin + " g/dL");
            System.out.println("Status: " + status);

            if (status.equals("Not Eligible")) {
                System.out.println("Reason: " + reason);
            }
        }

        double eligibilityRate = (eligibleCount * 100.0) / N;
        System.out.println("Total Donors: " + N);
        System.out.println("Eligible Donors: " + eligibleCount);
        System.out.println("Rejected Donors: " + rejectedCount);
        System.out.println("Eligibility Rate: " + eligibilityRate + "%");
    }
}