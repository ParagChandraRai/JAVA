import javax.swing.*;

public class star {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter the side of the square:");
        int side = Integer.parseInt(input);
        squareOfAsterisks(side);
    }

    public static void squareOfAsterisks(int side) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        JOptionPane.showMessageDialog(null, sb);
    }
}
