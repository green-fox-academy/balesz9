import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
        System.out.println("How many chicken do you have?");
        Scanner scanner = new Scanner(System.in);
        int userChicken= scanner.nextInt();
        System.out.println("How money pigs do you have?");
        int userPig= scanner.nextInt();
        System.out.println("The number of your animals legs is: "+(userChicken*2+userPig*4)+".");





    }
}
