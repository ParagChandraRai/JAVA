/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalabgaphics;


import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Line100 extends JPanel {

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		SecureRandom random = new SecureRandom();

		for (int i = 0; i < 100; i++)
			g.drawLine(random.nextInt(getWidth()), random.nextInt(getHeight()), random.nextInt(getWidth()),
					random.nextInt(getHeight()));

		repaint();

	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Drawing Lines");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Line100 draw = new Line100();
		draw.setBackground(Color.WHITE);
		frame.add(draw);
		frame.setSize(300, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}