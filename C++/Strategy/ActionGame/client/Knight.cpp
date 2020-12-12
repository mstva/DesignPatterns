
class Knight : public Character {

public:
    Knight() {
        this->weaponBehavior = new BowAndArrow("Knight");
    }
};

