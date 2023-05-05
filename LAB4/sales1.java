

package LOOP;
import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Reverse {

	public static void main(String[] args) {
		ArrayList<Integer> salaries = new ArrayList<>();
		int grossSales = 0;

		while (grossSales != -1) {
			String input = JOptionPane.showInputDialog(null, "Gross sales in the week or -1 to quit: ");
			grossSales = Integer.parseInt(input);

			if (grossSales != -1) {
				int salary = (int) (200 + (0.09 * grossSales));
				salaries.add(salary);
			}
		}

		displayRanges(salaries);
	}

	public static void displayRanges(ArrayList<Integer> salaries) {
		StringBuilder message = new StringBuilder();
		message.append("Frequency of wages at each of the following intervals:\n");
		int[] frequency = new int[11];

		for (Integer salary : salaries) {
			int rangeIndex = salary / 100;
			++frequency[rangeIndex > 10 ? 10 : rangeIndex];
		}

		for (int i = 2; i < frequency.length; i++) {
			if (i == 10)
				message.append(String.format("$%d and over: ", 1000));
			else
				message.append(String.format("$%d-%d: ", i * 100, i * 100 + 99));

			for (int stars = 0; stars < frequency[i]; stars++)
			          message.append(frequency[i]);

			message.append("\n");
		}

		JOptionPane.showMessageDialog(null, message);
	}

}
