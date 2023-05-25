
package javalabgaphics;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CircleDraw extends JPanel {
	private double radius;
	private int x;
	private int y;

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		double diametro = 2 * radius;
		g2d.draw(new Ellipse2D.Double(x, y, diametro, diametro));

		g.setFont(new Font("SansSerif", Font.BOLD, 16));
		g.drawString(String.format("DiÃ¢metro %,.1f%n cmÂ²  - CircunferÃªncia %,.1f%n cmÂ²  - Ã�rea %,.1f cmÂ²",
				diametro, 2 * Math.PI * radius, Math.PI * Math.pow(radius, 2)), 10, getHeight() - 20);
	}

	public void readData() {
		Scanner scanner = new Scanner(System.in);
                 
                
                
		
		  radius =Double.parseDouble(JOptionPane.showInputDialog("Gross sales in the week or -1 to quit:"));

		 x=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter X Coordinate : "));
               
                  y=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter y Coordinate : "));

		
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("CÃ­rculo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		CircleDraw draw = new CircleDraw();
		draw.readData(); // solicita os dados pelo console

		draw.setBackground(Color.WHITE);
		frame.add(draw);

		frame.setSize(520, 500);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
