package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class LuongCongNhan extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtLmMi;
	private JTextField txtIn;
	private JTable table;
	private JTable table_1;

	/**
	 * Create the panel.
	 */
	public LuongCongNhan() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LƯƠNG CÔNG NHÂN");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(410, 10, 153, 35);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mã CN");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 73, 53, 40);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Mã Lương");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(10, 114, 73, 40);
		add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setBounds(93, 80, 124, 27);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(93, 127, 124, 27);
		add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Họ Tên");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(271, 71, 73, 40);
		add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Tháng");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1.setBounds(271, 114, 73, 40);
		add(lblNewLabel_1_1_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(354, 83, 218, 28);
		add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(354, 126, 53, 28);
		add(comboBox_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Năm");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1.setBounds(429, 114, 46, 40);
		add(lblNewLabel_1_1_1_1_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBounds(485, 122, 89, 28);
		add(comboBox_1_1);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Thực Lãnh");
		lblNewLabel_1_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_2.setBounds(254, 164, 73, 40);
		add(lblNewLabel_1_1_1_1_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(354, 173, 124, 27);
		add(textField_2);
		
		JButton btnNewButton = new JButton("Tính Lương");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(100, 244, 105, 35);
		add(btnNewButton);
		
		txtLmMi = new JTextField();
		txtLmMi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtLmMi.setText("Làm Mới");
		txtLmMi.setColumns(10);
		txtLmMi.setBounds(256, 244, 73, 35);
		add(txtLmMi);
		
		txtIn = new JTextField();
		txtIn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtIn.setText("    In");
		txtIn.setColumns(10);
		txtIn.setBounds(379, 244, 58, 35);
		add(txtIn);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(582, 85, 571, 195);
		add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 CN", "T\u00EAn CN", "CMND", "Ng\u00E0y Sinh", "Gi\u1EDBi T\u00EDnh", "\u0110\u1ECBa Ch\u1EC9", "S\u1ED1 \u0110i\u1EC7n Tho\u1EA1i", "Ph\u00F2ng Ban"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 317, 1143, 236);
		add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 L\u01B0\u01A1ng", "M\u00E3 CN", "T\u00EAn CN", "CMND", "Ng\u00E0y Sinh", "Gi\u1EDBi T\u00EDnh", "Ph\u00F2ng Ban", "Tr\u1EE3 C\u1EA5p", "Th\u00E1ng", "N\u0103m", "L\u01B0\u01A1ng"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane_1.setViewportView(table_1);

	}

}
