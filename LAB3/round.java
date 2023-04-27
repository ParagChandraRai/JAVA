import javax.swing.JOptionPane;

public class round {
    public static void main(String[] args) {
        double number = Double.parseDouble(JOptionPane.showInputDialog("Enter a number:"));
        
      
        int integer = roundToInteger(number);
        String result1 = "Rounded to integer: " + integer;
        
       
        double tenths = roundToTenths(number);
        String result2 = "Rounded to tenths: " + tenths;
        
        
        double hundredths = roundToHundredths(number);
        String result3 = "Rounded to hundredths: " + hundredths;
        
        
        double thousandths = roundToThousandths(number);
        String result4 = "Rounded to thousandths: " + thousandths;
        
        
        String output = "Original number: " + number + "\n" + result1 + "\n" + result2 + "\n" + result3 + "\n" + result4;
        JOptionPane.showMessageDialog(null, output);
    }
    
    public static int roundToInteger(double number) {
        return (int) Math.floor(number + 0.5);
    }
    
    public static double roundToTenths(double number) {
        return Math.floor(number * 10 + 0.5) / 10;
    }
    
    public static double roundToHundredths(double number) {
        return Math.floor(number * 100 + 0.5) / 100;
    }
    
    public static double roundToThousandths(double number) {
        return Math.floor(number * 1000 + 0.5) / 1000;
    }
}
