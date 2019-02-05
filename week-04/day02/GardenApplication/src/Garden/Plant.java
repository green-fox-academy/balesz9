package Garden;

public class Plant {
    String color;
    double minWaterLevel;
    double waterAmount;
    double absorbLevel;

    public Plant(){
    }
    public Plant(String color, double minWaterLevel, double waterAmount, double absorbLevel){
        this.color = color;
        this.minWaterLevel = minWaterLevel;
        this.waterAmount = waterAmount;
        this.absorbLevel = absorbLevel;
    }
}
