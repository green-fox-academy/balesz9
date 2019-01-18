import java.util.Scanner;

public class DrawDiagonal {
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
            for (int l=0; l <k;l++) {
                System.out.print(" ");
            }
            System.out.print("%");
            for (int m=0; m<(number1-k-3); m++) {
                System.out.print(" ");
            }

            System.out.println("%");

        }
        for (int j = 0; j < number1; j++) {
            System.out.print("%");
        }
    }
}
