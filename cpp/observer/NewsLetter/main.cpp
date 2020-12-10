#include <iostream>
#include "subject/Newsletter.cpp"
#include "observer/Subscriber.cpp"

int main() {

    auto newsletter = new Newsletter();

    auto subscriber = new Subscriber(newsletter);

    newsletter->setName("Mustafa");

}
