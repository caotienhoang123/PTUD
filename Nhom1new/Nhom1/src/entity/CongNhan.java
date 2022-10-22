package entity;

import java.time.LocalDate;

public class CongNhan {
	private String maCongNhan;
	private String hoTen;
	private String cmnd;
	private String gioiTinh;
	private LocalDate ngaySinh;
	private String sdt;
	private String diaChi;
	private PhuCapNV phuCap;
	private PhongBan phongBan;
	private String tinhTrang;
	public String getMaCongNhan() {
		return maCongNhan;
	}
	public void setMaCongNhan(String maCongNhan) {
		this.maCongNhan = maCongNhan;
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
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public LocalDate getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
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
	public String getTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	public CongNhan(String maCongNhan, String hoTen, String cmnd, String gioiTinh, LocalDate ngaySinh, String sdt,
			String diaChi, PhuCapNV phuCap, PhongBan phongBan, String tinhTrang) {
		super();
		this.maCongNhan = maCongNhan;
		this.hoTen = hoTen;
		this.cmnd = cmnd;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.sdt = sdt;
		this.diaChi = diaChi;
		this.phuCap = phuCap;
		this.phongBan = phongBan;
		this.tinhTrang = tinhTrang;
	}
	public CongNhan(String maCongNhan) {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CongNhan [maCongNhan=" + maCongNhan + ", hoTen=" + hoTen + ", cmnd=" + cmnd + ", gioiTinh=" + gioiTinh
				+ ", ngaySinh=" + ngaySinh + ", sdt=" + sdt + ", diaChi=" + diaChi + ", phuCap=" + phuCap
				+ ", phongBan=" + phongBan + ", tinhTrang=" + tinhTrang + "]";
	}
	
}
