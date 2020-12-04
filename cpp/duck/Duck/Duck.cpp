#include "Duck.h"

#include <utility>

Duck::Duck(string name) : name(std::move(name)) {}

void Duck::quack() {
    cout << name << " is quacking" << endl;
}

void Duck::swim() {
    cout << name << " is swimming" << endl;
}

void Duck::display() {
    cout << "I am a " << name << endl;
}
