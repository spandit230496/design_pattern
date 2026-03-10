// Method 1 — Thread Safe Singleton (Using Synchronized Method)


public class Singleton2 {

    private static Singleton2 instance;

    private Singleton2() {
        System.out.println("Singleton instance created");
    }

    public static synchronized Singleton2 getInstance() {

        if (instance == null) {
            instance = new Singleton2();
        }

        return instance;
    }
}


// Explanation

// synchronized ensures that only one thread can execute getInstance() at a time.

// Prevents multiple instances from being created.

// Disadvantage

// Synchronization adds performance overhead because the entire method is locked.