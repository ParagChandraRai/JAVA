
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class sal {

	public static void main(String[] args) {
		ArrayList<Integer> salaries = new ArrayList<>();

		int grossSales = 0;

		while (grossSales != -1) {
			String input = JOptionPane.showInputDialog("Gross sales in the week or -1 to quit:");
			grossSales = Integer.parseInt(input);

			if (grossSales != -1)
				salaries.add((int) (200 + (0.09 * grossSales)));
		}

		displayRanges(salaries);
	}

	public static void displayRanges(ArrayList<Integer> salaries) {
		StringBuilder sb = new StringBuilder();
		sb.append("Frequency of wages at each of the following intervals:\n");
		int[] frequency = new int[11];

		for (Integer salary : salaries) {
			int rangeIndex = salary / 100;
			++frequency[rangeIndex > 10 ? 10 : rangeIndex];
		}

		for (int i = 2; i < frequency.length; i++) {
			/*
			 * 1. $200–299 2. $300–399
			 */

			if (i == 10)
				sb.append(String.format("$%d %s: ", 1000, "and over"));
			else
				sb.append(String.format("$%d-%d: ", i * 100, i * 100 + 99));

			for (int starts = 0; starts < frequency[i]; starts++)
				sb.append("*");

			sb.append("\n");
		}

		JOptionPane.showMessageDialog(null, sb.toString());
	}

}
