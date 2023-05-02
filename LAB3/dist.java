import javax.swing.JOptionPane;

public class dist {
    
    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Enter the x-coordinate of the first point:");
        double x1 = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Enter the y-coordinate of the first point:");
        double y1 = Double.parseDouble(input);
        
       
        input = JOptionPane.showInputDialog("Enter the x-coordinate of the second point:");
        double x2 = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Enter the y-coordinate of the second point:");
        double y2 = Double.parseDouble(input);
        
   
        double distance = distance(x1, y1, x2, y2);
        
       
        JOptionPane.showMessageDialog(null, "The distance between the points is " + distance);
    }
    
    public static double distance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        double distance = Math.sqrt(dx * dx + dy * dy);
        return distance;
    }
    
}
