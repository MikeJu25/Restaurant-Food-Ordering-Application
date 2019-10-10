package model;

public class Pop implements Drinks {
    @Override
    public String printTips() {
        return  ("Get a cup near front desk");
    }


    public void cokeZero() {
        printTips();
    }

}
