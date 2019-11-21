package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class KitchenPanel implements Observer {
    private List<String> foodNames;

    public KitchenPanel() {
        foodNames = new ArrayList<>();
    }

    @Override
    public void update(String foodName) {
        foodNames.add(foodName);
        //  update();
        // System.out.println("Customer has ordered: " + foodName);
    }

    public void update() {
        String result = "";
        for (String foodName : foodNames) {
            for (int i = 0; i < foodNames.size(); i++) {
                for (int j = i + 1; j < foodNames.size(); j++) {
                    if (foodNames.get(i) == foodNames.get(j)) {
                        result = foodNames.get(i);
                    } else {
                        System.out.println("Customer has ordered: " + foodName);
                    }
                }
            }
        }
        System.out.println("Customer has ordered: " + result + " * 2");
    }
}

