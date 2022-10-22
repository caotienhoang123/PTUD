package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import dao.HeSoLuongDao;
import entity.HeSoLuong;

public class TimKiemCongNhan extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private JComboBox cmb_maCongNhan;
	

	/**
	 * Create the panel.
	 */
	public TimKiemCongNhan() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TÌM KIẾM CÔNG NHÂN");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(474, 10, 188, 37);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mã CN");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(267, 67, 67, 26);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("CMND");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(267, 113, 67, 26);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Ngày Sinh ");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(267, 163, 69, 26);
		add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Phòng Ban");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(267, 211, 84, 26);
		add(lblNewLabel_1_3);
		
		cmb_maCongNhan = new JComboBox();
		cmb_maCongNhan.setBounds(367, 69, 149, 24);
		add(cmb_maCongNhan);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(367, 165, 149, 26);
		add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(367, 213, 149, 26);
		add(comboBox_2);
		
		textField = new JTextField();
		textField.setBounds(367, 119, 149, 26);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_4 = new JLabel("Tên CN");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_4.setBounds(595, 76, 67, 26);
		add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Địa Chỉ");
		lblNewLabel_1_4_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_4_1.setBounds(595, 122, 67, 26);
		add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("Số Điện thoại");
		lblNewLabel_1_4_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_4_2.setBounds(595, 172, 96, 26);
		add(lblNewLabel_1_4_2);
		
		JLabel lblNewLabel_1_4_2_1 = new JLabel("Giới Tính");
		lblNewLabel_1_4_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_4_2_1.setBounds(595, 220, 67, 26);
		add(lblNewLabel_1_4_2_1);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(693, 214, 149, 24);
		add(comboBox_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(693, 169, 149, 26);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(693, 122, 149, 26);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(693, 73, 149, 26);
		add(textField_3);
		
		JButton btnNewButton = new JButton("Tìm");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(803, 273, 84, 37);
		add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 361, 1068, 177);
		add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 NV", "T\u00EAn NV", "CMND", "Ng\u00E0y Sinh", "Gi\u1EDBi T\u00EDnh", "\u0110\u1ECBa Ch\u1EC9", "S\u0110T", "Tr\u1EE3 C\u1EA5p", "Ph\u00F2ng Ban"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);

	}

}
