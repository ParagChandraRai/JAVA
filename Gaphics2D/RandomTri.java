/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalabgaphics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.GeneralPath;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class RandomTri extends JPanel implements ActionListener
{
    private ArrayList<GeneralPath> triangles = new ArrayList<GeneralPath>();
    private ArrayList<Color> colors = new ArrayList<Color>();
    
    public RandomTri()
    {
        
    }
    
    public void paint(Graphics g)
    {
        Graphics2D g2d = (Graphics2D)g;
        super.paint(g);
        
        for (int i = 0; i < colors.size(); i++)
        {
            g2d.setColor(colors.get(i));
            g2d.fill(triangles.get(i));
        }        
    }

    public void actionPerformed(ActionEvent e)
    {
        int width = super.getWidth();
        int height = super.getHeight();

        GeneralPath path = new GeneralPath();
        int[] x = new int[3];
        int[] y = new int[3];

        for (int i = 0; i < 3; i++)
        {
            x[i] = (int)( Math.random() * width);
            y[i] = (int)( Math.random() * height);
        }
        path.moveTo(x[0], y[0]);
        path.lineTo(x[1], y[1]);
        path.lineTo(x[2], y[2]);
        path.lineTo(x[0], y[0]);


        triangles.add(path);
        
        int r = (int)(Math.random() * 255);
        int g = (int)(Math.random() * 255);
        int b = (int)(Math.random() * 255);
        
        colors.add(new Color(r, g, b));
        
        repaint();        
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Randomly Triangles");
        RandomTri panel = new RandomTri();
        frame.setLayout(new BorderLayout());
        JPanel btnPanel = new JPanel();
        JButton button = new JButton("Generate");
        button.addActionListener(panel);
        btnPanel.add(button);
        
        frame.add(btnPanel, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}