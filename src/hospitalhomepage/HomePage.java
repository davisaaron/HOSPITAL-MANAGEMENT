/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalhomepage;


import finance_management.MainMenu;
import In_patient.inPatient_management;
import Inventory.inv_home;
import maternity.MaternityGUI;
import pms.opd.opdGUI;

import Pharmacy.Main;
//import Lab_management.inv_home;
import Lab_management.lab_home;
import Lab_management.scanning;
import hrmanagement.OverView;
import vehicle.management.system.Vehicle;


/**
 *
 * @author kiros
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
    }

    
    public void set_previlege(String type){
        if(type.equals("admin")){
             
        
        }
        else if(type.equals("rep")){
            //opd.setEnabled(false);
            //inp.setEnabled(false);
            //mat.setEnabled(false);
             lab.setEnabled(false);
            inv.setEnabled(false);
            hr.setEnabled(false);
           // tra.setEnabled(false);
            pha.setEnabled(false);
                bf.setEnabled(false);
                
            
        }
        else if(type.equals("hr")){
            opd.setEnabled(false);
            inp.setEnabled(false);
            mat.setEnabled(false);
             lab.setEnabled(false);
            //inv.setEnabled(false);
            //hr.setEnabled(false);
           // tra.setEnabled(false);
            pha.setEnabled(false);
                bf.setEnabled(false);
            
            
        }
        else if(type.equals("phar")){
            opd.setEnabled(false);
            inp.setEnabled(false);
            mat.setEnabled(false);
             lab.setEnabled(false);
            inv.setEnabled(false);
            hr.setEnabled(false);
            tra.setEnabled(false);
            bf.setEnabled(false);
            //pha.setEnabled(false);
            
            
        }
        else if(type.equals("lab_assist")){
            opd.setEnabled(false);
            inp.setEnabled(false);
            mat.setEnabled(false);
            // lab.setEnabled(false);
            inv.setEnabled(false);
            hr.setEnabled(false);
            tra.setEnabled(false);
            pha.setEnabled(false);
                bf.setEnabled(false);
            
        }
        else if(type.equals("opd")){
           // opd.setEnabled(false);
            inp.setEnabled(false);
            mat.setEnabled(false);
             lab.setEnabled(false);
            inv.setEnabled(false);
            hr.setEnabled(false);
            tra.setEnabled(false);
            pha.setEnabled(false);
                bf.setEnabled(false);
        }
        else if (type.equals("vcl")){
            opd.setEnabled(false);
            inp.setEnabled(false);
            mat.setEnabled(false);
             lab.setEnabled(false);
            inv.setEnabled(false);
            hr.setEnabled(false);
           // tra.setEnabled(false);
            pha.setEnabled(false);
                bf.setEnabled(false);
            
        }
        else{
        
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        opd = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inp = new javax.swing.JButton();
        mat = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lab = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pha = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        inv = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        hr = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        bf = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        tra = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        opd.setBackground(new java.awt.Color(255, 255, 255));
        opd.setText("OPD");
        opd.setPreferredSize(new java.awt.Dimension(200, 30));
        opd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opdActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalhomepage/opd.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalhomepage/InPatient.jpg"))); // NOI18N

        inp.setBackground(new java.awt.Color(255, 255, 255));
        inp.setText("IN PATIENT");
        inp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpActionPerformed(evt);
            }
        });

        mat.setBackground(new java.awt.Color(255, 255, 255));
        mat.setText("MATERNITY");
        mat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalhomepage/maternity.jpg"))); // NOI18N

        lab.setBackground(new java.awt.Color(255, 255, 255));
        lab.setText("LABORATORY");
        lab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalhomepage/lab.jpg"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalhomepage/pharmacy.jpg"))); // NOI18N

        pha.setBackground(new java.awt.Color(255, 255, 255));
        pha.setText("PHARMACY");
        pha.setPreferredSize(new java.awt.Dimension(200, 30));
        pha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phaActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalhomepage/inventory.jpg"))); // NOI18N

        inv.setBackground(new java.awt.Color(255, 255, 255));
        inv.setText("INVENTORY");
        inv.setPreferredSize(new java.awt.Dimension(200, 30));
        inv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalhomepage/hr.jpg"))); // NOI18N

        hr.setBackground(new java.awt.Color(255, 255, 255));
        hr.setText("HUMAN RESOURCES");
        hr.setPreferredSize(new java.awt.Dimension(200, 30));
        hr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hrActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalhomepage/finance.jpg"))); // NOI18N

        bf.setBackground(new java.awt.Color(255, 255, 255));
        bf.setText("FINANCE");
        bf.setPreferredSize(new java.awt.Dimension(200, 30));
        bf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bfActionPerformed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalhomepage/doctor.jpg"))); // NOI18N

        tra.setBackground(new java.awt.Color(255, 255, 255));
        tra.setText("TRANSPORT");
        tra.setPreferredSize(new java.awt.Dimension(200, 30));
        tra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                traActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(opd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(inp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(mat, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lab, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(pha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(inv, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(hr, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(bf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(tra, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(20, 20, 20)
                                .addComponent(mat, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(74, 74, 74)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(opd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(inv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(lab, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(hr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36))))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(opd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(inp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lab, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(mat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(pha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                    .addGap(103, 103, 103)
                                    .addComponent(bf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                    .addGap(87, 87, 87)
                                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11)))))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(hr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(tra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );

        getContentPane().add(jLayeredPane1);
        jLayeredPane1.setBounds(110, 120, 1000, 380);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1050, 610, 150, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalhomepage/186063.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 120, 1000, 390);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalhomepage/185895.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1330, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void phaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phaActionPerformed
        // TODO add your handling code here:
        Main m = new Main();
        this.dispose();
        m.setVisible(true);
    }//GEN-LAST:event_phaActionPerformed

    private void opdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opdActionPerformed
        // TODO add your handling code here:
        this.dispose();
        opdGUI op = new opdGUI();
        op.setVisible(true);
    }//GEN-LAST:event_opdActionPerformed

    private void inpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpActionPerformed
        
        this.setVisible(false);
        inPatient_management Im=new inPatient_management();
        Im.setVisible(true);
        
    }//GEN-LAST:event_inpActionPerformed

    private void invActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invActionPerformed
        // TODO add your handling code here:
        this.dispose();
       inv_home ih = new inv_home();
        ih.setVisible(true);
    }//GEN-LAST:event_invActionPerformed

    private void bfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bfActionPerformed
        // TODO add your handling code here:
       this.dispose();
      MainMenu mm = new MainMenu();
      mm.setVisible(true);
    }//GEN-LAST:event_bfActionPerformed

    private void traActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_traActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Vehicle v = new Vehicle();
        v.setVisible(true);
    }//GEN-LAST:event_traActionPerformed

    private void labActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labActionPerformed
        // TODO add your handling code here:
        this.dispose();
        lab_home lh = new lab_home();
        lh.setVisible(true);
    }//GEN-LAST:event_labActionPerformed

    private void hrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hrActionPerformed
        // TODO add your handling code here:
      this.dispose();
      OverView ov = new OverView();
      ov.setVisible(true);
    }//GEN-LAST:event_hrActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       LogIn li=new LogIn();
       li.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void matActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matActionPerformed
        // TODO add your handling code here:
        this.dispose();
        MaternityGUI ma = new MaternityGUI();
        ma.setVisible(true);
    }//GEN-LAST:event_matActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bf;
    private javax.swing.JButton hr;
    private javax.swing.JButton inp;
    private javax.swing.JButton inv;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JButton lab;
    private javax.swing.JButton mat;
    private javax.swing.JButton opd;
    private javax.swing.JButton pha;
    private javax.swing.JButton tra;
    // End of variables declaration//GEN-END:variables
}
