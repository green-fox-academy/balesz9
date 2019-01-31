public class Power {
    public static void main(String[] args) {
        int n = 3;
        int power = 3;
        System.out.println(PowerN(n,power));
    }
    public static int PowerN (int number, int power) {
        if (power <= 1) {
            return number;
        }
        else {
            return number*PowerN(number,power-1);
        }
    }
}


// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
