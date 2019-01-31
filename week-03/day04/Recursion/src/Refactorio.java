public class Refactorio {
    public static void main(String[] args) {
        int number = 10;
        System.out.println(Refactorio(number));
    }
    public static int Refactorio(int n){
        if (n <=1){
            return 1;
        }
        else
            return n*Refactorio(n-1);
    }
}

// Create a recursive function called `refactorio`
// that returns it's input's factorial
