#include <string>
#include <iostream>
using namespace std;

class WeaponBehavior {

public:
    virtual void useWeapon() = 0;
};

class Axe : public WeaponBehavior {

public:
    Axe(string characterName) : characterName(characterName) {}
    void useWeapon() override {
        cout << "the " << characterName << " is using Axe" << endl;
    }

private:
    string characterName;
};

class Sword : public WeaponBehavior {

public:
    Sword(string characterName) : characterName(characterName) {}
    void useWeapon() override {
        cout << "the " << characterName << " is using Sword" << endl;
    }

private:
    string characterName;
};

class BowAndArrow : public WeaponBehavior {

public:
    BowAndArrow(string characterName) : characterName(characterName) {}
    void useWeapon() override {
        cout << "the " << characterName << " is using BowAndArrow" << endl;
    }

private:
    string characterName;
};

class Knife : public WeaponBehavior {

public:
    Knife(string characterName) : characterName(characterName) {}
    void useWeapon() override {
        cout << "the " << characterName << " is using Knife" << endl;
    }

private:
    string characterName;
};


