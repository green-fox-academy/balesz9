import java.util.Scanner;
    public class ParametricAverage {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Give me a whole number!");
            int number;
            int number2;
            double sumOfNumbers=0;
            double counter=0;
            double average=0;
            number = scanner.nextInt();
            do {
                System.out.println("Give me a whole number!");
                number2 = scanner.nextInt();
                sumOfNumbers=sumOfNumbers+number2;
                counter += 1;
            }
            while (counter < number) ;
            average = sumOfNumbers/counter;
            System.out.println("The sum of the numbers is: "+sumOfNumbers+".The average of the numbers is: "+average);



        }
    }
