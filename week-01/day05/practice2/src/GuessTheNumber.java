import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 10;
        int number2;
        do {
            System.out.println("Please guess my number!");
            number2 = scanner.nextInt();
            if (number == number2) {
                System.out.println("You guessed the number");
            } else if (number > number2) {
                System.out.println("The number is higher.");
            } else {
                System.out.println("The number is lower.");
            }


        } while (number != number2);
    }
}