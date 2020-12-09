import observer.Subscriber;
import subject.Newsletter;

public class Main {

    public static void main(String[] args) {

        Newsletter newsletter = new Newsletter();

        Subscriber subscriber = new Subscriber(newsletter);

        newsletter.setName("Mustafa");
        newsletter.removeObserver(subscriber);
        
    }

}
