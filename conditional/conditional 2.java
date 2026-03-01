import java.util.Scanner;
public class LoanApprovalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int creditScore = sc.nextInt();
        double annualIncome = sc.nextDouble();
        double debtRatio = sc.nextDouble();
        sc.nextLine(); 
        String loanType = sc.nextLine();

        String decision = "Rejected";
        double maxLoan = 0.0;
        if (creditScore < 600 || debtRatio > 50) {
            decision = "Rejected";
            maxLoan = 0.0;
        } 
        else {
            String creditTier;
            if (creditScore >= 750)
                creditTier = "Excellent";
            else if (creditScore >= 700)
                creditTier = "Good";
            else if (creditScore >= 650)
                creditTier = "Fair";
            else
                creditTier = "Poor";
            String debtTier;
            if (debtRatio <= 30)
                debtTier = "Low";
            else if (debtRatio <= 40)
                debtTier = "Moderate";
            else
                debtTier = "High";
            if (loanType.equalsIgnoreCase("Home")) {
                if (creditTier.equals("Excellent") && debtTier.equals("Low")) {
                    decision = "Approved";
                    maxLoan = annualIncome * 4;
                }
                else if (creditTier.equals("Good") && debtTier.equals("Moderate")) {
                    decision = "Needs Review";
                    maxLoan = annualIncome * 3;
                }
                else if (creditTier.equals("Good") && debtTier.equals("Low")) {
                    decision = "Approved";
                    maxLoan = annualIncome * 3;
                }
                else {
                    decision = "Needs Review";
                    maxLoan = annualIncome * 2;
                }
            } 
            else if (loanType.equalsIgnoreCase("Personal")) {

                if (creditTier.equals("Excellent") && debtTier.equals("Low")) {
                    decision = "Approved";
                    maxLoan = annualIncome * 1;
                }
                else if (creditTier.equals("Fair") && debtTier.equals("Moderate")) {
                    decision = "Needs Review";
                    maxLoan = annualIncome * 0.5;
                }
                else if (creditTier.equals("Good") && debtTier.equals("Low")) {
                    decision = "Approved";
                    maxLoan = annualIncome * 0.8;
                }
                else {
                    decision = "Needs Review";
                    maxLoan = annualIncome * 0.5;
                }

            } 
            else if (loanType.equalsIgnoreCase("Business")) {
                if ((creditTier.equals("Excellent") || creditTier.equals("Good"))
                        && (debtTier.equals("Low") || debtTier.equals("Moderate"))) {
                    decision = "Approved";
                    maxLoan = annualIncome * 3;
                }
                else if (creditTier.equals("Fair") && debtTier.equals("Moderate")) {
                    decision = "Needs Review";
                    maxLoan = annualIncome * 2;
                }
                else {
                    decision = "Needs Review";
                    maxLoan = annualIncome * 1.5;
                }
            }
        }
        System.out.println("Credit Score: " + creditScore);
        System.out.println("Annual Income: $" + annualIncome);
        System.out.println("Debt-to-Income Ratio: " + debtRatio + "%");
        System.out.println("Loan Type: " + loanType);
        System.out.println("Decision: " + decision);
        System.out.println("Maximum Loan Amount: $" + maxLoan);
    }
}