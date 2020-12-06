
class RedheadDuck : public Duck {

public:
    explicit RedheadDuck(string duckName) : Duck(duckName) {
        flyBehavior = new FlyWithWings(duckName);
        quackBehavior = new Squeak(duckName);
    }
};

