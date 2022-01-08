package View;

import Controller.SanPhamDAO;
import Model.SanPham;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmSanPham extends javax.swing.JPanel {

    private DefaultTableModel defaultTableModel;
    ArrayList<SanPham> listSP = new ArrayList<>();
    SanPham sp;
    DecimalFormat formatter = new DecimalFormat("###,###");
    public frmSanPham() {
        initComponents();
        listSP = new SanPhamDAO().getAllSanPham();
        defaultTableModel = (DefaultTableModel) tbl_sanpham.getModel();
        getData(listSP);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnTimKiem = new javax.swing.JButton();
        txt_timkiem = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_maSanPham = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_donViTinh = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_giaNhap = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_giaBan = new javax.swing.JTextField();
        txt_tenSp1 = new javax.swing.JTextField();
        txt_tenNsx = new javax.swing.JTextField();
        txt_soLuong = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btn_sua = new javax.swing.JButton();
        btn_them = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_sanpham = new javax.swing.JTable();
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

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1930, 50));

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTimKiem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Search-icon.png"))); // NOI18N
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });
        jPanel2.add(btnTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 50, 30));

        txt_timkiem.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_timkiemCaretUpdate(evt);
            }
        });
        jPanel2.add(txt_timkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 340, 30));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 490, 60));

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Mã SP:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 50, 30));
        jPanel3.add(txt_maSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 190, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Đơn vị tính:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 90, 30));
        jPanel3.add(txt_donViTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 190, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Giá Nhập:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 90, 30));
        jPanel3.add(txt_giaNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 190, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Tên SP:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 60, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Số Lượng:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 110, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Giá Bán:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 80, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Tên NSX:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 70, 30));
        jPanel3.add(txt_giaBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 190, 30));
        jPanel3.add(txt_tenSp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 190, 30));
        jPanel3.add(txt_tenNsx, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 190, 30));
        jPanel3.add(txt_soLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 190, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel3.setText("Xin mời nhập thông tin!");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, 20));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bảng điều khiển", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_sua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit-icon.png"))); // NOI18N
        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });
        jPanel5.add(btn_sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 110, -1));

        btn_them.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Actions-list-add-user-icon.png"))); // NOI18N
        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });
        jPanel5.add(btn_them, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 120, -1));

        btn_xoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Windows-Close-Program-icon.png"))); // NOI18N
        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });
        jPanel5.add(btn_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 110, -1));

        btn_reset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Reload-icon.png"))); // NOI18N
        btn_reset.setText("Cancel");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        jPanel5.add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 120, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 310, 140));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 350, 570));

        tbl_sanpham.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_sanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_sanphamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_sanpham);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 1120, 490));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wp3152222.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1920, 900));
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        String timKiem = txt_timkiem.getText();

        if (timKiem.equals("")) {
            getData(listSP);
        } else {
            ArrayList<SanPham> listTimKiem = new ArrayList<>();
            for (int i = 0; i < listSP.size(); i++) {
                if (listSP.get(i).getMaSanPham().contains(timKiem) || listSP.get(i).getTenSp().contains(timKiem)) {
                    listTimKiem.add(listSP.get(i));
                }
            }
            getData(listTimKiem);
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        String maSP = txt_maSanPham.getText();
        String tenSP = txt_tenSp1.getText();
        String donViTinh = txt_donViTinh.getText();
        String tenNSX = txt_tenNsx.getText();
        String giaNhap = txt_giaNhap.getText();
        String giaBan = txt_giaBan.getText();
        String soLuong = txt_soLuong.getText();

        if (maSP.equals("") || donViTinh.equals("") || tenSP.equals("") || tenNSX.equals("") || giaBan.equals("") || giaNhap.equals("") || soLuong.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhâp đủ thông tin!");
            return;
        }
        for (int i = 0; i < soLuong.length(); i++) {
            if (Character.isLetter(soLuong.charAt(i))) {
                JOptionPane.showMessageDialog(this, "Số lượng phải là số");
                return;
            }
        }
        if (Integer.parseInt(soLuong) < 0) {
            JOptionPane.showMessageDialog(this, "Số lượng phải là số nguyên lớn hơn hoặc bằng 0");
            return;
        }

        sp.setMaSanPham(maSP);
        sp.setTenSp(tenSP);
        sp.setDonViTinh(donViTinh);
        sp.setTenNsx(tenNSX);
        sp.setGiaNhap(giaNhap);
        sp.setGiaBan(giaBan);
        sp.setSoLuong(Integer.parseInt(soLuong));

        try {
            if (new SanPhamDAO().updateSanPham(sp) != 0) {
                listSP.set(index, sp);
                getData(listSP);
                JOptionPane.showMessageDialog(this, "Sửa sản phẩm thành công!");
                reset();
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        String maSP = txt_maSanPham.getText();
        String tenSP = txt_tenSp1.getText();
        String donViTinh = txt_donViTinh.getText();
        String tenNSX = txt_tenNsx.getText();
        String giaNhap = txt_giaNhap.getText();
        String giaBan = txt_giaBan.getText();
        String soLuong = txt_soLuong.getText();

        for (int i = 0; i < listSP.size(); i++) {
            if (maSP.equals(listSP.get(i).getMaSanPham())) {
                JOptionPane.showMessageDialog(this, "Mã sản phẩm bị trùng, vui lòng nhập lại!");
                return;
            }
        }

        if (maSP.equals("") || donViTinh.equals("") || tenSP.equals("") || tenNSX.equals("") || giaBan.equals("") || giaNhap.equals("") || soLuong.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhâp đủ thông tin!");
            return;
        }

        for (int i = 0; i < soLuong.length(); i++) {
            if (Character.isLetter(soLuong.charAt(i))) {
                JOptionPane.showMessageDialog(this, "Số lượng phải là số");
                return;
            }
        }
        if (Integer.parseInt(soLuong) < 0) {
            JOptionPane.showMessageDialog(this, "Số lượng phải là số nguyên lớn hơn hoặc bằng 0");
            return;
        }

        sp = new SanPham(maSP, tenSP, donViTinh, tenNSX, giaNhap, giaBan, Integer.parseInt(soLuong));

        try {
            if (new SanPhamDAO().addSanPham(sp) != 0) {
                listSP.add(sp);
                getData(listSP);
                JOptionPane.showMessageDialog(this, "Thêm sản phẩm thành công!");
                reset();
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        Integer confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa không ?", "XÓA", 2, 2);
        if (confirm == JOptionPane.YES_OPTION) {
            if (listSP.remove(sp)) {
                new SanPhamDAO().deleteSanPham(sp);
                getData(listSP);
                JOptionPane.showMessageDialog(this, "Xóa thành công sản phẩm! " + sp.getTenSp());
            } else {
                JOptionPane.showMessageDialog(this, "Xóa thất bại");
            }
        }
        reset();
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        reset();
    }//GEN-LAST:event_btn_resetActionPerformed

    public void reset() {
        txt_donViTinh.setText("");
        txt_giaBan.setText("");
        txt_giaNhap.setText("");
        txt_maSanPham.setEnabled(true);
        txt_maSanPham.setText("");
        txt_soLuong.setText("");
        txt_tenNsx.setText("");
        txt_tenSp1.setText("");
        btn_them.setEnabled(true);
        btn_sua.setEnabled(true);
        btn_xoa.setEnabled(true);
        getData(listSP);
    }

    int index = -1;
    private void tbl_sanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_sanphamMouseClicked
        int row = tbl_sanpham.getSelectedRow();
        String maSP = tbl_sanpham.getValueAt(row, 0).toString();

        for (int i = 0; i < listSP.size(); i++) {
            if (maSP.equalsIgnoreCase(listSP.get(i).getMaSanPham())) {
                sp = listSP.get(i);
                index = i;
                break;
            }
        }
        txt_maSanPham.setEnabled(false);
        txt_maSanPham.setText(sp.getMaSanPham());
        txt_tenSp1.setText(sp.getTenSp());
        txt_soLuong.setText(String.valueOf(sp.getSoLuong()));
        txt_tenNsx.setText(sp.getTenNsx());
        txt_donViTinh.setText(sp.getDonViTinh());
        txt_giaBan.setText(sp.getGiaBan());
        txt_giaNhap.setText(sp.getGiaNhap());
        btn_them.setEnabled(false);
    }//GEN-LAST:event_tbl_sanphamMouseClicked

    private void txt_timkiemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_timkiemCaretUpdate
        String timKiem = txt_timkiem.getText();

        if (timKiem.equals("")) {
            getData(listSP);
        }
    }//GEN-LAST:event_txt_timkiemCaretUpdate

    //Đưa ra danh sách sản phẩn load từ mảng listsp
    private void getData(ArrayList<SanPham> listsp) {
        defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn("Mã SP");
        defaultTableModel.addColumn("Tên sản phẩm");
        defaultTableModel.addColumn("Đơn vị tính");
        defaultTableModel.addColumn("Tên NXS");
        defaultTableModel.addColumn("Giá nhập");
        defaultTableModel.addColumn("Giá bán");
        defaultTableModel.addColumn("Số lượng");

        for (SanPham sp : listsp) {
            defaultTableModel.addRow(new Object[]{
                sp.getMaSanPham(), sp.getTenSp(), sp.getDonViTinh(), sp.getTenNsx(), sp.getGiaNhap(), sp.getGiaBan(), sp.getSoLuong()
            });
        }
        tbl_sanpham.setModel(defaultTableModel);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_sanpham;
    private javax.swing.JTextField txt_donViTinh;
    private javax.swing.JTextField txt_giaBan;
    private javax.swing.JTextField txt_giaNhap;
    private javax.swing.JTextField txt_maSanPham;
    private javax.swing.JTextField txt_soLuong;
    private javax.swing.JTextField txt_tenNsx;
    private javax.swing.JTextField txt_tenSp1;
    private javax.swing.JTextField txt_timkiem;
    // End of variables declaration//GEN-END:variables
}
