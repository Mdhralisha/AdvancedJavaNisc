
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import controllers.studentController;

public class StudentRegForm extends JFrame implements ActionListener {
    
    public JTextField std_name,std_address;
    
    public StudentRegForm(){
        setTitle("REgistration Formm");
        setLayout(null);
        setBounds(30,30,400,400);
        
        JLabel lbl_name = new JLabel("Enter Name");
        lbl_name.setBounds(20,20,300,20);
        
        std_name = new JTextField();
        std_name.setBounds(20,40,300,20);
        
        JLabel lbl_address = new JLabel("Enter Address");
        lbl_address.setBounds(20,60,300,20);
        
        std_address = new JTextField();
        std_address.setBounds(20,80,300,20);
        
        
        JButton btn = new JButton("Submit");
        btn.setBounds(20,100,300,20);
        
        
        add(lbl_name);
        add(std_name);
        add(lbl_address);
        add(std_address);
        add(btn);
        
        btn.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String stdName = std_name.getText();
        String stdAddress = std_address.getText();
        studentController sc = new studentController();
        sc.s_name = stdName;
        sc.address=stdAddress;
        
        if(sc.createStudent(sc)){
            JOptionPane.showMessageDialog(rootPane, "Sucess");
        }
        
        
        
    }
    
    public static void main(String[] args){
        StudentRegForm st = new StudentRegForm();
        st.setVisible(true);
    }
    
}
