import javax.swing.*;

public class multiple {
    public static void main(String[] args) {
       

        while (true) {
			int num1=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Number1(0 to Exit)"));

            if (num1 == 0) {
                break;
            }
			  int num2=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Number1"));


            if (isMultiple(num1, num2)) {
				JOptionPane.showMessageDialog(null,num2 + " is a multiple of " + num1);
             
            } else {
              JOptionPane.showMessageDialog(null,num2 + " is not multiple of " + num1);
            }
        }
    }

    public static boolean isMultiple(int firstInt, int secondInt) {
        if (secondInt % firstInt == 0) {
            return true;
        } else {
            return false;
        }
    }
}
