/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javanang;

import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.naming.spi.DirStateFactory;
import javax.swing.JOptionPane;


/**
 *
 * @author MANH TRUONG
 */
public class bai2 extends javax.swing.JFrame {

    /**
     * Creates new form bai2
     */
    public bai2() {
        initComponents();
    }

    String driver="";//Là một class, nó dùng để quản lý danh sách các Driver (database drivers).
    String url="";//Là một Interface, nó dùng để liên kết các liên lạc với cơ sở dữ liệu, điều khiển các liên lạc với database. Một khi Driver được tải lên, lập trình viên không cần phải gọi nó một cách cụ thể.
    String user="";
    String password="sa";
    Statement st;//Là một Interface, gói gọn một câu lệnh SQL gửi tới cơ sở dữ liệu được phân tích, tổng hợp, lập kế hoạch và thực hiện.
    ResultSet rs;
    @SuppressWarnings("unchecked")//ResultSet đại diện cho tập hợp các bản ghi lấy do thực hiện truy vấn.
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtuser = new javax.swing.JTextField();
        txtgmail = new javax.swing.JTextField();
        btnlogin = new javax.swing.JButton();
        btndk = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        txtconfirm = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtuser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 224, -1));

        txtgmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtgmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 224, -1));

        btnlogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 96, -1));

        btndk.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btndk.setText("Đăng Kí");
        btndk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndkActionPerformed(evt);
            }
        });
        getContentPane().add(btndk, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("THÊM ACCOUT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 23, -1, -1));

        jLabel2.setText("UserName:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        jLabel3.setText("Gmail");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        jLabel5.setText("Confirm password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        txtpass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 224, -1));

        txtconfirm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtconfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 224, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anhxe.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1170, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndkActionPerformed
//        int dk=JOptionPane.showConfirmDialog(this,"Bạn có muốn đăng kí ","Confirm",JOptionPane.YES_NO_OPTION);
//        if(dk!=JOptionPane.YES_OPTION){
//            return;
//        }
//        try {
//            Class.forName(driver);
//            con=DriverManager.getConnection(url, user, password);
//            String sql="insert into ACOUNT values (?,?,?,?)";
//            PreparedStatement ps=con.prepareStatement(sql);
//            ps.setString(1,txtuser.getText());
//            ps.setString(2,txtuser.getText());
//            ps.setString(3,txtuser.getText());
//            ps.setString(4,txtuser.getText());
//            
//            int n=ps.executeUpdate();//update dữ liệu lên 
//            
//            if(txtuser.getText().equals("")|txtgmail.getText().equals("")|txtpass.getText().equals("")|txtconfirm.getText("").equals("")){
//                JOptionPane.showMessageDialog(this,"Không để thông tin trống");
//            }
//            else if(n!=0){
//                JOptionPane.showMessageDialog(this, "Đăng kí thành công");
//            }
//            else {
//                JOptionPane.showMessageDialog(this, "Đăng kí thất bại");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }//GEN-LAST:event_btndkActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnloginActionPerformed

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
            java.util.logging.Logger.getLogger(bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bai2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndk;
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField txtconfirm;
    private javax.swing.JTextField txtgmail;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
