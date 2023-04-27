import javax.swing.JOptionPane;

public class digit {
    public static int integerQuotient(int a, int b) {
        return a / b;
    }

    public static int integerRemainder(int a, int b) {
        return a % b;
    }
   static String s1="";
    public static void displayDigits(int num) 
	{
        int quotient = integerQuotient(num, 10);
        int remainder = integerRemainder(num, 10);
        if (quotient != 0) {
            displayDigits(quotient);
        }
		s1+=remainder+"   ";
        
    }

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer between 1 and 99999: "));
        displayDigits(num);
		JOptionPane.showMessageDialog(null, s1 + "  ");
    }
}
