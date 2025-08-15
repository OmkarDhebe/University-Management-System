package university.management.system;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class AddFaculty extends JFrame {
    JTextField textName,textfather,textAddress,textPhone,textEmail,textM10,textM12,textAadhar;
    JLabel empText;
    JDateChooser cdob;
    JComboBox courseBox;

 // so you want random numbers for each employee
 Random ran = new Random();
 long f4 =Math.abs((ran.nextLong() % 9000L)+1000L);

    AddFaculty(){

            

         //  It if for set the background color
        getContentPane().setBackground(new Color(166, 164, 252));


        JLabel heading = new JLabel("New Teacher Details");
        heading.setBounds(310, 30, 500, 50);
        heading.setFont(new Font("serif",Font.BOLD,30));
        add(heading);




        JLabel name = new JLabel("Name");
        name.setBounds(50,150,100,30); 
        name.setFont(new Font("serif",Font.BOLD,20));
        add(name);

        textName = new JTextField();
        textName.setBounds(200,150,150,30);
        add(textName);



        JLabel fname = new JLabel("Father Name");
        fname.setBounds(400,150,200,30);
        fname.setFont(new Font("serif",Font.BOLD,20));
        add(fname);


        textfather = new JTextField();
        textfather.setBounds(600,150,150,30);
        add(textfather);



        JLabel empID = new JLabel("Employee ID");
        empID.setBounds(50,200,200,30);
        empID.setFont(new Font("serif",Font.BOLD,20));
        add(empID);


        empText = new JLabel("" + f4);
        empText.setBounds(200, 200, 150, 20);
        empText.setFont(new Font("serif",Font.BOLD,20));
        add(empText);



        JLabel dob = new JLabel("Date of Birth");
        dob.setBounds(400,200,200,30);
        dob.setFont(new Font("serif",Font.BOLD,20));
        add(dob);



        cdob = new JDateChooser();
        cdob.setBounds(600,200 ,150,30);
        add(cdob);
         

         JLabel address = new JLabel("Address");
        address.setBounds(50,250,200,30);
        address.setFont(new Font("serif",Font.BOLD,20));
        add(address);


        textAddress = new JTextField();
        textAddress.setBounds(200,250,150,30);
        add(textAddress);



        JLabel phone = new JLabel("Phone Number");
        phone.setBounds(400,250,200,30);
        phone.setFont(new Font("serif",Font.BOLD,20));
        add(phone);


        textPhone = new JTextField();
        textPhone.setBounds(600,250,150,30);
        add(textPhone);


        JLabel email = new JLabel("Email");
        email.setBounds(50,300,200,30);
        email.setFont(new Font("serif",Font.BOLD,20));
        add(email);


        textEmail = new JTextField();
        textEmail.setBounds(200,300,150,30);
        add(textEmail);


        JLabel M10 = new JLabel("Class X (%)");
        M10.setBounds(400,300,200,30);
        M10.setFont(new Font("serif",Font.BOLD,20));
        add(M10);


        textM10 = new JTextField();
        textM10.setBounds(600,300,150,30);
        add(textM10);
        

        JLabel M12 = new JLabel("Class XII (%)");
        M12.setBounds(50,350,200,30);
        M12.setFont(new Font("serif",Font.BOLD,20));
        add(M12);


        textM12 = new JTextField();
        textM12.setBounds(200,350,150,30);
        add(textM12);


        JLabel aadharNo = new JLabel("Aadhar Number");
        aadharNo.setBounds(400,350,200,30);
        aadharNo.setFont(new Font("serif",Font.BOLD,20));
        add(aadharNo);


        textAadhar = new JTextField();
        textAadhar.setBounds(600,350,150,30);
        add(textAadhar);


        JLabel qualification = new JLabel("Aadhar Number");
        qualification.setBounds(50,400,200,30);
        qualification.setFont(new Font("serif",Font.BOLD,20));
        add(qualification);

        String course[] = {"B.Tech","B.E","B.CA","B.BA","B.Sc","M.Sc","M.BA","M.CA","M.Tech","M.E","M.Com","B.Com","M.A","B.A"};
        courseBox = new JComboBox<>(course);
        courseBox.setBounds(200,400,150,30);
        courseBox.setBackground(Color.WHITE);
        add(courseBox);
        




        setSize(900, 700);
        setLocation(350, 50);
        setLayout(null);
        setVisible(true);

    }



    public static void main(String[] args) {
        new AddFaculty();
    }
}
