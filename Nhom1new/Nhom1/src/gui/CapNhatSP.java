package gui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JButton;

public class CapNhatSP extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPanel pnl_table_sp;
	private DefaultTableModel data_ModelSP;
	private JTable table_SP;

	/**
	 * Create the panel.
	 */
	public CapNhatSP() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cập Nhật Sản Phẩm");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(444, 0, 208, 34);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mã Sản Phẩm  :");
		lblNewLabel_1.setBounds(104, 62, 96, 13);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Kiểu Dáng");
		lblNewLabel_2.setBounds(104, 102, 135, 13);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tên Sản Phẩm");
		lblNewLabel_3.setBounds(383, 62, 100, 13);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Chất liệu");
		lblNewLabel_4.setBounds(383, 102, 84, 13);
		add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(493, 59, 380, 19);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(493, 99, 117, 19);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Số Lượng");
		lblNewLabel_5.setBounds(630, 102, 116, 13);
		add(lblNewLabel_5);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(756, 99, 117, 20);
		add(spinner);
		
		textField_2 = new JTextField();
		textField_2.setBounds(277, 59, 96, 19);
		add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(277, 99, 96, 19);
		add(textField_3);
		textField_3.setColumns(10);
		pnl_table_sp = new JPanel();
		pnl_table_sp.setBackground(new Color(192, 192, 192));
		pnl_table_sp.setBounds(0, 367, 1100, 239);
		pnl_table_sp.setLayout(null);
		
		add(pnl_table_sp);
		Box bQuanLiNhanVien1;
		pnl_table_sp.add(bQuanLiNhanVien1 = Box.createHorizontalBox());
		
		JButton btnNewButton = new JButton("Thêm");
		btnNewButton.setBounds(314, 179, 85, 21);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sửa");
		btnNewButton_1.setBounds(472, 179, 85, 21);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Xóa");
		btnNewButton_2.setBounds(630, 179, 85, 21);
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Xóa Rỗng");
		btnNewButton_3.setBounds(777, 179, 85, 21);
		add(btnNewButton_3);
		String[] headers_CD1 = { "Mã SP" ,"Tên SP", "Kiểu Dáng", "Chất Liệu","Số Lượng" };
		data_ModelSP = new DefaultTableModel(headers_CD1, 0);
		
		JScrollPane jScrollPane_SP;
		bQuanLiNhanVien1.add(jScrollPane_SP = new JScrollPane(table_SP = new JTable(data_ModelSP)));
		jScrollPane_SP.setBorder(BorderFactory.createTitledBorder("Danh sách Sản Phẩm"));
		bQuanLiNhanVien1.setBounds(5, 5, 1090, 229);

	}
}
