package Garden;

public class Tree extends Plant {

    public Tree(String color, int waterAmount){
        this.color = color;
        this.waterAmount = waterAmount;
    }

    public void watering(double water) {
        this.waterAmount = +water * 0.4;
    }

    public void treeStatus(){
        if (this.waterAmount< this.minWaterLevel){
            System.out.println("The "+this.color+"tree needs water.");
        }
        else {
            System.out.println("The "+this.color+"tree doesn't need water.");
        }
    }
}


/*The Tree
needs water if its current water amount is less then 10
when watering it the tree can only absorb the 40% of the water
eg. watering with 10 the tree's amount of water should only increase with 4*/