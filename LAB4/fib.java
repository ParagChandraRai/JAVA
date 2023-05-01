import javax.swing.JOptionPane;

public class fib {
    
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter the value of n:");
        int n = Integer.parseInt(input);
        int result = fibonacci(n);
        JOptionPane.showMessageDialog(null, "The " + n + "th Fibonacci number is " + result);
    }
}
