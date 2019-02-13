import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteSingleLine {
    public static void main(String[] args) {
        System.out.println("Type in your name:");
        Scanner scanner = new Scanner(System.in);
        String myName = scanner.nextLine(); // instead .next I wrote .nextLine
        writeSingleLine2(myName);

    }
    public static void writeSingleLine (String text){
        List<String> newText= new ArrayList<>();
        newText.add(text);
        try {
            Path filePath = Paths.get("assets/new-file.txt");
            Files.write(filePath, newText);
        } catch (Exception e) {
            System.out.println("Unable to write file: my-file.txt");
        }


    }
    public static void writeSingleLine2 (String text){
        try {
            Path filePath = Paths.get("assets/my-file.txt");
            Files.write(filePath,text.getBytes());
        } catch (Exception e) {
            System.out.println("Unable to write file: my-file.txt");
        }


    }
}

// Write a function that is able to manipulate a file
// By writing your name into it as a single line
// The file should be named "my-file.txt"
// In case the program is unable to write the file,
// It should print the following error message: "Unable to write file: my-file.txt"