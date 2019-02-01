package Counter;

public class Counter {
    int number;

    public Counter(){
    }

    public Counter(int number) {
        this.number = number;
    }

    public int add(int addNUmber){
        return this.number = number+ addNUmber;

    }
    public int add(){
        return this.number++;
    }
    public int get() {
        System.out.println("The current value:"+number);
        return this.number;
    }
    public void reset() {
        this.number = 0;

    }
}


/*Create Counter class
which has an integer field value
when creating it should have a default value 0 or we can specify it when creating
we can add(number) to this counter another whole number
or we can add() without parameters just increasing the counter's value by one
and we can get() the current value
also we can reset() the value to the initial value*/
