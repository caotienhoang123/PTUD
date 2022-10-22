package gui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import dao.SanPhamDao;
import entity.SanPham;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;

public class CongDoanSanXuat extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPanel pnl_table_congDoan;
	private DefaultTableModel data_ModelNV;
	private JTable table_congDoan;
	private JPanel pnl_table_congdoan2;
	private JTable table_CD;
	private JComboBox cmb_maSanPham;
	private List<SanPham> sanPhams = new ArrayList<SanPham>();
	private SanPhamDao sanPhamDao = new SanPhamDao();
	private JComboBox cmb_tenSanPham;

	/**
	 * Create the panel.
	 */
	public CongDoanSanXuat() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Công Đoạn Sản Xuất");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(448, 10, 179, 36);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mã Công Đoạn :");
		lblNewLabel_1.setBounds(27, 78, 120, 13);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tên Công Đoạn :");
		lblNewLabel_2.setBounds(27, 120, 120, 13);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Giá");
		lblNewLabel_3.setBounds(27, 165, 120, 13);
		add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(164, 75, 119, 19);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(164, 117, 119, 19);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(164, 162, 119, 19);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Mã Sản Phẩm");
		lblNewLabel_4.setBounds(309, 78, 85, 13);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Tên Sản Phẩm");
		lblNewLabel_5.setBounds(309, 120, 85, 13);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Số Lượng");
		lblNewLabel_6.setBounds(309, 165, 85, 13);
		add(lblNewLabel_6);
		
		
		
		
		
		pnl_table_congDoan = new JPanel();
		pnl_table_congDoan.setBackground(new Color(192, 192, 192));
		pnl_table_congDoan.setBounds(553, 67, 518, 222);
		pnl_table_congDoan.setLayout(null);
		
		add(pnl_table_congDoan);
		Box bQuanLyCongDoan;
		pnl_table_congDoan.add(bQuanLyCongDoan = Box.createHorizontalBox());
		String[] headers_CD = { "Mã công đoạn", "Tên Sản Phẩm", "Kiểu Dáng", "Chất Liệu", "Số Lượng"};
		data_ModelNV = new DefaultTableModel(headers_CD, 0);
		
		JScrollPane jScrollPane_NhanVien;
		bQuanLyCongDoan.add(jScrollPane_NhanVien = new JScrollPane(table_congDoan = new JTable(data_ModelNV)));
		jScrollPane_NhanVien.setBorder(BorderFactory.createTitledBorder("Danh sách sản phẩm"));
		bQuanLyCongDoan.setBounds(5, 5, 509, 209);
		
		pnl_table_congdoan2 = new JPanel();
		pnl_table_congdoan2.setBackground(new Color(192, 192, 192));
		pnl_table_congdoan2.setBounds(0, 367, 1100, 239);
		pnl_table_congdoan2.setLayout(null);
		
		add(pnl_table_congdoan2);
		Box bQuanLiNhanVien1;
		pnl_table_congdoan2.add(bQuanLiNhanVien1 = Box.createHorizontalBox());
		String[] headers_CD1 = { "Mã CD", "Mã SP", "Tên CD", "Tên SP", "Giá CD", "","Số Lượng", "Công Đoạn Yêu Cầu" };
		data_ModelNV = new DefaultTableModel(headers_CD1, 0);
		
		JScrollPane jScrollPane_CD;
		bQuanLiNhanVien1.add(jScrollPane_NhanVien = new JScrollPane(table_CD = new JTable(data_ModelNV)));
		jScrollPane_NhanVien.setBorder(BorderFactory.createTitledBorder("Danh sách Công Đoạn"));
		bQuanLiNhanVien1.setBounds(5, 5, 1090, 229);
		
		
		
		cmb_maSanPham = new JComboBox();
		cmb_maSanPham.setBounds(404, 74, 118, 21);
		add(cmb_maSanPham);
		
		cmb_tenSanPham = new JComboBox();
		cmb_tenSanPham.setBounds(404, 116, 118, 21);
		add(cmb_tenSanPham);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(403, 165, 119, 20);
		add(spinner);
		
		JButton btnNewButton = new JButton("Thêm");
		btnNewButton.setBounds(62, 230, 85, 21);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sửa");
		btnNewButton_1.setBounds(175, 230, 85, 21);
		add(btnNewButton_1);
		
		JButton btnXa = new JButton("Xóa");
		btnXa.setBounds(285, 230, 85, 21);
		add(btnXa);
		
		JButton btnNewButton_2 = new JButton("Xóa Rỗng");
		btnNewButton_2.setBounds(404, 230, 104, 21);
		add(btnNewButton_2);
		upCmbMaSanPham();
		upCmbTenSanPham();

	}
	public void upCmbMaSanPham() {
		sanPhams = sanPhamDao.docDB();
		for (SanPham sanPham : sanPhams ) {
			cmb_maSanPham.addItem(sanPham.getMaSP());
			
		}
		
	}
	public void upCmbTenSanPham() {
		sanPhams = sanPhamDao.docDB();
		for (SanPham sanPham : sanPhams ) {
			cmb_tenSanPham.addItem(sanPham.getTenSP());
			
		}
		
	}
}
