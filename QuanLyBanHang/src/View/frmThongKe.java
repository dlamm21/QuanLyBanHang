package View;

import Controller.HoaDonDAO;
import Model.HoaDon;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class frmThongKe extends javax.swing.JPanel {

    ArrayList<HoaDon> listHD;
    private DefaultTableModel defaultTableModel;
    HoaDon hd = new HoaDon();
    double tongTien;
    NumberFormat formatter = new DecimalFormat("###,###");
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat sdf1 = new SimpleDateFormat("MM");

    public frmThongKe() {
        initComponents();
        listHD = new HoaDonDAO().getAllHoaDon();
        defaultTableModel = (DefaultTableModel) tbl_thongke.getModel();
        getData(listHD);
    }

    //Đưa ra danh sách hóa đơn từ mảng listHD
    private void getData(ArrayList<HoaDon> listHD) {
        defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn("Mã HD");
        defaultTableModel.addColumn("Mã NV");
        defaultTableModel.addColumn("Mã KH");
        defaultTableModel.addColumn("Tên KH");
        defaultTableModel.addColumn("Mã SP");
        defaultTableModel.addColumn("Tên SP");
        defaultTableModel.addColumn("Số lượng");
        defaultTableModel.addColumn("Đơn giá");
        defaultTableModel.addColumn("Thành tiền");
        defaultTableModel.addColumn("Ngày bán");

        for (HoaDon obj : listHD) {
            defaultTableModel.addRow(new Object[]{
                obj.getMaHD(), obj.getMaNV(), obj.getMaKH(), obj.getTenKH(),
                obj.getMaSP(), obj.getTenSp(), formatter.format(obj.getSoLuong()),
                formatter.format(obj.getDonGia()), formatter.format(obj.getThanhTien()),
                obj.getNgayBan()
            });
        }
        tbl_thongke.setModel(defaultTableModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_thongke = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        tbnTimKiem = new javax.swing.JButton();
        txt_timkiem = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btn_thongKe1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        cancel = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btn_thongKe = new javax.swing.JButton();
        txt_timkiem1 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        txtMaNV = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbl_tongTien2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1925, 1111));
        setPreferredSize(new java.awt.Dimension(1925, 1111));
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

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1940, 50));

        jPanel4.setBackground(new java.awt.Color(255, 153, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thống kê", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(102, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_thongke.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbl_thongke);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 980, 470));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbnTimKiem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tbnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Search-icon.png"))); // NOI18N
        tbnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnTimKiemActionPerformed(evt);
            }
        });
        jPanel6.add(tbnTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 50, 30));

        txt_timkiem.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_timkiemCaretUpdate(evt);
            }
        });
        jPanel6.add(txt_timkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 310, 30));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 980, 70));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thống kê theo ngày", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_thongKe1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_thongKe1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ok-icon.png"))); // NOI18N
        btn_thongKe1.setText("Thống kê ");
        btn_thongKe1.setMaximumSize(new java.awt.Dimension(117, 33));
        btn_thongKe1.setMinimumSize(new java.awt.Dimension(117, 33));
        btn_thongKe1.setPreferredSize(new java.awt.Dimension(117, 33));
        btn_thongKe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thongKe1ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_thongKe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 130, 30));

        jDateChooser1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 190, 40));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 450, 120));

        cancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Reload-icon.png"))); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel4.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 120, 40));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thống kê theo tháng/năm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_thongKe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_thongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ok-icon.png"))); // NOI18N
        btn_thongKe.setText("Thống kê");
        btn_thongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thongKeActionPerformed(evt);
            }
        });
        jPanel5.add(btn_thongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 130, 30));
        jPanel5.add(txt_timkiem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 180, 30));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 450, 120));

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(txtMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 150, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Office-Customer-Male-Light-icon.png"))); // NOI18N
        jLabel14.setText("Nhập mã nhân viên:");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 30));

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 450, 70));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Doanh thu:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 110, 30));

        lbl_tongTien2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_tongTien2.setText("....................");
        jPanel4.add(lbl_tongTien2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 90, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("VND.");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 40, 30));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 1480, 660));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wp3152222.jpg"))); // NOI18N
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1920, 900));
    }// </editor-fold>//GEN-END:initComponents

    private void tbnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnTimKiemActionPerformed
        String timkiem = txt_timkiem.getText();
        ArrayList<HoaDon> listTimkiemArrayList = new ArrayList<>();
        if (timkiem.equals("")) {
            getData(listHD);
            tongTien = 0;
            for (int i = 0; i < listHD.size(); i++) {
                tongTien += listHD.get(i).getThanhTien();
            }
            lbl_tongTien2.setText(formatter.format(tongTien));
        } else {
            for (int i = 0; i < listHD.size(); i++) {
                if (listHD.get(i).getMaHD().contains(timkiem)
                        || listHD.get(i).getTenKH().contains(timkiem)
                        || listHD.get(i).getMaKH().contains(timkiem)
                        || listHD.get(i).getTenSp().contains(timkiem)
                        || listHD.get(i).getNgayBan().contains(timkiem)
                        || listHD.get(i).getMaNV().trim().contains(timkiem)) {
                    listTimkiemArrayList.add(listHD.get(i));
                }
            }
            getData(listTimkiemArrayList);

            tongTien = 0;
            for (int i = 0; i < listTimkiemArrayList.size(); i++) {
                tongTien += listTimkiemArrayList.get(i).getThanhTien();
            }
            lbl_tongTien2.setText(formatter.format(tongTien));
        }

        txtMaNV.setText("");
        txt_timkiem1.setText("");
    }//GEN-LAST:event_tbnTimKiemActionPerformed

    //Thống kê theo ngày
    private void btn_thongKe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thongKe1ActionPerformed
        Date date = jDateChooser1.getDate();
        String date_str = sdf.format(date);
        String maNV = txtMaNV.getText();
        ArrayList<HoaDon> listHD_timKiem = new ArrayList<>();
        for (int i = 0; i < listHD.size(); i++) {
            if (listHD.get(i).getNgayBan().equals(date_str) && listHD.get(i).getMaNV().contains(maNV)) {
                listHD_timKiem.add(listHD.get(i));
            }
        }
        getData(listHD_timKiem);
        tongTien = 0;
        for (int i = 0; i < listHD_timKiem.size(); i++) {
            tongTien += listHD_timKiem.get(i).getThanhTien();
        }
        lbl_tongTien2.setText(formatter.format(tongTien));
        txt_timkiem.setText("");
        txt_timkiem1.setText("");
    }//GEN-LAST:event_btn_thongKe1ActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        getData(listHD);
        txtMaNV.setText("");
        txt_timkiem.setText("");
        txt_timkiem1.setText("");
        lbl_tongTien2.setText("......................");
    }//GEN-LAST:event_cancelActionPerformed

    //Thống kê theo tháng hoặc năm
    private void btn_thongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thongKeActionPerformed
        String timKiem = txt_timkiem1.getText();
        String maNV = txtMaNV.getText();
        ArrayList<HoaDon> listHD_tinKiem = new ArrayList<>();
        for (int i = 0; i < listHD.size(); i++) {
            if (listHD.get(i).getNgayBan().contains(timKiem) && listHD.get(i).getMaNV().contains(maNV)) {
                listHD_tinKiem.add(listHD.get(i));
            }
        }
        getData(listHD_tinKiem);
        tongTien = 0;
        for (int i = 0; i < listHD_tinKiem.size(); i++) {
            tongTien += listHD_tinKiem.get(i).getThanhTien();
        }
        lbl_tongTien2.setText(formatter.format(tongTien));
        txt_timkiem.setText("");
        
    }//GEN-LAST:event_btn_thongKeActionPerformed

    private void txt_timkiemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_timkiemCaretUpdate
        String timkiem = txt_timkiem.getText();
        if (timkiem.equals("")) {
            getData(listHD);
        }
    }//GEN-LAST:event_txt_timkiemCaretUpdate


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_thongKe;
    private javax.swing.JButton btn_thongKe1;
    private javax.swing.JButton cancel;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_tongTien2;
    private javax.swing.JTable tbl_thongke;
    private javax.swing.JButton tbnTimKiem;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txt_timkiem;
    private javax.swing.JTextField txt_timkiem1;
    // End of variables declaration//GEN-END:variables
}
