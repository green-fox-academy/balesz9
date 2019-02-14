import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Rainy {
    public static void main(String[] args) {
        System.out.println(mostRainCity("cities.txt"));
    }
        public static String mostRainCity(String file){
            Path filePath = Paths.get(file);
            List<String> lines = new ArrayList<>();
        try{
            lines.addAll(Files.readAllLines(filePath));           //addAll hozzáadunk sort
        }
        catch (IOException ex){
            System.err.println("Couldn't find this file!");
        }
            Map<String, Integer> rainyCities = new HashMap<>();

            for (String line:lines) {
                String[] splitArray = line.split(",");

                if(rainyCities.containsKey(splitArray[1])&& splitArray[2].equals("RAINY")){
                    //int valueOfRainyCity = rainyCities.get(splitArray[1]);
                    //valueOfRainyCity++;
                    rainyCities.put(splitArray[1], rainyCities.get(splitArray[1])+1);
                } else if (splitArray[2].equals("RAINY")){
                    rainyCities.put(splitArray[1],1);
                }

            }
            String mostRainyCity = "";
            int mostRainy = 0;
            for (String city:rainyCities.keySet()){
                if (mostRainy < rainyCities.get(city)){
                    mostRainy = rainyCities.get(city);
                    mostRainyCity = city;
                }
            }
            return mostRainyCity;
        }

    }

