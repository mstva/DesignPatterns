#include "MollardDuck/MollardDuck.h"
#include "RedheadDuck/RedheadDuck.h"

int main() {

    MollardDuck mollard("mollard");
    mollard.display();
    mollard.quack();
    mollard.swim();

    RedheadDuck redhead("redhead");
    redhead.display();
    redhead.quack();
    redhead.swim();

    return 0;
}
