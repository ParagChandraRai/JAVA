import javax.swing.*;
public class variablelength{
    
    public static int product(int... nums) {
        int result = 1;
        for (int num : nums) {
            result *= num;
        }
        return result;
    }
    
    public static void main(String[] args) {
        int prod1 = product(2, 4, 6);
        int prod2 = product(1, 3, 5, 7, 9);
        int prod3 = product(4, 7);
        
		JOptionPane.showMessageDialog(null,"Product of 2, 4, 6 is " + prod1); 
	    JOptionPane.showMessageDialog(null,"Product of 1, 3, 5, 7, 9 is " + prod2); 
		JOptionPane.showMessageDialog(null,"Product of 4, 7 is " + prod3); 
		
    }
}
