import javax.swing.JOptionPane;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int rows1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of rows for matrix 1:"));
		int cols1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of columns for matrix 1:"));

		int[][] matrix1 = new int[rows1][cols1];

		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < cols1; j++) {
				String input = JOptionPane.showInputDialog(null, "Enter element at row " + (i + 1) + " and column " + (j + 1) + " for matrix 1:");
				matrix1[i][j] = Integer.parseInt(input);
			}
		}

		int rows2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of rows for matrix 2:"));
		int cols2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of columns for matrix 2:"));

		int[][] matrix2 = new int[rows2][cols2];

		for (int i = 0; i < rows2; i++) {
			for (int j = 0; j < cols2; j++) {
				String input = JOptionPane.showInputDialog(null, "Enter element at row " + (i + 1) + " and column " + (j + 1) + " for matrix 2:");
				matrix2[i][j] = Integer.parseInt(input);
			}
		}

		if (cols1 != rows2) {
			JOptionPane.showMessageDialog(null, "Error: Number of columns in matrix 1 does not match number of rows in matrix 2.");
			System.exit(0);
		}

		int[][] result = multiplyMatrices(matrix1, matrix2);

		StringBuilder message = new StringBuilder();
		message.append("Resulting matrix:\n");

		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				message.append(result[i][j] + "\t");
			}
			message.append("\n");
		}

		JOptionPane.showMessageDialog(null, message);
	}

	public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
		int rows1 = matrix1.length;
		int cols1 = matrix1[0].length;
		int rows2 = matrix2.length;
		int cols2 = matrix2[0].length;

		if (cols1 != rows2) {
			throw new IllegalArgumentException("Number of columns in matrix 1 does not match number of rows in matrix 2.");
		}

		int[][] result = new int[rows1][cols2];

		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < cols2; j++) {
				for (int k = 0; k < cols1; k++) {
					result[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}

		return result;
	}

}
