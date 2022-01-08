package Controller;

import Model.KhachHang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class KhachHangDAO {

    Connection conn = Connect.getConnection();
    PreparedStatement ps = null;

    public int addKhachHang(KhachHang nv) {
        String sql = "INSERT INTO KhachHang(maKH, hoTen, sdt, email, diaChi,"
                + "gioiTinh, trangThai) VALUES(?,?,?,?,?,?,?)";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, nv.getMaKhachHang());
            ps.setString(2, nv.getHoTen());
            ps.setString(3, nv.getSoDienThoai());
            ps.setString(4, nv.getEmail());
            ps.setString(5, nv.getDiaChi());
            ps.setString(6, nv.getGioiTinh());
            ps.setInt(7, nv.getTrangThai());

            if (ps.executeUpdate() > 0) {
                System.out.println("Thêm thành công");
                return 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int updateKhachHang(KhachHang nv) {
        String sql = "update KhachHang set hoTen=?, sdt=?, email=?, diaChi=?,"
                + "gioiTinh=?, trangThai=? where maKH=?";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(7, nv.getMaKhachHang());
            ps.setString(1, nv.getHoTen());
            ps.setString(2, nv.getSoDienThoai());
            ps.setString(3, nv.getEmail());
            ps.setString(4, nv.getDiaChi());
            ps.setString(5, nv.getGioiTinh());
            ps.setInt(6, nv.getTrangThai());

            if (ps.executeUpdate() > 0) {
                System.out.println("Sửa thành công");
                return 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int deleteKhachHang(KhachHang nv) {
        String sql = "delete KhachHang where maKH=?";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, nv.getMaKhachHang());

            if (ps.executeUpdate() > 0) {
                System.out.println("Xóa thành công");
                return 1;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return 0;
    }

    public ArrayList<KhachHang> getAllKhachHang() {
        ArrayList<KhachHang> arrayList = new ArrayList<>();
        String sql = "SELECT * FROM KhachHang";

        try {
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                KhachHang kh = new KhachHang();
                kh.setMaKhachHang(rs.getString(1));
                kh.setHoTen(rs.getString(2));
                kh.setSoDienThoai(rs.getString(3));
                kh.setEmail(rs.getString(4));
                kh.setDiaChi(rs.getString(5));
                kh.setGioiTinh(rs.getString(6));
                kh.setTrangThai(rs.getInt(7));
                arrayList.add(kh);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return arrayList;
    }
}
