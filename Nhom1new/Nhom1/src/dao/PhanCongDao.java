package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connectDB.Database;
import entity.CongDoan;
import entity.CongNhan;
import entity.NhanVien;
import entity.PhanCong;
import entity.PhongBan;
import entity.PhuCapNV;
import entity.SanPham;



public class PhanCongDao {
	private List<PhanCong> phanCongs = new ArrayList<>();
	public List<PhanCong> DocDB() {
		try {
			Connection con = Database.getInstance().getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from PhanCong");
			while (rs.next()) {
	
				 String maPC = rs.getString(1);
				 String maCongNhan = rs.getString(2);
				 String maCongDoan = rs.getString(3);
			
				 int soLuong = rs.getInt(4);
					PhanCong phanCong = new PhanCong(maPC, new CongNhan(maCongNhan),new CongDoan(maCongDoan),soLuong);
					
					phanCongs.add(phanCong);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
			// TODO: handle exception
		}
		return phanCongs;
	}
	
	public boolean addPhanCong(PhanCong pc) {
		Connection con = Database.getInstance().getConnection();
		PreparedStatement stmt = null;
		int n = 0;
		try {
			stmt = con.prepareStatement("insert into PhanCong values(?,?,?,?)");
			stmt.setString(1, pc.getMaPC());
			stmt.setString(2, pc.getMaCongNhan().getHoTen());
			stmt.setString(3, pc.getMacongDoan().getTenCongDoan());
			
			
			stmt.setInt(4, pc.getSoLuongcan());
			
			
			n = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n > 0;
	}

}
