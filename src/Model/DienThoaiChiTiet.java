package Model;

import java.math.BigDecimal;

public class DienThoaiChiTiet {
    private String maDTCT, maDT;
    private BigDecimal GiaBan;
    private String HinhAnh, MauSac;
    private int SoLuongTonKho;
    private String maBoNho, maKho, maNSX, maPhieuBaoHanh;
    private boolean TrangThai;
    private String MoTa;

    public DienThoaiChiTiet() {
        
    }

    public DienThoaiChiTiet(String maDTCT, String maDT, BigDecimal GiaBan, String HinhAnh, String MauSac, int SoLuongTonKho, String maBoNho, String maKho, String maNSX, String maPhieuBaoHanh, boolean TrangThai, String MoTa) {
        this.maDTCT = maDTCT;
        this.maDT = maDT;
        this.GiaBan = GiaBan;
        this.HinhAnh = HinhAnh;
        this.MauSac = MauSac;
        this.SoLuongTonKho = SoLuongTonKho;
        this.maBoNho = maBoNho;
        this.maKho = maKho;
        this.maNSX = maNSX;
        this.maPhieuBaoHanh = maPhieuBaoHanh;
        this.TrangThai = TrangThai;
        this.MoTa = MoTa;
    }

    public String getMaDTCT() {
        return maDTCT;
    }

    public void setMaDTCT(String maDTCT) {
        this.maDTCT = maDTCT;
    }

    public String getMaDT() {
        return maDT;
    }

    public void setMaDT(String maDT) {
        this.maDT = maDT;
    }

    public BigDecimal getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(BigDecimal GiaBan) {
        this.GiaBan = GiaBan;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public String getMauSac() {
        return MauSac;
    }

    public void setMauSac(String MauSac) {
        this.MauSac = MauSac;
    }

    public int getSoLuongTonKho() {
        return SoLuongTonKho;
    }

    public void setSoLuongTonKho(int SoLuongTonKho) {
        this.SoLuongTonKho = SoLuongTonKho;
    }

    public String getMaBoNho() {
        return maBoNho;
    }

    public void setMaBoNho(String maBoNho) {
        this.maBoNho = maBoNho;
    }

    public String getMaKho() {
        return maKho;
    }

    public void setMaKho(String maKho) {
        this.maKho = maKho;
    }

    public String getMaNSX() {
        return maNSX;
    }

    public void setMaNSX(String maNSX) {
        this.maNSX = maNSX;
    }

    public String getMaPhieuBaoHanh() {
        return maPhieuBaoHanh;
    }

    public void setMaPhieuBaoHanh(String maPhieuBaoHanh) {
        this.maPhieuBaoHanh = maPhieuBaoHanh;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

}
