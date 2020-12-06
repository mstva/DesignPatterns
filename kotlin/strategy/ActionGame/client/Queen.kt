package client

import behavior.Knife

class Queen : Character() {

    init {
        weaponBehavior = Knife("Queen")
    }

}