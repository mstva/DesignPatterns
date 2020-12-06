
class RubberDuck : public Duck {

public:
    explicit RubberDuck(string duckName) : Duck(duckName) {
        flyBehavior = new FlyNoWay(duckName);
        quackBehavior = new MuteQuack(duckName);
    }
};

