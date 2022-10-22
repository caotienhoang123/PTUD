package entity;

public class PhongBan {
	private String maPhongBan;
	private String tenPhongBan;
	private String diaChi;
	public String getMaPhongBan() {
		return maPhongBan;
	}
	public void setMaPhongBan(String maPhongBan) {
		this.maPhongBan = maPhongBan;
	}
	public String getTenPhongBan() {
		return tenPhongBan;
	}
	public void setTenPhongBan(String tenPhongBan) {
		this.tenPhongBan = tenPhongBan;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public PhongBan(String maPhongBan, String tenPhongBan, String diaChi) {
		super();
		this.maPhongBan = maPhongBan;
		this.tenPhongBan = tenPhongBan;
		this.diaChi = diaChi;
	}
	public PhongBan() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public PhongBan(String maPhongBan) {
		super();
		this.maPhongBan = maPhongBan;
	}
	@Override
	public String toString() {
		return "PhongBan [maPhongBan=" + maPhongBan + ", tenPhongBan=" + tenPhongBan + ", diaChi=" + diaChi + "]";
	}
	
}
