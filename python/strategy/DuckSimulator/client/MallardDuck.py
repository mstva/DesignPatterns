from client.Duck import Duck
from behavior.FlyBehavior import FlyWithWings
from behavior.QuackBehavior import Quack

class MallardDuck(Duck):
    """this is a mollard duck class, a subclass from Duck"""
    def __init__(self, duck_name):
        super().__init__(duck_name)
        self._fly_behavior = FlyWithWings(duck_name)
        self._quack_behavior = Quack(duck_name)
