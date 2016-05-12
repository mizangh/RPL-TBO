/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ConMobil;
import Controller.ConPemesan;
import Controller.ConSupir;
import Model.App;
import Model.Pemesan;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nikho Sagala
 */
public class KelolaPemesanan extends javax.swing.JFrame {

    /**
     * Creates new form Kelolapesan
     */
    public KelolaPemesanan() {
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
        pic_formkelolapemesanan = new javax.swing.JLabel();
        lbl_nmpelanggan = new javax.swing.JLabel();
        lbl_noktp = new javax.swing.JLabel();
        lbl_nohp = new javax.swing.JLabel();
        lbl_durasi = new javax.swing.JLabel();
        lbl_jenismobil = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cmbx_durasi = new javax.swing.JComboBox();
        txt_nmpelanggan = new javax.swing.JTextField();
        txt_noktp = new javax.swing.JTextField();
        lbl_perhari = new javax.swing.JLabel();
        cmbx_jenismobil = new javax.swing.JComboBox();
        pic_people = new javax.swing.JLabel();
        lbl_totbiaya = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();
        btn_submit = new javax.swing.JButton();
        btn_home = new javax.swing.JButton();
        pic_kelolapemesanan = new javax.swing.JLabel();
        txt_noktp1 = new javax.swing.JTextField();
        bg_white1 = new javax.swing.JPanel();
        pic_formkelolapemesanan1 = new javax.swing.JLabel();
        lbl_nmpelanggan1 = new javax.swing.JLabel();
        lbl_noktp1 = new javax.swing.JLabel();
        lbl_nohp1 = new javax.swing.JLabel();
        lbl_durasi1 = new javax.swing.JLabel();
        lbl_jenismobil1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cmbDurasi = new javax.swing.JComboBox();
        txtNamaPelanggan = new javax.swing.JTextField();
        txtNoHp = new javax.swing.JTextField();
        lbl_perhari1 = new javax.swing.JLabel();
        cmbJenisMobil = new javax.swing.JComboBox();
        pic_people1 = new javax.swing.JLabel();
        lbl_totbiaya1 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        pic_kelolapemesanan1 = new javax.swing.JLabel();
        txtNoKtp = new javax.swing.JTextField();
        lbl_nohp2 = new javax.swing.JLabel();
        SprYa = new javax.swing.JRadioButton();
        SprTdk = new javax.swing.JRadioButton();

        bg_white.setBackground(new java.awt.Color(255, 255, 255));

        pic_formkelolapemesanan.setName(""); // NOI18N

        lbl_nmpelanggan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_nmpelanggan.setText("Nama Pelanggan");

        lbl_noktp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_noktp.setText("No Ktp");

        lbl_nohp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_nohp.setText("No Handphone");

        lbl_durasi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_durasi.setText("Durasi");

        lbl_jenismobil.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_jenismobil.setText("Jenis Mobil");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Total Biaya");

        cmbx_durasi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbx_durasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbx_durasiActionPerformed(evt);
            }
        });

        txt_nmpelanggan.setName(""); // NOI18N

        txt_noktp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_noktpActionPerformed(evt);
            }
        });

        lbl_perhari.setText("Perhari");

        cmbx_jenismobil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbx_jenismobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbx_jenismobilActionPerformed(evt);
            }
        });

        lbl_totbiaya.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_totbiaya.setText("Total Biaya");

        lbl_total.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_total.setText("Total");

        btn_submit.setBackground(new java.awt.Color(255, 255, 255));
        btn_submit.setText("Submit");
        btn_submit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_home.setBackground(new java.awt.Color(255, 255, 255));
        btn_home.setText("Home");
        btn_home.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txt_noktp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_noktp1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bg_whiteLayout = new javax.swing.GroupLayout(bg_white);
        bg_white.setLayout(bg_whiteLayout);
        bg_whiteLayout.setHorizontalGroup(
            bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_whiteLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg_whiteLayout.createSequentialGroup()
                        .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pic_formkelolapemesanan)
                            .addComponent(jLabel13))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bg_whiteLayout.createSequentialGroup()
                        .addGap(750, 750, 750)
                        .addComponent(pic_people)
                        .addGap(26, 26, 26))))
            .addGroup(bg_whiteLayout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(pic_kelolapemesanan)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_whiteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_whiteLayout.createSequentialGroup()
                        .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_whiteLayout.createSequentialGroup()
                        .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_whiteLayout.createSequentialGroup()
                                .addComponent(lbl_totbiaya)
                                .addGap(108, 108, 108))
                            .addGroup(bg_whiteLayout.createSequentialGroup()
                                .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_nmpelanggan)
                                    .addComponent(lbl_noktp)
                                    .addComponent(lbl_nohp)
                                    .addComponent(lbl_durasi)
                                    .addComponent(lbl_jenismobil))
                                .addGap(68, 68, 68)))
                        .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbx_jenismobil, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bg_whiteLayout.createSequentialGroup()
                                .addComponent(cmbx_durasi, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_perhari))
                            .addComponent(txt_noktp, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nmpelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_noktp1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_total))
                        .addGap(117, 117, 117)))
                .addComponent(btn_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
        );
        bg_whiteLayout.setVerticalGroup(
            bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_whiteLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(pic_kelolapemesanan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pic_formkelolapemesanan)
                .addGap(18, 18, 18)
                .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bg_whiteLayout.createSequentialGroup()
                        .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nmpelanggan)
                            .addComponent(txt_nmpelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bg_whiteLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(pic_people))
                            .addGroup(bg_whiteLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_noktp1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_noktp))))
                        .addGap(18, 18, 18)
                        .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_noktp, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_nohp))
                        .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bg_whiteLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(lbl_durasi))
                            .addGroup(bg_whiteLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(lbl_perhari)))
                        .addGap(8, 8, 8))
                    .addComponent(cmbx_durasi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_jenismobil)
                    .addComponent(cmbx_jenismobil, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg_whiteLayout.createSequentialGroup()
                        .addComponent(lbl_totbiaya)
                        .addGap(405, 405, 405)
                        .addComponent(jLabel13))
                    .addGroup(bg_whiteLayout.createSequentialGroup()
                        .addComponent(lbl_total)
                        .addGap(7, 7, 7)
                        .addGroup(bg_whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg_white1.setBackground(new java.awt.Color(255, 255, 255));

        pic_formkelolapemesanan1.setName(""); // NOI18N

        lbl_nmpelanggan1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_nmpelanggan1.setText("Nama Pelanggan");

        lbl_noktp1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_noktp1.setText("No Ktp");

        lbl_nohp1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_nohp1.setText("No Handphone");

        lbl_durasi1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_durasi1.setText("Durasi");

        lbl_jenismobil1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_jenismobil1.setText("Jenis Mobil");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Total Biaya");

        cmbDurasi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6" }));
        cmbDurasi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDurasiItemStateChanged(evt);
            }
        });

        txtNamaPelanggan.setName(""); // NOI18N

        lbl_perhari1.setText("Hari");

        cmbJenisMobil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Innova", "Xenia", "APV", "Bemo", "Bajaj", "Mobil Rusak" }));

        lbl_totbiaya1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_totbiaya1.setText("Total Biaya");

        txtTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotal.setText("Total");

        btnSubmit.setBackground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnHome.setBackground(new java.awt.Color(255, 255, 255));
        btnHome.setText("Home");
        btnHome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        lbl_nohp2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_nohp2.setText("Supir");

        SprYa.setText("Ya");

        SprTdk.setText("Tidak");

        javax.swing.GroupLayout bg_white1Layout = new javax.swing.GroupLayout(bg_white1);
        bg_white1.setLayout(bg_white1Layout);
        bg_white1Layout.setHorizontalGroup(
            bg_white1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_white1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(bg_white1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pic_formkelolapemesanan1)
                    .addComponent(jLabel14)
                    .addGroup(bg_white1Layout.createSequentialGroup()
                        .addGap(750, 750, 750)
                        .addComponent(pic_people1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(bg_white1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(pic_kelolapemesanan1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_white1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bg_white1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_white1Layout.createSequentialGroup()
                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_white1Layout.createSequentialGroup()
                        .addGroup(bg_white1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_white1Layout.createSequentialGroup()
                                .addComponent(lbl_totbiaya1)
                                .addGap(108, 108, 108))
                            .addGroup(bg_white1Layout.createSequentialGroup()
                                .addGroup(bg_white1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_nmpelanggan1)
                                    .addComponent(lbl_noktp1)
                                    .addComponent(lbl_nohp1)
                                    .addComponent(lbl_durasi1)
                                    .addComponent(lbl_jenismobil1)
                                    .addComponent(lbl_nohp2))
                                .addGap(68, 68, 68)))
                        .addGroup(bg_white1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbJenisMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bg_white1Layout.createSequentialGroup()
                                .addComponent(cmbDurasi, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_perhari1))
                            .addComponent(txtNoHp, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNamaPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNoKtp, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotal)
                            .addGroup(bg_white1Layout.createSequentialGroup()
                                .addComponent(SprYa)
                                .addGap(18, 18, 18)
                                .addComponent(SprTdk)))
                        .addGap(117, 117, 117)))
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
        );
        bg_white1Layout.setVerticalGroup(
            bg_white1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_white1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(pic_kelolapemesanan1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pic_formkelolapemesanan1)
                .addGap(18, 18, 18)
                .addGroup(bg_white1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bg_white1Layout.createSequentialGroup()
                        .addGroup(bg_white1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nmpelanggan1)
                            .addComponent(txtNamaPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(bg_white1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bg_white1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(pic_people1))
                            .addGroup(bg_white1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(bg_white1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNoKtp, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_noktp1))))
                        .addGap(18, 18, 18)
                        .addGroup(bg_white1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNoHp, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_nohp1))
                        .addGap(18, 18, 18)
                        .addComponent(lbl_nohp2))
                    .addGroup(bg_white1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SprYa)
                        .addComponent(SprTdk)))
                .addGroup(bg_white1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_white1Layout.createSequentialGroup()
                        .addGroup(bg_white1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bg_white1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(lbl_durasi1))
                            .addGroup(bg_white1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(lbl_perhari1)))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_white1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(cmbDurasi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(bg_white1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_jenismobil1)
                    .addComponent(cmbJenisMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(bg_white1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg_white1Layout.createSequentialGroup()
                        .addGap(422, 422, 422)
                        .addComponent(jLabel14))
                    .addGroup(bg_white1Layout.createSequentialGroup()
                        .addGroup(bg_white1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotal)
                            .addComponent(lbl_totbiaya1))
                        .addGap(7, 7, 7)
                        .addGroup(bg_white1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bg_white1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bg_white1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbx_durasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbx_durasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbx_durasiActionPerformed

    private void txt_noktpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_noktpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_noktpActionPerformed

    private void cmbx_jenismobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbx_jenismobilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbx_jenismobilActionPerformed

    private void txt_noktp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_noktp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_noktp1ActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Home a = new Home();
        a.show();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        String nama = txtNamaPelanggan.getText();
        String noKtp = txtNoKtp.getText();
        String noHp = txtNoHp.getText();
        Pemesan p = new Pemesan();
        App app = new App();

        p.setNamaPemesan(nama);
        p.setNoKtp(noKtp);
        p.setNoTelpPemesan(noHp);

        ConMobil cm = new ConMobil();
        ConPemesan cp = new ConPemesan();
        ConSupir cs = new ConSupir();
        String plat = cm.getMobilSQL(cmbJenisMobil.getSelectedItem().toString()).get(0).getPlat();
        try {
            app.setDaftar(cm.getMobilSQL(cmbJenisMobil.getSelectedItem().toString()).get(0).getPlat());
            app.saveData();
        } catch (IOException ex) {
            Logger.getLogger(KelolaPemesanan.class.getName()).log(Level.SEVERE, null, ex);
        }
        Integer idSpr = 0;
        if(SprYa.isSelected()){
            idSpr = cs.getSupirSQL().get(0).getIdSupir();
            cs.updateStatSupir(idSpr);
        }else if(SprTdk.isSelected()){
            idSpr = 0;
        }

        cp.insertPemesanSQL(p, plat, idSpr);
        cm.updateStatMobil(plat);
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void cmbDurasiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDurasiItemStateChanged
        // TODO add your handling code here:
        ConMobil cm = new ConMobil();
        int an = (cmbDurasi.getSelectedIndex()+1)*  cm.getMobilSQL(cmbJenisMobil.getSelectedItem().toString()).get(0).getHarga();
        txtTotal.setText(Integer.toString(an));
    }//GEN-LAST:event_cmbDurasiItemStateChanged

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
            java.util.logging.Logger.getLogger(KelolaPemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KelolaPemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KelolaPemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KelolaPemesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KelolaPemesanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton SprTdk;
    private javax.swing.JRadioButton SprYa;
    private javax.swing.JPanel bg_white;
    private javax.swing.JPanel bg_white1;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_submit;
    private javax.swing.JComboBox cmbDurasi;
    private javax.swing.JComboBox cmbJenisMobil;
    private javax.swing.JComboBox cmbx_durasi;
    private javax.swing.JComboBox cmbx_jenismobil;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel lbl_durasi;
    private javax.swing.JLabel lbl_durasi1;
    private javax.swing.JLabel lbl_jenismobil;
    private javax.swing.JLabel lbl_jenismobil1;
    private javax.swing.JLabel lbl_nmpelanggan;
    private javax.swing.JLabel lbl_nmpelanggan1;
    private javax.swing.JLabel lbl_nohp;
    private javax.swing.JLabel lbl_nohp1;
    private javax.swing.JLabel lbl_nohp2;
    private javax.swing.JLabel lbl_noktp;
    private javax.swing.JLabel lbl_noktp1;
    private javax.swing.JLabel lbl_perhari;
    private javax.swing.JLabel lbl_perhari1;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JLabel lbl_totbiaya;
    private javax.swing.JLabel lbl_totbiaya1;
    private javax.swing.JLabel pic_formkelolapemesanan;
    private javax.swing.JLabel pic_formkelolapemesanan1;
    private javax.swing.JLabel pic_kelolapemesanan;
    private javax.swing.JLabel pic_kelolapemesanan1;
    private javax.swing.JLabel pic_people;
    private javax.swing.JLabel pic_people1;
    private javax.swing.JTextField txtNamaPelanggan;
    private javax.swing.JTextField txtNoHp;
    private javax.swing.JTextField txtNoKtp;
    private javax.swing.JLabel txtTotal;
    private javax.swing.JTextField txt_nmpelanggan;
    private javax.swing.JTextField txt_noktp;
    private javax.swing.JTextField txt_noktp1;
    // End of variables declaration//GEN-END:variables
}
