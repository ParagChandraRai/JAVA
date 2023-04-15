import java.util.Scanner;

public class CircleCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        int radius = input.nextInt();

        System.out.printf("Diameter: %.2f%n", 2 * radius * 1.0);
        System.out.printf("Circumference: %.2f%n", 2 * 3.14159 * radius);
        System.out.printf("Area: %.2f%n", 3.14159 * radius * radius);
    }
}
