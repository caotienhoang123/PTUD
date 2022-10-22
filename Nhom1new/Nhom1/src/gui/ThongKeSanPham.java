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

public class ThongKeSanPham extends JPanel {
	private JTable table;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public ThongKeSanPham() {
		setForeground(new Color(255, 0, 0));
		setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"Mã SP", "Tên SP", "Kiểu Dáng", "Chất liệu", "SL Tồn", "SL Đặt Hàng"
			}
		));
		
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(300, 136, 563, 200);
		add(scrollPane);
		
		JLabel lblNewLabel = new JLabel("Thống kê Sản Phẩm");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBounds(407, 24, 255, 24);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MaNV");
		lblNewLabel_1.setBounds(10, 138, 45, 13);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tháng");
		lblNewLabel_2.setBounds(10, 175, 45, 13);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Năm");
		lblNewLabel_3.setBounds(10, 211, 45, 13);
		add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(86, 171, 97, 21);
		add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(86, 207, 97, 21);
		add(comboBox_1);
		
		textField = new JTextField();
		textField.setBounds(87, 135, 96, 19);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Thống Kê");
		btnNewButton.setBounds(10, 258, 85, 21);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("IN");
		btnNewButton_1.setBounds(139, 258, 85, 21);
		add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("SL Hiện Tại");
		lblNewLabel_4.setBounds(10, 303, 66, 13);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Tổng SL Đặt Hàng");
		lblNewLabel_5.setBounds(10, 345, 85, 13);
		add(lblNewLabel_5);

	}

}
