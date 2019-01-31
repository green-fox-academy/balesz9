public class Counter {
    public static void main(String[] args) {
        counter(10);
        }
        public static void counter(int n){
            if ( n <=0 ){
            }
            else {
                System.out.println(n);
                counter(n-1);
            }
        }
}

//  Write a recursive function that takes one parameter: n and counts down from n.