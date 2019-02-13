import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class NumberOfLines2 {
    public static void main(String[] args) {
        try {
            Path filepath = Paths.get("assets/my-file.txt");
            List<String> lines = Files.readAllLines(filepath);
            System.out.println("The file contains "+ lines.size()+ " lines.");
        }
        catch (Exception ex) {
            System.err.println("0");
        }
    }
}


// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.