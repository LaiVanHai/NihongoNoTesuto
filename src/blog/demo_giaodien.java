/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blog;

import static blog.Main.rand;
import java.awt.Dimension;
import java.awt.Graphics;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

/**
 *
 * @author haiyka
 */
public class demo_giaodien extends javax.swing.JFrame {

    /**
     * Creates new form demo_giaodien
     */
    ButtonGroup group = new ButtonGroup();
    String dapan = " ";
    String cauhoi, kanji;
    int tong = 0, dung = 0;

    public demo_giaodien() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jComboBox1 = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel(){

            ImageIcon icon = new ImageIcon("C:\\Users\\haiyka\\Documents\\NetBeansProjects\\DatabaseDemo\\src\\blog\\pic\\manhinh1.png");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        jLabel1 = new javax.swing.JLabel();
        txt_cau_hoi = new javax.swing.JTextField();
        dap_an1 = new javax.swing.JRadioButton();
        dap_an2 = new javax.swing.JRadioButton();
        dap_an3 = new javax.swing.JRadioButton();
        dap_an4 = new javax.swing.JRadioButton();
        tra_loi = new javax.swing.JButton(){
            ImageIcon icon = new ImageIcon("C:\\Users\\haiyka\\Documents\\NetBeansProjects\\DatabaseDemo\\src\\blog\\pic\\tra_loi.png");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        btn_batdau = new javax.swing.JButton(){
            ImageIcon icon = new ImageIcon("C:\\Users\\haiyka\\Documents\\NetBeansProjects\\DatabaseDemo\\src\\blog\\pic\\bat_dau.png");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        jLabel2 = new javax.swing.JLabel();
        ketqua = new javax.swing.JTextField();
        ht_ketqua = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_cau_hoi.setEditable(false);
        txt_cau_hoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cau_hoiActionPerformed(evt);
            }
        });

        dap_an1.setFont(new java.awt.Font("UTM God's Word", 0, 12)); // NOI18N
        dap_an1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dap_an1ActionPerformed(evt);
            }
        });

        dap_an2.setFont(new java.awt.Font("UTM God's Word", 0, 12)); // NOI18N
        dap_an2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dap_an2ActionPerformed(evt);
            }
        });

        dap_an3.setFont(new java.awt.Font("UTM God's Word", 0, 12)); // NOI18N
        dap_an3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dap_an3ActionPerformed(evt);
            }
        });

        dap_an4.setFont(new java.awt.Font("UTM God's Word", 0, 12)); // NOI18N
        dap_an4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dap_an4ActionPerformed(evt);
            }
        });

        tra_loi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blog/pic/tra_loi.png"))); // NOI18N
        tra_loi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tra_loiActionPerformed(evt);
            }
        });

        btn_batdau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blog/pic/bat_dau.png"))); // NOI18N
        btn_batdau.setSelected(true);
        btn_batdau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batdauActionPerformed(evt);
            }
        });

        ketqua.setEditable(false);
        ketqua.setCaretColor(new java.awt.Color(0, 255, 255));
        ketqua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ketquaActionPerformed(evt);
            }
        });

        ht_ketqua.setForeground(new java.awt.Color(255, 255, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_batdau, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ketqua, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(txt_cau_hoi, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(dap_an4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                                .addComponent(dap_an3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dap_an2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dap_an1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(ht_ketqua, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(tra_loi, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(ketqua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_batdau, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cau_hoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(dap_an1)
                .addGap(18, 18, 18)
                .addComponent(dap_an2)
                .addGap(18, 18, 18)
                .addComponent(dap_an3)
                .addGap(18, 18, 18)
                .addComponent(dap_an4)
                .addGap(10, 10, 10)
                .addComponent(ht_ketqua, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tra_loi)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_cau_hoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cau_hoiActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_txt_cau_hoiActionPerformed

    private void dap_an3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dap_an3ActionPerformed
        // TODO add your handling code here
        group.add(dap_an3);

    }//GEN-LAST:event_dap_an3ActionPerformed

    private void dap_an1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dap_an1ActionPerformed
        // TODO add your handling code here:
        group.add(dap_an1);
    }//GEN-LAST:event_dap_an1ActionPerformed

    private void dap_an4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dap_an4ActionPerformed
        // TODO add your handling code here:
        group.add(dap_an4);

    }//GEN-LAST:event_dap_an4ActionPerformed

    private void btn_batdauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batdauActionPerformed
        // TODO add your handling code here:

        String[] mangda = new String[4];
        String tgian;
        int tg;
        int dem = 0, snn;
        try {
            tong++;
            ketqua.setText(dung + "/" + tong);
            Main db = new Main();
            db.connect();
            //System.out.println(db.executeUpdate() + "row");
            String sqlCommand = "Select count(stt) from htmt_n5";
            ResultSet rs = db.retrieveData(sqlCommand);
            while (rs.next()) {
                dem = rs.getInt(1);
            }
            snn = rand(1, dem);
            String strNumber = String.format("%d", snn);
            sqlCommand = "Select * from htmt_n5 where stt=" + strNumber;
            rs = db.retrieveData(sqlCommand);
            while (rs.next()) {
                //  System.out.print("Chọn đáp án đúng: "+ rs.getString(2).trim() + "(" + rs.getString(3).trim()+ "):\n");
                // txt_cau_hoi.setText(rs.getString(2).trim() + "   (" + rs.getString(3).trim()+ ")");
                if (rs.getString(3) != null) {
                    txt_cau_hoi.setText(rs.getString(2).trim() + "   (" + rs.getString(3).trim() + ")");
                } else {
                    txt_cau_hoi.setText(rs.getString(2));
                }
                cauhoi = rs.getString(2);
                //txt_cau_hoi.setText(cauhoi);
                kanji = rs.getString(3);
                dapan = rs.getString(4);
                mangda[0] = dapan;

            }

            strNumber = String.format("%d", rand(1, dem));
            sqlCommand = "Select vn from htmt_n5 where stt=" + strNumber;
            rs = db.retrieveData(sqlCommand);
            while (rs.next()) {
                mangda[1] = rs.getString(1);
            }

            strNumber = String.format("%d", rand(1, dem));
            sqlCommand = "Select vn from htmt_n5 where stt=" + strNumber;
            rs = db.retrieveData(sqlCommand);
            while (rs.next()) {
                mangda[2] = rs.getString(1);
            }

            strNumber = String.format("%d", rand(1, dem));
            sqlCommand = "Select vn from htmt_n5 where stt=" + strNumber;
            rs = db.retrieveData(sqlCommand);
            while (rs.next()) {
                mangda[3] = rs.getString(1);
            }

            // System.out.println("Chọn đáp án đúng: " + cauhoi);
            tg = rand(0, 3);
            tgian = mangda[tg];
            mangda[tg] = mangda[0];
            mangda[0] = tgian;

            tg = rand(0, 3);
            tgian = mangda[tg];
            mangda[tg] = mangda[0];
            mangda[0] = tgian;

            tg = rand(0, 3);
            tgian = mangda[tg];
            mangda[tg] = mangda[0];
            mangda[0] = tgian;
            dap_an1.setText(mangda[0]);
            dap_an2.setText(mangda[1]);
            dap_an3.setText(mangda[2]);
            dap_an4.setText(mangda[3]);

        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_batdauActionPerformed

    private void tra_loiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tra_loiActionPerformed
        // TODO add your handling code here:
        String xau = null;
        if (dap_an1.isSelected()) {

            xau = dap_an1.getText();

        }

        if (dap_an2.isSelected()) {

            xau = dap_an2.getText();

        }

        if (dap_an3.isSelected()) {

            xau = dap_an3.getText();
        }

        if (dap_an4.isSelected()) {

            xau = dap_an4.getText();
        }
        if (xau == null) {
            ht_ketqua.setText("Bạn vui lòng chọn đáp án");
        } else {
            if (xau == dapan) {
                //JOptionPane.showMessageDialog(null,"Bạn đã trả lời đúng.");
                ht_ketqua.setText("Bạn đã trả lời đúng.");
                dung++;
            } else {
                // JOptionPane.showMessageDialog(null,"Bạn đã trả lời sai - " + cauhoi.trim()+" : "+dapan);
                if (kanji != null) {
                    ht_ketqua.setText("Bạn đã trả lời sai - " + cauhoi.trim() + "(" + kanji.trim() + ") : " + dapan);
                } else {
                    ht_ketqua.setText("Bạn đã trả lời sai - " + cauhoi.trim() + " : " + dapan);    
            }
        }
        }
        ketqua.setText(dung + "/" + tong);

        //---------------------------------------------------------
        String[] mangda = new String[4];
        String tgian;
        int tg;
        int dem = 0, snn;
        try {
            tong++;
            ketqua.setText(dung + "/" + tong);
            Main db = new Main();
            db.connect();
            //System.out.println(db.executeUpdate() + "row");
            String sqlCommand = "Select count(stt) from htmt_n5";
            ResultSet rs = db.retrieveData(sqlCommand);
            while (rs.next()) {
                dem = rs.getInt(1);
            }
            snn = rand(1, dem);
            String strNumber = String.format("%d", snn);
            sqlCommand = "Select * from htmt_n5 where stt=" + strNumber;
            rs = db.retrieveData(sqlCommand);
            while (rs.next()) {
                //  System.out.print("Chọn đáp án đúng: "+ rs.getString(2).trim() + "(" + rs.getString(3).trim()+ "):\n");
                //txt_cau_hoi.setText(rs.getString(2).trim() + "   (" + rs.getString(3).trim()+ ")");
                if (rs.getString(3) != null) {
                    txt_cau_hoi.setText(rs.getString(2).trim() + "   (" + rs.getString(3).trim() + ")");
                } else {
                    txt_cau_hoi.setText(rs.getString(2));
                }
                cauhoi = rs.getString(2);
                //txt_cau_hoi.setText(cauhoi);
                kanji = rs.getString(3);
                dapan = rs.getString(4);
                mangda[0] = dapan;

            }

            strNumber = String.format("%d", rand(1, dem));
            sqlCommand = "Select vn from htmt_n5 where stt=" + strNumber;
            rs = db.retrieveData(sqlCommand);
            while (rs.next()) {
                mangda[1] = rs.getString(1);
            }

            strNumber = String.format("%d", rand(1, dem));
            sqlCommand = "Select vn from htmt_n5 where stt=" + strNumber;
            rs = db.retrieveData(sqlCommand);
            while (rs.next()) {
                mangda[2] = rs.getString(1);
            }

            strNumber = String.format("%d", rand(1, dem));
            sqlCommand = "Select vn from htmt_n5 where stt=" + strNumber;
            rs = db.retrieveData(sqlCommand);
            while (rs.next()) {
                mangda[3] = rs.getString(1);
            }

            // System.out.println("Chọn đáp án đúng: " + cauhoi);
            tg = rand(0, 3);
            tgian = mangda[tg];
            mangda[tg] = mangda[0];
            mangda[0] = tgian;

            tg = rand(0, 3);
            tgian = mangda[tg];
            mangda[tg] = mangda[0];
            mangda[0] = tgian;

            tg = rand(0, 3);
            tgian = mangda[tg];
            mangda[tg] = mangda[0];
            mangda[0] = tgian;
            dap_an1.setText(mangda[0]);
            dap_an2.setText(mangda[1]);
            dap_an3.setText(mangda[2]);
            dap_an4.setText(mangda[3]);

        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        //---------------------------------------------------------
    }//GEN-LAST:event_tra_loiActionPerformed

    private void dap_an2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dap_an2ActionPerformed
        // TODO add your handling code here:
        group.add(dap_an2);

    }//GEN-LAST:event_dap_an2ActionPerformed

    private void ketquaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ketquaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ketquaActionPerformed

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
            java.util.logging.Logger.getLogger(demo_giaodien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(demo_giaodien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(demo_giaodien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(demo_giaodien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new demo_giaodien().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batdau;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton dap_an1;
    private javax.swing.JRadioButton dap_an2;
    private javax.swing.JRadioButton dap_an3;
    private javax.swing.JRadioButton dap_an4;
    private javax.swing.JLabel ht_ketqua;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField ketqua;
    private javax.swing.JButton tra_loi;
    private javax.swing.JTextField txt_cau_hoi;
    // End of variables declaration//GEN-END:variables
}
