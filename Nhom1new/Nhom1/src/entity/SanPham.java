package entity;

public class SanPham {
	private String maSP;
	private String tenSP;
	private String kieuDang;
	private String chatLieu;
	private int soLuong;
	public String getMaSP() {
		return maSP;
	}
	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public String getKieuDang() {
		return kieuDang;
	}
	public void setKieuDang(String kieuDang) {
		this.kieuDang = kieuDang;
	}
	public String getChatLieu() {
		return chatLieu;
	}
	public void setChatLieu(String chatLieu) {
		this.chatLieu = chatLieu;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public SanPham(String maSP, String tenSP, String kieuDang, String chatLieu, int soLuong) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.kieuDang = kieuDang;
		this.chatLieu = chatLieu;
		this.soLuong = soLuong;
	}
	public SanPham(String sanPham) {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SanPham [maSP=" + maSP + ", tenSP=" + tenSP + ", kieuDang=" + kieuDang + ", chatLieu=" + chatLieu
				+ ", soLuong=" + soLuong + "]";
	}
}