package entity;

public class ChucVu {
	private String maChucVu;
	private String tenChucVu;
	public String getMaChucVu() {
		return maChucVu;
	}
	public void setMaChucVu(String maChucVu) {
		this.maChucVu = maChucVu;
	}
	public String getTenChucVu() {
		return tenChucVu;
	}
	public void setTenChucVu(String tenChucVu) {
		this.tenChucVu = tenChucVu;
	}
	public ChucVu(String maChucVu, String tenChucVu) {
		super();
		this.maChucVu = maChucVu;
		this.tenChucVu = tenChucVu;
	}
	public ChucVu() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param maChucVu
	 */
	public ChucVu(String maChucVu) {
		super();
		this.maChucVu = maChucVu;
	}
	@Override
	public String toString() {
		return "ChucVu [maChucVu=" + maChucVu + ", tenChucVu=" + tenChucVu + "]";
	}
	
	
	
}
