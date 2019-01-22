import java.util.*;

public class AppendLetter{
    public static void main(String... args){
        ArrayList<String> far = new ArrayList<String>(Arrays.asList("bo", "anacond", "koal", "pand", "zebr"));
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        System.out.println(appendA(far));
    }
    public static ArrayList<String> appendA(ArrayList<String> anArray){
        ArrayList<String> tempArrayList = new ArrayList<String>();
        for (int i = 0; i< anArray.size(); i++){
         tempArrayList.add(anArray.get(i)+"a");
        }
        return tempArrayList;
    }
}