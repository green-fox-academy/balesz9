import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise6 {
    public static void main(String[] args) {
        String text = "HHaaBBaaC";
        String isUp = text
                .chars()
                .filter((c) -> Character.isUpperCase(c))
                .collect(StringBuilder::new, // supplier
                        StringBuilder::appendCodePoint, // accumulator
                        StringBuilder::append) // combiner
                .toString();
        System.out.println("The uppercase characters are " + isUp);
//Uppercase
        String isUp2 =text
                .chars()
                .filter((c) -> Character.isUpperCase(c))
                .toString();

        System.out.println(isUp2);
    }
}
//Write a Stream Expression to find the uppercase characters in a string!
