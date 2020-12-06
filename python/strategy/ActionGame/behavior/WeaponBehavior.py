
class WeaponBehavior:
    def use_weapon(self):
        return

class Axe(WeaponBehavior):

    def __init__(self, character_name):
        self.__character_name = character_name

    def use_weapon(self):
        print("the " + self.__character_name + " is using Axe")

class Sword(WeaponBehavior):

    def __init__(self, character_name):
        self.__character_name = character_name

    def use_weapon(self):
        print("the " + self.__character_name + " is using Sword")

class BowAndArrow(WeaponBehavior):

    def __init__(self, character_name):
        self.__character_name = character_name

    def use_weapon(self):
        print("the " + self.__character_name + " is using BowAndArrow")

class Knife(WeaponBehavior):

    def __init__(self, character_name):
        self.__character_name = character_name

    def use_weapon(self):
        print("the " + self.__character_name + " is using Knife")
