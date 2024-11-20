package creational.singleton;

public class SingletonTest {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
        System.out.println("Singleton 1 instance equals: " + s1.toString());
        System.out.println("Singleton 2 instance equals: " + s2.toString());
    }
}
