#include "client/King.cpp"
#include "client/Queen.cpp"
#include "client/Knight.cpp"
#include "client/Troll.cpp"

int main() {

    Character* king = new King();
    king->fight();

    Character* queen = new Queen();
    queen->fight();

    Character* knight = new Knight();
    knight->fight();

    Character* troll = new Troll();
    troll->fight();

    return 0;
}
