#ifndef WEATHERRAMA_SUBJECT_H
#define WEATHERRAMA_SUBJECT_H

class Subject {

public:
    virtual void registerObserver(Observer* newObserver) = 0;
    virtual void removeObserver(Observer* removeObserver) = 0;
    virtual void notifyObserver() = 0;

};


#endif
