import javax.swing.JOptionPane;

public class airline {
    private static boolean[] seats = new boolean[10];

    public static void main(String[] args) {
        while (true) {
            String input = JOptionPane.showInputDialog(null, "Please type 1 for First Class\nPlease type 2 for Economy",
                    "Seat Selection", JOptionPane.PLAIN_MESSAGE);

            int seatClass;
            try {
                seatClass = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                continue;
            }

            if (seatClass != 1 && seatClass != 2) {
                continue;
            }

            int seat = assignSeat(seatClass);
            if (seat == -1) {
                JOptionPane.showMessageDialog(null,
                        "The section you selected is full. Would you like to try a different section?",
                        "Seat Selection", JOptionPane.QUESTION_MESSAGE);
                continue;
            }

            JOptionPane.showMessageDialog(null,
                    "Boarding Pass\nSeat Number: " + seat + "\nSection: " + (seat <= 5 ? "First Class" : "Economy"),
                    "Seat Selection", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static int assignSeat(int seatClass) {
        int start = seatClass == 1 ? 0 : 5;
        int end = seatClass == 1 ? 4 : 9;

        for (int i = start; i <= end; i++) {
            if (!seats[i]) {
                seats[i] = true;
                return i + 1;
            }
        }

        // Section is full
        for (int i = 0; i < seats.length; i++) {
            if (!seats[i]) {
                int choice = JOptionPane.showConfirmDialog(null,
                        "The section you selected is full. Would you like to be placed in the other section?",
                        "Seat Selection", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (choice == JOptionPane.YES_OPTION) {
                    seats[i] = true;
                    return i + 1;
                } else {
                    return -1;
                }
            }
        }

        // All seats are taken
        return -1;
    }
}
