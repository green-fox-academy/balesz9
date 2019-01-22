import java.util.*;
import java.lang.Math;

public class MatchMaking{
    public static void main(String... args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff", "Joe"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // If someone has no pair, he/she should be the element of the list too
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...
        System.out.println(makingMatches(girls, boys));
    }

        public static ArrayList<String> makingMatches(ArrayList<String> arrayList1, ArrayList<String> arrayList2) {
            ArrayList<String> newArray = new ArrayList<String>();
                for (int i=0; i<Math.max(arrayList1.size(),arrayList2.size() ) ;i++){
                    if (i < arrayList1.size()) {
                        newArray.add(arrayList1.get(i));
                    }
                    if (i< arrayList2.size()) {
                        newArray.add(arrayList2.get(i));
                    }
                }

                 return newArray;
        }
    }