/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author gggggggggggggggggggg
 */
public class Transaksi extends javax.swing.JFrame {

    /**
     * Creates new form Transaksi
     */
    public Transaksi() {
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
        jLabel1 = new javax.swing.JLabel();
        lbl_datapeminjam = new javax.swing.JLabel();
        lbl_nopolisi = new javax.swing.JLabel();
        txtNoPol = new javax.swing.JTextField();
        lbl_namapeminjam = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        lbl_ktp = new javax.swing.JLabel();
        lbl_nohandphone = new javax.swing.JLabel();
        lblNoKtp = new javax.swing.JLabel();
        lblNoHp = new javax.swing.JLabel();
        lbl_jnsmobil = new javax.swing.JLabel();
        lblJenisMobil = new javax.swing.JLabel();
        lbl_lmpeminjaman = new javax.swing.JLabel();
        lblLamaPinjam = new javax.swing.JLabel();
        lbl_biaya = new javax.swing.JLabel();
        lblTotalBiaya = new javax.swing.JLabel();
        btn_home = new javax.swing.JButton();
        btn_submit = new javax.swing.JButton();
        pic_formtransaksi = new javax.swing.JLabel();
        pic_ftransaksi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg_white.setBackground(new java.awt.Color(255, 255, 255));
        bg_white.setToolTipText("");

        lbl_datapeminjam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_datapeminjam.setText("DATA PEMINJAM");

        lbl_nopolisi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_nopolisi.setText("No.Polisi/Plat");

        lbl_namapeminjam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_namapeminjam.setText("Nama Peminjam");

        lblNama.setText("lbl-nama");

        lbl_ktp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_ktp.setText("No Ktp");

        lbl_nohandphone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_nohandphone.setText("No Handphone");

        lblNoKtp.setText("lbl-noktp");

        lblNoHp.setText("lbl-nohp");

        lbl_jnsmobil.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_jnsmobil.setText("Jenis Mobil");

        lblJenisMobil.setText("lbl-jenismobil");

        lbl_lmpeminjaman.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_lmpeminjaman.setText("Lama Peminjaman");

        lblLamaPinjam.setText("lbl-lamapemin");

        lbl_biaya.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_biaya.setText("Total Biaya");

        lblTotalBiaya.setText("lbl-totbiaya");

        btn_home.setBackground(new java.awt.Color(255, 255, 255));
        btn_home.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\RPL-TBO-branch\\src\\assets\\home (1).jpg")); // NOI18N
        btn_home.setText("Home");
        btn_home.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });

        btn_submit.setBackground(new java.awt.Color(255, 255, 255));
        btn_submit.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\RPL-TBO-branch\\src\\assets\\arrow_right.png")); // NOI18N
        btn_submit.setText("Submit");
        btn_submit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        pic_ftransaksi.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\RPL-TBO-branch\\src\\assets\\form Transaksi.jpg")); // NOI18N

        javax.swing.GroupLayout bg_whiteLayout = new javax.swing.GroupLayout(bg_white);
        bg_white.setLayout(bg_whiteLayout);
        bg_whiteLayout.setHorizontalGroup(
            bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_whiteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btn_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(bg_whiteLayout.createSequentialGroup()
                .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg_whiteLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_biaya)
                            .addComponent(lbl_lmpeminjaman)
                            .addComponent(lbl_jnsmobil)
                            .addComponent(lbl_nohandphone)
                            .addComponent(lbl_ktp)
                            .addComponent(lbl_namapeminjam)
                            .addComponent(lbl_nopolisi)
                            .addComponent(lbl_datapeminjam))
                        .addGap(45, 45, 45)
                        .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLamaPinjam)
                            .addComponent(lblTotalBiaya)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNoHp)
                                .addComponent(lblJenisMobil)
                                .addComponent(lblNoKtp)
                                .addComponent(lblNama)
                                .addComponent(txtNoPol, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(bg_whiteLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pic_formtransaksi)
                            .addComponent(jLabel1)))
                    .addGroup(bg_whiteLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(pic_ftransaksi)))
                .addContainerGap(263, Short.MAX_VALUE))
        );
        bg_whiteLayout.setVerticalGroup(
            bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_whiteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pic_formtransaksi)
                .addGap(7, 7, 7)
                .addComponent(pic_ftransaksi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_datapeminjam, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNoPol, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nopolisi))
                .addGap(18, 18, 18)
                .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNama)
                    .addComponent(lbl_namapeminjam))
                .addGap(18, 18, 18)
                .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNoKtp)
                    .addComponent(lbl_ktp))
                .addGap(18, 18, 18)
                .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNoHp)
                    .addComponent(lbl_nohandphone))
                .addGap(18, 18, 18)
                .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJenisMobil)
                    .addComponent(lbl_jnsmobil))
                .addGap(18, 18, 18)
                .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLamaPinjam)
                    .addComponent(lbl_lmpeminjaman))
                .addGap(18, 18, 18)
                .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotalBiaya)
                    .addComponent(lbl_biaya))
                .addGap(14, 14, 14)
                .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_white, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_white, javax.swing.GroupLayout.PREFERRED_SIZE, 470, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
    this.dispose();
    Home a = new Home();
    a.show();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_homeActionPerformed

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
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg_white;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_submit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblJenisMobil;
    private javax.swing.JLabel lblLamaPinjam;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblNoHp;
    private javax.swing.JLabel lblNoKtp;
    private javax.swing.JLabel lblTotalBiaya;
    private javax.swing.JLabel lbl_biaya;
    private javax.swing.JLabel lbl_datapeminjam;
    private javax.swing.JLabel lbl_jnsmobil;
    private javax.swing.JLabel lbl_ktp;
    private javax.swing.JLabel lbl_lmpeminjaman;
    private javax.swing.JLabel lbl_namapeminjam;
    private javax.swing.JLabel lbl_nohandphone;
    private javax.swing.JLabel lbl_nopolisi;
    private javax.swing.JLabel pic_formtransaksi;
    private javax.swing.JLabel pic_ftransaksi;
    private javax.swing.JTextField txtNoPol;
    // End of variables declaration//GEN-END:variables
}
