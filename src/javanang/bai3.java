/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javanang;

/**
 *
 * @author MANH TRUONG
 */
public class bai3 extends javax.swing.JFrame {
    
  int demsolandaubang=0;
  String[] arrayMemory={"2","4"};
    
   String toanhang1="";
   
    String operator="";
    
    boolean isEqualsPress=false;
    /**
     * Creates new form bai3
     */
    public bai3() {
        initComponents();
        setLocationRelativeTo(null);
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
        jPanel1 = new javax.swing.JPanel();
        txtResult = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnNumber1 = new javax.swing.JButton();
        btnNumber2 = new javax.swing.JButton();
        btnNumber3 = new javax.swing.JButton();
        btnDivaid = new javax.swing.JButton();
        btnSquareRoot = new javax.swing.JButton();
        btnNumbe4 = new javax.swing.JButton();
        btnNumber5 = new javax.swing.JButton();
        btnNumber6 = new javax.swing.JButton();
        btnNhan = new javax.swing.JButton();
        btnPhantram = new javax.swing.JButton();
        btnNumber7 = new javax.swing.JButton();
        btnNumber8 = new javax.swing.JButton();
        btnNumber9 = new javax.swing.JButton();
        btnCong = new javax.swing.JButton();
        btnMotChiax = new javax.swing.JButton();
        btnNumber0 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnTru = new javax.swing.JButton();
        btnBang = new javax.swing.JButton();
        btnAns = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("CASIO");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtResult.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtResult)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtResult, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setLayout(new java.awt.GridLayout(4, 5, 5, 5));

        btnNumber1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNumber1.setText("1");
        btnNumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnNumber1);

        btnNumber2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNumber2.setText("2");
        btnNumber2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnNumber2);

        btnNumber3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNumber3.setText("3");
        btnNumber3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnNumber3);

        btnDivaid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDivaid.setText("/");
        btnDivaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivaidActionPerformed(evt);
            }
        });
        jPanel3.add(btnDivaid);

        btnSquareRoot.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSquareRoot.setText("sqrt");
        btnSquareRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSquareRootActionPerformed(evt);
            }
        });
        jPanel3.add(btnSquareRoot);

        btnNumbe4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNumbe4.setText("4");
        btnNumbe4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnNumbe4);

        btnNumber5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNumber5.setText("5");
        btnNumber5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnNumber5);

        btnNumber6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNumber6.setText("6");
        btnNumber6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnNumber6);

        btnNhan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNhan.setText("*");
        btnNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivaidActionPerformed(evt);
            }
        });
        jPanel3.add(btnNhan);

        btnPhantram.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPhantram.setText("%");
        btnPhantram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSquareRootActionPerformed(evt);
            }
        });
        jPanel3.add(btnPhantram);

        btnNumber7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNumber7.setText("7");
        btnNumber7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnNumber7);

        btnNumber8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNumber8.setText("8");
        btnNumber8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnNumber8);

        btnNumber9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNumber9.setText("9");
        btnNumber9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnNumber9);

        btnCong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCong.setText("+");
        btnCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivaidActionPerformed(evt);
            }
        });
        jPanel3.add(btnCong);

        btnMotChiax.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnMotChiax.setText("1/x");
        btnMotChiax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSquareRootActionPerformed(evt);
            }
        });
        jPanel3.add(btnMotChiax);

        btnNumber0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNumber0.setText("0");
        btnNumber0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnNumber0);

        jButton16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton16.setText("+/-");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton16);

        btnClear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnClear.setText("C");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel3.add(btnClear);

        btnTru.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTru.setText("-");
        btnTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivaidActionPerformed(evt);
            }
        });
        jPanel3.add(btnTru);

        btnBang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBang.setText("=");
        btnBang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBangActionPerformed(evt);
            }
        });
        jPanel3.add(btnBang);

        btnAns.setText("Ans");
        btnAns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnsActionPerformed(evt);
            }
        });
        jPanel3.add(btnAns);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumber1ActionPerformed
        if(isEqualsPress){
            isEqualsPress=false;
            txtResult.setText("");
        }
        String cmd =evt.getActionCommand();
        txtResult.setText(txtResult.getText()+cmd);
    }//GEN-LAST:event_btnNumber1ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed

        try {

            double value=Double.parseDouble(txtResult.getText());
            value=-value;
            txtResult.setText(""+value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void btnDivaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivaidActionPerformed
        String cmd = evt.getActionCommand();
        
        operator=cmd;
        toanhang1=txtResult.getText();
        
        txtResult.setText(" ");
    }//GEN-LAST:event_btnDivaidActionPerformed

    private void btnBangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBangActionPerformed
        if(txtResult.getText().equals("")||toanhang1.equals("")){
            return;
        }
        try {
            double oprand1=Double.parseDouble(toanhang1);
            double oprand2=Double.parseDouble(txtResult.getText());
            double result=0;
            if(operator.equals("+")){
                result =oprand1+oprand2;
               
            }else if(operator.equals("-")){
                result =oprand1-oprand2;
               
            }else if(operator.equals("*")){
                result =oprand1*oprand2;
            
            }else if(operator.equals("/")){
                result =oprand1/oprand2;
           
            }         
       
            txtResult.setText(""+result);
            
            isEqualsPress=true;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        demsolandaubang++;
        if(demsolandaubang==1){
            arrayMemory[1]=txtResult.getText();
        }else{
            arrayMemory[0]=arrayMemory[1];
            arrayMemory[1]=txtResult.getText();
        }
    }//GEN-LAST:event_btnBangActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtResult.setText("");
        toanhang1="";
        operator="";
        isEqualsPress=false;
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSquareRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSquareRootActionPerformed
        if(txtResult.getText().equals("")){
            return;
        }
        String cmd=evt.getActionCommand();
        try {
            double value=Double.parseDouble(txtResult.getText());
            
            if(cmd.equals("sqrt")){
                value=Math.sqrt(value);
            }else  if(cmd.equals("%")){
                value=value/100;
            }else  if(cmd.equals("1/x")){
                value=1/value;
            }
            txtResult.setText(""+ value);
            isEqualsPress=true;
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnSquareRootActionPerformed

    private void btnAnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnsActionPerformed
        txtResult.setText(arrayMemory[0].toString());
    }//GEN-LAST:event_btnAnsActionPerformed

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
            java.util.logging.Logger.getLogger(bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bai3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAns;
    private javax.swing.JButton btnBang;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCong;
    private javax.swing.JButton btnDivaid;
    private javax.swing.JButton btnMotChiax;
    private javax.swing.JButton btnNhan;
    private javax.swing.JButton btnNumbe4;
    private javax.swing.JButton btnNumber0;
    private javax.swing.JButton btnNumber1;
    private javax.swing.JButton btnNumber2;
    private javax.swing.JButton btnNumber3;
    private javax.swing.JButton btnNumber5;
    private javax.swing.JButton btnNumber6;
    private javax.swing.JButton btnNumber7;
    private javax.swing.JButton btnNumber8;
    private javax.swing.JButton btnNumber9;
    private javax.swing.JButton btnPhantram;
    private javax.swing.JButton btnSquareRoot;
    private javax.swing.JButton btnTru;
    private javax.swing.JButton jButton16;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables

    private void luuketqua() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void luuketqua(double result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}