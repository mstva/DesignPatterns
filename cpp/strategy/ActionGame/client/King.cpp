#include "Character.cpp"

class King : public Character {

public:
    King() {
        this->weaponBehavior = new Sword("King");
    }
};

