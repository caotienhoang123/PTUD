package entity;

public class PhanCong {
	private String maPC;
	private CongNhan maCongNhan;
	private CongDoan macongDoan;
	private int soLuongcan;
	public String getMaPC() {
		return maPC;
	}
	public void setMaPC(String maPC) {
		this.maPC = maPC;
	}
	public CongNhan getMaCongNhan() {
		return maCongNhan;
	}
	public void setMaCongNhan(CongNhan maCongNhan) {
		this.maCongNhan = maCongNhan;
	}
	public CongDoan getMacongDoan() {
		return macongDoan;
	}
	public void setMacongDoan(CongDoan macongDoan) {
		this.macongDoan = macongDoan;
	}
	public int getSoLuongcan() {
		return soLuongcan;
	}
	public void setSoLuongcan(int soLuongcan) {
		this.soLuongcan = soLuongcan;
	}
	public PhanCong(String maPC, CongNhan maCongNhan, CongDoan macongDoan, int soLuongcan) {
		super();
		this.maPC = maPC;
		this.maCongNhan = maCongNhan;
		this.macongDoan = macongDoan;
		this.soLuongcan = soLuongcan;
	}
	public PhanCong() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PhanCong [maPC=" + maPC + ", maCongNhan=" + maCongNhan + ", macongDoan=" + macongDoan + ", soLuongcan="
				+ soLuongcan + "]";
	}

	

}
 