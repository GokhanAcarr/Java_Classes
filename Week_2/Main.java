import java.util.Scanner;

public class Main {

    public static double calculateRectangleArea(int length, int width) {
        return length * width;
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Select a shape to calculate area:");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Enter the length of the rectangle: ");
            int length = input.nextInt();
            System.out.print("Enter the width of the rectangle: ");
            int width = input.nextInt();
            double rectangleArea = calculateRectangleArea(length, width);
            System.out.println("The area of the rectangle is: " + rectangleArea);
        } else if (choice == 2) {
            System.out.print("Enter the radius of the circle: ");
            double radius = input.nextDouble();
            double circleArea = calculateCircleArea(radius);
            System.out.println("The area of the circle is: " + circleArea);
        } else {
            System.out.println("Invalid choice. Please enter 1 for rectangle or 2 for circle.");
        }
    }
}
