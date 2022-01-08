package Controller;

import Model.SanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SanPhamDAO {

    Connection conn = Connect.getConnection();
    PreparedStatement ps = null;

    public int addSanPham(SanPham nv) {
        String sql = "INSERT INTO SanPham(maSP, tenSP, donViTinh, tenNsx, giaNhap,"
                + "giaBan, soLuong) VALUES(?,?,?,?,?,?,?)";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, nv.getMaSanPham());
            ps.setString(2, nv.getTenSp());
            ps.setString(3, nv.getDonViTinh());
            ps.setString(4, nv.getTenNsx());
            ps.setString(5, nv.getGiaNhap());
            ps.setString(6, nv.getGiaBan());
            ps.setInt(7, nv.getSoLuong());

            if (ps.executeUpdate() > 0) {
                System.out.println("Thêm thành công");
                return 1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int updateSanPham(SanPham sp) {
        String sql = "UPDATE SanPham SET tenSP=?, donViTinh=?, tenNsx=?, giaNhap=?, giaBan=?, soLuong=? where maSP=?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(7, sp.getMaSanPham());
            ps.setString(1, sp.getTenSp());
            ps.setString(2, sp.getDonViTinh());
            ps.setString(3, sp.getTenNsx());
            ps.setString(4, sp.getGiaNhap());
            ps.setString(5, sp.getGiaBan());
            ps.setInt(6, sp.getSoLuong());

            if (ps.executeUpdate() > 0) {
                System.out.println("Sửa thành công");
                return 1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int deleteSanPham(SanPham sp) {
        String sql = "DELETE SanPham WHERE maSP=?";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, sp.getMaSanPham());

            if (ps.executeUpdate() > 0) {
                System.out.println("Xóa thành công");
                return 1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public ArrayList<SanPham> getAllSanPham() {
        ArrayList<SanPham> arrayList = new ArrayList<>();
        String sql = "SELECT * FROM SanPham";

        try {
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                SanPham sp = new SanPham();
                sp.setMaSanPham(rs.getString(1));
                sp.setTenSp(rs.getString(2));
                sp.setDonViTinh(rs.getString(3));
                sp.setTenNsx(rs.getString(4));
                sp.setGiaNhap(rs.getString(5));
                sp.setGiaBan(rs.getString(6));
                sp.setSoLuong(rs.getInt(7));
                arrayList.add(sp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arrayList;
    }
}
