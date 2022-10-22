package entity;

import java.time.LocalDate;

public class NhanVien {
	private String maNVHC;
	private String hoTen;
	private String cmnd;
	private LocalDate ngaySinh;
	private String gioiTinh;
	private double luongCoBan;
	private String sdt;
	private String diaChi;
	private ChucVu chucVu;
	private HeSoLuong hSL;
	private PhuCapNV phuCap;
	private PhongBan phongBan;
	private String trangThai;

	public String getMaNVHC() {
		return maNVHC;
	}

	public void setMaNVHC(String maNVHC) {
		this.maNVHC = maNVHC;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public LocalDate getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public double getLuongCoBan() {
		return luongCoBan;
	}

	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	

	public HeSoLuong gethSL() {
		return hSL;
	}

	public void sethSL(HeSoLuong hSL) {
		this.hSL = hSL;
	}

	public ChucVu getChucVu() {
		return chucVu;
	}

	public void setChucVu(ChucVu chucVu) {
		this.chucVu = chucVu;
	}

	



	public PhuCapNV getPhuCap() {
		return phuCap;
	}

	public void setPhuCap(PhuCapNV phuCap) {
		this.phuCap = phuCap;
	}



	public PhongBan getPhongBan() {
		return phongBan;
	}

	public void setPhongBan(PhongBan phongBan) {
		this.phongBan = phongBan;
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}

	

	public NhanVien() {
		super();
	}

	public NhanVien(String maNVHC) {
		super();
		this.maNVHC = maNVHC;
	}

	public NhanVien(String maNVHC, String hoTen, String cmnd, LocalDate ngaySinh, String gioiTinh, double luongCoBan,
			String sdt, String diaChi, ChucVu chucVu, HeSoLuong hSL, PhuCapNV phuCap, PhongBan phongBan,
			String trangThai) {
		super();
		this.maNVHC = maNVHC;
		this.hoTen = hoTen;
		this.cmnd = cmnd;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.luongCoBan = luongCoBan;
		this.sdt = sdt;
		this.diaChi = diaChi;
		this.chucVu = chucVu;
		this.hSL = hSL;
		this.phuCap = phuCap;
		this.phongBan = phongBan;
		this.trangThai = trangThai;
	}

	@Override
	public String toString() {
		return "NhanVien [maNVHC=" + maNVHC + ", hoTen=" + hoTen + ", cmnd=" + cmnd + ", ngaySinh=" + ngaySinh
				+ ", gioiTinh=" + gioiTinh + ", luongCoBan=" + luongCoBan + ", sdt=" + sdt + ", diaChi=" + diaChi
				+ ", chucVu=" + chucVu + ", hSL=" + hSL + ", phuCap=" + phuCap + ", phongBan=" + phongBan
				+ ", trangThai=" + trangThai + "]";
	}

	

	

	

}
