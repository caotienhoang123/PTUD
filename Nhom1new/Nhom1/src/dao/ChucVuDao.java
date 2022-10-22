package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connectDB.Database;
import entity.ChucVu;

public class ChucVuDao {
	private List<ChucVu> chucVus  = new ArrayList<ChucVu>();
	public List<ChucVu> DocDB() {
		try {
			Connection con = Database.getInstance().getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from ChucVu");
			while (rs.next()) {
				String maChucVu = rs.getString(1);
				String tenChucVu = rs.getString(2);
				ChucVu chucVu = new ChucVu(maChucVu, tenChucVu);
				chucVus.add(chucVu);
				
			}
		} catch (Exception e) {
			
			e.printStackTrace();
			// TODO: handle exception
		}
		return chucVus;
	}
	public ChucVu searchChucVuWhereName(String tenChucVu)  {
		ChucVu chucVu = null;
		try {
			Connection con = Database.getInstance().getConnection();
			PreparedStatement stmt = null;
			stmt = con.prepareStatement("select * from [dbo].[ChucVu] where tenChucVu=?");
			stmt.setString(1, tenChucVu);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				String maChucVu = rs.getString(1);
				String tenCv = rs.getString(2);
				chucVu = new ChucVu(maChucVu, tenChucVu);
								
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return chucVu;
	}
	public ChucVu searchChucVuWhereID(String maCV)  {
		ChucVu chucVu = null;
		try {
			Connection con = Database.getInstance().getConnection();
			PreparedStatement stmt = null;
			stmt = con.prepareStatement("select * from [dbo].[ChucVu] where maChucVu=?");
			stmt.setString(1, maCV);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				String maChucVu = rs.getString(1);
				String tenCv = rs.getString(2);
				chucVu = new ChucVu(maChucVu, tenCv);
								
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return chucVu;
	}
}

