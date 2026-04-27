import java.util.Scanner;
public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.trim();
        int count = 0;
        if (str.isEmpty()) {
            count = 0;
        } else {
            count = 1;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}