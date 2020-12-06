#include "../behavior/WeaponBehavior.cpp"

class WeaponBehavior;

class Character {

public:
    void fight() { weaponBehavior->useWeapon(); }

protected:
    WeaponBehavior* weaponBehavior;
};

