package model;

public class Pop implements Drinks {
    @Override
    public void printTips() {
        System.out.println("Get a cup near front desk");
    }


    public void cokeZero() {
        printTips();
    }

}
