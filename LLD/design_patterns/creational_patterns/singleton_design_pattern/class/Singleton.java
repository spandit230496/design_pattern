public class Singleton {

    // static variable to hold single instance
    private static Singleton instance;

    // private constructor
    private Singleton() {
        System.out.println("Singleton Instance Created");
    }

    // public method to get instance
    public static Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}