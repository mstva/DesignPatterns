#include "iostream"
#include <string>
using namespace std;

class QuackBehavior{

public:
    virtual void quack() = 0;
};

class Quack : public QuackBehavior {

public:
    Quack(string duckName) : duckName(duckName) {};
    void quack() override {
        cout << duckName << " is quacking" << endl;
    };

private:
    string duckName;
};

class Squeak : public QuackBehavior {

public:
    Squeak(string duckName) : duckName(duckName) {};
    void quack() override { cout << duckName << " is squeaking" << endl; };

private:
    string duckName;
};

class MuteQuack : public QuackBehavior {

public:
    MuteQuack(string duckName) : duckName(duckName) {};
    void quack() override { cout << duckName << " is not quacking" << endl; };

private:
    string duckName;
};


