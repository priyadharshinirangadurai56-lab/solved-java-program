import java.util.Scanner;

public class basic8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rodsPerHour = sc.nextInt();
        int hoursWorked = sc.nextInt();
        int overtimeRods = sc.nextInt();
        int rejectedRods = sc.nextInt();

        int normalProduction = rodsPerHour * hoursWorked;
        int usableRods = normalProduction + overtimeRods - rejectedRods;

        System.out.println("Usable Rods = " + usableRods);
    }
}
