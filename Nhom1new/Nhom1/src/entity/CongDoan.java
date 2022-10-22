package entity;

public class CongDoan {
	private String maCongDoan;
	private SanPham sanPham;
	private String tenCongDoan;
	private Double giaCongDoan;
	private int soLuong;
	private String congDoanTruoc;
	public String getMaCongDoan() {
		return maCongDoan;
	}
	public void setMaCongDoan(String maCongDoan) {
		this.maCongDoan = maCongDoan;
	}
	public SanPham getSanPham() {
		return sanPham;
	}
	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}
	public String getTenCongDoan() {
		return tenCongDoan;
	}
	public void setTenCongDoan(String tenCongDoan) {
		this.tenCongDoan = tenCongDoan;
	}
	public Double getGiaCongDoan() {
		return giaCongDoan;
	}
	public void setGiaCongDoan(Double giaCongDoan) {
		this.giaCongDoan = giaCongDoan;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public String getCongDoanTruoc() {
		return congDoanTruoc;
	}
	public void setCongDoanTruoc(String congDoanTruoc) {
		this.congDoanTruoc = congDoanTruoc;
	}
	public CongDoan(String maCongDoan, SanPham sanPham, String tenCongDoan, Double giaCongDoan, int soLuong,
			String congDoanTruoc) {
		super();
		this.maCongDoan = maCongDoan;
		this.sanPham = sanPham;
		this.tenCongDoan = tenCongDoan;
		this.giaCongDoan = giaCongDoan;
		this.soLuong = soLuong;
		this.congDoanTruoc = congDoanTruoc;
	}
	public CongDoan(String congDoan) {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CongDoan [maCongDoan=" + maCongDoan + ", sanPham=" + sanPham + ", tenCongDoan=" + tenCongDoan
				+ ", giaCongDoan=" + giaCongDoan + ", soLuong=" + soLuong + ", congDoanTruoc=" + congDoanTruoc + "]";
	}
	
	

}
