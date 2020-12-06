package behavior

class Axe(private var characterName: String) : WeaponBehavior {

    override fun useWeapon() {
        println("the $characterName is using Axe")
    }

}