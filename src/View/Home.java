/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Nikho Sagala
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Rumah
     */
    public Home() {
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

        bg_white = new javax.swing.JPanel();
        btn_kelolapemesanan = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        btn_transaksi = new javax.swing.JButton();
        btn_report = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        pic_rentalmobil = new javax.swing.JLabel();
        pic_mobil = new javax.swing.JLabel();
        btn_kelolapengembalian = new javax.swing.JButton();
        btn_kelolamobil1 = new javax.swing.JButton();
        btnTransaksi2 = new javax.swing.JButton();
        bg_white1 = new javax.swing.JPanel();
        btnKelolaPemesanan = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        pic_rentalmobil1 = new javax.swing.JLabel();
        btnKelolaPengembalian = new javax.swing.JButton();
        pic_mobil1 = new javax.swing.JLabel();
        btnTransaksi3 = new javax.swing.JButton();

        bg_white.setBackground(new java.awt.Color(255, 255, 255));
        bg_white.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bg_white.setPreferredSize(new java.awt.Dimension(950, 610));

        btn_kelolapemesanan.setBackground(new java.awt.Color(255, 255, 255));
        btn_kelolapemesanan.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\RPL-TBO-branch\\src\\assets\\pinjam.png")); // NOI18N
        btn_kelolapemesanan.setText("Kelola Pemesanan");
        btn_kelolapemesanan.setToolTipText("");
        btn_kelolapemesanan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_logout.setBackground(new java.awt.Color(255, 255, 255));
        btn_logout.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\RPL-TBO-branch\\src\\assets\\loginoke.png")); // NOI18N
        btn_logout.setText("Log Out");
        btn_logout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        btn_transaksi.setBackground(new java.awt.Color(255, 255, 255));
        btn_transaksi.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\RPL-TBO-branch\\src\\assets\\transaksi.png")); // NOI18N
        btn_transaksi.setText("Transaksi");
        btn_transaksi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_report.setBackground(new java.awt.Color(255, 255, 255));
        btn_report.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\RPL-TBO-branch\\src\\assets\\printer.png")); // NOI18N
        btn_report.setText("Report");
        btn_report.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_exit.setBackground(new java.awt.Color(255, 255, 255));
        btn_exit.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\RPL-TBO-branch\\src\\assets\\Exit1.jpg")); // NOI18N
        btn_exit.setText("Exit");
        btn_exit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        pic_rentalmobil.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\RPL-TBO-branch\\src\\assets\\Rental Mobil.jpg")); // NOI18N

        pic_mobil.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\RPL-TBO-branch\\src\\assets\\Background.png")); // NOI18N
        pic_mobil.setText("jLabel2");

        btn_kelolapengembalian.setBackground(new java.awt.Color(255, 255, 255));
        btn_kelolapengembalian.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\RPL-TBO-branch\\src\\assets\\kembali_mobil.png")); // NOI18N
        btn_kelolapengembalian.setText("Kelola Pengembalian");
        btn_kelolapengembalian.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_kelolamobil1.setBackground(new java.awt.Color(255, 255, 255));
        btn_kelolamobil1.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\RPL-TBO-branch\\src\\assets\\add_mobil.png")); // NOI18N
        btn_kelolamobil1.setText("Kelola Mobil");
        btn_kelolamobil1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_kelolamobil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kelolamobil1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bg_whiteLayout = new javax.swing.GroupLayout(bg_white);
        bg_white.setLayout(bg_whiteLayout);
        bg_whiteLayout.setHorizontalGroup(
            bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_whiteLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg_whiteLayout.createSequentialGroup()
                        .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)
                        .addComponent(pic_rentalmobil, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bg_whiteLayout.createSequentialGroup()
                        .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_kelolamobil1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_kelolapemesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_kelolapengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_report, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(pic_mobil, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        bg_whiteLayout.setVerticalGroup(
            bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_whiteLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pic_rentalmobil, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg_whiteLayout.createSequentialGroup()
                        .addComponent(btn_kelolamobil1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_kelolapemesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bg_whiteLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(btn_kelolapengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(btn_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_report, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pic_mobil, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnTransaksi2.setBackground(new java.awt.Color(255, 255, 255));
        btnTransaksi2.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\RPL-TBO-branch\\src\\assets\\transaksi.png")); // NOI18N
        btnTransaksi2.setText("Transaksi");
        btnTransaksi2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTransaksi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransaksi2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg_white1.setBackground(new java.awt.Color(255, 255, 255));
        bg_white1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bg_white1.setPreferredSize(new java.awt.Dimension(950, 610));

        btnKelolaPemesanan.setBackground(new java.awt.Color(255, 255, 255));
        btnKelolaPemesanan.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\RPL-TBO-branch\\src\\assets\\pinjam.png")); // NOI18N
        btnKelolaPemesanan.setText("Kelola Pemesanan");
        btnKelolaPemesanan.setToolTipText("");
        btnKelolaPemesanan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnKelolaPemesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKelolaPemesananActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\RPL-TBO-branch\\src\\assets\\loginoke.png")); // NOI18N
        btnLogout.setText("Log Out");
        btnLogout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\RPL-TBO-branch\\src\\assets\\Exit1.jpg")); // NOI18N
        btnExit.setText("Exit");
        btnExit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        pic_rentalmobil1.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\RPL-TBO-branch\\src\\assets\\Rental Mobil.jpg")); // NOI18N

        btnKelolaPengembalian.setBackground(new java.awt.Color(255, 255, 255));
        btnKelolaPengembalian.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\RPL-TBO-branch\\src\\assets\\kembali_mobil.png")); // NOI18N
        btnKelolaPengembalian.setText("Kelola Pengembalian");
        btnKelolaPengembalian.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnKelolaPengembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKelolaPengembalianActionPerformed(evt);
            }
        });

        pic_mobil1.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\RPL-TBO-branch\\src\\assets\\Background.png")); // NOI18N
        pic_mobil1.setText("jLabel2");

        btnTransaksi3.setBackground(new java.awt.Color(255, 255, 255));
        btnTransaksi3.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\RPL-TBO-branch\\src\\assets\\transaksi.png")); // NOI18N
        btnTransaksi3.setText("Transaksi");
        btnTransaksi3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTransaksi3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransaksi3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bg_white1Layout = new javax.swing.GroupLayout(bg_white1);
        bg_white1.setLayout(bg_white1Layout);
        bg_white1Layout.setHorizontalGroup(
            bg_white1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_white1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(bg_white1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnKelolaPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKelolaPemesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTransaksi3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(bg_white1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg_white1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(pic_rentalmobil1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(215, Short.MAX_VALUE))
                    .addGroup(bg_white1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pic_mobil1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        bg_white1Layout.setVerticalGroup(
            bg_white1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_white1Layout.createSequentialGroup()
                .addGroup(bg_white1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg_white1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(pic_rentalmobil1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pic_mobil1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_white1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKelolaPemesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKelolaPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTransaksi3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bg_white1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bg_white1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_kelolamobil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kelolamobil1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_kelolamobil1ActionPerformed

    private void btnKelolaPengembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKelolaPengembalianActionPerformed
        // TODO add your handling code here:
        this.dispose();
        bg_white1.removeAll();
        KelolaPengembalian kpe = new KelolaPengembalian();
        kpe.setVisible(true);
        
        bg_white1.add(kpe);
    }//GEN-LAST:event_btnKelolaPengembalianActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Login Lg = new Login();
        Lg.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnKelolaPemesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKelolaPemesananActionPerformed
        // TODO add your handling code here:
        this.hide();
        bg_white1.removeAll();
        KelolaPemesanan kp = new KelolaPemesanan();
        kp.setVisible(true);
        bg_white1.add(kp);
    }//GEN-LAST:event_btnKelolaPemesananActionPerformed

    private void btnTransaksi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransaksi2ActionPerformed
        // TODO add your handling code here:
        this.hide();
        bg_white1.removeAll();
        Transaksi Tr = new Transaksi();
        Tr.setVisible(true);
        bg_white1.add(Tr);
    }//GEN-LAST:event_btnTransaksi2ActionPerformed

    private void btnTransaksi3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransaksi3ActionPerformed
        // TODO add your handling code here:
        this.hide();
        bg_white1.removeAll();
        Transaksi Tr = new Transaksi();
        Tr.setVisible(true);
        bg_white1.add(Tr);
    }//GEN-LAST:event_btnTransaksi3ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg_white;
    private javax.swing.JPanel bg_white1;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnKelolaPemesanan;
    private javax.swing.JButton btnKelolaPengembalian;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnTransaksi2;
    private javax.swing.JButton btnTransaksi3;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_kelolamobil1;
    private javax.swing.JButton btn_kelolapemesanan;
    private javax.swing.JButton btn_kelolapengembalian;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_report;
    private javax.swing.JButton btn_transaksi;
    private javax.swing.JLabel pic_mobil;
    private javax.swing.JLabel pic_mobil1;
    private javax.swing.JLabel pic_rentalmobil;
    private javax.swing.JLabel pic_rentalmobil1;
    // End of variables declaration//GEN-END:variables
}
