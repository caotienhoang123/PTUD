package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;

import connectDB.Database;
import entity.ChucVu;
import entity.HeSoLuong;
import entity.NhanVien;
import entity.PhongBan;
import entity.PhuCapNV;

public class NhanVienDao {
	private List<NhanVien> nhanViens = new ArrayList<>();

	public List<NhanVien> docDB() {
		try {
			Connection con = Database.getInstance().getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from NhanVienHanhChinh");
			while (rs.next()) {
				String maNV = rs.getString(1);
				String tenNV = rs.getString(2);
				String cmnd = rs.getString(3);
				LocalDate ngaySinh = rs.getDate(4).toLocalDate();
				String gioiTinh = rs.getString(5);
				double luongCB = rs.getDouble(6);
				String sdt = rs.getString(7);
				String diaChi = rs.getString(8);
				String chucVu = rs.getString(9);
				String maHSL = rs.getString(10);
				String phuCap = rs.getString(11);
				String phongBan = rs.getString(12);
				String trangThai = rs.getString(13);

				NhanVien nhanVien = new NhanVien(maNV, tenNV, cmnd, ngaySinh, gioiTinh, luongCB, sdt, diaChi,
						new ChucVu(chucVu), new HeSoLuong(maHSL), new PhuCapNV(phuCap), new PhongBan(phongBan),
						trangThai);
				
				nhanViens.add(nhanVien);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return nhanViens;
	}

	public boolean addNhanVienHC(NhanVien nv) {
		Connection con = Database.getInstance().getConnection();
		PreparedStatement stmt = null;
		int n = 0;
		try {
			stmt = con.prepareStatement("insert into NhanVienHanhChinh values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
			stmt.setString(1, nv.getMaNVHC());
			stmt.setString(2, nv.getHoTen());
			stmt.setString(3, nv.getCmnd());
			stmt.setDate(4, Date.valueOf(nv.getNgaySinh()));
			stmt.setString(5, nv.getGioiTinh());
			stmt.setDouble(6, nv.getLuongCoBan());
			stmt.setString(7, nv.getSdt());
			stmt.setString(8, nv.getDiaChi());
			stmt.setString(9, nv.getChucVu().getMaChucVu());
			stmt.setString(10, nv.gethSL().getMaHeSoLuong());
			stmt.setString(11, nv.getPhuCap().getMaPhuCap());
			stmt.setString(12, nv.getPhongBan().getMaPhongBan());
			stmt.setString(13, nv.getTrangThai());
			n = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n > 0;
	}
	public boolean update(NhanVien nv) {
		Connection con = Database.getInstance().getConnection();
		PreparedStatement stmt = null;
		int n = 0;
		try {
			stmt = con.prepareStatement("update NhanVienHanhChinh set hoTen=?, cmnd=?, ngaySinh =?, gioiTinh=?, luongCoBan=?, sdt=?, diaChi=?, chucVu=?,maHSL=?,phuCap=?,phongBan=?,trangThai=? where maNVHC=?");
			stmt.setString(1, nv.getMaNVHC());
			stmt.setString(2, nv.getHoTen());
			stmt.setString(3, nv.getCmnd());
			stmt.setDate(4, Date.valueOf(nv.getNgaySinh()));
			stmt.setString(5, nv.getGioiTinh());
			stmt.setDouble(6, nv.getLuongCoBan());
			stmt.setString(7, nv.getSdt());
			stmt.setString(8, nv.getDiaChi());
			stmt.setString(9, nv.getChucVu().getMaChucVu());
			stmt.setString(10, nv.gethSL().getMaHeSoLuong());
			stmt.setString(11, nv.getPhuCap().getMaPhuCap());
			stmt.setString(12, nv.getPhongBan().getMaPhongBan());
			stmt.setString(13, nv.getTrangThai());
			n = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n > 0;
	}
}
