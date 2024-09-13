package swingfileddisplay;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author DELL
 */
public class FileDisplay extends JFrame{
    JLabel title,file_select;
    JButton btn_select;
    JTextArea file_content;
    JScrollPane scroll;
    
    public FileDisplay(){
        setTitle("File content Display Example");
        setBounds(100,50,500,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(null);
        
        title = new JLabel("File Content Display");
        title.setBounds(20,20,400,20);
        
        btn_select = new JButton();
        btn_select.setText("Select File");
        btn_select.setBounds(50,40,400,20);
        
        file_select = new JLabel();
        file_select.setText("No File Selected");
        file_select.setBounds(50,90,300,20);
        file_content = new JTextArea();
        file_content.setText("File Content");
        file_content.setWrapStyleWord(true);
        file_content.setEditable(false);
        file_content.setLineWrap(true);
        
        
        
        scroll = new JScrollPane(file_content);
        scroll.setBounds(50,110,400,500);
        
        btn_select.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser file_chooser = new JFileChooser();
                int value = file_chooser.showOpenDialog(null);
                if(value == JFileChooser.APPROVE_OPTION){
                    File file = file_chooser.getSelectedFile();
                    file_select.setText(file.getAbsolutePath());
                    System.out.println(file.getAbsoluteFile());
                    
                    if(checkFileExtension(file)){
                        displayContent(file);
                    }else{
                        System.out.println("Please Select");
                    }
                }
            }
        });
        
        add(title);
        add(btn_select);
        add(scroll);
        add(file_select);
        
    }
    public boolean checkFileExtension(File file){
        String extension[] = {"txt","docx","pdf"};
        boolean status = false;
        String file_name = file.getName().toLowerCase();
        for(String ext : extension){
            if(file_name.endsWith(ext)){
                status = true;
                break;
            }else{
                file_select.setText("please select correct file");
            }
        }
        return status;
    }
    
    public void displayContent(File file){
        try{
            BufferedReader bf = new BufferedReader(new FileReader(file));
            String line;
            file_content.setText("");
            while((line = bf.readLine())!=null){
                file_content.append(line);
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
        @Override
        public void run(){
            new FileDisplay().setVisible(true);
            }
        });
    }
}
