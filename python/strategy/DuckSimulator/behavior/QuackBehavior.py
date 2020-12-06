
class QuackBehavior:
    def quack(self):
        return

class Quack(QuackBehavior):

    def __init__(self, duck_name):
        self.__duck_name = duck_name

    def quack(self):
        print(self.__duck_name + " is quacking")

class Squeak(QuackBehavior):

    def __init__(self, duck_name):
        self.__duck_name = duck_name

    def quack(self):
        print(self.__duck_name + " is squeaking")

class MuteQuack(QuackBehavior):

    def __init__(self, duck_name):
        self.__duck_name = duck_name

    def quack(self):
        print(self.__duck_name + " is not quacking")
