package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import connectDB.Database;
import entity.TaiKhoan;

public class TaiKhoanDao {
	private List<TaiKhoan> taiKhoans = new ArrayList<TaiKhoan>();

	public boolean addTaiKhoan(TaiKhoan taiKhoan) {
		Connection con = Database.getInstance().getConnection();
		PreparedStatement stmt = null;
		int n = 0;
		try {
			stmt = con.prepareStatement("insert into TaiKhoan values(?,?,?,?)");
			stmt.setString(1, taiKhoan.getMaTK());
			stmt.setString(2, taiKhoan.getLoaiTK());
			stmt.setString(3, taiKhoan.getTinhTrang());
			stmt.setString(4, taiKhoan.getMatKhau());		
			
			n=stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return n>0;
	}
}
