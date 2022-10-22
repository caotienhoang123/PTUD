package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class MenuGUI extends JFrame implements ActionListener  { 
	
	private JPanel contentPane;
	private JMenuItem JMenuItem_chamcong = new JMenuItem("Chấm công HC");
	
    


	
	public MenuGUI() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Menu");
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	    setBounds(100, 100, (int) dim.getWidth(), (int) dim.getHeight());
	    setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar_HELP = new JMenuBar();
		menuBar_HELP.setBounds(0, 0, 39, 22);
		contentPane.add(menuBar_HELP);
		
		JMenu mnNewMenu = new JMenu("Help");
		menuBar_HELP.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("liên Hệ Trợ Giup");
		mnNewMenu.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Hướng Dẫn Sử Dụng");
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenuBar menuBar_1_NVHC = new JMenuBar();
		menuBar_1_NVHC.setBackground(new Color(255, 228, 196));
		menuBar_1_NVHC.setForeground(new Color(30, 144, 255));
		menuBar_1_NVHC.setBounds(100, 135, 200, 36);
		contentPane.add(menuBar_1_NVHC);
		
		JMenu mnAbout = new JMenu("Nhân Viên Hành Chánh");
		mnAbout.setHorizontalAlignment(SwingConstants.TRAILING);
		mnAbout.setBackground(Color.ORANGE);
		menuBar_1_NVHC.add(mnAbout);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Cập Nhật Nhân Viên Hành Chính");
		mnAbout.add(mntmNewMenuItem);
		mntmNewMenuItem.addActionListener(this);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Chấm Công Nhân Viên Hành Chính");
		mnAbout.add(mntmNewMenuItem_1);
		mntmNewMenuItem_1.addActionListener(this);
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Lương Nhân Viên Hành Chính");
		mnAbout.add(mntmNewMenuItem_2);
		mntmNewMenuItem_2.addActionListener(this);
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Tìm Kiếm Nhân Viên Hành Chính");
		mnAbout.add(mntmNewMenuItem_3);
		mntmNewMenuItem_3.addActionListener(this);
		
		JMenuBar menuBar_2_CN = new JMenuBar();
		menuBar_2_CN.setBackground(new Color(255, 228, 196));
		menuBar_2_CN.setBounds(100, 311, 200, 36);
		contentPane.add(menuBar_2_CN);
		
		
		
		JMenu mnCngNhn_1 = new JMenu("Công Nhân");
		mnCngNhn_1.setBackground(Color.CYAN);
		menuBar_2_CN.add(mnCngNhn_1);
		
		JMenuItem mntmNewMenuItem_4_1 = new JMenuItem("Cập Nhật Công Nhân");
		mnCngNhn_1.add(mntmNewMenuItem_4_1);
		mntmNewMenuItem_4_1.addActionListener(this);
		
		JMenuItem mntmNewMenuItem_1_1_1 = new JMenuItem("Chấm Công Công Nhân");
		mnCngNhn_1.add(mntmNewMenuItem_1_1_1);
		mntmNewMenuItem_1_1_1.addActionListener(this);
		
		JMenuItem mntmNewMenuItem_2_1_1 = new JMenuItem("Lương Công Nhân");
		mnCngNhn_1.add(mntmNewMenuItem_2_1_1);
		mntmNewMenuItem_2_1_1.addActionListener(this);
		JMenuItem menuitem_phancong = new JMenuItem("Phân Công Công Nhân");
		mnCngNhn_1.add(menuitem_phancong);
		menuitem_phancong.addActionListener(this);
		
	
		
		JMenuItem mntmNewMenuItem_3_1_1 = new JMenuItem("Tìm Kiếm Công Nhân");
		mnCngNhn_1.add(mntmNewMenuItem_3_1_1);
		mntmNewMenuItem_3_1_1.addActionListener(this);
		JMenuBar menuBar_2_1_sp = new JMenuBar();
		menuBar_2_1_sp.setBackground(new Color(255, 228, 196));
		menuBar_2_1_sp.setBounds(100, 487, 200, 36);
		contentPane.add(menuBar_2_1_sp);
		
		JMenu mnNewMenu_1 = new JMenu("Sản Phẩm");
		menuBar_2_1_sp.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Công Đoạn Sản Phẩm");
		mnNewMenu_1.add(mntmNewMenuItem_8);
		mntmNewMenuItem_8.addActionListener(this);
		
		JMenuItem timkiem_sanpham = new JMenuItem("Tìm Kiếm Sản Phẩm");
		mnNewMenu_1.add(timkiem_sanpham);
		timkiem_sanpham.addActionListener(this);
		
		JMenuItem capnhat_sanpham = new JMenuItem("Cập Nhật Sản Phẩm");
		mnNewMenu_1.add(capnhat_sanpham);
		capnhat_sanpham.addActionListener(this);
		
		
		JMenuBar menuBar_2_1_1_ThongKe = new JMenuBar();
		menuBar_2_1_1_ThongKe.setBackground(new Color(255, 228, 196));
		menuBar_2_1_1_ThongKe.setBounds(100, 655, 200, 36);
		contentPane.add(menuBar_2_1_1_ThongKe);
		
		JMenu mnNewMenu_3 = new JMenu("Nhân Viên Quản Lý");
		menuBar_2_1_1_ThongKe.add(mnNewMenu_3);
		
		JMenuItem thongkenhanvien = new JMenuItem("Thống Kê Nhân Viên");
		mnNewMenu_3.add(thongkenhanvien);
		thongkenhanvien.addActionListener(this);
		
		JMenuItem thongkecongnhan = new JMenuItem("Thống Kê Công Nhân");
		mnNewMenu_3.add(thongkecongnhan);
		thongkecongnhan.addActionListener(this);
		
		JMenuItem thongkesanpham = new JMenuItem("Thống Kê Sản Phẩm");
		mnNewMenu_3.add(thongkesanpham);
		thongkesanpham.addActionListener(this);
		
		
		
		
		JTextArea txtrMenuQunL = new JTextArea();
		txtrMenuQunL.setBackground(new Color(135, 206, 235));
		txtrMenuQunL.setFont(new Font("Monospaced", Font.BOLD, 30));
		txtrMenuQunL.setText("MENU QUẢN LÝ LƯƠNG SẢN PHẨM");
		txtrMenuQunL.setBounds(702, 35, 703, 39);
		contentPane.add(txtrMenuQunL);
		
		JLabel icon_nv = new JLabel("");
		icon_nv.setFont(new Font("Tahoma", Font.PLAIN, 28));
		icon_nv.setHorizontalAlignment(SwingConstants.CENTER);
		icon_nv.setIcon(new ImageIcon("\\Nhom1new\\Nhom1\\anh\\nhanvienv.png"));
		icon_nv.setBounds(23, 123, 55, 58);
		contentPane.add(icon_nv);
		
		JLabel icon_cn = new JLabel("");
		icon_cn.setIcon(new ImageIcon("\\Nhom1new\\Nhom1\\anh\\congnhanv.jpg"));
		icon_cn.setBounds(39, 311, 51, 36);
		contentPane.add(icon_cn);
		
		JLabel icon_sp = new JLabel("");
		icon_sp.setIcon(new ImageIcon("\\Nhom1new\\Nhom1\\anh\\sanphamv.png"));
		icon_sp.setBounds(39, 487, 51, 36);
		contentPane.add(icon_sp);
		
		JLabel icon_thongke = new JLabel("");
		icon_thongke.setIcon(new ImageIcon("\\Nhom1new\\Nhom1\\anh\\thongkev.png"));
		icon_thongke.setBounds(39, 655, 51, 36);
		contentPane.add(icon_thongke);
		
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("\\Nhom1new\\Nhom1\\anh\\congviec2.jpg"));
		lblNewLabel.setBounds(500, 113, 1140, 621);
		contentPane.add(lblNewLabel);
	}


	
	public void actionPerformed(ActionEvent e) {

		// TODO Auto-generated method stub
		
		String cm = e.getActionCommand();
		for(int x=0;x<30;x++) {
			contentPane.remove(10);
			if(cm.equals("Chấm Công Nhân Viên Hành Chính")){
				ChamCongNV chamCongNV = new ChamCongNV();
				chamCongNV.setVisible(true);
				chamCongNV.setBounds(320, 100, 1450, 621);
				contentPane.add(chamCongNV);
				contentPane.updateUI();
				
				}
			else if (cm.equals("Cập Nhật Nhân Viên Hành Chính")) {
				CapNhatNVHC capNhatNVHC = new CapNhatNVHC();
				capNhatNVHC.setVisible(true);
				capNhatNVHC.setBounds(320, 100, 1450, 621);
				contentPane.add(capNhatNVHC);
				contentPane.updateUI();

			
			}
			else if (cm.equals("Lương Nhân Viên Hành Chính")) {
				LuongNV luongNV = new LuongNV();
				luongNV.setVisible(true);
				luongNV.setBounds(320, 100, 1450, 621);
				contentPane.add(luongNV);
				contentPane.updateUI();
				
			}
			else if (cm.equals("Tìm Kiếm Nhân Viên Hành Chính")) {
				TimKiemNV timKiemNV = new TimKiemNV();
				timKiemNV.setVisible(true);
				timKiemNV.setBounds(320, 100, 1450, 621);
				contentPane.add(timKiemNV);
				contentPane.updateUI();
				
			}
			else if (cm.equals("Chấm Công Công Nhân")) {
				
				ChamCongCongNhan2 cn = new ChamCongCongNhan2();
				cn.setVisible(true);
				cn.setBounds(320, 100, 1450, 621);
				contentPane.add(cn);
				contentPane.updateUI();
			}
			else if (cm.equals("Cập Nhật Công Nhân")) {
				CapNhatCongNhan capnhatcn = new CapNhatCongNhan();
				capnhatcn.setVisible(true);
				capnhatcn.setBounds(320, 100, 1450, 621);
				contentPane.add(capnhatcn);
				contentPane.updateUI();
			}
			else if (cm.equals("Tìm Kiếm Công Nhân")) {
				TimKiemCongNhan timCongNhan = new TimKiemCongNhan();
				timCongNhan.setVisible(true);
				timCongNhan.setBounds(320, 100, 1450, 621);
				contentPane.add(timCongNhan);
				contentPane.updateUI();
			}
			else if (cm.equals("Phân Công Công Nhân")) {
				Phancongcongnhan phancongcongnhan = new Phancongcongnhan();
				phancongcongnhan.setVisible(true);
				phancongcongnhan.setBounds(320, 100, 1450, 621);
				contentPane.add(phancongcongnhan);
				contentPane.updateUI();
			}
			else if (cm.equals("Lương Công Nhân")) {
				LuongCongNhan luongCongNhan = new LuongCongNhan();
				luongCongNhan.setVisible(true);
				luongCongNhan.setBounds(320, 100, 1450, 621);
				contentPane.add(luongCongNhan);
				contentPane.updateUI();
			}
			else if (cm.equals("Thống Kê Nhân Viên")) {
				ThongKeNV thongKeNV = new ThongKeNV();
				thongKeNV.setVisible(true);
				thongKeNV.setBounds(400, 100, 1450, 621);
				contentPane.add(thongKeNV);
				contentPane.updateUI();
				
			}
			else if (cm.equals("Thống Kê Công Nhân")) {
				ThongkeCN thongkeCN = new ThongkeCN();
				thongkeCN.setVisible(true);
				thongkeCN.setBounds(400, 100, 1450, 621);
				contentPane.add(thongkeCN);
				contentPane.updateUI();
				
			}
			else if (cm.equals("Thống Kê Sản Phẩm")) {
				ThongKeSanPham thongKeSanPham = new ThongKeSanPham();
				thongKeSanPham.setVisible(true);
				thongKeSanPham.setBounds(400, 100, 1450, 621);
				contentPane.add(thongKeSanPham);
				contentPane.updateUI();
				
			}else if (cm.equals("Công Đoạn Sản Phẩm")) {
				CongDoanSanXuat congDoanSanXuat  = new CongDoanSanXuat();
				congDoanSanXuat.setVisible(true);
				congDoanSanXuat.setBounds(400, 100, 1450, 621);
				contentPane.add(congDoanSanXuat);
				contentPane.updateUI();
				
			}
			else if (cm.equals("Tìm Kiếm Sản Phẩm")) {
				TimKiemSP timKiemSP = new TimKiemSP();
				timKiemSP.setVisible(true);
				timKiemSP.setBounds(400, 100, 1450, 621);
				contentPane.add(timKiemSP);
				contentPane.updateUI();
				
			}
			else if (cm.equals("Cập Nhật Sản Phẩm")) {
				CapNhatSP capNhatSP = new CapNhatSP();
				capNhatSP.setVisible(true);
				capNhatSP.setBounds(400, 100, 1450, 621);
				contentPane.add(capNhatSP);
				contentPane.updateUI();
				
			}
			
			
			
			else {
				JOptionPane.showMessageDialog(null, "Bạn vừa faild");
			}
			
		}
		
		
	
			
	}
}		

	