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
import entity.PhongBan;
import entity.PhuCapNV;
import entity.SanPham;



public class CongDoanDao {
	private List<CongDoan> congDoans = new ArrayList<>();
	public List<CongDoan> DocDB() {
		try {
			Connection con = Database.getInstance().getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from CongDoan");
			while (rs.next()) {
	
				 String maCongDoan = rs.getString(1);
				 String sanPham = rs.getString(2);
				 String tenCongDoan = rs.getString(3);
				 Double giaCongDoan = rs.getDouble(4);
				 int soLuong = rs.getInt(5);
				 String congDoanTruoc = rs.getString(6);
					CongDoan congDoan = new CongDoan(maCongDoan, new SanPham(sanPham),tenCongDoan,giaCongDoan,soLuong,congDoanTruoc);
					
					congDoans.add(congDoan);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
			// TODO: handle exception
		}
		return congDoans;
	}
	
	public boolean addCongDoan(CongDoan cd) {
		Connection con = Database.getInstance().getConnection();
		PreparedStatement stmt = null;
		int n = 0;
		try {
			stmt = con.prepareStatement("insert into CongDoan values(?,?,?,?,?,?)");
			stmt.setString(1, cd.getMaCongDoan());
			stmt.setString(2, cd.getSanPham().getTenSP());
			stmt.setString(3, cd.getTenCongDoan());
			stmt.setDouble(4, cd.getGiaCongDoan());
			stmt.setInt(5, cd.getSoLuong());
			stmt.setString(6, cd.getCongDoanTruoc());
			
			n = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n > 0;
	}

}
