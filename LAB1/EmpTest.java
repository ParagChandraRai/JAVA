import mypack.*;
import javax.swing.*;
 class EmpTest {
    public static void main(String[] args) {
        emp obj1 = new emp("John", "Doe", 5000);
        emp obj2= new  emp("Jane", "Smith", 6000);
        
		String fn = JOptionPane.showInputDialog(null,"Enter First name");
		String ln = JOptionPane.showInputDialog(null,"Enter last name");
		double sal = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter Monthly Salary"));
		
		obj1.setFirstName(fn);
		obj1.setLastName(ln);
		obj1.setMonthlySalary(sal);
		
		JOptionPane.showMessageDialog(null,"Yearly salary for" +obj1.getFirstName()+" "+obj1.getLastName()+" "+obj1.getYearlySalary()+"");
		
		String fn1 = JOptionPane.showInputDialog(null,"Enter First name");
		String ln1 = JOptionPane.showInputDialog(null,"Enter last name");
		double sal1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter Monthly Salary"));
		
		obj2.setFirstName(fn1);
		obj2.setLastName(ln1);
		obj2.setMonthlySalary(sal1);
		JOptionPane.showMessageDialog(null,"Yearly salary for" +obj2.getFirstName()+" "+obj2.getLastName()+" "+obj2.getYearlySalary()+"");

        obj1.raiseSalary(10);
        obj2.raiseSalary(10);

		JOptionPane.showMessageDialog(null,"Yearly salary after 10% raise " +obj1.getFirstName()+" "+obj1.getLastName()+" "+obj1.getYearlySalary()+"");
		JOptionPane.showMessageDialog(null,"Yearly salary after 10% raise " +obj2.getFirstName()+" "+obj2.getLastName()+" "+obj2.getYearlySalary()+"");
    }
}
