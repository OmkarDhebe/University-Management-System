package university.management.system;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;


public class TeacherLeave extends JFrame implements ActionListener{

    Choice choiceEmpID , choTime;
    JDateChooser selDate;
    JButton submit,cancel;
   

TeacherLeave(){


    getContentPane().setBackground(new Color(210,232,252));
    

    JLabel heading = new JLabel("Apply Leave (Teacher)");
    heading.setBounds(40,50,300,30);
    heading.setFont(new Font("Tahoma",Font.BOLD,20));
    add(heading);


     JLabel empID = new JLabel("Search by Employee ID");
    empID.setBounds(60,100,250,15);
    empID.setFont(new Font("Tahoma",Font.PLAIN,20));
    add(empID);


    //  we need drop down to show students roll no
    choiceEmpID = new Choice();
    choiceEmpID.setBounds(60,140,200,20);
    add(choiceEmpID);


    try {
        Conn c = new Conn();
        ResultSet resultSet = c.statement.executeQuery("select * from teacher");

        while (resultSet.next()) {
            choiceEmpID.add(resultSet.getString("empID"));
        }
        

    } catch (Exception e) {
        // TODO: handle exception
        e.printStackTrace();
    }


    JLabel lbldate = new JLabel("Date");
    lbldate.setBounds(60,180,200,20);
    lbldate.setFont(new Font("Tahoma",Font.PLAIN,18));
    add(lbldate);

    selDate = new JDateChooser();
    selDate.setBounds(60,215,200,25);
    add(selDate);

    JLabel time = new JLabel("Time Duration");
    time.setBounds(60,260,200,20);
    time.setFont(new Font("Tahoma",Font.PLAIN,18));
    add(time);

    choTime = new Choice();
    choTime.setBounds(60,290,200,20);
    choTime.add("Full Day");
    choTime.add("Half Day");
    add(choTime);



    submit = new JButton("Submit");
    submit.setBounds(60,350,100,25);
    submit.setBackground(Color.BLACK);
    submit.setForeground(Color.WHITE);
    submit.addActionListener(this);
    add(submit);


     cancel = new JButton("Cancel");
    cancel.setBounds(200,350,100,25);
    cancel.setBackground(Color.BLACK);
    cancel.setForeground(Color.WHITE);
    cancel.addActionListener(this);
    add(cancel);




    setSize(500,550);
    setLocation(550,100);
    setLayout(null);
    setVisible(true);

    

}
@Override
public void actionPerformed(ActionEvent e) {

    if (e.getSource() == submit) {
        String empID = choiceEmpID.getSelectedItem();
        String date = ((JTextField) selDate.getDateEditor().getUiComponent()).getText();
        String time = choTime.getSelectedItem();

        String Q = "insert into teacherleave values('"+empID+"','"+date +"','"+time+"')";

        try {
            Conn c = new Conn();
            c.statement.executeUpdate(Q);
            JOptionPane.showMessageDialog(null,"Leave Confirmed" );
            setVisible(false);

        } catch (Exception E) {
            // TODO: handle exception
            E.printStackTrace();
        }
        
    }else{
        setVisible(false)   ;
    }



    
}

public static void main(String[] args) {
    new TeacherLeave();

}

}
