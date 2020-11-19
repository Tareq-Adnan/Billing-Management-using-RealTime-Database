
import Project.ConnectionProvider;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HunTer
 */
public class DeleteProduct extends javax.swing.JFrame {

    /**
     * Creates new form addBuyers
     */
    public DeleteProduct() {
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

        search = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ProductName = new javax.swing.JTextField();
        ProductRate = new javax.swing.JTextField();
        ProductDescription = new javax.swing.JTextField();
        ActiveStatus = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        Delete = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        searchbtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(360, 180));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 200, -1));

        jLabel8.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel8.setText("Product Id");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete product ani.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 280, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete product.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, -1, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 560, 10));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 560, 10));

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel3.setText("Product Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel4.setText("Product Rate");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel5.setText("Product Description");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel7.setText("Activate");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, -1, -1));

        ProductName.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        ProductName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ProductNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ProductNameFocusLost(evt);
            }
        });
        ProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductNameActionPerformed(evt);
            }
        });
        getContentPane().add(ProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 206, -1));

        ProductRate.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        ProductRate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ProductRateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ProductRateFocusLost(evt);
            }
        });
        ProductRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductRateActionPerformed(evt);
            }
        });
        getContentPane().add(ProductRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 206, -1));

        ProductDescription.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        ProductDescription.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ProductDescriptionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ProductDescriptionFocusLost(evt);
            }
        });
        getContentPane().add(ProductDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 206, -1));

        ActiveStatus.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        ActiveStatus.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ActiveStatusFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ActiveStatusFocusLost(evt);
            }
        });
        ActiveStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActiveStatusActionPerformed(evt);
            }
        });
        getContentPane().add(ActiveStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 206, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 590, 10));

        Delete.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, -1));

        Reset.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        Reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reset.png"))); // NOI18N
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        getContentPane().add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, -1, -1));

        Cancel.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        Cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close Jframe.png"))); // NOI18N
        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        getContentPane().add(Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, -1, -1));

        searchbtn.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        searchbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pbg.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProductRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductRateActionPerformed

    private void ProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductNameActionPerformed

    private void ProductNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ProductNameFocusGained
     
    }//GEN-LAST:event_ProductNameFocusGained

    private void ProductNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ProductNameFocusLost
   
    }//GEN-LAST:event_ProductNameFocusLost

    private void ProductRateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ProductRateFocusGained
 
    }//GEN-LAST:event_ProductRateFocusGained

    private void ProductRateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ProductRateFocusLost
        
    }//GEN-LAST:event_ProductRateFocusLost

    private void ProductDescriptionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ProductDescriptionFocusGained
       
    }//GEN-LAST:event_ProductDescriptionFocusGained

    private void ProductDescriptionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ProductDescriptionFocusLost
       
        
    }//GEN-LAST:event_ProductDescriptionFocusLost

    private void ActiveStatusFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ActiveStatusFocusGained
        
    }//GEN-LAST:event_ActiveStatusFocusGained

    private void ActiveStatusFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ActiveStatusFocusLost
        
    }//GEN-LAST:event_ActiveStatusFocusLost

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_CancelActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new DeleteProduct().setVisible(true);
    }//GEN-LAST:event_ResetActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
       String productid=search.getText();
        int a=JOptionPane.showConfirmDialog(null, "Do You Want to Delete?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
        try {
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            st.executeUpdate("delete from product where productid='"+productid+"'");
            JOptionPane.showMessageDialog(null, "Delete Successfull");
            setVisible(false);
            new DeleteProduct().setVisible(true);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        }
        
       
        
        
        
           
    }//GEN-LAST:event_DeleteActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        // TODO add your handling code here:
        String productid=search.getText();
        
        try {
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select* from product Where ProductId ='"+productid+"'");
            
            if(rs.next()){
            ProductName.setText(rs.getString(2));
            ProductRate.setText(rs.getString(3));
            ProductDescription.setText(rs.getString(4));
            ActiveStatus.setText(rs.getString(5));
            search.setEditable(false);
            ProductName.setEditable(false);
            ProductRate.setEditable(false);
            ProductDescription.setEditable(false);
            ActiveStatus.setEditable(false);
            
            }
            
            else{
            
            JOptionPane.showMessageDialog(null, "No Product Found!");
            
            }
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, ex);
        } catch (ClassNotFoundException ex) {
          
        }
        
    }//GEN-LAST:event_searchbtnActionPerformed

    private void ActiveStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActiveStatusActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ActiveStatusActionPerformed

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
            java.util.logging.Logger.getLogger(addBuyers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addBuyers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addBuyers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addBuyers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ActiveStatus;
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField ProductDescription;
    private javax.swing.JTextField ProductName;
    private javax.swing.JTextField ProductRate;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField search;
    private javax.swing.JButton searchbtn;
    // End of variables declaration//GEN-END:variables
}