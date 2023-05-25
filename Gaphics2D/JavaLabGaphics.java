/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalabgaphics;

import java.awt.Graphics;
import javax.swing.JPanel;

  

import javax.swing.JFrame;
import javax.swing.*;

public class JavaLabGaphics extends JPanel {

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		// desenha linhas horizontais
		for (int i = 1; i <= 8; i++)
			g.drawLine(0, (getHeight() / 8) * i, getWidth(), (getHeight() / 8) * i);

		// desenha linhas verticais
		for (int i = 1; i <= 8; i++)
			g.drawLine((getWidth() / 8) * i, 0, (getWidth() / 8) * i, getHeight());

	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Grade 8 por 8");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JavaLabGaphics draw = new JavaLabGaphics();
		frame.add(draw);

		frame.setSize(600, 600);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}

}