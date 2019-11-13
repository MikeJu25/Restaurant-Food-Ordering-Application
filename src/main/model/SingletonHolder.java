package model;

public class SingletonHolder {
    private static final Singleton Instance = new Singleton("Mike Ju");

    public static Singleton getInstance() {
        return SingletonHolder.Instance;
    }
}
