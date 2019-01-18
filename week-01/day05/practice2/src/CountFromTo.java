import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a whole number!");
        int number1 = scanner.nextInt();
        System.out.println("Give me an other whole number!");
        int number2 = scanner.nextInt();
        if (number2 <= number1) {
            System.out.println("The second number should be bigger!");
        } else {
            for (int i = number1; i < number2; i++ ) {
                System.out.println(i);

            }
        }

    }
}