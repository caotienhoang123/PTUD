package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JFormattedTextField;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import dao.CongDoanDao;
import dao.CongNhanDao;
import dao.PhongBanDao;
import dao.SanPhamDao;
import entity.CongDoan;
import entity.CongNhan;
import entity.PhongBan;
import entity.SanPham;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class ChamCongCongNhan2 extends JPanel {
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private JTable table_1;
	private JComboBox cmb_maSanPham;
	
	private List<SanPham> sanPhams = new ArrayList<SanPham>();
	private SanPhamDao sanPhamDao = new SanPhamDao();
	private JComboBox cmb_tenSP;
	
	
	private JComboBox cmb_tenCD;
	private List<CongDoan> congDoans = new ArrayList<CongDoan>();
	private CongDoanDao congDoanDao = new CongDoanDao();
	
	private JComboBox cmb_maCD;
	
	
	private JComboBox cmb_caLam;
	
	

	/**
	 * Create the panel.
	 */
	public ChamCongCongNhan2() {
		setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHẤM CÔNG CÔNG NHÂN");
		lblNewLabel.setBounds(304, 10, 204, 45);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mã Sản Phẩm");
		lblNewLabel_1.setBounds(434, 82, 97, 33);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tên Sản Phẩm");
		lblNewLabel_1_1.setBounds(434, 125, 97, 33);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Tên Công Đoạn");
		lblNewLabel_1_2.setBounds(434, 176, 108, 33);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Mã CĐ ");
		lblNewLabel_1_3.setBounds(434, 219, 97, 33);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblNewLabel_1_3);
		
	     cmb_maSanPham = new JComboBox();
		cmb_maSanPham.setBounds(541, 90, 124, 21);
		add(cmb_maSanPham);
		
		cmb_tenSP = new JComboBox();
		cmb_tenSP.setBounds(541, 133, 124, 21);
		add(cmb_tenSP);
		
		cmb_tenCD = new JComboBox();
		cmb_tenCD.setBounds(541, 184, 124, 21);
		add(cmb_tenCD);
		
		cmb_maCD = new JComboBox();
		cmb_maCD.setBounds(541, 227, 124, 21);
		add(cmb_maCD);
		
		JLabel lblNewLabel_1_4 = new JLabel("Ngày Chấm");
		lblNewLabel_1_4.setBounds(691, 79, 97, 33);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Ca Làm");
		lblNewLabel_1_5.setBounds(691, 125, 97, 33);
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Giờ Làm");
		lblNewLabel_1_6.setBounds(691, 168, 97, 33);
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("Lương Ca");
		lblNewLabel_1_7.setBounds(691, 219, 97, 33);
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_7_1 = new JLabel("Mã Ca");
		lblNewLabel_1_7_1.setBounds(691, 260, 97, 33);
		lblNewLabel_1_7_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblNewLabel_1_7_1);
		
		 cmb_caLam = new JComboBox();
		cmb_caLam.setBounds(798, 138, 124, 21);
		cmb_caLam.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(cmb_caLam);
		
		textField_1 = new JTextField();
		textField_1.setBounds(798, 182, 124, 19);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setColumns(10);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(798, 233, 124, 19);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_2.setColumns(10);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(798, 274, 124, 19);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_3.setColumns(10);
		add(textField_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(798, 91, 124, 21);
		comboBox_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(comboBox_4);
		
		JButton btnNewButton = new JButton("Lấy Danh Sách Chấm");
		btnNewButton.setBounds(477, 268, 183, 25);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Chấm Công");
		btnNewButton_1.setBounds(495, 370, 108, 33);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Xóa");
		btnNewButton_1_1.setBounds(739, 370, 108, 33);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(btnNewButton_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Số lượng còn lại cần làm :");
		lblNewLabel_2.setBounds(586, 317, 273, 33);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblNewLabel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(33, 78, 366, 270);
		add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 Ph\u00E2n C\u00F4ng", "M\u00E3 CN", "T\u00EAn CN", "C\u00F3 M\u1EB7t", "C\u00F3 Ph\u00E9p", "S\u1ED1 L\u01B0\u1EE3ng"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, Boolean.class, Boolean.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(89);
		table.getColumnModel().getColumn(4).setPreferredWidth(78);
		scrollPane.setViewportView(table);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(22, 444, 920, 91);
		add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 C\u00F4ng", "M\u00E3 CN", "T\u00EAn CN", "M\u00E3 PC", "M\u00E3 C\u0110", "T\u00EAn C\u0110", "Ng\u00E0y", "M\u00E3 Ca", "Ca", "Gi\u1EDD l\u00E0m", "S\u1ED1 SP", "Tr\u1EA1ng th\u00E1i", "Ngh\u1EC9 Ph\u00E9p"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		scrollPane_1.setViewportView(table_1);
		upCmbMaSP();
		upCmbtenSP();
		upCmbCDSP();
		upCmbMaCD();

	}
	public void upCmbMaSP() {
		sanPhams = sanPhamDao.docDB();
		for (SanPham sanPham : sanPhams) {
			cmb_maSanPham.addItem(sanPham.getMaSP());
			
		}
		
	}
	public void upCmbtenSP() {
		sanPhams = sanPhamDao.docDB();
		for (SanPham sanPham : sanPhams) {
			cmb_tenSP.addItem(sanPham.getTenSP());
			
		}
		
	}
	public void upCmbCDSP() {
		congDoans = congDoanDao.DocDB();
		for (CongDoan congDoan : congDoans) {
			cmb_tenCD.addItem(congDoan.getTenCongDoan());
			
		}
		
	}
	public void upCmbMaCD() {
		congDoans = congDoanDao.DocDB();
		for (CongDoan congDoan : congDoans) {
			cmb_maCD.addItem(congDoan.getMaCongDoan());
	
}}}
