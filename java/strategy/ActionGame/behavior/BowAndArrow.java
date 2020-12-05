package behavior;

public class BowAndArrow implements WeaponBehavior {

    private final String characterName;
    public BowAndArrow(String characterName) {
        this.characterName = characterName;
    }

    @Override
    public void useWeapon() {
        System.out.println("the " + characterName + " is using BowAndArrow");
    }

}
