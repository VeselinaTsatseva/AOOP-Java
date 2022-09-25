package zad1;

public class MonetaryCoin extends Coin{
    private int value;

    public MonetaryCoin(Face face, int value) {
        super(face);
        setValue(value);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value > 0 ? value : 0;
    }
}
