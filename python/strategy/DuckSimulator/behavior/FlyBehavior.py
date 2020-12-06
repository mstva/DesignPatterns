
class FlyBehavior:

    def fly(self):
        return

class FlyWithWings(FlyBehavior):

    def __init__(self, duck_name):
        self.__duck_name = duck_name

    def fly(self):
        print(self.__duck_name + " is flying wih wings")

class FlyNoWay(FlyBehavior):

    def __init__(self, duck_name):
        self.__duck_name = duck_name

    def fly(self):
        print(self.__duck_name + " is not flying")
