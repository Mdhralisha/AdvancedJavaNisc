/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.graphics.demo;

import javax.swing.JFrame;
public class AppFrame extends JFrame{
    
    public int WIDTH = 700;
    public int HEIGHT = 800;
    public int posX = 200;
    public int posY = 100; 
     
    public AppFrame(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(this.posX,this.posY,this.WIDTH,this.HEIGHT);
        setTitle("Graphics Demo App");
        
        add(new GraphicsPanel());
        setVisible(true);
    }
    public static void main(String args[]){
        new AppFrame();
    }
}
