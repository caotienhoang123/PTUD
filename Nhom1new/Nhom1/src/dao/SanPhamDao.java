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
import entity.SanPham;

public class SanPhamDao {
	private List<SanPham> sanPhams = new ArrayList<>();
	

	public List<SanPham> docDB() {
		try {
			Connection con = Database.getInstance().getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from SanPham");
			while (rs.next()) {
				 String maSP = rs.getString(1);;
				 String tenSP = rs.getString(2);;
				 String kieuDang = rs.getString(3);;
				 String chatLieu = rs.getString(4);;
				 int soLuong = rs.getInt(5);;

				SanPham sanPham = new SanPham(maSP, tenSP,kieuDang,chatLieu, soLuong);
				
				sanPhams.add(sanPham);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return sanPhams;
	}

	public boolean addSanPham(SanPham sp) {
		Connection con = Database.getInstance().getConnection();
		PreparedStatement stmt = null;
		int n = 0;
		try {
			stmt = con.prepareStatement("insert into SanPham values(?,?,?,?,?)");
			stmt.setString(1, sp.getMaSP());
			
			n = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n > 0;
	}

}
