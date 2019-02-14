package Pirates;

public class Pirate {

    String name;
    int rumLevel;
    boolean isAlive;
    boolean isPassedOut;
    boolean hasAParrot;
    boolean isCaptain;

    public Pirate(){
        rumLevel = 0;
        isAlive = true;
        isPassedOut = false;
        hasAParrot = false;
        isCaptain = false;

    }

    public Pirate(String name){
        this.name = name;
        rumLevel = 0;
        isAlive = true;
        isPassedOut = false;
        hasAParrot = false;
        isCaptain = false;
    }

    public void drinkSomeRum() {
        if (isAlive) {
            rumLevel++;
        } else System.out.println(name+"is dead.");
    }

    public void howItsGoingMate() {
        if (isAlive) {
            if (rumLevel < 5) {
                System.out.println("Pour me a nudder!");
            } else System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        } else System.out.println(name+"is dead.");
    }

    public void die() {
        isAlive = false;
    }

    public void brawl(Pirate otherPirate) {
        int brawlResult = (int) (Math.random() * 3 + 1);
        switch (brawlResult) {
            case 1: die();
                break;
            case 2: otherPirate.die();
                break;
            case 3: isPassedOut = true;
            otherPirate.isPassedOut=true;
                break;
        }
    }

}


   /* Create a Pirate class. While you can add other fields and methods, you must have these methods:-

        drinkSomeRum() - intoxicates the Pirate some
        howsItGoingMate() - when called, the Pirate replies, if drinkSomeRun was called:-
        0 to 4 times, "Pour me anudder!"
        else, "Arghh, I'ma Pirate. How d'ya d'ink its goin?", the pirate passes out and sleeps it off.
        If you manage to get this far, then you can try to do the following.

        die() - this kills off the pirate, in which case, drinkSomeRum, etc. just result in he's dead.
        brawl(x) - where pirate fights another pirate (if that other pirate is alive) and there's a 1/3 chance, 1 dies,
        the other dies or they both pass out.

        And... if you get that far...

        Add a parrot.
        */
