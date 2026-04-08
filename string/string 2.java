import java.util.Scanner;
public class PasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        boolean hasUppercase = false;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
                break;
            }
        }
        if (hasUppercase) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}