public class Main {

    public static void main(String[] args) {

        // Singleton s1 = Singleton.getInstance();
        // Singleton s2 = Singleton.getInstance();

        Singleton2 st1 = Singleton2.getInstance();
        Singleton2 st2 = Singleton2.getInstance();

        // System.out.println(s1 == s2);
        System.out.println(st1 == st2);
    }
}