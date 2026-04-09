import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        int index = email.indexOf('@');
        String username = email.substring(0, index);
        System.out.println(username);
    }
}