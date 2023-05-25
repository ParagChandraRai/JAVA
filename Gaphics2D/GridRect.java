/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalabgaphics;


import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridRect extends JPanel {

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		int spaceAmongLines = 0;

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++)
				g.drawRect((getWidth() / 10) * j, spaceAmongLines, getWidth() / 10, getWidth() / 10);

			spaceAmongLines += getHeight() / 10;

		}

	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Grade 10 por 10 - drawRect");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GridRect draw = new GridRect();
		frame.add(draw);
		frame.setSize(590, 601);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
