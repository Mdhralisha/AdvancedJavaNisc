/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MouseListner;

import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import org.w3c.dom.events.MouseEvent;

/**
 *
 * @author DELL
 */
public class MouseListner extends JFrame implements MouseListener{
    JLabel output;
    
    public MouseListner(){
        setTitle("Mouse Listner");
        setBounds(100,50,400,600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
          JLabel lbl_message = new JLabel("Type your message here");
        lbl_message.setBounds(20, 5, 300, 20);
        
        JTextArea message =new JTextArea();
        message.setBounds(20, 20, 300, 300);
        
        JButton btn = new JButton("Click");
        btn.setBounds(20,320,300,20);
        
        output = new JLabel("No Event");
        output.setBounds(20,350,300,20);
        
        
        
        
        add(lbl_message);
        add(message);
        add(btn);
        add(output);
        
        
        btn.addMouseListener(this);
    }
   

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        System.out.println("Clicked");
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
            output.setText("clicked");
        System.out.println("Pressed");
       
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
       
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
        
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
       
    }
    
    public static void main(String[] args) {
        new MouseListner().setVisible(true);
    }
            
}
