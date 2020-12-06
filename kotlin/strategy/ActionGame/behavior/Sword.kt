package behavior

class Sword(private var characterName: String) : WeaponBehavior {

    override fun useWeapon() {
        println("the $characterName is using Sword")
    }

}