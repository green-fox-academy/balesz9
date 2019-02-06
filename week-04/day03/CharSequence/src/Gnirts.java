public class Gnirts implements CharSequence {
    public String text;

    public Gnirts(String text){
        this.text = text;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return this.text.charAt(this.text.length()-(index+1));
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}

/*Check out the CharSequence interface
Create a Gnirts class implementing this interface
It should have one String field that can be set via the constructor
Implementing the interface's methods, always think of the field as if it was backwards, so at the second position of "this example" there is a 'p'
In a main method try out all the methods*/
