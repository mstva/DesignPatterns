package subject;

import observer.Observer;

import java.util.ArrayList;

public class Newsletter implements Subject {

    private String name;
    private ArrayList<Observer> observers;

    public Newsletter() { observers = new ArrayList<>(); }

    @Override
    public void registerObserver(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void removeObserver(Observer removeObserver) {
        observers.remove(removeObserver);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(name);
        }
    }

    public void setName(String name) {
        this.name = name;
        notifyObservers();
    }

}
