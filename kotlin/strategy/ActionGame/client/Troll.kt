package client

import behavior.Axe
import behavior.Knife

class Troll : Character() {

    init {
        weaponBehavior = Axe("Troll")
    }

}