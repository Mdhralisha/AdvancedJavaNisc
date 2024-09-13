/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package keymouseeventexample;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class KeyMouseEventExample extends JFrame implements KeyListener{
    
    String input_username = "";
    String username = "admin";
    
    JLabel output;
    
    public KeyMouseEventExample(){
        setTitle("Key listener Example");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,50,400,600);
        
        JLabel lbl_message = new JLabel("Type your message here");
        lbl_message.setBounds(20, 5, 300, 20);
        
        JTextArea message =new JTextArea();
        message.setBounds(20, 20, 300, 300);
        
        output = new JLabel("No Event");
        output.setBounds(20,350,300,20);
        
        
        
        add(lbl_message);
        add(message);
        add(output);
        
        message.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                new KeyMouseEventExample().setVisible(true);
            }
        
        });
    }
    
    
    @Override
    public void keyPressed(KeyEvent e) {
        this.input_username += e.getKeyChar();
        
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Key Released");
        if(input_username.equals(this.username)){
            this.setOutput("Correct");
        }else{
            this.setOutput("Incorrect");

        }
    }
    
    public void setOutput(String Data){
        this.output.setText(Data);
    }
    
    
    
}
