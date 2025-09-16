package university.management.system;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
 

public class FeeStructure extends JFrame implements ActionListener {

    FeeStructure(){
        getContentPane().setBackground(Color.WHITE);
        
        JLabel heading = new JLabel("Fee Structure");
        heading.setBounds(400,10,400,30);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        add(heading);


        JTable table = new JTable();

        try {
            Conn c = new Conn();
            ResultSet resultSet=c.statement.executeQuery("select * from fee");
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }


        JScrollPane js = new JScrollPane(table);
        js.setBounds(0,60,1000,700);
        add(js);








        setSize(1000,700);
        setLocation(250,50);
        setLayout(null);
        setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }

    public static void main(String[] args) {
        new FeeStructure();
    }

}
