
import javax.swing.*;
public class Even {
    public static void main(String[] args) {
        
		int num=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Number"));
        if( EvenOdd(num))
           JOptionPane.showMessageDialog(null,"Even Number ");
	   else
	   
	   JOptionPane.showMessageDialog(null,"Odd Number ");
    }
    
    public static boolean EvenOdd(int number) 
	{
	if(number%2==0)
	   return true;
	 return false;
	
   }

}

