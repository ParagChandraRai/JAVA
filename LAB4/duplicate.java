import java.util.Scanner;
import javax.swing.*;
public class duplicate {
    public static void main(String[] args) {
        final int SIZE = 5;
        int[] numbers = new int[SIZE];
        
        JOptionPane.showMessageDialog(null,"Enter " + SIZE + " numbers between 10 and 100, inclusive:");
       
        for (int i = 0; i < SIZE; i++) {
            int num =Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Number"));

            if (num < 10 || num > 100) {
				JOptionPane.showMessageDialog(null,"Number must be between 10 and 100, inclusive.");
                System.out.println("");
                i--; 
            } else if (contains(numbers, i, num)) {
				JOptionPane.showMessageDialog(null,"Duplicate number. Try again.");
                System.out.println("");
                i--; 
            } else {
                numbers[i] = num;
                displayUnique(numbers, i);
            }
        }
    }

    public static boolean contains(int[] array, int index, int num) {
        for (int i = 0; i < index; i++) {
            if (array[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static void displayUnique(int[] array, int index) {
		String s1="";
        
        for (int i = 0; i <= index; i++) 
		{
            System.out.print(array[i] + " ");
			s1+=array[i]+" ";
        }
        JOptionPane.showMessageDialog(null,"Unique numbers entered:"+s1);
    }
}
