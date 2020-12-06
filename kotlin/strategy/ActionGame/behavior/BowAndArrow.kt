package behavior

class BowAndArrow(private var characterName: String) : WeaponBehavior {

    override fun useWeapon() {
        println("the $characterName is using BowAndArrow")
    }

}