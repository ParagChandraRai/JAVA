import javax.swing.JOptionPane;

public class points {
    
    public static void main(String[] args) {
        
     
        String input = JOptionPane.showInputDialog("Enter the student's average:");
        double average = Double.parseDouble(input);
        
       
        int grade = qualityPoints(average);
        
        
        JOptionPane.showMessageDialog(null, "The student's grade is " + grade);
    }
    
    public static int qualityPoints(double average) {
        if (average >= 90 && average <= 100) 
		{
            return 4;
        }
		else if (average >= 80 && average <= 89) 
		{
            return 3;
        } 
		else if (average >= 70 && average <= 79) 
		{
            return 2;
        } 
		else if (average >= 60 && average <= 69) {
            return 1;
        } 
		else 
		{
            return 0;
        }
    }
    
}
