package Counter;

public class CounterTask {
    public static void main(String[] args) {
        Counter firstNumber = new Counter(100);
        firstNumber.add(-10);
        firstNumber.get();
        firstNumber.reset();
        firstNumber.get();
    }
}
