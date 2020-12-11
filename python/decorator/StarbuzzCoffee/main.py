from component.coffees.DarkRoast import DarkRoast
from component.coffees.Espresso import Espresso
from component.coffees.HouseBlend import HouseBlend
from decorator.condiments.Milk import Milk
from decorator.condiments.Mocha import Mocha
from decorator.condiments.Soy import Soy
from decorator.condiments.Whip import Whip

if __name__ == '__main__':

    espresso = Mocha(Milk(Soy(Whip(Espresso()))))
    dark_roast = Milk(Soy(Whip(Mocha(DarkRoast()))))
    house_blend = Whip(Mocha(Milk(Soy(HouseBlend()))))

    print("\nDescription: " + espresso.get_description())
    print("Cost: $" + str(espresso.cost()))

    print("\nDescription: " + dark_roast.get_description())
    print("Cost: $" + str(dark_roast.cost()))

    print("\nDescription: " + house_blend.get_description())
    print("Cost: $" + str(house_blend.cost()))

