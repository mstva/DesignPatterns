package behavior;

public class Knife implements WeaponBehavior {

    private final String characterName;
    public Knife(String characterName) {
        this.characterName = characterName;
    }

    @Override
    public void useWeapon() {
        System.out.println("the " + characterName + " is using Knife");
    }

}
