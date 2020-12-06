from behavior.WeaponBehavior import Knife
from client.Character import Character

class Queen(Character):

    def __init__(self):
        super().__init__()
        self._weapon_behavior = Knife("Queen")
