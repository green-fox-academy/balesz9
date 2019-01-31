public class StringXRemover {
    public static void main(String[] args) {
        String text = "x1x2x3";
        System.out.println(TextRemover(text));
    }

    public static String TextRemover(String text) {
        if (text.length() < 1) {
            return text;
        } else if (text.charAt(0) == 'x') {
            return "" + TextRemover(text.substring(1));
        } else {
            char c = text.charAt(0);
            return c + TextRemover(text.substring(1));
        }
    }
}

// Given a string, compute recursively a new string where all the 'x' chars have been removed.