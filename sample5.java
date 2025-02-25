import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess a number between 1 and 10: ");
        int guess = scanner.nextInt();

        if (guess == secretNumber) {
            System.out.println("Correct! You guessed it.");
        } else {
            System.out.println("Wrong! The number was " + secretNumber);
        }

        scanner.close();
    }
}

