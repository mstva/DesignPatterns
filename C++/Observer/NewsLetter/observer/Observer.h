#ifndef NEWSLETTER_OBSERVER_H
#define NEWSLETTER_OBSERVER_H

#include <string>
using namespace std;

class Observer {

public:
    virtual void update(string name) = 0;
};


#endif //NEWSLETTER_OBSERVER_H
