import java.util.Random;
import javax.swing.JOptionPane;

public class DiceRoller {
    
    public static void main(String[] args) {
        
        // Create a Random object for rolling the dice
        Random random = new Random();
        
        // Create a 6x6 table to tally the number of times each sum appears
        int[][] counts = new int[6][6];
        
        // Roll the dice 36,000,000 times
        for (int i = 0; i < 36000000; i++) {
            // Roll the first die and the second die
            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;
            
            // Calculate the sum of the values
            int sum = die1 + die2;
            
            // Increment the count for the corresponding sum
            counts[die1 - 1][die2 - 1]++;
        }
        
        // Display the results in a 6x6 table
        StringBuilder sb = new StringBuilder();
        sb.append("  ");
        for (int i = 1; i <= 6; i++) {
            sb.append(String.format("%3d", i));
        }
        sb.append("\n");
        for (int i = 0; i < 6; i++) {
            sb.append(String.format("%2d", i+1));
            for (int j = 0; j < 6; j++) {
                sb.append(String.format("%3d", counts[i][j]));
            }
            sb.append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
    
}
