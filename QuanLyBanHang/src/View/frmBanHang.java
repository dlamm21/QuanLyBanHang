package View;

import Controller.HoaDonDAO;
import Controller.KhachHangDAO;
import Controller.SanPhamDAO;
import Model.HoaDon;
import Model.KhachHang;
import Model.NhanVien;
import Model.SanPham;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public final class frmBanHang extends javax.swing.JPanel {

    private DefaultTableModel defaultTableModel;
    private ArrayList<HoaDon> listGioHang = new ArrayList<>();
    int index;
    KhachHang kh = new KhachHang();
    NhanVien nv = new NhanVien();
    SanPham sp = new SanPham();
    double tongTien;
    DecimalFormat formatter = new DecimalFormat("###,###");

    public frmBanHang() {
        initComponents();
        getDataKH(loadKH());
        getDataSP(loadSP());
    }

    //trả về mảng chứa danh sách khách hàng
    public ArrayList<KhachHang> loadKH() {
        ArrayList<KhachHang> arrayListKH = new KhachHangDAO().getAllKhachHang();
        return arrayListKH;
    }

    //trả về mảng chứa danh sách sản phẩm
    public ArrayList<SanPham> loadSP() {
        ArrayList<SanPham> arrayListSP = new SanPhamDAO().getAllSanPham();
        return arrayListSP;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_gioHang = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnXoa = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_thanhToan = new javax.swing.JButton();
        lbl_maKH = new javax.swing.JLabel();
        lbl_tenKH = new javax.swing.JLabel();
        lbl_tongTien = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_khachhang = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        txt_searchKH = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_sanpham = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        txt_searchSP = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        btnThemVaoGioHang = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txt_soLuong = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/store-icon.png"))); // NOI18N
        jLabel1.setText("SIÊU THỊ MINI");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("|");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 80, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1930, 50));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_gioHang.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_gioHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_gioHangMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_gioHang);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 640, 190));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Mã khách hàng:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Họ tên:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Editing-Delete-icon.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel4.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 100, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/coin-us-dollar-icon.png"))); // NOI18N
        jLabel8.setText("Tổng tiền thanh toán:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 190, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("VND.");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, 40, 30));

        btn_thanhToan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_thanhToan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cash-icon.png"))); // NOI18N
        btn_thanhToan.setText("Thanh toán");
        btn_thanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thanhToanActionPerformed(evt);
            }
        });
        jPanel4.add(btn_thanhToan, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 140, 50));

        lbl_maKH.setText("..................");
        jPanel4.add(lbl_maKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, -1, -1));

        lbl_tenKH.setText("...............................");
        jPanel4.add(lbl_tenKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, -1));

        lbl_tongTien.setText("......................");
        jPanel4.add(lbl_tongTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 100, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("SIÊU THI MINI");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("TT Yên Ninh , Yên Khánh, Ninh Bình");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("hotline:0972532403");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setText("HÓA ĐƠN BÁN HÀNG");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        jLabel7.setText("----------------------------------------------------------------------------------------------------------------------------------");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 660, -1));

        jLabel17.setText("----------------------------------------------------------------------------------------------------------------------------------");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 670, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("CẢM ƠN QUÝ KHÁCH VÀ HẸN GẶP LẠI");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, -1, -1));
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, -1, -1));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 110, 670, 700));

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 800, 170));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_searchKH.setToolTipText("");
        txt_searchKH.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_searchKHCaretUpdate(evt);
            }
        });
        jPanel5.add(txt_searchKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 290, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Nhập mã hoặc tên khách hàng: ");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, 50));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 550, 60));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 820, 270));

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(102, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane2.setViewportView(tbl_sanpham);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 800, 200));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_searchSP.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_searchSPCaretUpdate(evt);
            }
        });
        jPanel6.add(txt_searchSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 280, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Nhập mã hoặc tên sản phẩm: ");
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 230, 50));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 560, 60));

        btnThemVaoGioHang.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnThemVaoGioHang.setText("Thêm vào giỏ hàng");
        btnThemVaoGioHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemVaoGioHangActionPerformed(evt);
            }
        });
        jPanel3.add(btnThemVaoGioHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, 150, 60));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Số lượng:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 80, 50));

        txt_soLuong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_soLuong.setText("0");
        jPanel3.add(txt_soLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 50, 30));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 820, 390));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wp3152222.jpg"))); // NOI18N
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, 900));
    }// </editor-fold>//GEN-END:initComponents

    String maSP;
    private void tbl_gioHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_gioHangMouseClicked
        int row = tbl_gioHang.getSelectedRow();
        maSP = tbl_gioHang.getValueAt(row, 0).toString();
    }//GEN-LAST:event_tbl_gioHangMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        double tienGiam;
        for (int i = 0; i < listGioHang.size(); i++) {
            if (maSP.equals(listGioHang.get(i).getMaSP())) {
                tienGiam = listGioHang.get(i).getThanhTien();
                listGioHang.remove(i);
                tongTien = tongTien - tienGiam;
                lbl_tongTien.setText(String.valueOf(tongTien));
            }
        }
        loadGioHang(listGioHang);
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btn_thanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thanhToanActionPerformed
        Date date = new Date();
        SimpleDateFormat sdf2 = new SimpleDateFormat("ddMMyyyy");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String maHD = "KH" + sdf2.format(date);
        
        JTextField txtSoTien = new JTextField(10);
        JPanel myPanel = new JPanel();
        myPanel.add(Box.createHorizontalStrut(10));
        myPanel.add(new JLabel("Số tiền khách đưa:"));
        myPanel.add(txtSoTien);
        int result = JOptionPane.showConfirmDialog(null, myPanel, "Số tiền khách thanh toán", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            double soTienKhachDua = Double.parseDouble(txtSoTien.getText());
            if (soTienKhachDua < tongTien) {
                JOptionPane.showMessageDialog(this, "Số tiền khách đưa chưa đủ !");
                return;
            } else if (soTienKhachDua > tongTien) {
                JOptionPane.showMessageDialog(this, "Số tiền trả lại cho khách hàng " + (formatter.format(soTienKhachDua - tongTien)));
            }
            JOptionPane.showMessageDialog(this, "Thanh toán thành công!");
            listGioHang = new ArrayList<>();
            loadGioHang(listGioHang);
        }
        
        for (int i = 0; i < listGioHang.size(); i++) {
            HoaDon hd = listGioHang.get(i);
            hd.setMaHD(maHD+i);
            hd.setMaKH(kh.getMaKhachHang());
            hd.setMaNV(frmSignIn.maDN);
            hd.setNgayBan(sdf.format(date));
            hd.setTenKH(lbl_tenKH.getText());
            listGioHang.set(i, hd);
            new HoaDonDAO().addHoaDon(hd);
        }
        

        frmSanPham frmSP = new frmSanPham();
        new HoaDonDAO().getAllHoaDon();
        for (int i = 0; i < listGioHang.size(); i++) {
            updateSoLuong(listGioHang.get(i).getMaSP(), listGioHang.get(i).getSoLuong(), frmSP.listSP);
        }
        new SanPhamDAO().updateSanPham(sp);
        reset();
    }//GEN-LAST:event_btn_thanhToanActionPerformed

    private void tbl_khachhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_khachhangMouseClicked
        try {
            int row = tbl_khachhang.getSelectedRow();
            String makh = tbl_khachhang.getValueAt(row, 0).toString();
            ArrayList<KhachHang> listKH = loadKH();
            for (int i = 0; i < listKH.size(); i++) {
                if (makh.equals(listKH.get(i).getMaKhachHang())) {
                    kh = listKH.get(i);
                    index = i;
                    break;
                }
            }
            lbl_maKH.setText(kh.getMaKhachHang());
            lbl_tenKH.setText(kh.getHoTen());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tbl_khachhangMouseClicked

    private void tbl_sanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_sanphamMouseClicked
        try {
            int row = tbl_sanpham.getSelectedRow();
            String makh = tbl_sanpham.getValueAt(row, 0).toString();
            ArrayList<SanPham> listSP = loadSP();
            for (int i = 0; i < listSP.size(); i++) {
                if (makh.equals(listSP.get(i).getMaSanPham())) {
                    sp = listSP.get(i);
                    index = i;
                    break;
                }
            }
            txt_soLuong.setText("1");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tbl_sanphamMouseClicked

    private void btnThemVaoGioHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemVaoGioHangActionPerformed
        int soLuongMua = Integer.parseInt(txt_soLuong.getText());
        if (soLuongMua <= 0) {
            JOptionPane.showMessageDialog(this, "Số lượng sản phẩm phải >0!");
        } else if (soLuongMua + soLuongSPTrongListGioHang(sp.getMaSanPham()) > sp.getSoLuong()) {
            JOptionPane.showMessageDialog(this, "Số lượng sản phẩm lớn hơn số lượng còn trong kho");

        } else {
            HoaDon hd = new HoaDon();
            hd.setTenSp(sp.getTenSp());
            hd.setMaSP(sp.getMaSanPham());
            hd.setSoLuong(soLuongMua);
            hd.setDonGia(Double.parseDouble(sp.getGiaBan()));
            hd.setThanhTien(soLuongMua * Double.parseDouble(sp.getGiaBan()));
            if (checkSPExistGioHang(hd.getMaSP(), listGioHang)) {
                HoaDon hoaDon = listGioHang.get(indexMaSPTrungTrongGioHang);
                hoaDon.setSoLuong(Integer.parseInt(txt_soLuong.getText()) + hoaDon.getSoLuong());
                hoaDon.setThanhTien(hoaDon.getDonGia() * hoaDon.getSoLuong());
                listGioHang.set(indexMaSPTrungTrongGioHang, hoaDon);
            } else {
                listGioHang.add(hd);
            }
            loadGioHang(listGioHang);
            JOptionPane.showMessageDialog(this, "Thêm vào giỏ hàng thành công");

            tongTien = 0;
            for (int i = 0; i < listGioHang.size(); i++) {
                tongTien += listGioHang.get(i).getThanhTien();
            }
            lbl_tongTien.setText(formatter.format(tongTien));

        }
    }//GEN-LAST:event_btnThemVaoGioHangActionPerformed

    private void txt_searchKHCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_searchKHCaretUpdate
        String timKiem = txt_searchKH.getText();

        if (timKiem.equals("")) {
            getDataKH(loadKH());
        } else {
            ArrayList<KhachHang> listTimKiem = new ArrayList<>();
            for (int i = 0; i < loadKH().size(); i++) {
                if (loadKH().get(i).getMaKhachHang().contains(timKiem) || loadKH().get(i).getHoTen().contains(timKiem)) {
                    listTimKiem.add(loadKH().get(i));
                }
            }
            getDataKH(listTimKiem);
        }
    }//GEN-LAST:event_txt_searchKHCaretUpdate

    private void txt_searchSPCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_searchSPCaretUpdate
        String timKiem = txt_searchSP.getText();

        if (timKiem.equals("")) {
            getDataSP(loadSP());
        } else {
            ArrayList<SanPham> listTimKiem = new ArrayList<>();
            for (int i = 0; i < loadSP().size(); i++) {
                if (loadSP().get(i).getMaSanPham().contains(timKiem) || loadSP().get(i).getTenSp().contains(timKiem)) {
                    listTimKiem.add(loadSP().get(i));
                }
            }
            getDataSP(listTimKiem);
        }
    }//GEN-LAST:event_txt_searchSPCaretUpdate

    //trả về số lượng sản phẩm đã có trong giỏ hàng
    public int soLuongSPTrongListGioHang(String maSP) {
        for (int i = 0; i < listGioHang.size(); i++) {
            if (maSP.equals(listGioHang.get(i).getMaSP())) {
                return listGioHang.get(i).getSoLuong();
            }
        }
        return 0;
    }

    //đua ra danh sách khách hàng từ listKH
    private void getDataKH(ArrayList<KhachHang> listKH) {
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

    //đua ra danh sách sản phẩm từ listsp
    private void getDataSP(ArrayList<SanPham> listsp) {
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

    public void reset() {
        getDataKH(loadKH());
        getDataSP(loadSP());
        loadGioHang(listGioHang);
        lbl_maKH.setText("...............");
        lbl_tenKH.setText("...............");
        tongTien = 0;
        lbl_tongTien.setText("...............");
    }

    //Đưa ra danh sách các sản phẩm đã được thêm từ listHD
    public void loadGioHang(ArrayList<HoaDon> listHD) {
        defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn("Mã SP");
        defaultTableModel.addColumn("Tên SP");
        defaultTableModel.addColumn("Đơn vi tính");
        defaultTableModel.addColumn("Số lượng");
        defaultTableModel.addColumn("Giá ");
        defaultTableModel.addColumn("Thành tiền");
        for (HoaDon obj : listHD) {
            sp = new frmBanHang().getSPByCode(obj.getMaSP());
            defaultTableModel.addRow(new Object[]{
                obj.getMaSP(), sp.getTenSp(), sp.getDonViTinh(), obj.getSoLuong(), formatter.format(obj.getDonGia()), formatter.format(obj.getThanhTien())
            });
        }
        tbl_gioHang.setModel(defaultTableModel);
        if (listHD.size() > 0) {
            btn_thanhToan.setEnabled(true);
        } else {
            btn_thanhToan.setEnabled(false);
        }
    }

    //trả về sản phẩm đã có trong giỏ hàng
    public SanPham getSPByCode(String maSP) {
        ArrayList<SanPham> listSP = loadSP();
        for (int i = 0; i < listSP.size(); i++) {
            if (maSP.equals(listSP.get(i).getMaSanPham())) {
                return listSP.get(i);
            }
        }
        return null;
    }

    //Kiểm trả xem theo mã sản phẩm có trùng với các sản phẩm có trong giỏ hàng hay không
    int indexMaSPTrungTrongGioHang;
    public boolean checkSPExistGioHang(String maSP, ArrayList<HoaDon> listHD) {
        for (int i = 0; i < listHD.size(); i++) {
            if (maSP.equals(listHD.get(i).getMaSP())) {
                indexMaSPTrungTrongGioHang = i;
                return true;
            }
        }
        return false;
    }

    //Cập nhật lại số lượng sản phẩm sau khi khách hàng đã thanh toán
    public void updateSoLuong(String maSP, int soLuongMua, ArrayList<SanPham> listSP) {
        for (int i = 0; i < listSP.size(); i++) {
            if (maSP.equals(listSP.get(i).getMaSanPham())) {
                sp = listSP.get(i);
                sp.setSoLuong(sp.getSoLuong() - soLuongMua);
                listSP.set(i, sp);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThemVaoGioHang;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btn_thanhToan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_maKH;
    private javax.swing.JLabel lbl_tenKH;
    private javax.swing.JLabel lbl_tongTien;
    private javax.swing.JTable tbl_gioHang;
    private javax.swing.JTable tbl_khachhang;
    private javax.swing.JTable tbl_sanpham;
    private javax.swing.JTextField txt_searchKH;
    private javax.swing.JTextField txt_searchSP;
    private javax.swing.JTextField txt_soLuong;
    // End of variables declaration//GEN-END:variables
}
