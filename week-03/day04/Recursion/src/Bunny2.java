public class Bunny2 {
    public static void main(String[] args) {
        int bunnies = 3;
        System.out.println(NumberOfEars(bunnies));
    }

    public static int NumberOfEars(int bunnies) {
        if (bunnies <= 1) {
            return bunnies * 2;
        } else {
            return 5 +NumberOfEars(bunnies - 2);
        }
    }
}


// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
