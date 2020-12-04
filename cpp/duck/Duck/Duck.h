#ifndef DUCK_DUCK_H
#define DUCK_DUCK_H


#include <iostream>
using namespace std;

class Duck {

public:
    explicit Duck(string name);
    void quack();
    void swim();
    void display();

private:
    string name;

};


#endif //DUCK_DUCK_H
