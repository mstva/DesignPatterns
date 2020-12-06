from client.King import King
from client.Queen import Queen
from client.Knight import Knight
from client.Troll import Troll
from behavior.WeaponBehavior import Sword

if __name__ == '__main__':

    king = King().fight()
    queen = Queen().fight()
    knight = Knight().fight()
    troll = Troll()
    troll.fight()
    troll.set_weapon(Sword("Troll"))
    troll.fight()
