import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a whole number!");
        int number1 = scanner.nextInt();

        for (int i = 1; i <= number1; i++) {
            for (int j = i; j < number1; j++)
                System.out.print(" ");
            for (int k = 1; k < (i * 2); k++)
                System.out.print("*");
            System.out.println(" ");
            }
        }
    }



