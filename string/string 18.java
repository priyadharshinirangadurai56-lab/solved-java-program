import java.util.Scanner;
public class SpaceCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String address = sc.nextLine();        
        int count = 0;      
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println(count);        
    }
}