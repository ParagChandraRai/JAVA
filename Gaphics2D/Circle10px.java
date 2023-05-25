/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalabgaphics;


import javax.swing.*;
import java.awt.*;

public class Circle10px extends JFrame {


    public Circle10px() {
        setTitle("Concentric Circles");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void paint(Graphics g) {
        super.paint(g);

        int centerX = WIDTH / 2;
        int centerY = HEIGHT / 2;
        int radius = 10;

        for (int i = 0; i < 8; i++) {
            g.drawArc(centerX - radius, centerY - radius, 2 * radius, 2 * radius, 0, 360);
            radius += 10;
        }
    }

    public static void main(String[] args) {
        Circle10px circles = new Circle10px();
        circles.setVisible(true);
    }
}

