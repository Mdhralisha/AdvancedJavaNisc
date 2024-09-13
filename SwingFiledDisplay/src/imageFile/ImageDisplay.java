/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imageFile;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author DELL
 */
public class ImageDisplay extends JFrame {
    JButton btn_select;
    JLabel img_label;
    
    public ImageDisplay(){
        setTitle("Image Display");
        setBounds(100,50,400,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        btn_select = new JButton("Select Image:");
        btn_select.setBounds(20,20,300,30);
        
        img_label = new JLabel("no icon selected");
        img_label.setBounds(20,50,300, 200);
        
        add(btn_select);
        add(img_label);
        
        btn_select.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser file_choose = new JFileChooser();
                int value = file_choose.showOpenDialog(null);
                if(value==JFileChooser.APPROVE_OPTION){
                    File file = file_choose.getSelectedFile();
                    
                    if(checkImageExtension(file)){
                        displayImageIcon(file);
                    }
                    
                }
            }
        
        
        });
    }
    
    public boolean checkImageExtension(File file){
        String extensions[] ={"jpg","gif","png","jpg","bmp"};
        boolean status = false;
        String file_name = file.getName().toLowerCase();
        for(String ext:extensions){
            if(file_name.endsWith(ext)){
                status=true;
                break;
            }
        }
        return status;
    }
    
    
    public void displayImageIcon(File file){
        ImageIcon icon = new ImageIcon(file.getAbsolutePath());
        
        
        img_label.setIcon(icon);
    }
    public static void main(String[]args){
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            new ImageDisplay().setVisible(true);
            }
            
        });
    }
    
}
