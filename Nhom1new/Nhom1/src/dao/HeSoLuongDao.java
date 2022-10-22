package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connectDB.Database;
import entity.ChucVu;
import entity.HeSoLuong;

public class HeSoLuongDao {
	private List<HeSoLuong> heSoLuongs = new ArrayList<HeSoLuong>();
	public List<HeSoLuong> DocDB() {
		try {
			Connection con = Database.getInstance().getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from HeSoLuong");
			while (rs.next()) {
				String maHeSoLuong = rs.getString(1);
				float heSoLuong = rs.getFloat(2);
				HeSoLuong hsl= new HeSoLuong(maHeSoLuong, heSoLuong);
				heSoLuongs.add(hsl);
				
				
				
			}
		} catch (Exception e) {
			
			e.printStackTrace();
			// TODO: handle exception
		}
		return heSoLuongs;
	}
	
	public HeSoLuong searchHoSoLuongWhereHSL(String hsLuong)  {
		HeSoLuong heSoLuong = null;
		try {
			Connection con = Database.getInstance().getConnection();
			PreparedStatement stmt = null;
			stmt = con.prepareStatement("select *from [dbo].[HeSoLuong] where [hesoLuong] = ?");
			stmt.setString(1, hsLuong);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				String maHSL = rs.getString(1);
				
				heSoLuong = new HeSoLuong(maHSL);
								
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return heSoLuong;
	}
	
	public HeSoLuong searchHoSoLuongWhereID(String id)  {
		HeSoLuong heSoLuong = null;
		try {
			Connection con = Database.getInstance().getConnection();
			PreparedStatement stmt = null;
			stmt = con.prepareStatement("select *from [dbo].[HeSoLuong] where maHSL = ?");
			stmt.setString(1, id);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				String maHSL = rs.getString(1);
				float hsl = rs.getFloat(2);
				heSoLuong = new HeSoLuong(maHSL, hsl);
								
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return heSoLuong;
	}
	
}