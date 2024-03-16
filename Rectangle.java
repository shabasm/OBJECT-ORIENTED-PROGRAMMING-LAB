import java.util.Scanner;

class RectangleAreaCalculator {
    int length;
    int breadth;

    public void calculateArea() {
        System.out.println("Area of the rectangle: " + (length * breadth));
    }
}

public class Rectangle {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            RectangleAreaCalculator rectangle = new RectangleAreaCalculator();
            System.out.print("Enter length: ");
            rectangle.length = scanner.nextInt();
            System.out.print("Enter breadth: ");
            rectangle.breadth = scanner.nextInt();
            rectangle.calculateArea();
        }
    }
}
