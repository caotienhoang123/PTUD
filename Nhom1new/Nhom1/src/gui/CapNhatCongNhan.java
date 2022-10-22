package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import dao.PhongBanDao;
import dao.PhuCapDao;
import entity.PhongBan;
import entity.PhuCapNV;

import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class CapNhatCongNhan extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable table;
	private JComboBox cmb_phongBan;
	private List<PhongBan> phongBans = new ArrayList<PhongBan>();
	private PhongBanDao phongBanDao = new PhongBanDao();
	private JComboBox cmb_phuCap;
	private List<PhuCapNV> phuCapNVs = new ArrayList<PhuCapNV>();
	private PhuCapDao phuCapDao = new PhuCapDao();
	/**
	 * Create the panel.
	 */
	public CapNhatCongNhan() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CẬP NHẬT CÔNG NHÂN");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(424, 10, 182, 37);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mã CN");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(265, 72, 52, 27);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("CMND");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(265, 109, 52, 27);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Tình trạng");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(265, 146, 94, 27);
		add(lblNewLabel_1_2);
		
		textField = new JTextField();
		textField.setBounds(369, 72, 112, 25);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(369, 115, 112, 25);
		add(textField_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Họ Tên");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(529, 72, 52, 27);
		add(lblNewLabel_1_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(639, 75, 344, 25);
		add(textField_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Ngày Sinh");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3_1.setBounds(529, 118, 81, 27);
		add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("Số Điện Thoại");
		lblNewLabel_1_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3_1_1.setBounds(529, 155, 90, 27);
		add(lblNewLabel_1_3_1_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(639, 152, 112, 25);
		add(textField_5);
		
		JLabel lblNewLabel_1_3_1_2 = new JLabel("Giới Tính");
		lblNewLabel_1_3_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3_1_2.setBounds(795, 118, 81, 27);
		add(lblNewLabel_1_3_1_2);
		
		JLabel lblNewLabel_1_3_1_2_1 = new JLabel("Địa Chỉ");
		lblNewLabel_1_3_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3_1_2_1.setBounds(795, 155, 81, 27);
		add(lblNewLabel_1_3_1_2_1);
		
		JLabel lblNewLabel_1_3_1_2_2 = new JLabel("Phụ Cấp");
		lblNewLabel_1_3_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3_1_2_2.setBounds(795, 192, 81, 27);
		add(lblNewLabel_1_3_1_2_2);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(871, 152, 112, 25);
		add(textField_6);
		
		JLabel lblNewLabel_1_3_1_1_1 = new JLabel("Phòng Ban");
		lblNewLabel_1_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3_1_1_1.setBounds(529, 192, 90, 27);
		add(lblNewLabel_1_3_1_1_1);
		
		cmb_phongBan = new JComboBox();
		cmb_phongBan.setBounds(639, 194, 112, 25);
		add(cmb_phongBan);
		cmb_phuCap = new JComboBox();
		cmb_phuCap.setBounds(871, 197, 112, 22);
		add(cmb_phuCap);
		
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Nam ", "Nữ"}));
		comboBox_1.setBounds(871, 114, 112, 25);
		add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(639, 114, 112, 25);
		add(comboBox_2);
		
		JButton btnNewButton = new JButton("Thêm");
		btnNewButton.setBackground(new Color(128, 255, 255));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(332, 275, 107, 37);
		add(btnNewButton);
		
		JButton btnSa = new JButton("Sửa");
		btnSa.setBackground(new Color(192, 192, 192));
		btnSa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSa.setBounds(483, 275, 107, 37);
		add(btnSa);
		
		JButton btnXa = new JButton("Xóa");
		btnXa.setForeground(new Color(0, 0, 0));
		btnXa.setBackground(new Color(255, 255, 128));
		btnXa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnXa.setBounds(631, 275, 107, 37);
		add(btnXa);
		
		JButton btnXaRng = new JButton("Xóa Rỗng");
		btnXaRng.setBackground(new Color(255, 255, 255));
		btnXaRng.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnXaRng.setBounds(783, 275, 107, 37);
		add(btnXaRng);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 356, 1072, 162);
		add(scrollPane);
		//////////////////////
		upCmbPhongBan();
		upCmbPhuCap();
		
		
		
		
		
		
		
		
		
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 CN", "T\u00EAn CN", "CMND", "Ng\u00E0y Sinh", "Gi\u1EDBi T\u00EDnh", "\u0110\u1ECBa Ch\u1EC9", "S\u0110T", "Tr\u1EE3 C\u1EA5p", "Phòng Ban", "Tình Trạng"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(9).setPreferredWidth(95);
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		scrollPane.setViewportView(table);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(369, 151, 112, 21);
		add(comboBox);
		
		

	}
	public void upCmbPhongBan() {
		phongBans = phongBanDao.DocDB();
		for (PhongBan phongBan : phongBans) {
			cmb_phongBan.addItem(phongBan.getTenPhongBan());
			
		}
		
	}
	public void upCmbPhuCap() {
		phuCapNVs = phuCapDao.DocDB();
		for (PhuCapNV phuCapNV : phuCapNVs) {
			cmb_phuCap.addItem(phuCapNV.getTienPhuCap());
			
		}
	}
}
