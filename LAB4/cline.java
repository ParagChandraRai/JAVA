import javax.swing.*;
public class cline {
    
    public static void main(String[] args) {
        double sum = 0.0;
        for (String arg : args) {
            sum += Double.parseDouble(arg);
        }
		JOptionPane.showMessageDialog(null,"Sum of double values: " + sum); 
        
    }
}
