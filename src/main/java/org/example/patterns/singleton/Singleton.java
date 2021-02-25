package org.example.patterns.singleton;

public class Singleton {
    // global variable for only one instance
    private volatile static Singleton uniqueInstance;

    private Singleton() {}
    // method returns only one instance
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            // synced only for first time when instance is null
            synchronized(Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
