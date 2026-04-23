import java.util.Scanner;
public class FirstOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char target = sc.next().charAt(0);
        int index = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}