package mypack;
import java.time.*;
import javax.swing.*;
public class heart {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    public heart(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int calculateAge() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(dateOfBirth, currentDate).getYears();
    }

    public int calculateMaximumHeartRate() {
        int age = calculateAge();
        return 220 - age;
    }
	public int[] calculateTargetHeartRate() {
        int maxHeartRate = calculateMaximumHeartRate();
        int targetMin = (int) Math.round(maxHeartRate * 0.5);
        int targetMax = (int) Math.round(maxHeartRate * 0.85);
        return new int[] {targetMin, targetMax};
    
    }
}
