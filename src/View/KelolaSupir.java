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
public class KelolaSupir extends javax.swing.JFrame {

    /**
     * Creates new form KelolaSupir
     */
    public KelolaSupir() {
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
        pic_kelolapengembalian = new javax.swing.JLabel();
        lbl_datamobil = new javax.swing.JLabel();
        lbl_nopolisi = new javax.swing.JLabel();
        txt_nopolisi = new javax.swing.JTextField();
        lbl_nmpeminjam = new javax.swing.JLabel();
        lbl_tglpeminjam = new javax.swing.JLabel();
        lbl_tglpengembalian = new javax.swing.JLabel();
        lbl_lmpeminjam = new javax.swing.JLabel();
        lbl_harga = new javax.swing.JLabel();
        lbl_nama = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_tglpinjam = new javax.swing.JLabel();
        lbl_tglkembali = new javax.swing.JLabel();
        lbl_lmpinjam = new javax.swing.JLabel();
        lbl_hargaperhari = new javax.swing.JLabel();
        btn_kembalikanmobil = new javax.swing.JButton();
        btn_home = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bg_white1 = new javax.swing.JPanel();
        pic_kelolapengembalian1 = new javax.swing.JLabel();
        lbl_datamobil1 = new javax.swing.JLabel();
        lbl_nopolisi1 = new javax.swing.JLabel();
        txt_nohandphone = new javax.swing.JTextField();
        lbl_nmpeminjam1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_submit = new javax.swing.JButton();
        btn_home1 = new javax.swing.JButton();
        txt_namasupir = new javax.swing.JTextField();

        bg_white.setBackground(new java.awt.Color(255, 255, 255));

        lbl_datamobil.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lbl_datamobil.setText("DATA MOBIL");

        lbl_nopolisi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_nopolisi.setText("No.Polisi/Plat");

        lbl_nmpeminjam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_nmpeminjam.setText("Nama Peminjam");

        lbl_tglpeminjam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_tglpeminjam.setText("Tanggal Peminjaman");

        lbl_tglpengembalian.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_tglpengembalian.setText("Tanggal Pengembalian");

        lbl_lmpeminjam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_lmpeminjam.setText("Lama Peminjaman");

        lbl_harga.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_harga.setText("Harga /perhari");

        lbl_nama.setText("lbl-nama");

        lbl_tglpinjam.setText("lbl-tglpinjam");

        lbl_tglkembali.setText("lbl-tglkembali");

        lbl_lmpinjam.setText("lbl-lmpinjam");

        lbl_hargaperhari.setText("lbl-harga");

        btn_kembalikanmobil.setBackground(new java.awt.Color(255, 255, 255));
        btn_kembalikanmobil.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\RPL-TBO-branch\\src\\assets\\arrow_right.png")); // NOI18N
        btn_kembalikanmobil.setText("Kembalkan Mobil");
        btn_kembalikanmobil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_home.setBackground(new java.awt.Color(255, 255, 255));
        btn_home.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\RPL-TBO-branch\\src\\assets\\home (1).jpg")); // NOI18N
        btn_home.setText("Home");
        btn_home.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\RPL-TBO-branch\\src\\assets\\Kelola pengembalian.jpg")); // NOI18N

        javax.swing.GroupLayout bg_whiteLayout = new javax.swing.GroupLayout(bg_white);
        bg_white.setLayout(bg_whiteLayout);
        bg_whiteLayout.setHorizontalGroup(
            bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_whiteLayout.createSequentialGroup()
                .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg_whiteLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pic_kelolapengembalian)
                            .addComponent(jLabel3)))
                    .addGroup(bg_whiteLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_tglpengembalian)
                                .addComponent(lbl_tglpeminjam)
                                .addComponent(lbl_nmpeminjam)
                                .addComponent(lbl_nopolisi)
                                .addComponent(lbl_lmpeminjam)
                                .addComponent(lbl_harga))
                            .addGroup(bg_whiteLayout.createSequentialGroup()
                                .addComponent(lbl_datamobil)
                                .addGap(43, 43, 43)))
                        .addGap(25, 25, 25)
                        .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_tglpinjam)
                            .addComponent(lbl_lmpinjam)
                            .addComponent(lbl_tglkembali)
                            .addComponent(lbl_hargaperhari)
                            .addComponent(lbl_nama)
                            .addComponent(txt_nopolisi, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(227, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_whiteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_kembalikanmobil, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        bg_whiteLayout.setVerticalGroup(
            bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_whiteLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pic_kelolapengembalian)
                    .addComponent(jLabel1))
                .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg_whiteLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3))
                    .addGroup(bg_whiteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_datamobil)))
                .addGap(18, 18, 18)
                .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nopolisi)
                    .addComponent(txt_nopolisi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nmpeminjam)
                    .addComponent(lbl_nama))
                .addGap(18, 18, 18)
                .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tglpeminjam)
                    .addComponent(lbl_tglpinjam))
                .addGap(18, 18, 18)
                .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tglpengembalian)
                    .addComponent(lbl_tglkembali))
                .addGap(18, 18, 18)
                .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_lmpeminjam)
                    .addComponent(lbl_lmpinjam))
                .addGap(18, 18, 18)
                .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_harga)
                    .addComponent(lbl_hargaperhari))
                .addGap(18, 18, 18)
                .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_kembalikanmobil, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg_white1.setBackground(new java.awt.Color(255, 255, 255));
        bg_white1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        bg_white1.add(pic_kelolapengembalian1, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 22, -1, -1));

        lbl_datamobil1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lbl_datamobil1.setText("DATA SUPIR");
        bg_white1.add(lbl_datamobil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 117, -1, -1));

        lbl_nopolisi1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_nopolisi1.setText("Nama Supir");
        bg_white1.add(lbl_nopolisi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 166, -1, -1));
        bg_white1.add(txt_nohandphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 183, 31));

        lbl_nmpeminjam1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_nmpeminjam1.setText("No Handphone");
        bg_white1.add(lbl_nmpeminjam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 203, -1, -1));
        bg_white1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 139, -1, -1));

        btn_submit.setBackground(new java.awt.Color(255, 255, 255));
        btn_submit.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\RPL-TBO-branch\\src\\assets\\arrow_right.png")); // NOI18N
        btn_submit.setText("Submit");
        btn_submit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });
        bg_white1.add(btn_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, 160, 49));

        btn_home1.setBackground(new java.awt.Color(255, 255, 255));
        btn_home1.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\RPL-TBO-branch\\src\\assets\\home (1).jpg")); // NOI18N
        btn_home1.setText("Home");
        btn_home1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_home1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_home1ActionPerformed(evt);
            }
        });
        bg_white1.add(btn_home1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 110, 52));
        bg_white1.add(txt_namasupir, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 160, 183, 31));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_white1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_white1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Home a = new Home();
        a.show();
    }//GEN-LAST:event_btn_homeActionPerformed

    private void btn_home1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_home1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Home a = new Home();
        a.show();
    }//GEN-LAST:event_btn_home1ActionPerformed

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_submitActionPerformed

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
            java.util.logging.Logger.getLogger(KelolaSupir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KelolaSupir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KelolaSupir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KelolaSupir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new KelolaSupir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg_white;
    private javax.swing.JPanel bg_white1;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_home1;
    private javax.swing.JButton btn_kembalikanmobil;
    private javax.swing.JButton btn_submit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_datamobil;
    private javax.swing.JLabel lbl_datamobil1;
    private javax.swing.JLabel lbl_harga;
    private javax.swing.JLabel lbl_hargaperhari;
    private javax.swing.JLabel lbl_lmpeminjam;
    private javax.swing.JLabel lbl_lmpinjam;
    private javax.swing.JLabel lbl_nama;
    private javax.swing.JLabel lbl_nmpeminjam;
    private javax.swing.JLabel lbl_nmpeminjam1;
    private javax.swing.JLabel lbl_nopolisi;
    private javax.swing.JLabel lbl_nopolisi1;
    private javax.swing.JLabel lbl_tglkembali;
    private javax.swing.JLabel lbl_tglpeminjam;
    private javax.swing.JLabel lbl_tglpengembalian;
    private javax.swing.JLabel lbl_tglpinjam;
    private javax.swing.JLabel pic_kelolapengembalian;
    private javax.swing.JLabel pic_kelolapengembalian1;
    private javax.swing.JTextField txt_namasupir;
    private javax.swing.JTextField txt_nohandphone;
    private javax.swing.JTextField txt_nopolisi;
    // End of variables declaration//GEN-END:variables
}
