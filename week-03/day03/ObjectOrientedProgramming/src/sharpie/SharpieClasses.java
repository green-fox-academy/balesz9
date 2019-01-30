package sharpie;

public class SharpieClasses {
    public static void main(String[] args) {
        Sharpie sharpieOne = new Sharpie("green", 10.13) ;
        System.out.println("Sharpie's color: "+sharpieOne.color+", width: "+sharpieOne.width+
                ", ink: "+sharpieOne.inkAmount);
        sharpieOne.use();
        System.out.println("Sharpie's color: "+sharpieOne.color+", width: "+sharpieOne.width+
                ", ink: "+sharpieOne.inkAmount);

    }
}
