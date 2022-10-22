package gui;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ThongKeNV extends JPanel {
	private JTable table;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public ThongKeNV() {
		setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Mã NV", "Tên NV", "CMND", "NgaySinh", "GT", "Địa Chỉ", "SDT", "PB", "Số Ngày Làm", "Số Ca", "Lương"
			}
		));
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(298, 79, 630,562);
		add(scrollPane);
		
		JLabel lblNewLabel = new JLabel("Thống kê Nhân Viên Hành Chính");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBounds(419, 10, 292, 26);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tháng");
		lblNewLabel_1.setBounds(30, 83, 72, 13);
		add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(132, 79, 107, 21);
		add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Năm");
		lblNewLabel_2.setBounds(30, 120, 72, 13);
		add(lblNewLabel_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(132, 116, 107, 21);
		add(comboBox_1);
		
		JLabel lblNewLabel_3 = new JLabel("Ma NV");
		lblNewLabel_3.setBounds(30, 161, 72, 13);
		add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(132, 158, 107, 19);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Thống Kê");
		btnNewButton.setBounds(57, 214, 85, 21);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("IN");
		btnNewButton_1.setBounds(172, 214, 85, 21);
		add(btnNewButton_1);

	}
}
