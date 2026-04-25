import java.util.Scanner;
public class StringCopyManual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        char[] source = input.toCharArray();
        char[] destination = new char[source.length];
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
        String copiedString = new String(destination);
        System.out.println("Copied String: " + copiedString);
    }
}