public class TakesLonger {
    public static void main(String... args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)
        quote= StringBuilder(quote);
        System.out.println(quote);
    }
        public static String StringBuilder(String smg){
        smg = smg.substring(0, smg.indexOf("It")+2)+" always takes longer than"+smg.substring(smg.lastIndexOf("you")-1, smg.length());
        return smg;
    }
}

