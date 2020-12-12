#ifndef WEATHERRAMA_OBSERVER_H
#define WEATHERRAMA_OBSERVER_H

class Observer {

public:
    virtual void update(float temperature, float humidity, float pressure) = 0;
};


#endif
