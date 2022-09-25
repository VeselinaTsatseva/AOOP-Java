package zad2;

public class Singleton {
    private Object data;

    private static Singleton singleton = new Singleton("data");

    private Singleton(Object data) {
        this.data = data;
    }

    public static Singleton getInstance() {
        return singleton;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return String.format("%s", data);
    }

}
