from client.Character import Character
from behavior.WeaponBehavior import Axe


class Troll(Character):

    def __init__(self):
        super().__init__()
        self._weapon_behavior = Axe("Troll")
