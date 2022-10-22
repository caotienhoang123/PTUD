package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class Phancongcongnhan extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Phancongcongnhan() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PHÂN CÔNG CÔNG NHÂN");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(249, 10, 391, 48);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ma Phân Công");
		lblNewLabel_1.setBounds(41, 79, 83, 34);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Mã công đoạn");
		lblNewLabel_1_1.setBounds(41, 123, 83, 34);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Tên công đoạn");
		lblNewLabel_1_2.setBounds(41, 186, 83, 34);
		add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Mã công nhân");
		lblNewLabel_1_3.setBounds(41, 245, 83, 34);
		add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Tên Công nhân");
		lblNewLabel_1_4.setBounds(41, 327, 83, 34);
		add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Số lượng");
		lblNewLabel_1_5.setBounds(41, 390, 83, 34);
		add(lblNewLabel_1_5);
		
		textField = new JTextField();
		textField.setBounds(160, 87, 167, 19);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(160, 131, 167, 19);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(160, 194, 167, 19);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(160, 253, 167, 19);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(160, 335, 167, 19);
		add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(160, 398, 167, 19);
		add(textField_5);
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Mã Phân Công", "Công Đoạn", "Tên Công đoạn", "Mã công nhân", "Tên công nhân","Số lượng"
			}
		));
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(369, 88, 558, 336);
		add(scrollPane);
		
		JButton btnNewButton = new JButton("Phân Công");
		btnNewButton.setBounds(285, 473, 133, 39);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Xóa Rỗng");
		btnNewButton_1.setBounds(470, 473, 133, 39);
		add(btnNewButton_1);
		
	
	
		
		
		
		
	

	}
}
