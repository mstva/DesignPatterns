package client

import behavior.WeaponBehavior

open class Character {

    protected open var weaponBehavior: WeaponBehavior? = null

    fun fight() {
        weaponBehavior!!.useWeapon()
    }

    fun setWeapon(newWeapon: WeaponBehavior) {
        weaponBehavior = newWeapon
    }

}