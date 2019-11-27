package model;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers;

    Subject() {
        observers = new ArrayList<>();
    }

    void addObserver(Observer o) {
        if (!observers.contains(o)) {
            observers.add(o);
        }
    }

    // REQUIRES: observers are empty
    // EFFECTS: call update method on every observer in observers
    public void notifyObserver(String foodName) {
        for (Observer o : observers) {
            o.update(foodName);
        }
    }
}
