public class Sum {
    public static void main(String[] args) {
    // - Write a function called `sum` that sum all the numbers
    //   until the given parameter and returns with an integer
        int number = 4;
        int summ= summ(number);
        System.out.println(summ);
    }
    public static int summ(int summarizer) {
        int result= 0;
        for (int i = 0; i <= summarizer; i++) {
             result += i;
        }
        return result;
    }

}
