#ifndef NEWSLETTER_SUBJECT_H
#define NEWSLETTER_SUBJECT_H

#include "../observer/Observer.h"

class Subject {

public:
    virtual void registerObserver(Observer* newObserver) = 0;
    virtual void removeObserver(Observer* removeObserver) = 0;
    virtual void notifyObservers() = 0;

};


#endif
