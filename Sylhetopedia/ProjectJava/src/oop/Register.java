/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.awt.Color;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aftar Ahmad Sami
 */
public class Register extends javax.swing.JFrame {
  UserData obj = new UserData();
        PreparedStatement ps = null;

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jUsernameReg = new javax.swing.JTextField();
        jNameReg = new javax.swing.JTextField();
        jEmailReg = new javax.swing.JTextField();
        jPasswordReg = new javax.swing.JPasswordField();
        regButton = new javax.swing.JButton();
        redirectToLogin = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Aharoni", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("-");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(935, 30, 20, 30));

        jLabel3.setFont(new java.awt.Font("Aharoni", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("X");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 30, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sign Up");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 150, 41));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("User Name:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 120, 33));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Name: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Password:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jUsernameReg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jUsernameReg.setForeground(new java.awt.Color(0, 102, 102));
        jUsernameReg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jUsernameReg.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jUsernameReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 240, 30));

        jNameReg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jNameReg.setForeground(new java.awt.Color(0, 102, 102));
        jNameReg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jNameReg.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jNameReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 240, 30));

        jEmailReg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jEmailReg.setForeground(new java.awt.Color(0, 102, 102));
        jEmailReg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jEmailReg.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jEmailReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 240, 30));

        jPasswordReg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPasswordReg.setForeground(new java.awt.Color(0, 102, 102));
        jPasswordReg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordReg.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jPasswordReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 240, 30));

        regButton.setBackground(new java.awt.Color(0, 153, 0));
        regButton.setFont(new java.awt.Font("Agency FB", 1, 32)); // NOI18N
        regButton.setForeground(new java.awt.Color(255, 255, 255));
        regButton.setText("Create Account");
        regButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        regButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regButton.setFocusable(false);
        regButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                regButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                regButtonMouseExited(evt);
            }
        });
        regButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regButtonActionPerformed(evt);
            }
        });
        jPanel1.add(regButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 200, 50));

        redirectToLogin.setBackground(new java.awt.Color(0, 0, 0));
        redirectToLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        redirectToLogin.setForeground(new java.awt.Color(255, 51, 51));
        redirectToLogin.setText("Already Have Account?");
        redirectToLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        redirectToLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redirectToLoginMouseClicked(evt);
            }
        });
        jPanel1.add(redirectToLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 410, 580));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop/images/sunset-cityscape-anime-1360827-wallhere.com.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 700));

        setSize(new java.awt.Dimension(1024, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void redirectToLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redirectToLoginMouseClicked
        Login backToLog2 = new Login();
        backToLog2.setVisible(true);
        backToLog2.pack();
        backToLog2.setLocationRelativeTo(null);
        backToLog2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_redirectToLoginMouseClicked

    private void regButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regButtonMouseClicked
        Login backToLog1 = new Login();
        backToLog1.setVisible(true);
        backToLog1.pack();
        backToLog1.setLocationRelativeTo(null);
        backToLog1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_regButtonMouseClicked

    private void regButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regButtonActionPerformed
        
        String usernameReg = jUsernameReg.getText();
        String nameReg = jNameReg.getText();
        String emailReg = jEmailReg.getText();
        String passwordReg = String.valueOf(jPasswordReg.getPassword());
        
        PreparedStatement ps;
        String query = "INSERT INTO `users_info`(`username`, `name`, `email`, `password`) VALUES (?,?,?,?)";
        
        boolean emailState = false;
        if (emailReg.contains("@gmail.com") || emailReg.contains("@yahoo.com")|| emailReg.contains("@hotmail.com")|| emailReg.contains("@outlook.com") || emailReg.contains("@lus.ac.bd")){
            emailState = true;
           
        }
        System.out.println(emailState);
        
        if(usernameReg.equals("") || nameReg.equals("") || emailReg.equals("") || passwordReg.equals(""))
        {
            JOptionPane.showMessageDialog(null, "INCOMPLETE! Please do it correctly.","Registration Failed",JOptionPane.ERROR_MESSAGE);
        }
        else if (!emailState){
            JOptionPane.showMessageDialog(null, "Invalid Email Address", "Registration Failed",2);
        }
        else if (passwordReg.length()<8)
        {
            JOptionPane.showMessageDialog(null, "Use at least 8 Characters Password", "Registration Failed",2);
        }
        else if(checking(usernameReg))
        {
            JOptionPane.showMessageDialog(null, "Username Already Used", "Registration Failed",2);   
        }
        else
        {
            try {
                ps = obj.getConnection().prepareStatement(query);
                ps.setString(1,usernameReg);
                ps.setString(2,nameReg);
                ps.setString(3,emailReg);
                ps.setString(4,passwordReg);
                
                if(ps.executeUpdate()>0)
                {
                    JOptionPane.showMessageDialog(null, "Congratulation! You are a NEW User.", "Registration SUCCESSFUL",JOptionPane.INFORMATION_MESSAGE,new ImageIcon(Register.class.getResource("/oop/images/ok.png")));
                    Login backToLog1 = new Login();
                    backToLog1.setVisible(true);
                    backToLog1.pack();
                    backToLog1.setLocationRelativeTo(null);
                    backToLog1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    this.dispose();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_regButtonActionPerformed

    private void regButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regButtonMouseEntered
        regButton.setBackground(Color.white);
        regButton.setForeground(new Color(0,153,0));
    }//GEN-LAST:event_regButtonMouseEntered

    private void regButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regButtonMouseExited
        regButton.setBackground(new Color(0,153,0));
        regButton.setForeground(Color.white);
    }//GEN-LAST:event_regButtonMouseExited

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }
    
    
    public boolean checking(String username)
    {
        PreparedStatement ps;
        ResultSet rs;
        boolean chk = false;
        String query = "SELECT * FROM `users_info` WHERE `username`=?";
        
        try {
            ps = obj.getConnection().prepareStatement(query);
            ps.setString(1,username);
            
            rs = ps.executeQuery();
            
            if(rs.next())
            {
                chk=true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chk;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jEmailReg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jNameReg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordReg;
    private javax.swing.JTextField jUsernameReg;
    private javax.swing.JLabel redirectToLogin;
    private javax.swing.JButton regButton;
    // End of variables declaration//GEN-END:variables
}