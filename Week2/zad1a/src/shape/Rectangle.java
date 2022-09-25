package shape;

public class Rectangle {
    private double width;
    private double heigth;
    private String color;

    public Rectangle() {
        setWidth(1);
        setHeigth(1);
        setColor("yellow");
    }

    public Rectangle(double width, double heigth) {
        setWidth(width);
        setHeigth(heigth);
        setColor("yellow");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width > 0 ? width : 1;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth > 0 ? heigth : 1;
    }

    public double getHeigth() {
        return heigth;
    }

    public double gerArea() {
        return width + heigth;
    }

    public double getPerimeter() {
        return 2 * (width + heigth);
    }

    public void setColor(String color) {
        this.colour = colour != null ? colour : "yellow";
    }

    public String getColor() {
        return colour;
    }
}

