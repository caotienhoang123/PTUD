package entity;

public class PhuCapNV {
	private String maPhuCap;
	private String loaiPhuCap;
	private double tienPhuCap;
	public String getMaPhuCap() {
		return maPhuCap;
	}
	public void setMaPhuCap(String maPhuCap) {
		this.maPhuCap = maPhuCap;
	}
	public String getLoaiPhuCap() {
		return loaiPhuCap;
	}
	public void setLoaiPhuCap(String loaiPhuCap) {
		this.loaiPhuCap = loaiPhuCap;
	}
	public double getTienPhuCap() {
		return tienPhuCap;
	}
	public void setTienPhuCap(double tienPhuCap) {
		this.tienPhuCap = tienPhuCap;
	}
	public PhuCapNV(String maPhuCap, String loaiPhuCap, double tienPhuCap) {
		super();
		this.maPhuCap = maPhuCap;
		this.loaiPhuCap = loaiPhuCap;
		this.tienPhuCap = tienPhuCap;
	}
	public PhuCapNV() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public PhuCapNV(String maPhuCap) {
		super();
		this.maPhuCap = maPhuCap;
	}
	@Override
	public String toString() {
		return "PhuCapNV [maPhuCap=" + maPhuCap + ", loaiPhuCap=" + loaiPhuCap + ", tienPhuCap=" + tienPhuCap + "]";
	}
	

}
