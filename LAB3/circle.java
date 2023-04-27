
import javax.swing.*;
public class circle
{
   
     public static void main( String[] args )
	 {
      double radius=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter Radius"));
	  double area=circleArea(radius);
	  
	  JOptionPane.showMessageDialog(null,"Area is "+area);
    }
   public static double circleArea(double radius)
   {
     double area=Math.PI*radius*radius;
	 return area;
	 
   }
}

