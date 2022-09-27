
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author rajaselvam.s
 */
public class FastCash extends javax.swing.JFrame {
  String accountNo;
    /**
     * Creates new form FastCash
     */
    public FastCash() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
     public void my_update(String str) {
       accountNo =str;
       System.out.println("hello");
       System.out.println(str);
       accLab.setText(str);
       accLab.setVisible(false);
                
	}
    int oldBalance;
    ResultSet rst =null;
    public void getBalance(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/signup","root","ramki@123");
            Statement stmt =con.createStatement();
            ResultSet rst =stmt.executeQuery("select * from data where accountnum ='"+accountNo+"'");
            if (rst.next()) {
                oldBalance =rst.getInt(7);
                jLabel2.setText(""+oldBalance);
                System.out.println("print"+oldBalance);
                jLabel2.setVisible(false);
                
            }
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "exception");
        }
    }String myDate;
    public void getDate(){
        Date date = new Date();
        SimpleDateFormat d = new SimpleDateFormat("dd-MM-YYYY");
         myDate = d.format(date);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        accLab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255), 9));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(51, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("FastCash");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(51, 204, 255));
        jButton1.setText("100");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 204, 255));
        jButton2.setText("500");
        jButton2.setToolTipText("");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 204, 255));
        jButton3.setText("2000");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 204, 255));
        jButton4.setText("200");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(51, 204, 255));
        jButton5.setText("1000");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(51, 204, 255));
        jButton6.setText("5000");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(51, 204, 255));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7.setText("Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addComponent(jButton4)
                    .addComponent(jButton6))
                .addGap(116, 116, 116))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(accLab, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jButton7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(accLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton5))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
      public void WithdrawMoney(int newBalance ,int amount){
          getDate();
          Connection con;
        PreparedStatement insert;
          try {
           
            Class .forName("com.mysql.cj.jdbc.Driver");
            
            con =DriverManager.getConnection("jdbc:mysql://localhost:3306/signup","root","ramki@123");
            String Query="INSERT INTO transactions (AccountNumber, Date,Amount,Balance,transactionType) VALUES (?, ?, ?, ?,?)";
             
            insert =con.prepareStatement(Query);
           
              
              insert.setString(1, accountNo);
              insert.setString(2,myDate );
              insert.setInt(3, amount);
              insert.setInt(4, newBalance);
              insert.setString(5, "Fastcash");
                             
              insert.executeUpdate();
            
           
            //JOptionPane.showMessageDialog(null, "Registered");  
            
            
             
            }
        catch(SQLException sqle){
            System.out.println(sqle);
            //JOptionPane.showMessageDialog(null,"This Account number is already exist");
            
        }     catch (ClassNotFoundException ex) {
                  Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
              }
           
      }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      
            
                

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String str=accLab.getText(); // read the JTextFeild t1 data
            MainMenu obj= new MainMenu ();// obj created for class Second()
            obj.my_update(str);//Execute the method my_update to pass str
            obj.setVisible(true); // Open the Second.java window
            dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        getBalance();
        int amount = 100;
        int balance =oldBalance-amount;
        System.out.println(oldBalance);
        if (oldBalance<100) {
            JOptionPane.showMessageDialog(this, "No enough balance");
        } else if (balance<=500) {
            JOptionPane.showMessageDialog(this, "Please maintain minimum balance 500");
        } else{
            
        

              try {
                
                
                System.out.println("In jButton1MouseClicked - Balance --> " + oldBalance);
                Class.forName("com.mysql.cj.jdbc.Driver");
                String query ="update data set balance = ? where accountnum =?";
               
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/signup","root","ramki@123");
                PreparedStatement st =con.prepareStatement(query);
                
                
                
               
                
               
                int newBalance = oldBalance-100;
                st.setInt(1, newBalance);
                st.setString(2, accountNo);
                   st.executeUpdate();
                if (st.executeUpdate()!=0) {
                    
                    WithdrawMoney(newBalance ,amount);
                   
                    JOptionPane.showMessageDialog(null,"Transaction Successful");
                }else{
                    JOptionPane.showMessageDialog(null, "Transaction Failed");
                } 
                
                
            } catch (HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e) {
                System.out.println(e);
            }
            
                }

            
        
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        getBalance();
        int amount =200;
        int balance =oldBalance-amount;
       if (oldBalance<amount) {
            JOptionPane.showMessageDialog(this, "No enough balance");
        } else if (balance<=500) {
            JOptionPane.showMessageDialog(this, "Please maintain minimum balance 500");
        } else{
            
        

              try {
                
                
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                String query ="update data set balance = ? where accountnum =?";
                
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/signup","root","ramki@123");
                PreparedStatement st =con.prepareStatement(query);
                
               
                
                
                int newBalance = oldBalance-amount;
                st.setInt(1, newBalance);
                st.setString(2, accountNo);
                   st.executeUpdate();
                if (st.executeUpdate()!=0) {
                    
                    WithdrawMoney(newBalance ,amount);
                
                    JOptionPane.showMessageDialog(null,"Transaction Successful");
                }else{
                    JOptionPane.showMessageDialog(null, "Transaction Failed");
                } 
                
                   
            } catch (HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e) {
                System.out.println(e);
            }
            
                }

    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        getBalance();
        int amount =500;
        int balance =oldBalance-amount;
        if (oldBalance<amount) {
            JOptionPane.showMessageDialog(this, "No enough balance");
        } else if (balance<=500) {
            JOptionPane.showMessageDialog(this, "Please maintain minimum balance 500");
        }else{
            
        

              try {
                
                
                System.out.println("In jButton1MouseClicked - Balance --> " + oldBalance);
                Class.forName("com.mysql.cj.jdbc.Driver");
                String query ="update data set balance = ? where accountnum =?";
                // String query = "select * from data where accountnum ='"+accountNo+"' and balance ="+jTextField1+"";
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/signup","root","ramki@123");
                PreparedStatement st =con.prepareStatement(query);
                
                //st.setInt(7, oldBalance+Integer.valueOf(jTextField1.getText()));
                
                System.out.println(accountNo+"test");
                int newBalance = oldBalance-amount;
                
                st.setInt(1, newBalance);
                st.setString(2, accountNo);
                
                
                   st.executeUpdate();
                if (st.executeUpdate()!=0) {
                    WithdrawMoney(newBalance, amount);
                    JOptionPane.showMessageDialog(null,"Transaction Successful");
                }else{
                    JOptionPane.showMessageDialog(null, "Transaction Failed");
                } 
                
                
            } catch (HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e) {
                System.out.println(e);
            }
            
                }

    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
       getBalance();
        int amount = 1000; 
        int balance =oldBalance-amount;
        if (oldBalance<amount) {
            JOptionPane.showMessageDialog(this, "No enough balance");
        }else if (balance<=500) {
            JOptionPane.showMessageDialog(this, "Please maintain minimum balance 500");
        } else{
            
        

              try {
                
                
                System.out.println("In jButton1MouseClicked - Balance --> " + oldBalance);
                Class.forName("com.mysql.cj.jdbc.Driver");
                String query ="update data set balance = ? where accountnum =?";
                // String query = "select * from data where accountnum ='"+accountNo+"' and balance ="+jTextField1+"";
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/signup","root","ramki@123");
                PreparedStatement st =con.prepareStatement(query);
                
                
                
                System.out.println(accountNo+"test");
                int newBalance =oldBalance-amount;
                st.setInt(1, newBalance);
                st.setString(2, accountNo);
                
                
                
                   st.executeUpdate();
                if (st.executeUpdate()!=0) {
                    WithdrawMoney(newBalance, amount);
                    JOptionPane.showMessageDialog(null,"Transaction Successful");
                }else{
                    JOptionPane.showMessageDialog(null, "Transaction Failed");
                } 
                
                
            } catch (HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e) {
                System.out.println(e);
            }
            
                }

    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        getBalance();
        int amount = 2000; 
        int balance =oldBalance-amount;
        if (oldBalance<amount) {
            JOptionPane.showMessageDialog(this, "No enough balance");
        }else if (balance<=500) {
            JOptionPane.showMessageDialog(this, "Please maintain minimum balance 500");
        } else{
            
        

              try {
                
                
                System.out.println("In jButton1MouseClicked - Balance --> " + oldBalance);
                Class.forName("com.mysql.cj.jdbc.Driver");
                String query ="update data set balance = ? where accountnum =?";
                // String query = "select * from data where accountnum ='"+accountNo+"' and balance ="+jTextField1+"";
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/signup","root","ramki@123");
                PreparedStatement st =con.prepareStatement(query);
                
                //st.setInt(7, oldBalance+Integer.valueOf(jTextField1.getText()));
                
                System.out.println(accountNo+"test");
                int newBalance =oldBalance-amount;
                st.setInt(1, newBalance);
                st.setString(2, accountNo);
               
                
                   st.executeUpdate();
                if (st.executeUpdate()!=0) {
                    WithdrawMoney(newBalance, amount);
                    JOptionPane.showMessageDialog(null,"Transaction Successful");
                }else{
                    JOptionPane.showMessageDialog(null, "Transaction Failed");
                } 
                
                
            } catch (HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e) {
                System.out.println(e);
            }
            
                }

    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        getBalance();
        int amount =5000;
        int balance =oldBalance-amount;
        if (oldBalance<amount) {
            JOptionPane.showMessageDialog(this, "No enough balance");
        }else if (balance<=500) {
            JOptionPane.showMessageDialog(this, "Please maintain minimum balance 500");
        } else{
            
        

              try {
                
                
                System.out.println("In jButton1MouseClicked - Balance --> " + oldBalance);
                Class.forName("com.mysql.cj.jdbc.Driver");
                String query ="update data set balance = ? where accountnum =?";
                
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/signup","root","ramki@123");
                PreparedStatement st =con.prepareStatement(query);
                
                
                
                System.out.println(accountNo+"test");
                int newBalance =oldBalance-amount;
                
                st.setInt(1, newBalance);       
                
                st.setString(2, accountNo);
                
                
                   st.executeUpdate();
                if (st.executeUpdate()!=0) {
                    WithdrawMoney(newBalance, amount);
                    JOptionPane.showMessageDialog(null,"Transaction Successful");
                }else{
                    JOptionPane.showMessageDialog(null, "Transaction Failed");
                } 
                
                
            } catch (HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e) {
                System.out.println(e);
            }
            
                }

    }//GEN-LAST:event_jButton6MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FastCash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accLab;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
