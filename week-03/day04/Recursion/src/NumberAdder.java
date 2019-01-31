public class NumberAdder {
    public static void main(String[] args) {
        int sum = addNumbers(2);
        System.out.println("Sum = " + sum);
    }

    public static int addNumbers(int num) {
        if (num != 0)
            return num + addNumbers(num - 1);
        else
            return num;
    }

}


// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
