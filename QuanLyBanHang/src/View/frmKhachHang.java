package View;

import Controller.KhachHangDAO;
import Controller.Test;
import Model.KhachHang;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmKhachHang extends javax.swing.JPanel {

    private DefaultTableModel defaultTableModel;
    KhachHang kh;
    private ArrayList<KhachHang> listKH = new ArrayList<>();
    Test test = new Test();

    public frmKhachHang() {
        initComponents();
        listKH = new KhachHangDAO().getAllKhachHang();
        defaultTableModel = (DefaultTableModel) tbl_khachhang.getModel();
        getData(listKH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_maKhachHang = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_hoTenKH = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_emailKH = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_gioiTinhKH = new javax.swing.JComboBox<>();
        txt_trangThaiKH = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txt_sdtKH = new javax.swing.JTextField();
        txt_diaChiKH = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btn_them = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_khachhang = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnTimKiem = new javax.swing.JButton();
        txt_timkiem = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/store-icon.png"))); // NOI18N
        jLabel1.setText("SIÊU THỊ MINI");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("|");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 80, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 50));

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Mã KH:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        txt_maKhachHang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_maKhachHangKeyPressed(evt);
            }
        });
        jPanel3.add(txt_maKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 220, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Họ tên:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));
        jPanel3.add(txt_hoTenKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 220, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Email:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        jPanel3.add(txt_emailKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 220, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("SĐT:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Địa chỉ:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Trạng thái:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, 30));

        txt_gioiTinhKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_gioiTinhKH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        jPanel3.add(txt_gioiTinhKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 140, 30));

        txt_trangThaiKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_trangThaiKH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hoạt động", "Đã khóa" }));
        jPanel3.add(txt_trangThaiKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 140, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Giới tính:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, 30));
        jPanel3.add(txt_sdtKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 220, 30));

        txt_diaChiKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_diaChiKHActionPerformed(evt);
            }
        });
        jPanel3.add(txt_diaChiKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 220, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel4.setText("Xin mời nhập thông tin!");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, 30));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bảng điều khiển", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_them.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Actions-list-add-user-icon.png"))); // NOI18N
        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });
        jPanel4.add(btn_them, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 120, 30));

        btn_sua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit-icon.png"))); // NOI18N
        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });
        jPanel4.add(btn_sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 99, -1));

        btn_xoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Windows-Close-Program-icon.png"))); // NOI18N
        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });
        jPanel4.add(btn_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 100, -1));

        btn_reset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Reload-icon.png"))); // NOI18N
        btn_reset.setText("Cancel");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        jPanel4.add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 120, 30));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 310, 120));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 350, 590));

        tbl_khachhang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_khachhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_khachhangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_khachhang);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 1010, 510));

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTimKiem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Search-icon.png"))); // NOI18N
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });
        jPanel2.add(btnTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 50, 30));

        txt_timkiem.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_timkiemCaretUpdate(evt);
            }
        });
        jPanel2.add(txt_timkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 340, 30));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 500, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wp3152222.jpg"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1920, 900));
    }// </editor-fold>//GEN-END:initComponents

    private void txt_maKhachHangKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_maKhachHangKeyPressed

    }//GEN-LAST:event_txt_maKhachHangKeyPressed

    private void txt_diaChiKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_diaChiKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_diaChiKHActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        String maKH = txt_maKhachHang.getText();
        String tenKH = txt_hoTenKH.getText();
        String email = txt_emailKH.getText();
        String sdt = txt_sdtKH.getText();
        String diaChi = txt_diaChiKH.getText();
        String gioiTinh;
        if (txt_gioiTinhKH.getSelectedItem().equals("Nam")) {
            gioiTinh = "Nam";
        } else if (txt_gioiTinhKH.getSelectedItem().equals("Nữ")) {
            gioiTinh = "Nữ";
        } else {
            gioiTinh = "Khác";
        }
        int trangThai;
        if (txt_trangThaiKH.getSelectedItem().toString().equals("Hoạt động")) {
            trangThai = 1;
        } else {
            trangThai = 0;
        }

        if (maKH.equals("") || email.equals("") || tenKH.equals("") || diaChi.equals("") || sdt.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhâp đủ thông tin!");
            return;
        }
        if (!test.kiemTraTen(tenKH)) {
            JOptionPane.showMessageDialog(this, "Tên không được có số!");
            return;
        } else if (!test.kiemTraEmail(email)) {
            JOptionPane.showMessageDialog(this, "Lỗi đinh dạng email!");
            return;
        } else if (!test.kiemTraSDT(sdt)) {
            JOptionPane.showMessageDialog(this, "Lỗi định dạng số điện thoại!");
            return;
        } else {
            kh = new KhachHang(maKH, tenKH, sdt, email, diaChi, gioiTinh, trangThai);

            try {
                if (new KhachHangDAO().addKhachHang(kh) != 0) {
                    listKH.add(kh);
                    getData(listKH);
                    JOptionPane.showMessageDialog(this, "Thêm khách hàng thành công!");
                    reset();
                }
            } catch (HeadlessException e) {
                System.out.println(e.toString());
            }

        }
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        String tenKH = txt_hoTenKH.getText();
        String email = txt_emailKH.getText();
        String sdt = txt_sdtKH.getText();
        String diaChi = txt_diaChiKH.getText();
        String gioiTinh;
        if (txt_gioiTinhKH.getSelectedItem().equals("Nam")) {
            gioiTinh = "Nam";
        } else if (txt_gioiTinhKH.getSelectedItem().equals("Nữ")) {
            gioiTinh = "Nữ";
        } else {
            gioiTinh = "Khác";
        }

        int trangThai;
        if (txt_trangThaiKH.getSelectedItem().toString().equals("Hoạt động")) {
            trangThai = 1;
        } else {
            trangThai = 0;
        }

        if (email.equals("") || tenKH.equals("") || diaChi.equals("") || sdt.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhâp đủ thông tin!");
            return;

        } else if (!test.kiemTraTen(tenKH)) {
            JOptionPane.showMessageDialog(this, "Tên không được có số!");
            return;
        } else if (!test.kiemTraEmail(email)) {
            JOptionPane.showMessageDialog(this, "Lỗi đinh dạng email!");
            return;
        } else if (!test.kiemTraSDT(sdt)) {
            JOptionPane.showMessageDialog(this, "Lỗi định dạng số điện thoại!");
            return;
        }
        
        kh = new KhachHang(txt_maKhachHang.getText(), tenKH, sdt, email, diaChi, gioiTinh, trangThai);
        try {
            if (new KhachHangDAO().updateKhachHang(kh) != 0) {
                listKH.set(index, kh);
                getData(listKH);
                JOptionPane.showMessageDialog(this, "Sửa khách hàng thành công!");
                reset();
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        Integer confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa không ?", "XÓA", 2, 2);
        if (confirm == JOptionPane.YES_OPTION) {
            if (listKH.remove(kh)) {
                new KhachHangDAO().deleteKhachHang(kh);
                getData(listKH);
                JOptionPane.showMessageDialog(this, "Xóa thành công khách hàng " + kh.getHoTen());
            } else {
                JOptionPane.showMessageDialog(this, "Xóa thất bại");
            }
        }
        reset();
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        reset();
    }//GEN-LAST:event_btn_resetActionPerformed

    int index = -1;
    private void tbl_khachhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_khachhangMouseClicked
        int row = tbl_khachhang.getSelectedRow();
        String maNV = tbl_khachhang.getValueAt(row, 0).toString();

        for (int i = 0; i < listKH.size(); i++) {
            if (maNV.equalsIgnoreCase(listKH.get(i).getMaKhachHang())) {
                kh = listKH.get(i);
                index = i;
                break;
            }
        }
        txt_maKhachHang.setEnabled(false);
        txt_maKhachHang.setText(kh.getMaKhachHang());
        txt_hoTenKH.setText(kh.getHoTen());
        txt_emailKH.setText(kh.getEmail());
        txt_sdtKH.setText(kh.getSoDienThoai());
        txt_diaChiKH.setText(kh.getDiaChi());

        if (kh.getGioiTinh().trim().equals("Nam")) {
            txt_gioiTinhKH.setSelectedItem("Nam");
        } else if (kh.getGioiTinh().trim().equals("Nữ")) {
            txt_gioiTinhKH.setSelectedItem("Nữ");
        }

        if (kh.getTrangThai() == 1) {
            txt_trangThaiKH.setSelectedItem("Hoạt động");
        } else {
            txt_trangThaiKH.setSelectedItem("Đã khóa");
        }
        btn_them.setEnabled(false);
    }//GEN-LAST:event_tbl_khachhangMouseClicked

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        String timKiem = txt_timkiem.getText();

        if (timKiem.equals("")) {
            getData(listKH);
        } else {
            ArrayList<KhachHang> listTimKiem = new ArrayList<>();
            for (int i = 0; i < listKH.size(); i++) {
                if (listKH.get(i).getMaKhachHang().contains(timKiem) || listKH.get(i).getSoDienThoai().contains(timKiem) || listKH.get(i).getHoTen().contains(timKiem)) {
                    listTimKiem.add(listKH.get(i));
                }
            }
            getData(listTimKiem);
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void txt_timkiemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_timkiemCaretUpdate
        String timKiem = txt_timkiem.getText();

        if (timKiem.equals("")) {
            getData(listKH);
        }
    }//GEN-LAST:event_txt_timkiemCaretUpdate

    public void reset() {
        txt_emailKH.setText("");
        txt_maKhachHang.setText("");
        txt_hoTenKH.setText("");
        txt_diaChiKH.setText("");
        txt_sdtKH.setText("");
        txt_trangThaiKH.setSelectedIndex(0);
        txt_gioiTinhKH.setSelectedIndex(0);
        btn_them.setEnabled(true);
        btn_sua.setEnabled(true);
        btn_xoa.setEnabled(true);
        txt_maKhachHang.setEnabled(true);
        getData(listKH);
    }

    //Đưa ra danh sách khách hàng từ mảng listKH
    private void getData(ArrayList<KhachHang> listKH) {
        defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn("Mã KH");
        defaultTableModel.addColumn("Họ tên ");
        defaultTableModel.addColumn("SĐT");
        defaultTableModel.addColumn("Email");
        defaultTableModel.addColumn("Giới tính");
        defaultTableModel.addColumn("Nhóm");
        defaultTableModel.addColumn("Trạng Thái");

        for (KhachHang kh : listKH) {
            defaultTableModel.addRow(new Object[]{
                kh.getMaKhachHang(), kh.getHoTen(), kh.getSoDienThoai(), kh.getEmail(),
                kh.getDiaChi(), kh.getGioiTinh(),
                (kh.getTrangThai() == 1 ? "Hoạt động" : "Đã khóa")
            });
        }

        tbl_khachhang.setModel(defaultTableModel);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_khachhang;
    private javax.swing.JTextField txt_diaChiKH;
    private javax.swing.JTextField txt_emailKH;
    private javax.swing.JComboBox<String> txt_gioiTinhKH;
    private javax.swing.JTextField txt_hoTenKH;
    private javax.swing.JTextField txt_maKhachHang;
    private javax.swing.JTextField txt_sdtKH;
    private javax.swing.JTextField txt_timkiem;
    private javax.swing.JComboBox<String> txt_trangThaiKH;
    // End of variables declaration//GEN-END:variables
}
