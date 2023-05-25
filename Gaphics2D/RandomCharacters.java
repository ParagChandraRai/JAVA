/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalabgaphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.security.SecureRandom;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class RandomCharacters extends JPanel {

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		SecureRandom random = new SecureRandom();

		String[] namesFont = { "Serif", "Monospaced", "SansSerif", "Arial", "Consolas" };

		int quantidadeCaracteres = 20 + random.nextInt(201);

		for (int i = 0; i < quantidadeCaracteres; i++) {
			g.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));

			g.setFont(new Font(namesFont[random.nextInt(namesFont.length)], Font.PLAIN, 9 + random.nextInt(41)));

			g.drawString(String.valueOf((char) (65 + random.nextInt(58))), random.nextInt(getWidth()),
					random.nextInt(getHeight()));
		}

	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Caracteres Aleatórios");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		RandomCharacters draw = new RandomCharacters();
		frame.add(draw);

		frame.setSize(600, 250);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}