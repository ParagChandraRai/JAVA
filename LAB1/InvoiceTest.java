import mypack.*;
import javax.swing.*;
class InvoiceTest {
    public static void main(String[] args) {
        // create an Invoice object
        invoice obj = new invoice("101", "hammer", 1, 10);

         String pn= JOptionPane.showInputDialog(null,"Enter Part Number");
		 String pd = JOptionPane.showInputDialog(null,"Enter Part Description");
		int q=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Quantity"));
		double p=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter  price"));
		
		obj.setPartNumber(pn);
		obj.setPartDescription(pd);
		obj.setQuantity(q);
		obj.setPricePerItem(p);
		
         JOptionPane.showMessageDialog(null,"Part number: " + obj. getPartNumber()+"");
		 JOptionPane.showMessageDialog(null,"Part description: " + obj. getPartDescription()+"");
		 JOptionPane.showMessageDialog(null,"Quantity:: " + obj. getQuantity()+"");
		 JOptionPane.showMessageDialog(null,"Price per item: " + obj. getPricePerItem()+"");
		 JOptionPane.showMessageDialog(null,"Invoice amount: " + obj. getInvoiceAmount()+"");
        // print the invoice information
		
        
		

    }
}
 