package entity;

public class TaiKhoan {
	private String maTK;
	private String loaiTK;
	private String tinhTrang;
	private String matKhau;

	public String getMaTK() {
		return maTK;
	}

	public void setMaTK(String maTK) {
		this.maTK = maTK;
	}

	public String getLoaiTK() {
		return loaiTK;
	}

	public void setLoaiTK(String loaiTK) {
		this.loaiTK = loaiTK;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public TaiKhoan(String maTK, String loaiTK, String tinhTrang, String matKhau) {
		super();
		this.maTK = maTK;
		this.loaiTK = loaiTK;
		this.tinhTrang = tinhTrang;
		this.matKhau = matKhau;
	}

	/**
	 * 
	 */
	public TaiKhoan() {
		super();
	}

	/**
	 * @param maTK
	 */
	public TaiKhoan(String maTK) {
		super();
		this.maTK = maTK;
	}

	@Override
	public String toString() {
		return "TaiKhoan [maTK=" + maTK + ", loaiTK=" + loaiTK + ", tinhTrang=" + tinhTrang + ", matKhau=" + matKhau
				+ "]";
	}

}
