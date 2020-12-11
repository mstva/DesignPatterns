from component.Beverage import Beverage


class DarkRoast(Beverage):

    def __init__(self):
        super().__init__()
        self._description = "DarkRoast"

    def get_description(self):
        return self._description

    def cost(self):
        return 2.89
