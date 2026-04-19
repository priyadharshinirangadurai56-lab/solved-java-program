import java.util.Scanner;
public class UpperCaseConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32); 
            }
            result += ch;
        }
        System.out.println(result);
    }
}