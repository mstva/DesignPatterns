from behavior.WeaponBehavior import WeaponBehavior

class Character:

    def __init__(self):
        self._weapon_behavior = WeaponBehavior

    def fight(self):
        self._weapon_behavior.use_weapon()

    def set_weapon(self, wb):
        self._weapon_behavior = wb
