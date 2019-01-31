public class Bunnies {
    public static void main(String[] args) {
        int bunnies = 10;
        System.out.println(NumberOfEars(bunnies));
    }

    public static int NumberOfEars(int bunnies) {
        if (bunnies <= 1) {
            return bunnies * 2;
        } else {
            return 2 +NumberOfEars(bunnies - 1);
        }
    }
}

// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).