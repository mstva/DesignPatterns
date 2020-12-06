from client.Character import Character
from behavior.WeaponBehavior import BowAndArrow

class Knight(Character):

    def __init__(self):
        super().__init__()
        self._weapon_behavior = BowAndArrow("Knight")
