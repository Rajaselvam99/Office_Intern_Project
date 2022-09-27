/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author rajaselvam.s
 */
public class Connect {
    public static Connection getCon()
{
try
{
    System.out.println("in static method");
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","ramki@123");
    System.out.println(con.toString());
return con;
}

catch(Exception e)
{
   e.printStackTrace();
return null;
}
}
    public static void main(String[]args){
        getCon();
//    }
}
}
    
    

