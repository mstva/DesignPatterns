from component.Beverage import Beverage


class Espresso(Beverage):

    def __init__(self):
        super().__init__()
        self._description = "Espresso"

    def get_description(self):
        return self._description

    def cost(self):
        return 1.99
