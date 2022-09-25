package zad2;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton first = Singleton.getInstance();
        Singleton second = Singleton.getInstance();

        if (first == second) {
            System.out.println("The two objects are the same instance.");
        } else {
            System.out.println("The two objects are not the same instance.");
        }
    }
}