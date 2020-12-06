package client

import behavior.BowAndArrow

class Knight : Character() {

    init {
        weaponBehavior = BowAndArrow("Knight")
    }

}