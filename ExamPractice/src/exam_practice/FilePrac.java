package exam_practice;

import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class FilePrac extends JFrame implements ActionListener{
    
    JButton btn;
    JTextArea txt;
          
    
   public FilePrac(){
       setTitle("File upload");
       setBounds(10,20,600,600);
       setLayout(null);
       
       btn = new JButton("Select File");
       btn.setBounds(10,20,500,20);
       btn.addActionListener(this);
       
       txt= new JTextArea();
       txt.setBounds(10,20,500,500);
       txt.setWrapStyleWord(true);
       
       add(btn);
       add(txt);
       
       
   }
   public void actionPerformed(ActionEvent e){
       JFileChooser file_chooser = new JFileChooser();
       int value = file_chooser.showOpenDialog(null);
       if(value==JFileChooser.APPROVE_OPTION){
           File file = file_chooser.getSelectedFile();
           if(checkFile(file)){
               displayFile(file);
           }
       }
   }
   
   public boolean checkFile(File file){
       boolean status = false;
       String[] extensions = {"pdf","txt"};
       for(String ext:extensions){
           if(file.getName().toLowerCase().endsWith(ext)){
               status=true;
               break;
           }
       }
       
       return false;
   }
   
   public void displayFile(File file){
       
       try{
           BufferedReader bf = new BufferedReader(new FileReader(file));
           String line;
           while((line=bf.readLine())!=null){
               txt.append(line);
           }
       }catch(Exception e){
           
       }
       
   }
    
    public static void main(String[] args){
        new FilePrac().setVisible(true);
    }
    
}
