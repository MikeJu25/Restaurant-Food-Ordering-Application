package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class KitchenPedal implements Observer {
    private List<String> foodNames;

    public KitchenPedal() {
        foodNames = new ArrayList<>();
    }

    @Override
    public void update(String foodName) {
        foodNames.add(foodName);
       // System.out.println("Customer has ordered: " + foodName);
    }

    public void update() {
        for (String foodName : foodNames) {
            System.out.println("Customer has ordered: " + foodName);
        }
    }
}
