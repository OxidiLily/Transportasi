/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TampilanProjek;

import static TampilanProjek.ConnectionDB.conn;
import static TampilanProjek.ConnectionDB.jdbc_Driver;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author My MSI
 */
public class UpdateForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form UpdateForm
     */
    String sql = "Select * From kendaraan";
    public UpdateForm() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        namaTxt = new javax.swing.JTextField();
        kendaraanTxt = new javax.swing.JTextField();
        merkTxt = new javax.swing.JTextField();
        tujuanTxt = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        stjbox = new javax.swing.JCheckBox();
        hapusBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        menuUtamaBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setTitle("UPDATE DATA KENDARAAN");

        jLabel1.setText("Nama Pemilik");

        jLabel2.setText("Nama Kendaraan");

        jLabel3.setText("Merk/Brand Kendaraan");

        jLabel4.setText("Tujuan");

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        stjbox.setText("Setuju");

        hapusBtn.setText("Hapus");
        hapusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusBtnActionPerformed(evt);
            }
        });

        jLabel5.setText("Use ID");

        menuUtamaBtn.setText("Kembali Ketampilan");
        menuUtamaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUtamaBtnActionPerformed(evt);
            }
        });

        jLabel6.setText("*");

        jLabel7.setText("*");

        jLabel8.setText("*");

        jLabel9.setText("*");

        jLabel10.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(132, 132, 132)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kendaraanTxt)
                            .addComponent(namaTxt)
                            .addComponent(merkTxt)
                            .addComponent(tujuanTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(user))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(stjbox)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(179, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(hapusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(menuUtamaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(namaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(kendaraanTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(merkTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tujuanTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stjbox)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBtn)
                    .addComponent(hapusBtn))
                .addGap(18, 18, 18)
                .addComponent(menuUtamaBtn)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hapusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusBtnActionPerformed
        namaTxt.setText("");
        kendaraanTxt.setText("");
        merkTxt.setText("");
        tujuanTxt.setText("");
        user.setText("");
        stjbox.setSelected(false);
    }//GEN-LAST:event_hapusBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        if(stjbox.isSelected() == false){
            JOptionPane.showMessageDialog(null, "Centang Setuju untuk simpan Data","Error",JOptionPane.ERROR_MESSAGE);
            
        }else if(user.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Masukkan ID User untuk di Edit","Error",JOptionPane.ERROR_MESSAGE);
        
        }else if(namaTxt.getText().isEmpty() && kendaraanTxt.getText().isEmpty() && merkTxt.getText().isEmpty() && tujuanTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Masukkan Data yang Benar","Error",JOptionPane.ERROR_MESSAGE);
        }else{
            String nama = namaTxt.getText();
            String kendaraan = kendaraanTxt.getText();
            String merk = merkTxt.getText();
            String tujuan = tujuanTxt.getText();
            String id = user.getText();
            
            String SQL = "UPDATE kendaraan SET Nama_Pemilik = '"+nama+"', Nama_Kendaraan = '"+kendaraan+"', Nama_Merk = '"+merk+"', Tujuan = '"+tujuan+"' WHERE id_User = '"+id+"' ";
            
            //try pernyataan memungkinkan untuk menentukan blok kode yang akan diuji untuk kesalahan ketika sedang dijalankan.
            //catch pernyataan memungkinkan untuk menentukan blok kode yang akan dieksekusi, jika terjadi kesalahan dalam blok try.
    
            try {
                Class.forName(jdbc_Driver);
            }  catch (Exception e) {
                JOptionPane.showMessageDialog(null,"JDBC Driver Gagal","JDBC Driver Error",JOptionPane.WARNING_MESSAGE);
            }

            Statement stmt = null;
            Connection con = null;

            //Membuat Koneksi ke database
            try {
                stmt = (Statement) conn.createStatement();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane,"Koneksi Gagal","Connection Error",JOptionPane.WARNING_MESSAGE);
            }

            //Menjalankan SQL untuk update Catatan
            try {
                //untuk perintah INSERT, UPDATE, DELETE methode eksekusi SQL yang digunakan adalah executeUpdate().
                stmt.executeUpdate(SQL);
                //Kata untuk SQL bila berhasil
                JOptionPane.showMessageDialog(rootPane,"Data Berhasil di Ubah","Update Successful",JOptionPane.WARNING_MESSAGE);
            } catch (Exception e) {
                //Kata untuk SQL bila gagal
                JOptionPane.showMessageDialog(rootPane,"Data Gagal di Ubah","Warning",JOptionPane.WARNING_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_updateBtnActionPerformed

    private void menuUtamaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUtamaBtnActionPerformed
        DataForm tampilan = new DataForm();
        tampilan.setVisible(true);
        this.getDesktopPane().add(tampilan);
        this.dispose();
    }//GEN-LAST:event_menuUtamaBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hapusBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField kendaraanTxt;
    private javax.swing.JButton menuUtamaBtn;
    private javax.swing.JTextField merkTxt;
    private javax.swing.JTextField namaTxt;
    private javax.swing.JCheckBox stjbox;
    private javax.swing.JTextField tujuanTxt;
    private javax.swing.JButton updateBtn;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
