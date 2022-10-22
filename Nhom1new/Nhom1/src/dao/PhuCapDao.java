package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connectDB.Database;
import entity.ChucVu;
import entity.PhuCapNV;


public class PhuCapDao {
	private List<PhuCapNV> phuCapNVs = new ArrayList<PhuCapNV>();
	public List<PhuCapNV> DocDB() {
		try {
			Connection con = Database.getInstance().getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from PhuCapNhanVien");
			while (rs.next()) {
				String maPhuCap = rs.getString(1);
				String loaiPhuCap = rs.getString(2);
				double tienPhuCap = rs.getDouble(3);
				phuCapNVs.add(new PhuCapNV(maPhuCap, loaiPhuCap, tienPhuCap));
			}
		} catch (Exception e) {
			
			e.printStackTrace();
			// TODO: handle exception
		}
		return phuCapNVs;
	}
	public PhuCapNV searchPhuCapNVWhereTienPhuCap(String tienPhuCap)  {
		PhuCapNV capNV = null;
		try {
			Connection con = Database.getInstance().getConnection();
			PreparedStatement stmt = null;
			stmt = con.prepareStatement("select *from [dbo].[PhuCapNhanVien] where  [tienPhuCap] =?");
			stmt.setString(1, tienPhuCap);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				String maPC = rs.getString(1);
				capNV = new PhuCapNV(maPC);				
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return capNV;
	}
	
	public PhuCapNV searchPhuCapNVWhereId(String maPCap)  {
		PhuCapNV capNV = null;
		try {
			Connection con = Database.getInstance().getConnection();
			PreparedStatement stmt = null;
			stmt = con.prepareStatement("select *from [dbo].[PhuCapNhanVien] where maPC =?");
			stmt.setString(1, maPCap);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				String maPC = rs.getString(1);
				String loaiPhuCap = rs.getString(2);
				double tienPhuCap = rs.getDouble(3);
				capNV = new PhuCapNV(maPC, loaiPhuCap, tienPhuCap);				
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return capNV;
	}
}