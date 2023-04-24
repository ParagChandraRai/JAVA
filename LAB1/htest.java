import mypack.*;
import java.time.*;
import javax.swing.*;
public class htest{
    

    public static void main(String[] args) {
        heart person = new heart("John", "Doe", LocalDate.of(1990, 6, 15));
		String fn = JOptionPane.showInputDialog(null,"Enter First name");
		String ln = JOptionPane.showInputDialog(null,"Enter last name"); 
         person.setFirstName(fn);
		 person.setLastName(ln);
		 String input = JOptionPane.showInputDialog(null, "Enter Date of birth (yyyy-MM-dd)");
    try {
    LocalDate dob = LocalDate.parse(input);
    person.setDateOfBirth(dob);
    } catch (Exception e) {
    //JOptionPane.showMessageDialog(null, "Invalid date format. Please enter a date in the format yyyy-MM-dd");
     }
	 JOptionPane.showMessageDialog(null,"First Name: "+person.getFirstName()+"");
	 JOptionPane.showMessageDialog(null,"Last Name: "+person.getLastName()+"");
	 JOptionPane.showMessageDialog(null,"Date of Birth:"+person.getDateOfBirth()+"");
	 JOptionPane.showMessageDialog(null,"Age: "+person.calculateAge() + " years");
	 JOptionPane.showMessageDialog(null,"Maximum Heart Rate: " + person.calculateMaximumHeartRate() + " bpm");
	 
	 int[] targetHeartRate = person.calculateTargetHeartRate();
	 JOptionPane.showMessageDialog(null,"Target Heart Rate Range: " + targetHeartRate[0] + "-" + targetHeartRate[1] + " bpm");

	}
}
  