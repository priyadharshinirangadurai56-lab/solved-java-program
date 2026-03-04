import java.util.Scanner;
public class ScholarshipEligibilitySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gpa = sc.nextDouble();
        double familyIncome = sc.nextDouble();
        int extracurricularScore = sc.nextInt();
        sc.nextLine(); 
        String scholarshipType = sc.nextLine();
        boolean isEligible = false;
        double awardAmount = 0.0;
        String awardCategory = "None";
        if (gpa >= 2.5) {
            if (scholarshipType.equalsIgnoreCase("Merit")) {
                if (gpa >= 3.8 && extracurricularScore >= 80) {
                    isEligible = true;
                    awardAmount = 25000.0;
                    awardCategory = "Full";
                }
                else if (gpa >= 3.5 && extracurricularScore >= 70) {
                    isEligible = true;
                    awardAmount = 15000.0;
                    awardCategory = "Partial";
                }
                else if (gpa >= 3.0 && extracurricularScore >= 60) {
                    isEligible = true;
                    awardAmount = 8000.0;
                    awardCategory = "Minimal";
                }
            }
            else if (scholarshipType.equalsIgnoreCase("Need-Based")) {
                if (familyIncome <= 30000 && gpa >= 3.5) {
                    isEligible = true;
                    awardAmount = 30000.0;
                    awardCategory = "Full";
                }
                else if (familyIncome <= 50000 && gpa >= 3.0) {
                    isEligible = true;
                    awardAmount = 18000.0;
                    awardCategory = "Partial";
                }
                else if (familyIncome <= 70000 && gpa >= 2.8) {
                    isEligible = true;
                    awardAmount = 10000.0;
                    awardCategory = "Minimal";
                }
            }
            else if (scholarshipType.equalsIgnoreCase("Sports")) {
                if (extracurricularScore >= 85 && gpa >= 3.0) {
                    isEligible = true;
                    awardAmount = 22000.0;
                    awardCategory = "Full";
                }
                else if (extracurricularScore >= 75 && gpa >= 2.8) {
                    isEligible = true;
                    awardAmount = 20000.0;
                    awardCategory = "Partial";
                }
            }
        }
        System.out.println("GPA: " + gpa);
        System.out.println("Family Income: $" + familyIncome);
        System.out.println("Extracurricular Score: " + extracurricularScore);
        System.out.println("Scholarship Type: " + scholarshipType);
        if (isEligible) {
            System.out.println("Eligibility: Eligible");
            System.out.println("Award Amount: $" + awardAmount);
            System.out.println("Award Category: " + awardCategory);
        } else {
            System.out.println("Eligibility: Not Eligible");
            System.out.println("Award Amount: $0.0");
            System.out.println("Award Category: None");
        }
    }
}