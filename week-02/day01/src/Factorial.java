public class Factorial {
    public static void main(String[] args) {
    // - Create a function called `factorio`
    //   that returns it's input's factorial
        int number1= 10;
        int result= factorio(number1);
        System.out.println(result);
    }
    public static int factorio(int number) {
        int result = 1;
        for (int i = 1; i <= number ; i++) {
            result = result*i;
        }
        return result;
    }

}
