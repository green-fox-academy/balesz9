public class Fibonacci {

    public static double FibonacciMember(int element){
            if (element < 1){
                return 0;
            }
            if (element <3){
                return 1;
            }
            return FibonacciMember(element-1)+ FibonacciMember(element-2);

        }
}
