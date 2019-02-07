import java.util.Arrays;

public class Anagram {
    public boolean isAnagram(String text1, String text2){
        if (text1 == null || text2 == null ){ //nem kell beletenni mert enélkül is erre a hibábra fut
            throw new NullPointerException();
        }
        if (text1.length() != text2.length() || text1.isEmpty()) {
            return false;
        }
            char[] chars1 = text1.toLowerCase().toCharArray();
            char[] chars2 = text2.toLowerCase().toCharArray();
            Arrays.sort(chars1);
            Arrays.sort(chars2);
            String sorted1 = new String(chars1);
            String sorted2 = new String(chars2);
            if (sorted1.equals(sorted2)) {
                return true;
            }
            return false;
        }
    }
