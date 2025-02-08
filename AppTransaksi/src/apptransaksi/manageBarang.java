/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package apptransaksi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 * /**
 *
 * @author ACER
 */
public class manageBarang extends javax.swing.JFrame {

    private Connection conn;
    private int idProdukYangSedangDiedit = -1;

    /**
     * Creates new form manageBarang
     */
    public manageBarang() {
        conn = koneksi.getConnection();
        initComponents();
        loadDataBarang();

    }

    private void loadDataBarang() {
        DefaultTableModel model = (DefaultTableModel) tblBarang.getModel();
        model.setRowCount(0); // Clear existing data

        String query = "SELECT * FROM barang";
        try (PreparedStatement pstmt = conn.prepareStatement(query); ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                int idproduk = rs.getInt("idproduk");
                String nama_produk = rs.getString("nama_produk");
                double harga = rs.getDouble("harga");
                int stok = rs.getInt("stok");

                model.addRow(new Object[]{idproduk, nama_produk, harga, stok});
            }
        } catch (SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
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
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        namaBrg = new javax.swing.JTextField();
        hargaLb = new javax.swing.JTextField();
        stokLb = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBarang = new javax.swing.JTable();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("PENGELOLA BARANG ");

        jLabel4.setText("Stok");

        jLabel3.setText("Harga ");

        jLabel2.setText("Nama Barang");

        hargaLb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaLbActionPerformed(evt);
            }
        });

        btnSave.setText("Tambah");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        tblBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id Barang", "Nama Barang", "Harga", "Stok"
            }
        ));
        jScrollPane2.setViewportView(tblBarang);

        btnExit.setText("Kembali");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnExit)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(namaBrg)
                                    .addComponent(hargaLb)
                                    .addComponent(stokLb, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEdit)
                                    .addComponent(btnSave))))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(namaBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hargaLb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(stokLb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSave)
                        .addGap(22, 22, 22)
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit)
                .addGap(209, 209, 209))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hargaLbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaLbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargaLbActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // Jika tombol berfungsi sebagai "Edit"
        if (btnEdit.getText().equals("Edit")) {
            int selectedRow = tblBarang.getSelectedRow();
            if (selectedRow == -1) {
                javax.swing.JOptionPane.showMessageDialog(this, "Pilih data yang akan diedit!", "Peringatan", javax.swing.JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Ambil data dari tabel
            idProdukYangSedangDiedit = (int) tblBarang.getValueAt(selectedRow, 0);
            String nama = (String) tblBarang.getValueAt(selectedRow, 1);
            double harga = (double) tblBarang.getValueAt(selectedRow, 2);
            int stok = (int) tblBarang.getValueAt(selectedRow, 3);

            // Tampilkan data di TextField
            namaBrg.setText(nama);
            hargaLb.setText(String.valueOf(harga));
            stokLb.setText(String.valueOf(stok));

            // Ubah tombol Edit menjadi Simpan dan disable tombol Save
            btnEdit.setText("Simpan");
            btnSave.setEnabled(false);

        } else if (btnEdit.getText().equals("Simpan")) {
            // Jika tombol berfungsi sebagai "Simpan", simpan perubahan ke database
            if (idProdukYangSedangDiedit != -1) {
                String query = "UPDATE barang SET nama_produk = ?, harga = ?, stok = ? WHERE idproduk = ?";
                try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                    pstmt.setString(1, namaBrg.getText());
                    pstmt.setDouble(2, Double.parseDouble(hargaLb.getText()));
                    pstmt.setInt(3, Integer.parseInt(stokLb.getText()));
                    pstmt.setInt(4, idProdukYangSedangDiedit);
                    pstmt.executeUpdate();

                    javax.swing.JOptionPane.showMessageDialog(this, "Data berhasil diupdate!");

                    // Refresh data di tabel
                    loadDataBarang();

                    // Reset state
                    namaBrg.setText("");
                    hargaLb.setText("");
                    stokLb.setText("");
                    idProdukYangSedangDiedit = -1;

                    btnEdit.setText("Edit"); // Kembalikan tombol menjadi Edit
                    btnSave.setEnabled(true); // Aktifkan tombol Save kembali
                } catch (SQLException e) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                }
            }
        }     // TODO add your handling code here:
    }//GEN-LAST:event_btnEditActionPerformed


    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // Validasi input
        if (namaBrg.getText().isEmpty() || hargaLb.getText().isEmpty() || stokLb.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Peringatan", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            String nama = namaBrg.getText();
            double harga = Double.parseDouble(hargaLb.getText());
            int stok = Integer.parseInt(stokLb.getText());

            String query = "INSERT INTO barang (nama_produk, harga, stok) VALUES (?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(query)) {

                pstmt.setString(1, nama);
                pstmt.setDouble(2, harga);
                pstmt.setInt(3, stok);

                pstmt.executeUpdate();
                javax.swing.JOptionPane.showMessageDialog(this, "Data berhasil disimpan!");

                // Refresh data di tabel
                loadDataBarang();

                // Clear textbox
                namaBrg.setText("");
                hargaLb.setText("");
                stokLb.setText("");
            } catch (SQLException e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Harga dan stok harus berupa angka!", "Input Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }      // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        index addBarangForm = new index();
        addBarangForm.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(manageBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSave;
    private javax.swing.JTextField hargaLb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField namaBrg;
    private javax.swing.JTextField stokLb;
    private javax.swing.JTable tblBarang;
    // End of variables declaration//GEN-END:variables
}
