package shape;

import java.util.Scanner;

public class RectangleTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter width: ");
        double width = input.nextDouble();

        System.out.print("Enter height: ");
        double height = input.nextDouble();

        Rectangle rect = new Rectangle(width, height);

        System.out.printf("Rectangle {width: %.2f, height: %.2f, color: %s}\nArea: %.2f\nPerimeter: %.2f",
                rect.getWidth(), rect.getHeight(), rect.getColor(), rect.getArea(), rect.getPerimeter());
    }
}
