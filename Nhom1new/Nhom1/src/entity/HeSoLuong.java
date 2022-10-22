package entity;

public class HeSoLuong {
	private String maHeSoLuong;
	private float heSoLuong;
	public String getMaHeSoLuong() {
		return maHeSoLuong;
	}
	public void setMaHeSoLuong(String maHeSoLuong) {
		this.maHeSoLuong = maHeSoLuong;
	}
	public float getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(float heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	public HeSoLuong() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HeSoLuong(String maHeSoLuong, float heSoLuong) {
		super();
		this.maHeSoLuong = maHeSoLuong;
		this.heSoLuong = heSoLuong;
	}
	
	
	public HeSoLuong(String maHeSoLuong) {
		super();
		this.maHeSoLuong = maHeSoLuong;
	}
	@Override
	public String toString() {
		return "HeSoLuong [maHeSoLuong=" + maHeSoLuong + ", heSoLuong=" + heSoLuong + "]";
	}
	
	

}
