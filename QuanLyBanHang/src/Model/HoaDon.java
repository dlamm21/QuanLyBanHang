package Model;

public class HoaDon {
    private String maHD, maNV, maSP, maKH, ngayBan, tenSp, tenKH;
    private int soLuong;
    private double donGia;
    private double thanhTien;
    
    public HoaDon() {
    }

    public HoaDon(String maHD, String maNV, String maSP, String maKH, int soLuong, double donGia, double thanhTien, String ngayBan, String tenSp, String tenKH) {
        this.maHD = maHD;
        this.maNV = maNV;
        this.maSP = maSP;
        this.maKH = maKH;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
        this.ngayBan = ngayBan;
        this.tenSp = tenSp;
        this.tenKH = tenKH;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    
    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String máP) {
        this.maSP = máP;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(String ngayBan) {
        this.ngayBan = ngayBan;
    }
}
