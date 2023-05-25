/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalabgaphics;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class CubeDraw extends JFrame
{
            public CubeDraw()
            {
                        super("Drawing 2D Cube");
                        setSize(400,400);
                        setVisible(true);
            }
            public void paint(Graphics g)
            {
                        super.paint(g);

                        int xPoint[]={200,300,300,200,200,130,230,230,130,130};
                int yPoint[]={200,200,300,300,200,70,70,170,170,70};

                        Graphics2D g2d =(Graphics2D)g;
                        GeneralPath cube = new GeneralPath();

                        cube.moveTo(xPoint[0],yPoint[0]);
                        for( int i=1;i<xPoint.length;i++)
                        cube.lineTo(xPoint[i],yPoint[i]);
                        cube.closePath();
                        g2d.draw(cube);
                        g2d.draw(new Line2D.Double(130,170,200,300));
                        g2d.draw(new Line2D.Double(230,70,300,200));
                        g2d.draw(new Line2D.Double(230,170,300,300));

            }
            public static void main(String args[])
            {
                        CubeDraw m= new CubeDraw();
                        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
}