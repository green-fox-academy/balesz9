import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the 1. number!");
        int number1=scanner.nextInt();
        System.out.println("Give the 2. number!");
        int number2=scanner.nextInt();
        System.out.println("Give the 3. number!");
        int number3=scanner.nextInt();
        System.out.println("Give the 4. number!");
        int number4=scanner.nextInt();
        System.out.println("Give the 5. number!");
        int number5=scanner.nextInt();
        int sum= number1+number2+number3+number4+number5;
        System.out.println("The average of the numbers you gave is: "+(sum/5.)+" . The sum is "+sum+".");
    }
}
