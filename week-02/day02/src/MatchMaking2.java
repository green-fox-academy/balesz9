import java.util.*;
import java.lang.Math;

public class MatchMaking2{
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
        if (arrayList1.size()>arrayList2.size()) {
        for (int i=0; i < arrayList2.size() ;i++){
            newArray.add(arrayList1.get(i));
            newArray.add(arrayList2.get(i));
        }
        for (int l = arrayList2.size(); l < arrayList1.size(); l++)
            newArray.add(arrayList1.get(l));
    }
                 else {
        for (int j = 0; j < arrayList1.size(); j++) {
            newArray.add(arrayList1.get(j));
            newArray.add(arrayList2.get(j));
        }
        for (int k = arrayList1.size(); k < arrayList2.size(); k++)
            newArray.add(arrayList2.get(k));

    }
                 return newArray;


    }
}