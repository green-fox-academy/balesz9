public class String1 {
    public static void main(String[] args) {
        String text = "x1x2x3";
        System.out.println(TextChanger(text));
    }
    public static String TextChanger(String text){
        if (text.length()<1){
            return text;
        }
        else if(text.charAt(0) == 'x') {
            char c = 'y';
            return c + TextChanger(text.substring(1));
        }
            else {
            char c = text.charAt(0);
            return c + TextChanger(text.substring(1));
        }
    }

}

// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.
