
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Quote {
    public Quote(){
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout(10,200));
        frame.setBounds(500, 100, 500, 600);
        frame.setTitle("Quote Generator");
        frame.setVisible(true);
        
        
        JLabel title = new JLabel();
        title.setText("Welcome To Quote Generator");
        
        JTextField quote = new JTextField();
        quote.setSize(600,100);
        
        frame.add("North",title);
        frame.add("Center",quote);
    }
    public static void main(String[] args) {
        Quote quote = new Quote();
    }
}
