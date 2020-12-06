from client.Duck import Duck
from behavior.QuackBehavior import MuteQuack
from behavior.FlyBehavior import FlyNoWay

class RubberDuck(Duck):

    def __init__(self, duck_name):
        super().__init__(duck_name)
        self._fly_behavior = FlyNoWay(duck_name)
        self._quack_behavior = MuteQuack(duck_name)
