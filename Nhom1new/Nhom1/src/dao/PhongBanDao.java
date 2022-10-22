package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connectDB.Database;

import entity.PhongBan;


public class PhongBanDao {
	private List<PhongBan> phongBans = new ArrayList<PhongBan>();
	public List<PhongBan> DocDB() {
		try {
			Connection con = Database.getInstance().getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from PhongBan");
			while (rs.next()) {
				String maPhongBan = rs.getString(1);
				String tenPhongBan = rs.getString(2);
				String diaChi = rs.getString(3);
				phongBans.add(new PhongBan(maPhongBan, tenPhongBan, diaChi));
				
			}
		} catch (Exception e) {
			
			e.printStackTrace();
			// TODO: handle exception
		}
		return phongBans;
	}
	
	public PhongBan searchPhongBanWhereTenPhongBan(String tenPhongBan)  {
		PhongBan phongBan = null;
		try {
			Connection con = Database.getInstance().getConnection();
			PreparedStatement stmt = null;
			stmt = con.prepareStatement("select *from [dbo].[PhongBan] where [tenPB] = ?");
			stmt.setString(1, tenPhongBan);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				String maPB = rs.getString(1);
				phongBan = new PhongBan(maPB);		
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return phongBan;
	}
	public PhongBan searchPhongBanWhereID(String id)  {
		PhongBan phongBan = null;
		try {
			Connection con = Database.getInstance().getConnection();
			PreparedStatement stmt = null;
			stmt = con.prepareStatement("select *from [dbo].[PhongBan] where maPB = ?");
			stmt.setString(1, id);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				String maPB = rs.getString(1);
				String tenPB = rs.getString(2);
				String diaChi = rs.getString(3);
				phongBan = new PhongBan(maPB, tenPB, diaChi);		
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return phongBan;
	}

}
