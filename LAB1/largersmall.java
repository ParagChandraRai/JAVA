import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third integer: ");
        int num3 = input.nextInt();

        System.out.print("Enter the fourth integer: ");
        int num4 = input.nextInt();

        System.out.print("Enter the fifth integer: ");
        int num5 = input.nextInt();

        int largest = num1;
        int smallest = num1;

        if (num2 > largest) {
            largest = num2;
        }

        if (num3 > largest) {
            largest = num3;
        }

        if (num4 > largest) {
            largest = num4;
        }

        if (num5 > largest) {
            largest = num5;
        }

        if (num2 < smallest) {
            smallest = num2;
        }

        if (num3 < smallest) {
            smallest = num3;
        }

        if (num4 < smallest) {
            smallest = num4;
        }

        if (num5 < smallest) {
            smallest = num5;
        }

        System.out.println("The largest number is: " + largest);
        System.out.println("The smallest number is: " + smallest);
    }
}
