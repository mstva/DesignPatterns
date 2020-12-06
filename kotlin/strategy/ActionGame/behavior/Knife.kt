package behavior

class Knife(private var characterName: String) : WeaponBehavior {

    override fun useWeapon() {
        println("the $characterName is using Knife")
    }

}