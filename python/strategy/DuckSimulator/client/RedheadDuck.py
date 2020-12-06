from client.Duck import Duck
from behavior.FlyBehavior import FlyNoWay
from behavior.QuackBehavior import Squeak

class RedheadDuck(Duck):
    """this is a  redhead duck class, a subclass from Duck"""
    def __init__(self, duck_name):
        super().__init__(duck_name)
        self._fly_behavior = FlyNoWay(duck_name)
        self._quack_behavior = Squeak(duck_name)
