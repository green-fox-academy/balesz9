package animal;

public class AnimalClass {
    public static void main(String[] args) {
        Animal monkey = new Animal();
        System.out.println("Hunger:"+monkey.hunger+". Thirst:"+monkey.thirst+".");
        monkey.drink();
        monkey.eat();
        System.out.println("Hunger:"+monkey.hunger+". Thirst:"+monkey.thirst+".");
        monkey.play();
        System.out.println("Hunger:"+monkey.hunger+". Thirst:"+monkey.thirst+".");
    }
}
