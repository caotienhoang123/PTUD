package gui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import dao.PhuCapDao;
import dao.SanPhamDao;
import entity.PhongBan;
import entity.PhuCapNV;
import entity.SanPham;

import javax.swing.JComboBox;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;

public class TimKiemSP extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPanel pnl_table_timkiemsp;
	private DefaultTableModel data_ModelTLSP;
	private JScrollPane jScrollPane_TimKiem;
	private JTable table_TKSP;
	private TableModel data_ModelTKSP;
	private JPanel pnl_table_congdoantk;
	private JTable table_CD;
	private JScrollPane jScrollPane_NhanVien;
	private DefaultTableModel data_ModelNV;
	private JComboBox cmb_maSanPham;
	private List<SanPham> sanPhams = new ArrayList<SanPham>();
	private SanPhamDao sanPhamDao = new SanPhamDao();

	/**
	 * Create the panel.
	 */
	public TimKiemSP() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tìm Kiếm Sản Phẩm");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(404, 10, 203, 29);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mã Sản Phẩm");
		lblNewLabel_1.setBounds(96, 54, 117, 13);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Kiểu Dáng");
		lblNewLabel_2.setBounds(96, 106, 117, 13);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tên Sản Phẩm");
		lblNewLabel_3.setBounds(444, 49, 87, 13);
		add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(250, 103, 150, 19);
		add(textField);
		textField.setColumns(10);
		
		cmb_maSanPham = new JComboBox();
		cmb_maSanPham.setBounds(250, 50, 150, 21);
		add(cmb_maSanPham);
		
		JLabel lblNewLabel_4 = new JLabel("Chất Liệu");
		lblNewLabel_4.setBounds(444, 106, 69, 13);
		add(lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setBounds(541, 49, 150, 19);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(541, 103, 150, 19);
		add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Tìm");
		btnNewButton.setBounds(565, 155, 85, 21);
		add(btnNewButton);
		pnl_table_congdoantk = new JPanel();
		pnl_table_congdoantk.setBackground(new Color(192, 192, 192));
		pnl_table_congdoantk.setBounds(0, 367, 1100, 239);
		pnl_table_congdoantk.setLayout(null);
		
		add(pnl_table_congdoantk);
		Box bQuanLiNhanVien1;
		pnl_table_congdoantk.add(bQuanLiNhanVien1 = Box.createHorizontalBox());
		String[] headers_CD1 = { "Mã SP", "Tên SP", "Kiểu Dáng", "Chất Liệu","Số Lượng" };
		data_ModelNV = new DefaultTableModel(headers_CD1, 0);
		
		JScrollPane jScrollPane_CD;
		bQuanLiNhanVien1.add(jScrollPane_NhanVien = new JScrollPane(table_CD = new JTable(data_ModelNV)));
		jScrollPane_NhanVien.setBorder(BorderFactory.createTitledBorder("Danh sách Tìm Kiếm"));
		bQuanLiNhanVien1.setBounds(5, 5, 1090, 229);
		upCmbMaSanPham();

	}
	public void upCmbMaSanPham() {
		sanPhams = sanPhamDao.docDB();
		for (SanPham sanPham : sanPhams ) {
			cmb_maSanPham.addItem(sanPham.getMaSP());
			
		}
		
	}
}
