package behavior;

public class Axe implements WeaponBehavior {

    private final String characterName;
    public Axe(String characterName) {
        this.characterName = characterName;
    }

    @Override
    public void useWeapon() {
        System.out.println("the " + characterName + " is using Axe");
    }
}
