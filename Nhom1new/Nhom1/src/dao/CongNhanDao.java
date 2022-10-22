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
import entity.CongNhan;
import entity.HeSoLuong;
import entity.NhanVien;
import entity.PhongBan;
import entity.PhuCapNV;

public class CongNhanDao {
	private List<CongNhan> congNhans = new ArrayList<>();

	public List<CongNhan> docDB() {
		try {
			Connection con = Database.getInstance().getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from CongNhan");
			while (rs.next()) {
				String maCongNhan = rs.getString(1);
				String hoTen = rs.getString(2);
				String cmnd = rs.getString(3);
				String gioiTinh = rs.getString(4);
				LocalDate ngaySinh = rs.getDate(5).toLocalDate();
				 String sdt = rs.getString(6);
				 String diaChi = rs.getString(7);
				 String phuCap = rs.getString(8);
				 String phongBan = rs.getString(9);
				 String trangThai = rs.getString(10);

				CongNhan congNhan = new CongNhan(maCongNhan, hoTen, cmnd, gioiTinh, ngaySinh, sdt, diaChi, new PhuCapNV(phuCap), new PhongBan(phongBan),trangThai);
				
				congNhans.add(congNhan);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return congNhans;
	}

	public boolean addCongNhan(CongNhan cn) {
		Connection con = Database.getInstance().getConnection();
		PreparedStatement stmt = null;
		int n = 0;
		try {
			stmt = con.prepareStatement("insert into NhanVienHanhChinh values(?,?,?,?,?,?,?,?,?,?)");
			stmt.setString(1, cn.getMaCongNhan());
			stmt.setString(2, cn.getHoTen());
			stmt.setString(3, cn.getCmnd());
			stmt.setString(4, cn.getGioiTinh());
			stmt.setDate(5, Date.valueOf(cn.getNgaySinh()));
			stmt.setString(6, cn.getSdt());
			stmt.setString(7, cn.getDiaChi());
			stmt.setString(8, cn.getPhuCap().getMaPhuCap());
			stmt.setString(9, cn.getPhongBan().getMaPhongBan());
			stmt.setString(10, cn.getTinhTrang());
			n = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n > 0;
	}

}
