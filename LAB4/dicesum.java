import java.security.SecureRandom;
import javax.swing.*;
public class dicesum{
	private static final SecureRandom random = new SecureRandom();

	public static void main(String[] args) {
		int[] frequency = new int[13];

		for (int i = 0; i < 3600; i++) {
			int die1 = 1 + random.nextInt(6);
			int die2 = 1 + random.nextInt(6);

			int sum = die1 + die2;

			++frequency[sum];
		}

		String output = "Face\tFrequency\n";

for (int i = 2; i < frequency.length; i++) {
    output += String.format("%2d\t%10d%n", i, frequency[i]);
}

JOptionPane.showMessageDialog(null, output, "Rolling Dice", JOptionPane.INFORMATION_MESSAGE);
	}

}