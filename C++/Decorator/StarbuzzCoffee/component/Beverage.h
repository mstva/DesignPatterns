#ifndef STARBUZZCOFFEE_BEVERAGE_H
#define STARBUZZCOFFEE_BEVERAGE_H

#include <string>
using namespace std;

class Beverage {

public:

    virtual string getDescription() { return description; }

    virtual double cost() = 0;

protected:
    string description = "Unknown Beverage";
};


#endif
