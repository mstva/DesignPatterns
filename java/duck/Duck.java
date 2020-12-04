public class Duck {

    String name;

    public Duck(String name) { this.name = name; }

    public void quack() {
        System.out.println(name + " is quacking");
    }

    public void swim() {
        System.out.println(name + " is swimming");
    }

    public void display() {
        System.out.println("I am a " + name);
    }

}
