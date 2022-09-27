/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
//import java.sql.DriverManager;
/**
 *
 * @author rajaselvam.s
 */
public class Jdbc {
    
    
public static void main(String[]args){

    try {
        
    String query ="select * from account Where accountNumber=1234567890";  
    System.out.println(query);
    Class.forName("com.mysql.jdbc.Driver");
    System.out.println(query);
    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/accountholders","root","Welcome@123");
    System.out.println(query);
    Statement st = con.createStatement();
    System.out.println(query);
    ResultSet rs = st.executeQuery(query);
    System.out.println(query);
    rs.next();
    System.out.println(query);
    Long acc = rs.getLong(query);
    
    System.out.println(acc);
    
}
    catch(Exception e){
     e.printStackTrace();
}
    System.out.println("end");

    
    
}
}