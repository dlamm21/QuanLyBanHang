package Controller;

import Model.HoaDon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author dinhv
 */
public class HoaDonDAO {
    Connection conn = Connect.getConnection();
    PreparedStatement ps = null;
    
    public int addHoaDon(HoaDon hd){
        String sql = "INSERT INTO HoaDon(maHD, maNV, maSP, maKH, soLuong,"
                + "donGia, thanhTien, ngayBan, tenSP, tenKH) VALUES(?,?,?,?,?,?,?,?,?,?)";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, hd.getMaHD());
            ps.setString(2, hd.getMaNV());
            ps.setString(3, hd.getMaSP());
            ps.setString(4, hd.getMaKH());
            ps.setInt(5, hd.getSoLuong());
            ps.setDouble(6, hd.getDonGia());
            ps.setDouble(7, hd.getThanhTien());
            ps.setString(8, hd.getNgayBan());
            ps.setString(9, hd.getTenSp());
            ps.setString(10, hd.getTenKH());

            if (ps.executeUpdate() > 0) {
                System.out.println("Thêm thành công");
                return 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    public int updateHoaDon(HoaDon hd){
        String sql = "UPDATE HoaDon set maNV=?, maSP=?, maKH=?, soLuong=?,"
                + "donGia=?, thanhTien=?, ngayBan=?, tenSP=?, tenKH=? where maHD=?";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(10, hd.getMaHD());
            ps.setString(1, hd.getMaNV());
            ps.setString(2, hd.getMaSP());
            ps.setString(3, hd.getMaKH());
            ps.setInt(4, hd.getSoLuong());
            ps.setDouble(5, hd.getDonGia());
            ps.setDouble(6, hd.getThanhTien());
            ps.setString(7, hd.getNgayBan());
            ps.setString(8, hd.getTenSp());
            ps.setString(9, hd.getTenKH());

            if (ps.executeUpdate() > 0) {
                System.out.println("Sửa thành công");
                return 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    public ArrayList<HoaDon> getAllHoaDon(){
        ArrayList<HoaDon> arrayList = new ArrayList<>();
        String sql = "SELECT * FROM HoaDon";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                HoaDon hd = new HoaDon();
                hd.setMaHD(rs.getString(1));
                hd.setMaNV(rs.getString(2));
                hd.setMaSP(rs.getString(3));
                hd.setMaKH(rs.getString(4));
                hd.setSoLuong(rs.getInt(5));
                hd.setDonGia(rs.getDouble(6));
                hd.setThanhTien(rs.getDouble(7));
                hd.setNgayBan(rs.getString(8));
                hd.setTenSp(rs.getString(9));
                hd.setTenKH(rs.getString(10));
                arrayList.add(hd);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return arrayList;
    }
}
