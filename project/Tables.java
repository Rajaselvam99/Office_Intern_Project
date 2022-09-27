/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
import java.time.Clock;
//import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author rajaselvam.s
 */
public class Tables {
    
    
    
    
    public static void main(String[]args){
        Connection con=null;
        Statement st=null;
try
{
    Connect conClass = new Connect();
con=conClass.getCon();
    System.out.println(con.toString());
st=con.createStatement();
st.execute("create table user(account varchar(10),passWord varchar(10))");

JOptionPane.showMessageDialog(null,"Table created successfully");
//JOptionPane.showMessageDialog(parentComponent, st);
}
catch(Exception e)
{
JOptionPane.showMessageDialog(null, "exeception");
e.printStackTrace();
}
finally{
try
{
con.close();
st.close();
}
catch(SQLException e)
{
e.printStackTrace();
}
}
    }}
        
    

