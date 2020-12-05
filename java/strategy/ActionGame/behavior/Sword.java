package behavior;

public class Sword implements WeaponBehavior {

    private final String characterName;
    public Sword(String characterName) {
        this.characterName = characterName;
    }

    @Override
    public void useWeapon() {
        System.out.println("the " + characterName + " is using Sword");
    }

}
