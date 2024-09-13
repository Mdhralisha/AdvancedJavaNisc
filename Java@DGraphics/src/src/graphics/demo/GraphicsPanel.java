/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.graphics.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author DELL
 */
public class GraphicsPanel extends JPanel{
    public int width = 800;
    public int height = 700;
    
    public GraphicsPanel(){
        setSize(this.width,this.height);
        setBackground(Color.BLACK);
    }
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        
        Rectangle2D r1 = new Rectangle2D.Double(10,20,200,150);
        g2d.draw(r1);
        g2d.setColor(Color.red);
        g2d.fill(r1);
        
        
    }
        
    
}
