package client

import behavior.Sword

class King : Character() {

    init {
        weaponBehavior = Sword("King")
    }

}