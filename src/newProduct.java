import java.awt.Color;
import Project.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laksh
 */
public class newProduct extends javax.swing.JFrame {

    /**
     * Creates new form newProduct
     */
    public newProduct() {
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

        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        productId = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        productField = new javax.swing.JTextField();
        costField = new javax.swing.JTextField();
        sellingField = new javax.swing.JTextField();
        activateField = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        foodDetails = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all page background image.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        jLabel9.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLabel9ComponentShown(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\laksh\\Documents\\Lakshana\\Clone\\Restaurant-billing-system\\Billing management system\\src\\all page background image.png")); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\laksh\\Documents\\Lakshana\\Clone\\Restaurant-billing-system\\Billing management system\\src\\all page background image.png")); // NOI18N
        jLabel11.setText("jLabel11");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\laksh\\Documents\\Lakshana\\Clone\\Restaurant-billing-system\\Billing management system\\src\\all page background image.png")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(380, 160));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/new product.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 11, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 77, 580, 10));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Food ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 94, -1));

        productId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        productId.setForeground(new java.awt.Color(255, 51, 51));
        productId.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                productIdComponentShown(evt);
            }
        });
        getContentPane().add(productId, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 105, 50, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 146, 580, 10));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Food Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Cost Price");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 103, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Selling price");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 103, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Activate");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 103, -1));

        productField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        productField.setForeground(new java.awt.Color(153, 153, 153));
        productField.setText("Enter product Name");
        productField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                productFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                productFieldFocusLost(evt);
            }
        });
        productField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productFieldActionPerformed(evt);
            }
        });
        getContentPane().add(productField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 170, -1));

        costField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        costField.setForeground(new java.awt.Color(153, 153, 153));
        costField.setText("Enter cost price");
        costField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                costFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                costFieldFocusLost(evt);
            }
        });
        costField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costFieldActionPerformed(evt);
            }
        });
        getContentPane().add(costField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 170, -1));

        sellingField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sellingField.setForeground(new java.awt.Color(153, 153, 153));
        sellingField.setText("Enter selling price");
        sellingField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sellingFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sellingFieldFocusLost(evt);
            }
        });
        getContentPane().add(sellingField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 170, -1));

        activateField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        activateField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        activateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activateFieldActionPerformed(evt);
            }
        });
        getContentPane().add(activateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 170, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 110, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reset.png"))); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 140, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close Jframe.png"))); // NOI18N
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 120, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 366, 580, 10));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel12.setText("New Food");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon("C:\\Users\\laksh\\Documents\\Lakshana\\Clone\\Restaurant-billing-system\\Billing management system\\src\\save.png")); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

        foodDetails.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        foodDetails.setIcon(new javax.swing.ImageIcon("C:\\Users\\laksh\\Documents\\Lakshana\\Clone\\Restaurant-billing-system\\Billing management system\\src\\details product.png")); // NOI18N
        foodDetails.setText("Food details");
        foodDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodDetailsActionPerformed(evt);
            }
        });
        getContentPane().add(foodDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, -1, -1));

        delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon("C:\\Users\\laksh\\Documents\\Lakshana\\Clone\\Restaurant-billing-system\\Billing management system\\src\\delete.png")); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 120, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\laksh\\Documents\\Lakshana\\Clone\\Restaurant-billing-system\\Billing management system\\src\\all page background image.png")); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_productFieldFocusGained
        // TODO add your handling code here:
        if(productField.getText().equals("Enter product Name"))
        {
            productField.setText("");
            productField.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_productFieldFocusGained

    private void productFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_productFieldFocusLost
        // TODO add your handling code here:
        if(productField.getText().equals(""))
        {
            productField.setText("Enter product Name");
            productField.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_productFieldFocusLost

    private void costFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_costFieldFocusGained
        // TODO add your handling code here:
        if(costField.getText().equals("Enter cost price"))
        {
            costField.setText("");
            costField.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_costFieldFocusGained

    private void costFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_costFieldFocusLost
        // TODO add your handling code here:
        if(costField.getText().equals(""))
        {
            costField.setText("Enter cost price");
            costField.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_costFieldFocusLost

    private void sellingFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sellingFieldFocusGained
        // TODO add your handling code here:
        if(sellingField.getText().equals("Enter selling price"))
        {
            sellingField.setText("");
            sellingField.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_sellingFieldFocusGained

    private void sellingFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sellingFieldFocusLost
        // TODO add your handling code here:
        if(sellingField.getText().equals(""))
        {
            sellingField.setText("Enter selling price");
            sellingField.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_sellingFieldFocusLost

    private void productFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productFieldActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new newProduct().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String food_id=productId.getText();
        String pname=productField.getText();
        float cp=Float.parseFloat(costField.getText());
        float sp=Float.parseFloat(sellingField.getText());
        String activate=(String)activateField.getSelectedItem();
        try
        {
        Connection con=ConnectionProvider.getCon();
        Statement st=con.createStatement();
        st.executeUpdate("insert into food values('"+food_id+"','"+pname+"','"+cp+"','"+sp+"','"+activate+"')");
        JOptionPane.showMessageDialog(null, "Sucessfully inserted");
        setVisible(false);
        new newProduct().setVisible(true);
                }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void productIdComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_productIdComponentShown
        // TODO add your handling code here:
        

    }//GEN-LAST:event_productIdComponentShown

    private void jLabel9ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel9ComponentShown
        // TODO add your handling code here

    }//GEN-LAST:event_jLabel9ComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        try
    {
        Connection con=ConnectionProvider.getCon();
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select max(food_id) from food");
        while(rs.next()){
            int id=rs.getInt(1);
            id+=1;
            productId.setText(String.valueOf(id));
        }
        /*if(rs.first())
        {
            int id=rs.getInt(1);
            id=id+1;
            String s=String.valueOf(id);
            productId.setText(s);
        }
        else
        {
            productId.setText("1");
        }*/
        
        
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,e);
    }
    }//GEN-LAST:event_formComponentShown

    private void costFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costFieldActionPerformed

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

    private void activateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_activateFieldActionPerformed

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
            java.util.logging.Logger.getLogger(newProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newProduct().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> activateField;
    private javax.swing.JTextField costField;
    private javax.swing.JButton delete;
    private javax.swing.JButton foodDetails;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField productField;
    private javax.swing.JLabel productId;
    private javax.swing.JTextField sellingField;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
