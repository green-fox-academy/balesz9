import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a whole number!");
        int number1 = scanner.nextInt();
        for (int i = 0; i < number1; i++) {
            System.out.print("%");
        }
        System.out.println();
        for (int k = 0; k < number1-2; k++) {
            System.out.print("%");
            for (int l=0; l <number1-2;l++) {
                System.out.print(" ");
            }
            System.out.println("%");

        }
        for (int j = 0; j < number1; j++) {
            System.out.print("%");
        }
    }
}