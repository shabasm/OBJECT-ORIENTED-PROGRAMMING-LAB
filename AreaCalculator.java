import java.util.*;

class ShapeCalculator {
    int areaRectangle;
    int areaSquare;
    double areaCircle;
    double areaTriangle;

    void calculateAreaRectangle(int length, int breadth) {
        areaRectangle = length * breadth;
        System.out.println("Area of rectangle: " + areaRectangle);
    }

    void calculateAreaSquare(int side) {
        areaSquare = side * side;
        System.out.println("Area of square: " + areaSquare);
    }

    void calculateAreaCircle(double radius) {
        areaCircle = 3.14 * radius * radius;
        System.out.println("Area of circle: " + areaCircle);
    }

    void calculateAreaTriangle(double base, double height) {
        areaTriangle = 0.5 * base * height;
        System.out.println("Area of triangle: " + areaTriangle);
    }
}

public class AreaCalculator {
    public static void main(String args[]) {
        int side, length, breadth, choice;
        char wish;
        double radius, base, height;
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.println("---MENU---");
            System.out.println("1. Area of rectangle\n2. Area of circle\n3. Area of square\n4. Area of triangle\n");
            do {
                System.out.println("Enter your choice:");
                choice = scanner.nextInt();
                ShapeCalculator shapeCalculator = new ShapeCalculator();

                switch (choice) {
                    case 1:
                        System.out.println("Enter the length of rectangle:");
                        length = scanner.nextInt();
                        System.out.println("Enter the breadth of rectangle:");
                        breadth = scanner.nextInt();
                        shapeCalculator.calculateAreaRectangle(length, breadth);
                        break;
                    case 2:
                        System.out.println("Enter the radius of circle:");
                        radius = scanner.nextDouble();
                        shapeCalculator.calculateAreaCircle(radius);
                        break;
                    case 3:
                        System.out.println("Enter the side of square:");
                        side = scanner.nextInt();
                        shapeCalculator.calculateAreaSquare(side);
                        break;
                    case 4:
                        System.out.println("Enter the base of triangle:");
                        base = scanner.nextDouble();
                        System.out.println("Enter the height of triangle:");
                        height = scanner.nextDouble();
                        shapeCalculator.calculateAreaTriangle(base, height);
                        break;
                    default:
                        System.out.println("Wrong choice..");
                        break;
                }
                System.out.println("Do you wish to continue(y/n):");
                wish = scanner.next().charAt(0);
            } while (wish == 'y' || wish == 'Y');

        }
    }
}