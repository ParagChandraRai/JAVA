import java.util.Scanner;

public class IntegerInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value;

        System.out.print("Enter an integer: ");
        value = input.nextInt();

        System.out.println("The value you entered is " + value);
    }
}
