import java .util.*;
import javax.swing.*;
class park
{
	public static double calculate(double hours)
	{
double m=2.0;
		if(hours<=3)
		{
		JOptionPane.showMessageDialog(null,"ONGOING CALCULATION : ");
		return 2;
		}	
		else if(hours>3 && hours<=19)
		{
		for(int i=1;i<=16;i++)
		{
		 m=m+i*0.50;
		if(m>=10)
		break;
		JOptionPane.showMessageDialog(null,"ONGOING CALC"+m);
		}
		return 2+(hours-3)*0.50;
		}
		else
		return 10;
	}
	public static void main(String args[])
	{
		int n=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number of customers"));
		int i;
		double total=0.0;
		for(i=1;i<=n;i++)
		{
		
		double hours=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the number of hours for customer"+i));
		double h=calculate(hours);
		 total=total+h;
		JOptionPane.showMessageDialog(null,"Charges for customer is "+h);
		
		}
		JOptionPane.showMessageDialog(null,"TOTAL YESTERDAY  RECIEPT IS"+total);
	}
}