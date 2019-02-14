package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    List<Pirate> pirates;
    Pirate captain;

    public Ship() {
        this.pirates = new ArrayList<>();
    }

    public void fillShip() {
        captain.isCaptain = true;
        int randomNumber = (int) (Math.random() * 10 + 1);
        for (int i = 0; i < randomNumber; i++) {
            pirates.add(new Pirate());
        }
    }

    public boolean Battle(Ship otherShip) {
        int score = - captain.rumLevel;
        int scoreOtherShip = - otherShip.captain.rumLevel;
        boolean isWinner = true;
        for (Pirate pirates : pirates) {
            if (pirates.isAlive = true) {
                score++;
            }
        }
        for (Pirate pirates : otherShip.pirates) {
            if (pirates.isAlive = true) {
                scoreOtherShip++;
            }
        }
        int randomRum = (int) (Math.random() * 10 + 1);
        if (score > scoreOtherShip) {
            for (int i = 0; i < randomRum; i++) {
                for (Pirate pirate : pirates) {
                    pirate.drinkSomeRum();
                }
            }
            int randomDeath = (int) (Math.random() * otherShip.pirates.size() + 1);
            for (int i = 0; i < randomDeath; i++) {
                otherShip.pirates.remove(1);
            }
        } else {
            int randomDeath = (int) (Math.random() * pirates.size() + 1);
            for (int i = 0; i < randomDeath; i++) {
                pirates.remove(1);
            }
            for (int i = 0; i < randomRum; i++) {
                for (Pirate pirate : otherShip.pirates) {
                    pirate.drinkSomeRum();
                }
            }
            isWinner = false;
        }
        return isWinner;
    }
}




   /* Create a Ship class.
        The Ship stores Pirate-s instances in a list as the crew and has one isCaptain who is also a Pirate.
        When a ship is created it doesn't have a crew or a isCaptain.
        The ship can be filled with pirates and a isCaptain via fillShip() method.
        Filling the ship with a isCaptain and random number of pirates.
        Ships should be represented in a nice way on command line including information about
        captains consumed rum, state (passed out / died)
        number of alive pirates in the crew
        Ships should have a method to battle other ships: ship.battle(otherShip)
        should return true if the actual ship (this) wins
        the ship should win if its calculated score is higher
        calculate score: Number of Alive pirates in the crew - Number of consumed rum by the isCaptain
        The loser crew has a random number of losses (deaths).
        The winner isCaptain and crew has a party, including a random number of rum :)*/
