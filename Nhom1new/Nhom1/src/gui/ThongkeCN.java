package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ThongkeCN extends JPanel {
	private JTable table;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public ThongkeCN() {
		setForeground(new Color(0, 0, 0));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Thống Kê Công Nhân");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBounds(452, 10, 238, 24);
		add(lblNewLabel);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 CN", "T\u00EAn CN", "CMND", "Ngay Sinh", "Gi\u1EDBi T\u00EDnh", "PB", "S\u1ED1 Ng\u00E0y L\u00E0m", "S\u1ED1 Ca T\u0103ng", "L\u01B0\u01A1ng", "S\u1ED1 S\u1EA3n Ph\u00E2me"
			}
		));
		
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(337, 86, 667, 545);
		add(scrollPane);
		
		JLabel lblNewLabel_1 = new JLabel("Mã NV");
		lblNewLabel_1.setBounds(96, 88, 45, 13);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tháng");
		lblNewLabel_2.setBounds(96, 121, 45, 13);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Năm");
		lblNewLabel_3.setBounds(96, 160, 45, 13);
		add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(189, 117, 96, 21);
		add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(189, 156, 96, 21);
		add(comboBox_1);
		
		textField = new JTextField();
		textField.setBounds(189, 85, 96, 19);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Thống Kê");
		btnNewButton.setBounds(75, 206, 118, 21);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("IN");
		btnNewButton_1.setBounds(233, 206, 85, 21);
		add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("Tổng Tiền Lương\r\n");
		lblNewLabel_4.setBounds(47, 270, 127, 13);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Tổng Số CN");
		lblNewLabel_5.setBounds(47, 311, 127, 13);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Số Ngày làm TB");
		lblNewLabel_6.setBounds(47, 346, 127, 13);
		add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Số Ngày nghỉ TB");
		lblNewLabel_7.setBounds(47, 387, 146, 13);
		add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Số Sản Phẩm TB");
		lblNewLabel_8.setBounds(47, 421, 146, 13);
		add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Lương Cao Nhất");
		lblNewLabel_9.setBounds(47, 461, 146, 13);
		add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Lương Thấp Nhất");
		lblNewLabel_10.setBounds(47, 495, 146, 13);
		add(lblNewLabel_10);

	}

}
