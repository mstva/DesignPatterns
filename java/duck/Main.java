public class Main {

    public static void main(String[] args) {

        MollardDuck mollard = new MollardDuck("Mollard Duck");
        mollard.display();
        mollard.quack();
        mollard.swim();

        RedheadDuck redhead = new RedheadDuck("Redhead Duck");
        redhead.display();
        redhead.quack();
        redhead.swim();
    }
}
