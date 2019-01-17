import java.util.Scanner;

public class MileToKmConverter {
        public static void main(String[] args) {
            // Write a program that asks for an integer that is a distance in kilometers,
            // then it converts that value to miles and prints it
            System.out.println("How money kms do you want to change to miles?");
            Scanner scanner = new Scanner(System.in);
            int userInput1 = scanner.nextInt();
            System.out.println(userInput1+" km"+" is "+userInput1/1.609+" miles.");

        }
}
