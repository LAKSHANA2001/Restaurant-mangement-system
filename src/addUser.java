
import Project.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laksh
 */
public class addUser extends javax.swing.JFrame {

    /**
     * Creates new form addUser
     */
    public addUser() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        update = new javax.swing.JButton();
        foodDetails = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        update1 = new javax.swing.JButton();
        foodDetails1 = new javax.swing.JButton();
        delete1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        empIdField = new javax.swing.JTextField();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        saveBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        updateUser = new javax.swing.JButton();
        userDetails = new javax.swing.JButton();
        deleteUser = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reset.png"))); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close Jframe.png"))); // NOI18N
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon("C:\\Users\\laksh\\Documents\\Lakshana\\Clone\\Restaurant-billing-system\\Billing management system\\src\\save.png")); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        foodDetails.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        foodDetails.setIcon(new javax.swing.ImageIcon("C:\\Users\\laksh\\Documents\\Lakshana\\Clone\\Restaurant-billing-system\\Billing management system\\src\\details product.png")); // NOI18N
        foodDetails.setText("Food details");
        foodDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodDetailsActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon("C:\\Users\\laksh\\Documents\\Lakshana\\Clone\\Restaurant-billing-system\\Billing management system\\src\\delete.png")); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        jButton4.setText("Save");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reset.png"))); // NOI18N
        jButton5.setText("Reset");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close Jframe.png"))); // NOI18N
        jButton6.setText("Close");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        update1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update1.setIcon(new javax.swing.ImageIcon("C:\\Users\\laksh\\Documents\\Lakshana\\Clone\\Restaurant-billing-system\\Billing management system\\src\\save.png")); // NOI18N
        update1.setText("Update");
        update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update1ActionPerformed(evt);
            }
        });

        foodDetails1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        foodDetails1.setIcon(new javax.swing.ImageIcon("C:\\Users\\laksh\\Documents\\Lakshana\\Clone\\Restaurant-billing-system\\Billing management system\\src\\details product.png")); // NOI18N
        foodDetails1.setText("Food details");
        foodDetails1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodDetails1ActionPerformed(evt);
            }
        });

        delete1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete1.setIcon(new javax.swing.ImageIcon("C:\\Users\\laksh\\Documents\\Lakshana\\Clone\\Restaurant-billing-system\\Billing management system\\src\\delete.png")); // NOI18N
        delete1.setText("Delete");
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(380, 160));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\laksh\\Documents\\Lakshana\\Clone\\Restaurant-billing-system\\Billing management system\\src\\add user.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 11, 101, 76));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Add User");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 31, 190, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 87, 577, 10));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Employee Id");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 132, 107, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Username");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 192, 88, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 251, 88, -1));

        empIdField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        empIdField.setForeground(new java.awt.Color(153, 153, 153));
        empIdField.setText("Enter employee id");
        empIdField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                empIdFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                empIdFieldFocusLost(evt);
            }
        });
        getContentPane().add(empIdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 129, -1, -1));

        usernameField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usernameField.setForeground(new java.awt.Color(153, 153, 153));
        usernameField.setText("Enter username");
        usernameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFieldFocusLost(evt);
            }
        });
        getContentPane().add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 186, 137, -1));

        passwordField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passwordField.setForeground(new java.awt.Color(153, 153, 153));
        passwordField.setText("Enter password");
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFieldFocusLost(evt);
            }
        });
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 248, 137, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 289, 577, 10));

        saveBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 334, 110, -1));

        resetBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resetBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reset.png"))); // NOI18N
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        getContentPane().add(resetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 334, 140, -1));

        closeBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close Jframe.png"))); // NOI18N
        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 334, 120, -1));

        updateUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\laksh\\Documents\\Lakshana\\Clone\\Restaurant-billing-system\\Billing management system\\src\\save.png")); // NOI18N
        updateUser.setText("Update");
        updateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUserActionPerformed(evt);
            }
        });
        getContentPane().add(updateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 384, -1, -1));

        userDetails.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userDetails.setIcon(new javax.swing.ImageIcon("C:\\Users\\laksh\\Documents\\Lakshana\\Clone\\Restaurant-billing-system\\Billing management system\\src\\details product.png")); // NOI18N
        userDetails.setText("User Details");
        userDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userDetailsActionPerformed(evt);
            }
        });
        getContentPane().add(userDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 384, -1, -1));

        deleteUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\laksh\\Documents\\Lakshana\\Clone\\Restaurant-billing-system\\Billing management system\\src\\delete.png")); // NOI18N
        deleteUser.setText("Delete");
        deleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserActionPerformed(evt);
            }
        });
        getContentPane().add(deleteUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 384, 120, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\laksh\\Documents\\Lakshana\\Clone\\Restaurant-billing-system\\Billing management system\\src\\all page background image.png")); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void empIdFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_empIdFieldFocusGained
        // TODO add your handling code here:
        if(empIdField.getText().equals("Enter employee id"))
        {
            empIdField.setText("");
            empIdField.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_empIdFieldFocusGained

    private void empIdFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_empIdFieldFocusLost
        // TODO add your handling code here:
        if(empIdField.getText().equals(""))
        {
            empIdField.setText("Enter employee id");
            empIdField.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_empIdFieldFocusLost

    private void usernameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFieldFocusGained
        // TODO add your handling code here:
        if(usernameField.getText().equals("Enter username"))
        {
            usernameField.setText("");
            usernameField.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_usernameFieldFocusGained

    private void usernameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFieldFocusLost
        // TODO add your handling code here:
        if(usernameField.getText().equals(""))
        {
            usernameField.setText("Enter username");
            usernameField.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_usernameFieldFocusLost

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
        // TODO add your handling code here:
        if(passwordField.getText().equals("Enter password"))
        {
            passwordField.setText("");
            passwordField.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_passwordFieldFocusGained

    private void passwordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusLost
        // TODO add your handling code here:
        if(passwordField.getText().equals(""))
        {
            passwordField.setText("Enter password");
            passwordField.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_passwordFieldFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new newProduct().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new updateProduct().setVisible(true);
    }//GEN-LAST:event_updateActionPerformed

    private void foodDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodDetailsActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new productDetails().setVisible(true);
    }//GEN-LAST:event_foodDetailsActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new deleteProduct().setVisible(true);
    }//GEN-LAST:event_deleteActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new newProduct().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new updateProduct().setVisible(true);
    }//GEN-LAST:event_update1ActionPerformed

    private void foodDetails1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodDetails1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new productDetails().setVisible(true);
    }//GEN-LAST:event_foodDetails1ActionPerformed

    private void delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new deleteProduct().setVisible(true);
    }//GEN-LAST:event_delete1ActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        String empId=empIdField.getText();
        String username=usernameField.getText();
        String password=passwordField.getText();
       
        try
        {
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            st.executeUpdate("insert into app_user values('"+empId+"','"+username+"','"+password+"')");
            JOptionPane.showMessageDialog(null, "Sucessfully inserted");
            setVisible(false);
            new addUser().setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Emp_id's username is already created");
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new addUser().setVisible(true);
    }//GEN-LAST:event_resetBtnActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        
    }//GEN-LAST:event_closeBtnActionPerformed

    private void updateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUserActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new updateUser().setVisible(true);
    }//GEN-LAST:event_updateUserActionPerformed

    private void userDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userDetailsActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new userDetails().setVisible(true);
       
    }//GEN-LAST:event_userDetailsActionPerformed

    private void deleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new deleteUser().setVisible(true);
    }//GEN-LAST:event_deleteUserActionPerformed

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
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton delete;
    private javax.swing.JButton delete1;
    private javax.swing.JButton deleteUser;
    private javax.swing.JTextField empIdField;
    private javax.swing.JButton foodDetails;
    private javax.swing.JButton foodDetails1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField passwordField;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton update;
    private javax.swing.JButton update1;
    private javax.swing.JButton updateUser;
    private javax.swing.JButton userDetails;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
