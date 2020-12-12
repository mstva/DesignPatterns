#include <iostream>
#include "component/Beverage.h"
#include "decorator/condiments/Mocha.cpp"
#include "decorator/condiments/Milk.cpp"
#include "decorator/condiments/Soy.cpp"
#include "decorator/condiments/Whip.cpp"
#include "component/coffees/Espresso.cpp"
#include "component/coffees/DarkRoast.cpp"
#include "component/coffees/HouseBlend.cpp"
#include "component/coffees/Decaf.cpp"

using namespace std;

int main() {

    Beverage* espresso = new Mocha(new Milk(new Whip(new Soy(new Espresso()))));
    Beverage* darkRoast = new Soy(new Whip(new Mocha(new Soy(new DarkRoast()))));
    Beverage* houseBlend = new Milk(new Soy(new Milk(new Mocha(new HouseBlend()))));
    Beverage* decaf = new Whip(new Mocha(new Soy(new Milk(new Decaf()))));

    cout << endl << "Description: " << espresso->getDescription() << endl;
    cout << "Cost: $" << espresso->cost() << endl << endl;

    cout << "Description: " << darkRoast->getDescription() << endl;
    cout << "Cost: $" << darkRoast->cost() << endl<< endl;

    cout << "Description: " << houseBlend->getDescription() << endl;
    cout << "Cost: $" << houseBlend->cost() << endl<< endl;

    cout << "Description: " << decaf->getDescription() << endl;
    cout << "Cost: $" << decaf->cost() << endl;

}
