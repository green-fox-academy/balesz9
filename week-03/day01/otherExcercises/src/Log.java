import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Log {
    public static void main(String[] args) {

        System.out.println(ipAddress().size());
        System.out.println(getPostRatio());
    }


    public static ArrayList ipAddress() {
        ArrayList<String> ipAddresses = new ArrayList<>();
        try {
            List<String> logFile = Files.readAllLines(Paths.get("src/log.txt"));
            for (int i = 0; i < logFile.size(); i++) {
                String[] partOfLOG = logFile.get(i).split(" ");
                ipAddresses.add(partOfLOG[8]);
            }
            //System.out.println(ipAddresses.size());
            Set<String> set = new HashSet<>(ipAddresses);
            ipAddresses.clear();
            ipAddresses.addAll(set);
            //System.out.println(ipAddresses.size());
        } catch (IOException e) {

        }
        return ipAddresses;
    }

    public static double getPostRatio() {
        double get = 0;
        double post = 0;
        try {
            List<String> logFile = Files.readAllLines(Paths.get("src/log.txt"));
            for (int i = 0; i < logFile.size(); i++) {
                if (logFile.get(i).contains("GET")) {
                    get++;
                } else post++;
            }
        } catch (IOException e) {

        }

        return get/post;
    }
}


// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.
