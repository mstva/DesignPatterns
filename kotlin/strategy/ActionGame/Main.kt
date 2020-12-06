import behavior.Sword
import client.*

fun main() {

    val king: Character = King()
    king.fight()

    val queen: Character = Queen()
    queen.fight()

    val knight : Character = Knight()
    knight.fight()
    knight.setWeapon(Sword("Knight"))
    knight.fight()

    val troll : Character = Troll()
    troll.fight()

}