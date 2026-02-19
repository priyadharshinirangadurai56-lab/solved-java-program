import java.util.Scanner;

public class basic3 {
    public static void main(String [] arge){
        Scanner sc = new Scanner (System.in);
        double sales =sc.nextDouble();
        double discountpercent = sc.nextDouble();
        double gstpercent = sc.nextDouble();
        double discount = sales * discountpercent / 100;
        double afterDiscount = sales - discount;
        double gst = afterDiscount * gstpercent / 100;
        double finalRevenue = afterDiscount + gst ;
        System.out.println("Final Revenue = " + finalRevenue);



    }
    
}
