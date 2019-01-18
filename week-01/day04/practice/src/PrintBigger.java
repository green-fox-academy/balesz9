import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the 1. number!");
        int number1=scanner.nextInt();
        System.out.println("Give the 2. number!");
        int number2=scanner.nextInt();
        if ( number1 > number2 ) {
            System.out.println("The bigger number is: "+number1);
        } else if (number1<number2) {
            System.out.println("The bigger number is: "+number2);
        }
        else
            System.out.println("The two number is equal.");
    }
}
