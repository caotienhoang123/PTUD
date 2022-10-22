package gui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import dao.ChucVuDao;
import dao.HeSoLuongDao;
import dao.NhanVienDao;
import dao.PhongBanDao;
import dao.PhuCapDao;
import dao.TaiKhoanDao;
import entity.ChucVu;
import entity.HeSoLuong;
import entity.NhanVien;
import entity.PhongBan;
import entity.PhuCapNV;
import entity.TaiKhoan;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class CapNhatNVHC extends JPanel implements ActionListener,MouseListener {
	private JTextField txt_maNv;
	private JTextField txt_hoTen;
	private JTextField txt_cmnd;
	private JTextField txt_luongCb;
	private JTextField txt_sdt;
	private JTextField txt_diaChi;
	private JDateChooser dateNgaySinh;
	private JComboBox cmb_ChucVu;
	private ChucVuDao chucVuDao = new ChucVuDao();
	private List<ChucVu> chucVus = new ArrayList<ChucVu>();
	
	private HeSoLuongDao heSoLuongDao = new HeSoLuongDao();
	private List<HeSoLuong> heSoLuongs = new ArrayList<HeSoLuong>();
	private JComboBox cmb_HeSoLuong;
	private JComboBox cmb_PhuCap;
	private List<PhuCapNV> phuCapNVs = new ArrayList<PhuCapNV>();
	private PhuCapDao phuCapDao = new PhuCapDao();
	private JComboBox cmb_PhongBan;
	private List<PhongBan> phongBans = new ArrayList<PhongBan>();
	private PhongBanDao phongBanDao = new PhongBanDao();
	private JPanel pnl_table;
	private DefaultTableModel data_ModelNV;
	private JTable table_NhanVien;
	private JButton btn_them;
	private JComboBox cmb_GioiTinh;
	
	private NhanVienDao nhanVienDao = new NhanVienDao();
	private List<NhanVien> nhanViens = new ArrayList<NhanVien>();
	
	private TaiKhoanDao taiKhoanDao = new TaiKhoanDao();
	private JButton btn_capNhat;
	private JButton btn_xoaRong;
	private JComboBox cmb_trangThai;
	
	/**
	 * Create the panel.
	 */
	public CapNhatNVHC() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CẬP NHẬT NHÂN VIÊN HÀNH CHÍNH");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(388, 10, 400, 30);
		add(lblNewLabel);
		
		JLabel lblMaNV = new JLabel("Mã NV: ");
		lblMaNV.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblMaNV.setBounds(123, 70, 110, 22);
		add(lblMaNV);
		
		JLabel lblNewLabel_1_1 = new JLabel("CMND");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(118, 170, 71, 22);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Lương CB: ");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(438, 70, 97, 25);
		add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Hệ Số Lương");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(789, 220, 97, 22);
		add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_5 = new JLabel("Họ tên: ");
		lblNewLabel_1_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_5.setBounds(122, 120, 71, 22);
		add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Ngày Sinh");
		lblNewLabel_1_6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_6.setBounds(118, 220, 71, 22);
		add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("SDT");
		lblNewLabel_1_7.setBounds(439, 127, 71, 22);
		add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("Phòng Ban");
		lblNewLabel_1_8.setBounds(827, 121, 71, 22);
		add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_3 = new JLabel("Giới tính: ");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3.setBounds(123, 270, 91, 22);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Địa Chỉ");
		lblNewLabel_4.setBounds(441, 176, 45, 13);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_9 = new JLabel("Phụ Cấp");
		lblNewLabel_1_9.setBounds(827, 71, 71, 22);
		add(lblNewLabel_1_9);
		
		txt_maNv = new JTextField();
		txt_maNv.setBounds(233, 70, 155, 25);
		add(txt_maNv);
		txt_maNv.setColumns(10);
		
		txt_hoTen = new JTextField();
		txt_hoTen.setColumns(10);
		txt_hoTen.setBounds(233, 120, 155, 25);
		add(txt_hoTen);
		
		txt_cmnd = new JTextField();
		txt_cmnd.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txt_cmnd.setColumns(10);
		txt_cmnd.setBounds(233, 170, 155, 25);
		add(txt_cmnd);
		
		txt_luongCb = new JTextField();
		txt_luongCb.setColumns(10);
		txt_luongCb.setBounds(567, 73, 155, 19);
		add(txt_luongCb);
		
		txt_sdt = new JTextField();
		txt_sdt.setColumns(10);
		txt_sdt.setBounds(566, 122, 155, 19);
		add(txt_sdt);
		
		txt_diaChi = new JTextField();
		txt_diaChi.setColumns(10);
		txt_diaChi.setBounds(567, 172, 155, 19);
		add(txt_diaChi);
		
		cmb_HeSoLuong = new JComboBox();
		cmb_HeSoLuong.setFont(new Font("Times New Roman", Font.BOLD, 15));
		cmb_HeSoLuong.setBounds(908, 219, 155, 25);
		add(cmb_HeSoLuong);
		
		cmb_trangThai = new JComboBox();
		cmb_trangThai.setModel(new DefaultComboBoxModel(new String[] {"Đang Làm Việc", "Đã Thôi Việc"}));
		cmb_trangThai.setBounds(908, 172, 155, 21);
		add(cmb_trangThai);
		
		cmb_PhongBan = new JComboBox();
		cmb_PhongBan.setBounds(908, 122, 155, 21);
		add(cmb_PhongBan);
		
		cmb_GioiTinh = new JComboBox();
		cmb_GioiTinh.setFont(new Font("Times New Roman", Font.BOLD, 15));
		cmb_GioiTinh.setModel(new DefaultComboBoxModel(new String[] {"Nam", "Nữ"}));
		cmb_GioiTinh.setBounds(233, 270, 155, 25);
		add(cmb_GioiTinh);
		
		JLabel lblNewLabel_1_9_1 = new JLabel("Chuc Vu");
		lblNewLabel_1_9_1.setBounds(446, 223, 71, 22);
		add(lblNewLabel_1_9_1);
		
		cmb_PhuCap = new JComboBox();
		cmb_PhuCap.setBounds(908, 72, 155, 21);
		add(cmb_PhuCap);
		
		JLabel lblNewLabel_1_8_1 = new JLabel("Trạng Thái");
		lblNewLabel_1_8_1.setBounds(827, 161, 71, 22);
		add(lblNewLabel_1_8_1);
		
		dateNgaySinh = new JDateChooser();
		dateNgaySinh.setDateFormatString("yyyy-MM-dd");
		dateNgaySinh.setFont(new Font("Time New Roman", Font.BOLD, 15));
		dateNgaySinh.setBounds(233, 220, 155, 25);
		add(dateNgaySinh);
		
		pnl_table = new JPanel();
		pnl_table.setBackground(new Color(192, 192, 192));
		pnl_table.setBounds(0, 353, 1188, 239);
		pnl_table.setLayout(null);
		
		add(pnl_table);
		Box bQuanLiNhanVien;
		pnl_table.add(bQuanLiNhanVien = Box.createHorizontalBox());
		String[] headers_NV = { "Mã nhân viên", "Tên nhân viên", "CMND", "Ngày sinh", "Giới tính", "Lương Cơ Bản",
				"SDT", "Địa chỉ", "Chức Vụ","Hệ Số Lương","Phụ Cấp","Phòng Ban","Trạng Thái" };
		data_ModelNV = new DefaultTableModel(headers_NV, 0);
		
		JScrollPane jScrollPane_NhanVien;
		bQuanLiNhanVien.add(jScrollPane_NhanVien = new JScrollPane(table_NhanVien = new JTable(data_ModelNV)));
		jScrollPane_NhanVien.setBorder(BorderFactory.createTitledBorder("Danh sách nhân viên"));
		bQuanLiNhanVien.setBounds(5, 5, 1178, 229);

		
		
		
		cmb_ChucVu = new JComboBox();
		cmb_ChucVu.setBounds(570, 219, 155, 21);
		add(cmb_ChucVu);
		
		btn_them = new JButton("THÊM");
		btn_them.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btn_them.setBackground(new Color(128, 255, 255));
		btn_them.setBounds(512, 288, 126, 30);
		add(btn_them);
		
		btn_capNhat = new JButton("CẬP NHẬT");
		btn_capNhat.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btn_capNhat.setBackground(new Color(255, 128, 64));
		btn_capNhat.setBounds(682, 288, 126, 30);
		add(btn_capNhat);
		
		btn_xoaRong = new JButton("XÓA RỖNG");
		btn_xoaRong.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btn_xoaRong.setBackground(new Color(128, 255, 128));
		btn_xoaRong.setBounds(837, 288, 126, 30);
		add(btn_xoaRong);
		////////////////////////////////
		upCmbChucVu();
		upCmbHeSoLuong();
		upCmbPhuCap();
		upCmbPhongBan();
		/////////////////////////////////
		btn_them.addActionListener(this);
		btn_capNhat.addActionListener(this);
		btn_xoaRong.addActionListener(this);
		table_NhanVien.addMouseListener(this);
		
		updateTable();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if (o.equals(btn_them)) {
			if (valibData()) {
				addNhanVienHC();
			}
			
		}
		else if (o.equals(btn_capNhat)) {
			update_Action();
			
		}
		else if (o.equals(btn_xoaRong)) {
		XoaTrang();
		}
		
	}
	
	
	public void updateTable() {
		nhanViens =nhanVienDao.docDB();
		for (NhanVien nv : nhanViens) {
			ChucVu chucVu = chucVuDao.searchChucVuWhereID(nv.getChucVu().getMaChucVu());
			String tenChucVu = chucVu.getTenChucVu();
			
			HeSoLuong heSoLuong = heSoLuongDao.searchHoSoLuongWhereID(nv.gethSL().getMaHeSoLuong());
			String hSOLuong = heSoLuong.getHeSoLuong()+"";
			
			PhuCapNV capNV = phuCapDao.searchPhuCapNVWhereId(nv.getPhuCap().getMaPhuCap());
			String tienPC = capNV.getTienPhuCap()+"";
			
			PhongBan phongBan = phongBanDao.searchPhongBanWhereID(nv.getPhongBan().getMaPhongBan());
			String tenPB = phongBan.getTenPhongBan();
			
			String[] rowNhanVien = {nv.getMaNVHC(), nv.getHoTen(), nv.getCmnd(), nv.getNgaySinh()+"", nv.getGioiTinh(),nv.getLuongCoBan()+"", nv.getSdt(), nv.getDiaChi(), tenChucVu, hSOLuong,tienPC, tenPB, nv.getTrangThai()};
			
			data_ModelNV.addRow(rowNhanVien);
			
		}
		
	}
	
	private void xoaHetTable_Nhanvien() {
		DefaultTableModel dm = (DefaultTableModel) table_NhanVien.getModel();
		dm.getDataVector().removeAllElements();
	}
	
	public void XoaTrang() {
		txt_maNv.setText(null);
		txt_hoTen.setText(null);
		txt_cmnd.setText(null);
		dateNgaySinh.setDate(null);
		cmb_GioiTinh.setSelectedItem(null);
		txt_luongCb.setText(null);
		txt_sdt.setText(null);
		txt_diaChi.setText(null);
		cmb_ChucVu.setSelectedItem(null);
		cmb_PhuCap.setSelectedItem(null);
		cmb_PhongBan.setSelectedItem(null);
		cmb_trangThai.setSelectedItem(null);
		cmb_HeSoLuong.setSelectedItem(null);
		txt_maNv.requestFocus();
		
	}
	public void addNhanVienHC() {
		String maNv = txt_maNv.getText().trim();
		String hoTen = txt_hoTen.getText().trim();
		String cmnd = txt_cmnd.getText().trim();
		
		Date ngaySinh = dateNgaySinh.getDate();
		int ngay = ngaySinh.getDate();
		int thang =ngaySinh.getMonth()+1;
		int nam = ngaySinh.getYear()+1900;
		LocalDate ns= LocalDate.of(nam, thang,ngay);
		
		String gioiTinh = cmb_GioiTinh.getSelectedItem().toString();
		double luongCoBan = Double.parseDouble(txt_luongCb.getText());
		
		String sdt = txt_sdt.getText().trim();
		String diaChi = txt_diaChi.getText().trim();
		//
		String tenChucVu =cmb_ChucVu.getSelectedItem().toString();
		ChucVu chucVutemp = chucVuDao.searchChucVuWhereName(tenChucVu);
		System.out.println(chucVutemp.getMaChucVu());
		//
		String hsLuong = cmb_HeSoLuong.getSelectedItem().toString();
		HeSoLuong heSoLuongTemp = heSoLuongDao.searchHoSoLuongWhereHSL(hsLuong);
		System.out.println(heSoLuongTemp.getMaHeSoLuong());
		//
		
		String tienPhuCap = Double.parseDouble(cmb_PhuCap.getSelectedItem().toString())+"";
		PhuCapNV capNV = phuCapDao.searchPhuCapNVWhereTienPhuCap(tienPhuCap);
		System.out.println(capNV.getMaPhuCap());
		
		String tenPhongBan = cmb_PhongBan.getSelectedItem().toString();
		PhongBan phongBan = phongBanDao.searchPhongBanWhereTenPhongBan(tenPhongBan);
		System.out.println(phongBan.getMaPhongBan());
		
		String trangThai ="Đang Làm Việc";
		
		NhanVien nhanVien = new NhanVien(maNv, hoTen, cmnd, ns, gioiTinh, luongCoBan, sdt, diaChi, chucVutemp, heSoLuongTemp, capNV, phongBan, trangThai);
		if (nhanVienDao.addNhanVienHC(nhanVien)) {
			JOptionPane.showMessageDialog(this, "Thêm thành công, nhân viên vừa thêm có mã là: "+maNv);
			String[] rowNhanVien = {maNv, hoTen, cmnd, ns+"", gioiTinh, luongCoBan+"", sdt, diaChi,tenChucVu, hsLuong, tienPhuCap, tenChucVu, trangThai };
			data_ModelNV.addRow(rowNhanVien);
			TaiKhoan taiKhoan = new TaiKhoan(maNv, tenChucVu, "Đang hoạt động","123456");
			taiKhoanDao.addTaiKhoan(taiKhoan);
		}
		else {
			JOptionPane.showMessageDialog(this, "Thêm thất bại");
		}
		
		
	}
	
	public boolean valibData() {
		if (dateNgaySinh.getDate()==null) {
			JOptionPane.showMessageDialog(this, "Bạn chưa nhập ngày sinh nhân viên");
			return false;
		}
		else if (txt_luongCb.getText().equals("")) {
			JOptionPane.showMessageDialog(this, "Bạn chưa nhập lương cơ bản nhân viên");
			return false;
		}
		else if (txt_maNv.getText().equals(null)) {
			JOptionPane.showMessageDialog(this, "Mã nhân viên không đúng định dạng");
			return false;
		}
		else if (txt_hoTen.getText().equals(null)) {
			JOptionPane.showMessageDialog(this, "Bạn chưa nhập họ tên nhân viên");
			return false;
		}
		else if (txt_cmnd.getText().equals(null)) {
			JOptionPane.showMessageDialog(this, "Bạn chưa nhập CCCD nhân viên");
			return false;
		}
		else if (txt_sdt.getText().equals(null)) {
			JOptionPane.showMessageDialog(this, "Bạn chưa nhập số điện thoại nhân viên");
			return false;
		}
		else if (txt_diaChi.getText().equals(null)) {
			JOptionPane.showMessageDialog(this, "Bạn chưa nhập địa chỉ nhân viên");
			return false;
		}
		
		return true;
	}
	
	public void upCmbChucVu() {
		chucVus = chucVuDao.DocDB();
		for (ChucVu chucVu : chucVus) {
			cmb_ChucVu.addItem(chucVu.getTenChucVu());
		}
	}
	public void upCmbHeSoLuong() {
		heSoLuongs = heSoLuongDao.DocDB();
		for (HeSoLuong heSoLuong : heSoLuongs) {
			cmb_HeSoLuong.addItem(heSoLuong.getHeSoLuong());
		}
		}
		private void update_Action() {
			int row = table_NhanVien.getSelectedRow();
			if (row!=-1) {
				String maNv = txt_maNv.getText().trim();
				String hoTen = txt_hoTen.getText().trim();
				String cmnd = txt_cmnd.getText().trim();
				
				Date ngaySinh = dateNgaySinh.getDate();
				int ngay = ngaySinh.getDate();
				int thang =ngaySinh.getMonth()+1;
				int nam = ngaySinh.getYear()+1900;
				LocalDate ns= LocalDate.of(nam, thang,ngay);
				
				String gioiTinh = cmb_GioiTinh.getSelectedItem().toString();
				double luongCoBan = Double.parseDouble(txt_luongCb.getText());
				
				String sdt = txt_sdt.getText().trim();
				String diaChi = txt_diaChi.getText().trim();
				//
				String tenChucVu =cmb_ChucVu.getSelectedItem().toString();
				ChucVu chucVutemp = chucVuDao.searchChucVuWhereName(tenChucVu);
				System.out.println(chucVutemp.getMaChucVu());
				//
				String hsLuong = cmb_HeSoLuong.getSelectedItem().toString();
				HeSoLuong heSoLuongTemp = heSoLuongDao.searchHoSoLuongWhereHSL(hsLuong);
				System.out.println(heSoLuongTemp.getMaHeSoLuong());
				//
				
				String tienPhuCap = Double.parseDouble(cmb_PhuCap.getSelectedItem().toString())+"";
				PhuCapNV capNV = phuCapDao.searchPhuCapNVWhereTienPhuCap(tienPhuCap);
				System.out.println(capNV.getMaPhuCap());
				
				String tenPhongBan = cmb_PhongBan.getSelectedItem().toString();
				PhongBan phongBan = phongBanDao.searchPhongBanWhereTenPhongBan(tenPhongBan);
				System.out.println(phongBan.getMaPhongBan());
				
				String trangThai ="Đang Làm Việc";
				NhanVien nv = new NhanVien(maNv, hoTen, cmnd, ns, gioiTinh, luongCoBan, sdt, diaChi, chucVutemp, heSoLuongTemp, capNV, phongBan, trangThai);
				System.out.println();
					if (nhanVienDao.update(nv)) {
						JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
						table_NhanVien.setValueAt(maNv, row, 0);
//						table_NhanVien.setValueAt(hoTen, row, 1);
//						table_NhanVien.setValueAt(cmnd, row, 2);
//						table_NhanVien.setValueAt(ns, row, 3);
//						table_NhanVien.setValueAt(gioiTinh, row, 4);
//						table_NhanVien.setValueAt(luongCoBan, row, 5);
//						table_NhanVien.setValueAt(sdt, row, 6);
//						table_NhanVien.setValueAt(diaChi, row, 7);
//						table_NhanVien.getValueAt(row, 8);
//						table_NhanVien.setValueAt(gioiTinh, row, 9);
//						table_NhanVien.getValueAt(row, 10);
//						table_NhanVien.getValueAt(row, 11);
//						table_NhanVien.setValueAt(tenChucVu, row, 12);
//						
						
					
						
					}
					else {
						JOptionPane.showMessageDialog(this, "Cập nhật thất bại!");
					}
				
			}
			else {
				JOptionPane.showMessageDialog(this, "Bạn chưa chọn nhân viên cần cập nhật");
			}
		}
	public void upCmbPhuCap() {
		phuCapNVs = phuCapDao.DocDB();
		for (PhuCapNV phuCapNV : phuCapNVs) {
			cmb_PhuCap.addItem(phuCapNV.getTienPhuCap());
			
		}
	}
	public void upCmbPhongBan() {
		phongBans = phongBanDao.DocDB();
		for (PhongBan phongBan : phongBans) {
			cmb_PhongBan.addItem(phongBan.getTenPhongBan());
			
		}
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		Object src =e.getSource();
		if (src.equals(table_NhanVien)) {
			int row = table_NhanVien.getSelectedRow();
			if (row != -1) {
				txt_maNv.setText(table_NhanVien.getValueAt(row, 0).toString());
				txt_hoTen.setText(table_NhanVien.getValueAt(row, 1).toString());
				txt_cmnd.setText(table_NhanVien.getValueAt(row, 2).toString());
				cmb_GioiTinh.setSelectedItem(table_NhanVien.getValueAt(row, 4).toString());
				
				LocalDate ngaySinh = nhanViens.get(row).getNgaySinh();

				String daySinh = ngaySinh.getDayOfMonth() + "";
				String monthSinh = ngaySinh.getMonthValue() + "";
				String yearSinh = ngaySinh.getYear() + "";

				if (daySinh.length() == 1) {
					daySinh = "0" + daySinh;
				}
				if (monthSinh.length() == 1) {
					monthSinh = "0" + monthSinh;
				}

				String ddSinh = yearSinh + "-" + monthSinh + "-" + daySinh;
				Date dateSinh = null;

				try {
					dateSinh = new SimpleDateFormat("yyyy-MM-dd").parse(ddSinh);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dateNgaySinh.setDate(dateSinh);
				
				double luong = Double.parseDouble(table_NhanVien.getValueAt(row, 5).toString());
				txt_luongCb.setText(luong+"");
				
				
				txt_sdt.setText(table_NhanVien.getValueAt(row, 6).toString());
				txt_diaChi.setText(table_NhanVien.getValueAt(row, 7).toString());
				cmb_ChucVu.setSelectedItem(table_NhanVien.getValueAt(row, 8).toString());
				cmb_HeSoLuong.setSelectedItem(table_NhanVien.getValueAt(row, 9).toString());
				cmb_PhuCap.setSelectedItem(table_NhanVien.getValueAt(row, 10).toString());
				cmb_PhongBan.setSelectedItem(table_NhanVien.getValueAt(row, 11).toString());
				cmb_trangThai.setSelectedItem(table_NhanVien.getValueAt(row, 7).toString());
			}
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
