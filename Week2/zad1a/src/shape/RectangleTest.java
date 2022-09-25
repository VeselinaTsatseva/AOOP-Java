package shape;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter width: ");
        double width = input.nextDouble();

        System.out.print("Enter heigth: ");
        double heigth = input.nextDouble();

        Rectangle rect = new Rectangle(width, heigth);

        System.out.printf("Rectangle {width: %.2f, heigth: %.2f, color: %s}\nArea: %.2f\nPerimeter: %.2f\n",
                rect.getWidth(), rect.getHeigth(), rect.getColor(), rect.gerArea(), rect.getPerimeter());
    }
}
