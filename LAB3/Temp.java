import javax.swing.*;

class Temp {
    public static void celtofah(double temp) {
        double fah = ((9.0*temp)/5.0)+32;
        JOptionPane.showMessageDialog(null, "TEmperature in fahrenheit is : " + fah);
    }

    public static void fahtocel(double temp) 
    {
        double cel = (5.0*(temp-32))/9.0;
        JOptionPane.showMessageDialog(null, "TEmperature in celsius is : " + cel);
    }

    public static void main(String args[]) {

        String s = JOptionPane.showInputDialog(null, "ENTER ANY ONE OPTION" + "\n" + "1. cel" + "\n" + "2. fah");
        if (s.compareTo("cel")==0) {
            double temp = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the temperature in celsius"));
            celtofah(temp);
        }
        if (s.compareTo("fah")==0) {
            double temp = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the temperature in fahrenheit"));
            fahtocel(temp);
        }

    }

}