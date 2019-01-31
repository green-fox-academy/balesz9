public class StringSeperate {
    public static void main(String[] args) {
        String text = "x1x2x3";
        System.out.println(TextRemover(text));
    }

    public static String TextRemover(String text) {
        if (text.length() < 2) {
            return text;
        } else {
            return text.charAt(0)+"*" + TextRemover(text.substring(1));
        }
    }
}

// Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".