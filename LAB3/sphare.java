import javax.swing.*;
public class sphare
{
  public static void main( String[] args )
  {
    
	double radius=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter Radius"));
    double res1=sphereVolume( radius );
    
	JOptionPane.showMessageDialog(null,"Volume is"+res1);
  }

    public static double sphereVolume( double radius )
   {
     double volume = ( 4.0 / 3.0 ) * Math.PI * Math.pow( radius, 3 );
    return volume;
   } 
 } 