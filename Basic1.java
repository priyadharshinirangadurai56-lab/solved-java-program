import java.util.Scanner;

public class Basic1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int basic= sc.nextInt();
        int hra = sc.nextInt();
        int bonus = sc.nextInt();
        int tax = sc.nextInt();
        int pf = sc.nextInt();
        int home= basic+hra+bonus-tax-pf;
        System.out.println("Taking Home Salary : " + home);

    }
}
