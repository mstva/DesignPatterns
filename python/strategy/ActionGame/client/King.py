from behavior.WeaponBehavior import Sword
from client.Character import Character

class King(Character):

    def __init__(self):
        super().__init__()
        self._weapon_behavior = Sword("King")
