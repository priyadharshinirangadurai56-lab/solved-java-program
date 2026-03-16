import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secretNumber = sc.nextInt(); 
        int guess = 0;
        int attempts = 0;
        while (guess != secretNumber) {
            guess = sc.nextInt();
            attempts++;
            System.out.println("Guess the number (1100): " + guess);
            if (guess > secretNumber) {
                System.out.println("Too high!");
            } 
            else if (guess < secretNumber) {
                System.out.println("Too low!");
            } 
            else {
                System.out.println("Correct! Attempts: " + attempts);
            }
        }
    }
}