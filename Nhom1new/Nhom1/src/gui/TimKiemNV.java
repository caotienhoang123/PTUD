package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TimKiemNV extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private JComboBox cmb_maNV;

	/**
	 * Create the panel.
	 */
	public TimKiemNV () {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TÌM KIẾM CÔNG NHÂN");
		lblNewLabel.setBounds(474, 10, 188, 37);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mã NV");
		lblNewLabel_1.setBounds(34, 76, 67, 26);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("CMND");
		lblNewLabel_1_1.setBounds(34, 112, 67, 26);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Ngày Sinh ");
		lblNewLabel_1_2.setBounds(34, 163, 69, 26);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Phòng Ban");
		lblNewLabel_1_3.setBounds(34, 213, 84, 26);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblNewLabel_1_3);
		
		cmb_maNV = new JComboBox();
		cmb_maNV.setBounds(173, 79, 149, 24);
		add(cmb_maNV);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(173, 165, 149, 26);
		add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(173, 215, 149, 26);
		add(comboBox_2);
		
		textField = new JTextField();
		textField.setBounds(173, 115, 149, 26);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_4 = new JLabel("Tên NV");
		lblNewLabel_1_4.setBounds(375, 76, 67, 26);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Địa Chỉ");
		lblNewLabel_1_4_1.setBounds(375, 119, 67, 26);
		lblNewLabel_1_4_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("Số Điện thoại");
		lblNewLabel_1_4_2.setBounds(375, 163, 96, 26);
		lblNewLabel_1_4_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblNewLabel_1_4_2);
		
		JLabel lblNewLabel_1_4_2_1 = new JLabel("Giới Tính");
		lblNewLabel_1_4_2_1.setBounds(375, 213, 67, 26);
		lblNewLabel_1_4_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblNewLabel_1_4_2_1);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(474, 216, 149, 24);
		add(comboBox_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(474, 166, 149, 26);
		textField_1.setColumns(10);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(474, 115, 149, 26);
		textField_2.setColumns(10);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(474, 79, 149, 26);
		textField_3.setColumns(10);
		add(textField_3);
		
		JButton btnNewButton = new JButton("Tìm");
		btnNewButton.setBounds(549, 276, 84, 37);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 345, 879, 177);
		add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				 "M\u00E3 NV", "T\u00EAn NV", "CMND", "Ng\u00E0y Sinh", "Gi\u1EDBi T\u00EDnh", "\u0110\u1ECBa Ch\u1EC9", "SDT", "L\u01B0\u01A1ng CB", "Trợ cấp","HSL", "PhongBan"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, Object.class, Object.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);

	}

}
