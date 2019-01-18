import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many girls are coming to the party?");
        int a = scanner.nextInt();
        System.out.println("How many boys are coming to the party?");
        int b = scanner.nextInt();
        if ((a+b)>19 && a==b) {
            System.out.println("The party is excellent!");
        }
        else if ((a+b)>19 && a!=b ) {
            System.out.println("Quite cool party!");
        }
        else if ((a+b)<20) {
            System.out.println("Average party...");
            }
        else if (a == 0) {
            System.out.println("Sausage party...");
        }
        }
    }

