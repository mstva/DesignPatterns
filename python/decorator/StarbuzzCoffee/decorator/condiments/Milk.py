from component.Beverage import Beverage
from decorator.CondimentDecorator import CondimentDecorator


class Milk(CondimentDecorator):
    __beverage = Beverage()

    def __init__(self, beverage):
        super().__init__()
        self.__beverage = beverage

    def get_description(self):
        return self.__beverage.get_description() + ", Milk"

    def cost(self):
        return self.__beverage.cost() + 0.99
