import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a whole number!");
        int number1 = scanner.nextInt();

        for (int i = 0; i < number1; i++) {
            System.out.println();
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");

            }
            }
        }
    }
