from component.Beverage import Beverage


class HouseBlend(Beverage):

    def __init__(self):
        super().__init__()
        self._description = "HouseBlend"

    def get_description(self):
        return self._description

    def cost(self):
        return 0.55
