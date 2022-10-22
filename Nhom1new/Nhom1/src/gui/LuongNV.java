package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class LuongNV extends JPanel {
	private JTable table;
	private JTextField textField;
	private JTable table_1;

	/**
	 * Create the panel.
	 */
	public LuongNV() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lương Nhân Viên");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(304, 10, 187, 30);
		add(lblNewLabel);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Mã NV", "Tên NV", "CMND", "Ngày Sinh", "Giới Tính", "Địa Chỉ", "SDT", "PB"
			}
		));
	
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(391, 62, 433, 166);
		add(scrollPane);
		
		JLabel lblNewLabel_1 = new JLabel("Ma NV\r\n");
		lblNewLabel_1.setBounds(10, 64, 45, 13);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mã Lương");
		lblNewLabel_2.setBounds(10, 97, 45, 13);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tháng\r\n");
		lblNewLabel_3.setBounds(10, 133, 45, 13);
		add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(76, 94, 138, 19);
		add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(76, 60, 138, 21);
		add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(76, 129, 83, 21);
		add(comboBox_1);
		
		JLabel lblNewLabel_4 = new JLabel("Năm");
		lblNewLabel_4.setBounds(189, 133, 45, 13);
		add(lblNewLabel_4);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(244, 129, 84, 21);
		add(comboBox_2);
		
		JLabel lblNewLabel_5 = new JLabel("Họ tên");
		lblNewLabel_5.setBounds(10, 164, 45, 13);
		add(lblNewLabel_5);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(76, 160, 138, 21);
		add(comboBox_3);
		
		JButton btnNewButton = new JButton("Tính Lương");
		btnNewButton.setBounds(0, 212, 85, 21);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Làm Mới");
		btnNewButton_1.setBounds(95, 212, 85, 21);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Xóa ");
		btnNewButton_2.setBounds(190, 212, 85, 21);
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("IN");
		btnNewButton_3.setBounds(296, 212, 85, 21);
		add(btnNewButton_3);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Mã Lương", "Mã NV", "Tên NV", "CMND", "Lương CB", "HSL", "Phụ Cấp", "Tháng", "Năm", "Lương"
			}
		));
		
		
		JScrollPane scrollPane_1 = new JScrollPane(table_1);
		scrollPane_1.setBounds(10, 311, 814, 297);
		add(scrollPane_1);

	}

}
