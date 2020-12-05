import behavior.BowAndArrow;
import client.*;
import client.Character;

public class Main {

    public static void main(String[] args) {

        Character king = new King();
        king.fight();

        Character queen = new Queen();
        queen.fight();

        Character knight = new Knight();
        knight.fight();

        Character troll = new Troll();
        troll.fight();

    }

}
