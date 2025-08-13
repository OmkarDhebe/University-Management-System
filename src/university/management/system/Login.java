package university.management.system;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

public class Login extends JFrame implements ActionListener {

    JTextField textFieldName;
    JPasswordField passwordField;
    JButton login,back;

    Login(){

        JLabel labelName = new JLabel("Username");
        labelName.setBounds(40,20,100,20);
        labelName.setForeground(Color.WHITE);
        add(labelName);

        textFieldName = new JTextField();
        textFieldName.setBounds(150,20,150,20);
        add(textFieldName);


        JLabel labelpass = new JLabel("Password");
        labelpass.setBounds(40,70,100,20);
        labelpass.setForeground(Color.WHITE);
        add(labelpass);

          passwordField = new JPasswordField();
          passwordField.setBounds(150,70,150,20);
          add(passwordField);


        login = new JButton("Login");
        login.setBounds(40,140,120,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        
        back = new JButton("Back");
        back.setBounds(180,140,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

             //  need to increse the size of image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/second.png"));
        Image i2 = i1.getImage().getScaledInstance(270, 280, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(312,-13,270,280);
        add(img);  
        

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/background.jpg"));
        Image i22 = i11.getImage().getScaledInstance(600, 300, Image.SCALE_DEFAULT);
        ImageIcon i33 = new ImageIcon(i22);
        JLabel image = new JLabel(i33);
        image.setBounds(0,0,600,300);
        add(image);


        setSize(600,300); 
        setLocation(500,250);
        setLayout(null);


        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == login){
        String username = textFieldName.getText();
        String password = passwordField.getText();
        String query = "select * from login where username = '"+username+"'and password = '"+password+"' ";
        try {
          Conn c = new Conn();
          ResultSet resultSet = c.statement.executeQuery(query);

          if(resultSet.next()){
            setVisible(false);
          new main_class();
          }else{
            JOptionPane.showMessageDialog(null,"Invalid username or password ");

          }


        } catch (Exception E) {
          // TODO: handle exception
          E.printStackTrace();
        }
       }else{
        setVisible(false);
       }




    }
public static void main(String[] args) {
new Login();
    
}
}
