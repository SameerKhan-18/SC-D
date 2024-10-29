import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create a rectangle object using the default constructor
        Rectangle rectangle = new Rectangle();

        // Display default values
        System.out.println("Default Rectangle:");
        System.out.printf("Length: %.2f, Width: %.2f%n", rectangle.getLength(), rectangle.getWidth());
        System.out.printf("Area: %.2f, Perimeter: %.2f%n", rectangle.area(), rectangle.perimeter());

        // Input new values for length and width
        System.out.print("Enter length (0.0 < length < 20.0): ");
        double newLength = scanner.nextDouble();
        rectangle.setLength(newLength);

        System.out.print("Enter width (0.0 < width < 20.0): ");
        double newWidth = scanner.nextDouble();
        rectangle.setWidth(newWidth);

        // Display updated values
        System.out.println("\nUpdated Rectangle:");
        System.out.printf("Length: %.2f, Width: %.2f%n", rectangle.getLength(), rectangle.getWidth());
        System.out.printf("Area: %.2f, Perimeter: %.2f%n", rectangle.area(), rectangle.perimeter());
        
        scanner.close();
    }
}
