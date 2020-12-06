#include "client/MallardDuck.cpp"
#include "client/RedheadDuck.cpp"
#include "client/RubberDuck.cpp"

int main() {

    Duck* mallard = new MallardDuck("MallardDuck");
    mallard->display();
    mallard->swim();
    mallard->performFly();
    mallard->performQuack();

    Duck* redhead = new RedheadDuck("RedheadDuck");
    redhead->display();
    redhead->swim();
    redhead->performFly();
    redhead->performQuack();

    Duck* rubber = new RubberDuck("RubberDuck");
    rubber->display();
    rubber->swim();
    rubber->performFly();
    rubber->performQuack();

}
