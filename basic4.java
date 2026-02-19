import java.util.Scanner;
public class basic4 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        double tuitionFees = sc.nextDouble();
        double scholarshipPercent = sc.nextDouble();
        double examFee = sc.nextDouble();
        double libraryFee = sc.nextDouble();
        double scholarshipAmount = tuitionFees * scholarshipPercent / 100;
        double payableTuition = tuitionFees - scholarshipAmount;
        double finalFee = payableTuition + examFee + libraryFee;
        System.out.println("Final Payable Fee = " + (int)finalFee);
        }
    
}
