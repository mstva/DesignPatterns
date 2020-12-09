package observer;

import subject.Newsletter;

public class Subscriber implements Observer {

    private String name;
    private Newsletter newsletter;

    public Subscriber(Newsletter newsletter) {
        this.newsletter = newsletter;
        newsletter.registerObserver(this);
    }

    @Override
    public void update(String name) {
        this.name = name;
        display();
    }

    private void display() {
        System.out.println("New Subscriber: +" + name + " added to newsletter");
    }
}
