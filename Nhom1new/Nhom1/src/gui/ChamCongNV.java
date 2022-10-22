package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChamCongNV extends JPanel {
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table_1;

	/**
	 * Create the panel.
	 */
	public ChamCongNV() {
		setForeground(new Color(0, 0, 0));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Chấm Công Nhân Viên");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(301, 10, 222, 22);
		add(lblNewLabel);
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"Mã NV", "Tên NV", "CMND", "Tên PB", "Có mặt", "Có Phép"
			}
		));
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 68, 411, 227);
		add(scrollPane);
		
		JLabel lblNewLabel_1 = new JLabel("Mã Ca");
		lblNewLabel_1.setBounds(446, 70, 45, 13);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ca Làm");
		lblNewLabel_2.setBounds(446, 108, 45, 13);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Giờ Làm");
		lblNewLabel_3.setBounds(446, 144, 45, 13);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Lương Theo Ca");
		lblNewLabel_4.setBounds(446, 181, 77, 13);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Ngày Chấm");
		lblNewLabel_5.setBounds(446, 218, 77, 13);
		add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(553, 67, 154, 19);
		add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(553, 104, 154, 21);
		add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setBounds(553, 141, 154, 19);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(553, 178, 154, 19);
		add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(553, 215, 154, 19);
		add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Lấy Danh Sách");
		btnNewButton.setBounds(420, 274, 137, 21);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Có Mặt Tất Cả");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(564, 274, 114, 21);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Đặt Lại Chấm Công");
		btnNewButton_2.setBounds(687, 274, 130, 21);
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Chấm công");
		btnNewButton_3.setBounds(500, 305, 85, 21);
		add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Xóa");
		btnNewButton_4.setBounds(636, 305, 85, 21);
		add(btnNewButton_4);
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Mã Công", "Ngày Chấm", "Mã Ca", "Ca", "Giờ Làm", "Mã NV", "Tên NV", "Trạng Thái", "Phép"
			}
		));
		JScrollPane scrollPane_1 = new JScrollPane(table_1);
		scrollPane_1.setBounds(10, 391, 807, 239);
		add(scrollPane_1);
		
		
	
		
	
	}

}
