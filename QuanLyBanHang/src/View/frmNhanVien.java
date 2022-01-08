package View;

import Controller.NhanVienDAO;
import Controller.Test;
import Model.NhanVien;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmNhanVien extends javax.swing.JPanel {

    private DefaultTableModel defaultTableModel;
    NhanVien nv;
    public ArrayList<NhanVien> listNV = new ArrayList<>();
    Test test = new Test();

    public frmNhanVien() {
        initComponents();
        listNV = new NhanVienDAO().getAllNhanVien();
        defaultTableModel = (DefaultTableModel) tbl_nhanvien.getModel();
        getData(listNV);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_timKiem = new javax.swing.JButton();
        txt_timKiem = new javax.swing.JTextField();
        err = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_maNhanVien1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_hoTen1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_email1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_nhom = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_gioiTinh = new javax.swing.JComboBox<>();
        txt_trangThai = new javax.swing.JComboBox<>();
        txt_matkhau = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        txt_sdt1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btn_sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_them = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_nhanvien = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/store-icon.png"))); // NOI18N
        jLabel1.setText("SIÊU THỊ MINI");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("|");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 80, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1930, 50));

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_timKiem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_timKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Search-icon.png"))); // NOI18N
        btn_timKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timKiemActionPerformed(evt);
            }
        });
        jPanel2.add(btn_timKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 60, 30));

        txt_timKiem.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_timKiemCaretUpdate(evt);
            }
        });
        jPanel2.add(txt_timKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 400, 30));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, 530, 60));

        err.setBackground(new java.awt.Color(255, 153, 0));
        err.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        err.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Mã NV:");
        err.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 70, 30));
        err.add(txt_maNhanVien1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 220, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Họ tên:");
        err.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 80, 30));
        err.add(txt_hoTen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 220, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Email:");
        err.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 80, 30));
        err.add(txt_email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 220, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Nhóm:");
        err.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 70, 30));

        txt_nhom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_nhom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quản lý", "Nhân viên" }));
        err.add(txt_nhom, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 100, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("SĐT:");
        err.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 80, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Mật khẩu:");
        err.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 100, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Trạng thái:");
        err.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 100, 30));

        txt_gioiTinh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_gioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        err.add(txt_gioiTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 100, 30));

        txt_trangThai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_trangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hoạt động", "Đã khóa" }));
        err.add(txt_trangThai, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 100, 30));
        err.add(txt_matkhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 220, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Giới tính:");
        err.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 110, 30));
        err.add(txt_sdt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 220, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel3.setText("Xin mời nhập thông tin!");
        err.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bảng điều khiển", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_sua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit-icon.png"))); // NOI18N
        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });
        jPanel3.add(btn_sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, -1));

        btn_xoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Windows-Close-Program-icon.png"))); // NOI18N
        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });
        jPanel3.add(btn_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 120, -1));

        btn_them.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Actions-list-add-user-icon.png"))); // NOI18N
        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });
        jPanel3.add(btn_them, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 120, -1));

        btn_reset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Reload-icon.png"))); // NOI18N
        btn_reset.setText("Cancel");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        jPanel3.add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 120, -1));

        err.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 310, 120));

        add(err, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 360, 590));

        tbl_nhanvien.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_nhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_nhanvienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_nhanvien);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 1060, 490));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wp3152222.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1940, 900));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_timKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timKiemActionPerformed
        String timKiem = txt_timKiem.getText();
        
        if (timKiem.equals("")) {
            getData(listNV);
        } else {
            ArrayList<NhanVien> listTimKiem = new ArrayList<>();
            for (int i = 0; i < listNV.size(); i++) {
                if (listNV.get(i).getMaNhanVien().contains(timKiem) || listNV.get(i).getSoDienThoai().contains(timKiem) || listNV.get(i).getHoTen().contains(timKiem)) {
                    listTimKiem.add(listNV.get(i));
                }
            }
            getData(listTimKiem);
        }
    }//GEN-LAST:event_btn_timKiemActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        String tenNV = txt_hoTen1.getText();
        String email = txt_email1.getText();
        String sdt = txt_sdt1.getText();
        String gioiTinh;
        if (txt_gioiTinh.getSelectedItem().equals("Nam")) {
            gioiTinh = "Nam";
        } else if (txt_gioiTinh.getSelectedItem().equals("Nữ")) {
            gioiTinh = "Nữ";
        } else {
            gioiTinh = "Khác";
        }
        int nhom;
        if (txt_nhom.getSelectedItem().toString().equals("Quản lý")) {
            nhom = 1;
        } else {
            nhom = 0;
        }
        int trangThai;
        if (txt_trangThai.getSelectedItem().toString().equals("Hoạt động")) {
            trangThai = 1;
        } else {
            trangThai = 0;
        }

        if (email.equals("") || tenNV.equals("") || sdt.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhâp đủ thông tin!");
            return;
        } else if (!test.kiemTraTen(tenNV)) {
            JOptionPane.showMessageDialog(this, "Tên không được chứa số!");
            return;
        } else if (!test.kiemTraEmail(email)) {
            JOptionPane.showMessageDialog(this, "Lỗi đinh dạng email!");
            return;
        } else if (!test.kiemTraSDT(sdt)) {
            JOptionPane.showMessageDialog(this, "Lỗi định dạng số điện thoại!");
            return;
        } else {
            nv = new NhanVien(txt_maNhanVien1.getText(), tenNV, sdt, email, test.md5(txt_matkhau.getText()), gioiTinh, nhom, trangThai);
            try {
                if (new NhanVienDAO().updateNhanVien(nv) != 0) {
                    listNV.set(index, nv);
                    getData(listNV);
                    JOptionPane.showMessageDialog(this, "Sửa viên thành công!");
                    reset();
                }
            } catch (HeadlessException e) {
                System.out.println(e.toString());
            }
        }
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        Integer confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa không ?", "XÓA", 2, 2);
        if (confirm == JOptionPane.YES_OPTION) {
            if (new NhanVienDAO().deleteNhanVien(nv) != 0) {
                listNV.remove(nv);
                getData(listNV);
                JOptionPane.showMessageDialog(this, "Xóa thành công nhân viên " + nv.getHoTen());
            } else {
                JOptionPane.showMessageDialog(this, "Xóa thất bại");
            }
        }
        reset();
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        String maNV = txt_maNhanVien1.getText();
        String tenNV = txt_hoTen1.getText();
        String email = txt_email1.getText();
        String sdt = txt_sdt1.getText().trim();
        String matKhau = txt_matkhau.getText();

        String gioiTinh = "";
        if (txt_gioiTinh.getSelectedItem().equals("Nam")) {
            gioiTinh = "Nam";
        } else if (txt_gioiTinh.getSelectedItem().equals("Nữ")) {
            gioiTinh = "Nữ";
        }

        int nhom;
        if (txt_nhom.getSelectedItem().toString().equals("Quản lý")) {
            nhom = 1;
        } else {
            nhom = 0;
        }

        int trangThai;
        if (txt_trangThai.getSelectedItem().toString().equals("Hoạt động")) {
            trangThai = 1;
        } else {
            trangThai = 0;
        }

        if (maNV.equals("") || email.equals("") || tenNV.equals("") || matKhau.equals("") || sdt.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhâp đủ thông tin!");
            return;
        }

        for (int i = 0; i < listNV.size(); i++) {
            if (maNV.equals(listNV.get(i).getMaNhanVien())) {
                JOptionPane.showMessageDialog(this, "Mã nhân viên bị trùng, vui lòng nhập lại!");
                return;
            }
        }

        if (!test.kiemTraTen(tenNV)) {
            JOptionPane.showMessageDialog(this, "Tên không được chứa số!");
            return;
        } else if (!test.kiemTraEmail(email)) {
            JOptionPane.showMessageDialog(this, "Lỗi đinh dạng email!");
            return;
        } else if (!test.kiemTraSDT(sdt)) {
            JOptionPane.showMessageDialog(this, "Lỗi định dạng số điện thoại!");
            return;
        } else {
            nv = new NhanVien(maNV, tenNV, sdt, email, test.md5(matKhau), gioiTinh, nhom, trangThai);
            try {
                if (new NhanVienDAO().addNhanVien(nv) != 0) {
                    listNV.add(nv);
                    getData(listNV);
                    JOptionPane.showMessageDialog(this, "Thêm nhân viên thành công!");
                    reset();
                }
            } catch (HeadlessException e) {
                System.out.println(e.toString());
            }

        }
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        txt_email1.setText("");
        txt_maNhanVien1.setText("");
        txt_hoTen1.setText("");
        txt_matkhau.setText("");
        txt_sdt1.setText("");
        txt_trangThai.setSelectedIndex(0);
        txt_nhom.setSelectedIndex(0);
        txt_gioiTinh.setSelectedIndex(0);
        btn_them.setEnabled(true);
        btn_sua.setEnabled(true);
        btn_xoa.setEnabled(true);
        txt_maNhanVien1.setEnabled(true);
        txt_matkhau.setEnabled(true);
    }//GEN-LAST:event_btn_resetActionPerformed

    int index = -1;
    private void tbl_nhanvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_nhanvienMouseClicked
        int row = tbl_nhanvien.getSelectedRow();
        String maNV = tbl_nhanvien.getValueAt(row, 0).toString();

        for (int i = 0; i < listNV.size(); i++) {
            if (maNV.equalsIgnoreCase(listNV.get(i).getMaNhanVien())) {
                nv = listNV.get(i);
                index = i;
                break;
            }
        }
        txt_maNhanVien1.setEnabled(false);
        txt_maNhanVien1.setText(nv.getMaNhanVien());
        txt_hoTen1.setText(nv.getHoTen().trim());
        txt_email1.setText(nv.getEmail().trim());
        txt_sdt1.setText(nv.getSoDienThoai().trim());
        txt_matkhau.setText(nv.getMatKhau().trim());

        if (nv.getGioiTinh().trim().equals("Nam")) {
            txt_gioiTinh.setSelectedItem("Nam");
        } else if (nv.getGioiTinh().trim().equals("Nữ")) {
            txt_gioiTinh.setSelectedItem("Nữ");
        }

        if (nv.getNhom() == 1) {
            txt_nhom.setSelectedItem("Quản lý");
        } else {
            txt_nhom.setSelectedItem("Nhân viên");
        }

        if (nv.getTrangThai() == 1) {
            txt_trangThai.setSelectedItem("Hoạt động");
        } else {
            txt_trangThai.setSelectedItem("Đã khóa");
        }
        btn_them.setEnabled(false);
    }//GEN-LAST:event_tbl_nhanvienMouseClicked

    private void txt_timKiemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_timKiemCaretUpdate
        String timKiem = txt_timKiem.getText();

        if (timKiem.equals("")) {
            getData(listNV);
        }
    }//GEN-LAST:event_txt_timKiemCaretUpdate

    public void reset() {
        txt_email1.setText("");
        txt_maNhanVien1.setText("");
        txt_hoTen1.setText("");
        txt_matkhau.setText("");
        txt_sdt1.setText("");
        txt_trangThai.setSelectedIndex(0);
        txt_nhom.setSelectedIndex(0);
        txt_gioiTinh.setSelectedIndex(0);
        btn_them.setEnabled(true);
        btn_sua.setEnabled(true);
        btn_xoa.setEnabled(true);
        txt_maNhanVien1.setEnabled(true);
        txt_matkhau.setEnabled(true);
        getData(listNV);
    }

    //Lấy thông tin nhân viên từ listNV đưa ra table
    private void getData(ArrayList<NhanVien> listNV) {
        defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn("Mã NV");
        defaultTableModel.addColumn("Họ tên NV");
        defaultTableModel.addColumn("SĐT");
        defaultTableModel.addColumn("Email");
        defaultTableModel.addColumn("Giới tính");
        defaultTableModel.addColumn("Nhóm");
        defaultTableModel.addColumn("Trạng Thái");

        for (NhanVien nv : listNV) {
            defaultTableModel.addRow(new Object[]{
                nv.getMaNhanVien(), nv.getHoTen(), nv.getSoDienThoai(), nv.getEmail(),
                nv.getGioiTinh(), (nv.getNhom() == 1 ? "Quản lý" : "Nhân viên"),
                (nv.getTrangThai() == 1 ? "Hoạt động" : "Đã khóa")
            });
        }

        tbl_nhanvien.setModel(defaultTableModel);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_timKiem;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JPanel err;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_nhanvien;
    private javax.swing.JTextField txt_email1;
    private javax.swing.JComboBox<String> txt_gioiTinh;
    private javax.swing.JTextField txt_hoTen1;
    private javax.swing.JTextField txt_maNhanVien1;
    private javax.swing.JPasswordField txt_matkhau;
    private javax.swing.JComboBox<String> txt_nhom;
    private javax.swing.JTextField txt_sdt1;
    private javax.swing.JTextField txt_timKiem;
    private javax.swing.JComboBox<String> txt_trangThai;
    // End of variables declaration//GEN-END:variables
}
