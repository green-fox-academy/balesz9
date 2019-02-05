package Garden;

public class Flower extends  Plant{

    public Flower(String color, int waterAmount){
        this.color = color;
        this.waterAmount = waterAmount;
    }

    public void watering(double water) {
        this.waterAmount = +water * 0.75;
    }

    public void flowerStatus(){
        if (this.waterAmount< this.minWaterLevel){
            System.out.println("The "+this.color+"flower needs water.");
        }
        else {
            System.out.println("The "+this.color+"flower doesn't need water.");
        }
    }
}

/*The Flower
needs water if its current water amount is less then 5
when watering it the flower can only absorb the 75% of the water
eg. watering with 10 the flower's amount of water should only increase with 7.5
* */
