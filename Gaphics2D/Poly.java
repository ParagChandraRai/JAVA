/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalabgaphics;

import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PolygonsJPanel extends JPanel
{
//draw polygons and polylines
public void paintComponent(Graphics g)
{
super.paintComponent(g); // call superclass's paintComponent

//draw polylines with two arrays
int[] xValues2 = {200, 175 };
int[] yValues2 = {175, 150};
g.drawPolyline(xValues2, yValues2, 7);

}// end method paint Component
}// end class PolygonsJPanel



public class Poly
{
//execute application
public static void main (String args[])
{
//create frame for polygonJPane1
JFrame frame = new JFrame("Drawing Polygons");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

PolygonsJPanel polygonsJPanel = new PolygonsJPanel();
frame.add(polygonsJPanel); //add polygonsJPanel to frame
frame.setSize(280, 270); // set frame size
frame.setVisible(true); //display frame
}// end main
}// end c