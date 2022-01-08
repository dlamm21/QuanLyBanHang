package Controller;

import Model.NhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class NhanVienDAO {

    Connection conn = Connect.getConnection();
    PreparedStatement ps = null;

    public int addNhanVien(NhanVien nv) {
        String sql = "INSERT INTO NhanVien(maNV, hoTen, sdt, email, matKhau,"
                + "gioiTinh, nhom, trangThai) VALUES(?,?,?,?,?,?,?,?)";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, nv.getMaNhanVien());
            ps.setString(2, nv.getHoTen());
            ps.setString(3, nv.getSoDienThoai());
            ps.setString(4, nv.getEmail());
            ps.setString(5, nv.getMatKhau());
            ps.setString(6, nv.getGioiTinh());
            ps.setInt(7, nv.getNhom());
            ps.setInt(8, nv.getTrangThai());

            if (ps.executeUpdate() > 0) {
                System.out.println("Thêm thành công");
                return 1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    public int updateNhanVien(NhanVien nv) {
        String sql = "update NhanVien set hoTen=?, sdt=?, email=?, matKhau=?,"
                + "gioiTinh=?, nhom=?, trangThai=? where maNV=?";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(8, nv.getMaNhanVien());
            ps.setString(1, nv.getHoTen());
            ps.setString(2, nv.getSoDienThoai());
            ps.setString(3, nv.getEmail());
            ps.setString(4, nv.getMatKhau());
            ps.setString(5, nv.getGioiTinh());
            ps.setInt(6, nv.getNhom());
            ps.setInt(7, nv.getTrangThai());

            if (ps.executeUpdate() > 0) {
                System.out.println("Sửa thành công");
                return 1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    public int deleteNhanVien(NhanVien nv) {
        String sql = "delete NhanVien where maNV=?";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, nv.getMaNhanVien());

            if (ps.executeUpdate() > 0) {
                System.out.println("Xóa thành công");
                return 1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    public ArrayList<NhanVien> getAllNhanVien(){
        ArrayList<NhanVien> arrayList = new ArrayList<>();
        String sql = "SELECT * FROM NhanVien";
        
        try {
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                NhanVien nv = new NhanVien();
                nv.setMaNhanVien(rs.getString(1));
                nv.setHoTen(rs.getString(2));
                nv.setSoDienThoai(rs.getString(3));
                nv.setEmail(rs.getString(4));
                nv.setMatKhau(rs.getString(5));
                nv.setGioiTinh(rs.getString(6));
                nv.setNhom(rs.getInt(7));
                nv.setTrangThai(rs.getInt(8));
                arrayList.add(nv);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return arrayList;
    }
}