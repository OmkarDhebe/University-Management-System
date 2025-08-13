package university.management.system;

import java.sql.*;

public class Conn {
 Connection connection;
 Statement statement;   


Conn(){
    try {
        // Class.forName("com.mysql.cj.jdbc.Driver");
       connection = DriverManager.getConnection("jdbc:mysql:///universitymanagement","root","Omkar@15");
         statement =  connection.createStatement();   
    } catch (Exception e) {
        // TODO: handle exception
        e.printStackTrace();

    }

}
 

}








