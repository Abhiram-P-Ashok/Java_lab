import java.util.Scanner;

class Shape {
    float dimension1, dimension2;
    Shape(float d1, float d2) {
        dimension1 = d1;
        dimension2 = d2;
    }
    Shape(float d) {
        dimension1 = d;
        dimension2 = 0; // Set to 0 for shapes that have only one dimension (e.g., circle)
    }
    float area() {
        return 0; // Default area calculation (override in derived classes)
    }
}
class Circle extends Shape {
    Circle(float r) {
        super(r);
    }
    float area() {
        return (float) (Math.PI * dimension1 * dimension1);
    }
}
class Triangle extends Shape {
    Triangle(float b, float h) {
        super(b, h);
    }
    float area() {
        return 0.5f * dimension1 * dimension2;
    }
}
class Square extends Shape {
    Square(float side) {
        super(side);
    }
    float area() {
        return dimension1 * dimension1;
    }
}
class main_shape {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int choice;
            do {
                System.out.println("Select a shape to calculate area:");
                System.out.println("1. Circle");
                System.out.println("2. Triangle");
                System.out.println("3. Square");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter the radius of the circle: ");
                        float radius = sc.nextFloat();
                        Circle circle = new Circle(radius);
                        System.out.println("Area of the circle: " + circle.area());
                        break;
                    case 2:
                        System.out.print("Enter the base of the triangle: ");
                        float base = sc.nextFloat();
                        System.out.print("Enter the height of the triangle: ");
                        float height = sc.nextFloat();
                        Triangle triangle = new Triangle(base, height);
                        System.out.println("Area of the triangle: " + triangle.area());
                        break;
                    case 3:
                        System.out.print("Enter the side length of the square: ");
                        float side = sc.nextFloat();
                        Square square = new Square(side);
                        System.out.println("Area of the square: " + square.area());
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 4);
        }
    }
}
