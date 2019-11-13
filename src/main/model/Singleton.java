package model;

public class Singleton {
    protected static String nameOfProducer;

    protected Singleton(String str) {
        nameOfProducer = str;
        System.out.println("Producer: " + str);
    }
}
