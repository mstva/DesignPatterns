from behavior.FlyBehavior import FlyBehavior
from behavior.QuackBehavior import QuackBehavior

class Duck:
    """this is a Duck class"""

    def __init__(self, duck_name):
        self.__duck_name = duck_name
        self._fly_behavior = FlyBehavior
        self._quack_behavior = QuackBehavior

    def display(self):
        print("I am a " + self.__duck_name)

    def swim(self):
        print(self.__duck_name + " is swimming")

    def perform_fly(self):
        self._fly_behavior.fly()

    def perform_quack(self):
        self._quack_behavior.quack()
