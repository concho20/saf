
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.CardLayout;


public class View extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton QL_Order;
	private JButton QL_Kho;
	private JButton QL_NV;
	
	private JPanel panel_tang;
	private JPanel cardPanel_2;
	private JPanel cardPanel_TrangOder;
	private JPanel cardPanel_Kho;
	private JPanel cardPanel_QLNV;
	private JPanel cardPanel_tang;
	private JPanel panel_tang1;
	private JButton butonban1;
	private JButton butonban2;
	private JButton butonban3;
	private JButton butonban4;
	private JButton butonban5;
	private JButton butonban6;
	private JButton butonban7;
	private JButton butonban9;
	private JButton butonban8;
	private JButton butonban10;
	private JPanel panel_Mon;
	private JButton bt_Nuoc;
	private JPanel cardPanel_mon;
	private JPanel panel_Nuong;
	private JPanel panel_Lau;
	private JPanel panel_MonChinh;
	private JPanel panel_TrangMieng;
	private JButton bt_Nuong;
	private JButton bt_Lau;
	private JButton bt_MonChinh;
	private JButton bt_TrangMieng;
	private JPanel panel_Nuoc;
	private JButton bt_Tang1;
	private JButton bt_Tang2;
	private JPanel panel_tang2;
	private JButton butonban1_2;
	private JButton butonban2_2;
	private JButton butonban3_2;
	private JButton butonban4_2;
	private JButton butonban5_2;
	private JButton butonban6_2;
	private JButton butonban7_2;
	private JButton butonban9_2;
	private JButton butonban8_2;
	private JButton butonban10_2;
	private JTable table_BangLuong;
	private JTable table_MucLuong;
	
	

	
	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1574, 821);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1560, 50);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		QL_Order = new JButton("Trang Order");
		QL_Order.setBackground(new Color(255, 0, 0));
		QL_Order.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardPanel_TrangOder.setVisible(true);
				cardPanel_Kho.setVisible(false);
				cardPanel_QLNV.setVisible(false);
			}
		});
		QL_Order.setBounds(0, 0, 192, 50);
		panel_1.add(QL_Order);
		
		QL_Kho = new JButton("Trang QL Kho");
		QL_Kho.setBackground(new Color(0, 128, 255));
		QL_Kho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardPanel_TrangOder.setVisible(false);
				cardPanel_Kho.setVisible(true);
				cardPanel_QLNV.setVisible(false);				
			}
		});
		QL_Kho.setBounds(192, 0, 192, 50);
		panel_1.add(QL_Kho);
		
		QL_NV = new JButton("Trang QL NV");
		QL_NV.setBackground(new Color(0, 255, 64));
		QL_NV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardPanel_TrangOder.setVisible(false);
				cardPanel_Kho.setVisible(false);
				cardPanel_QLNV.setVisible(true);
			}
		});
		QL_NV.setBounds(384, 0, 192, 50);
		panel_1.add(QL_NV);
		
		cardPanel_2 = new JPanel();
		cardPanel_2.setBounds(0, 50, 1558, 733);
		contentPane.add(cardPanel_2);
		cardPanel_2.setLayout(new CardLayout(0, 0));
		
		cardPanel_TrangOder = new JPanel();
		cardPanel_TrangOder.setLayout(null);
		cardPanel_2.add(cardPanel_TrangOder, "name_1003617356376700");
		cardPanel_TrangOder.setVisible(true);
		
		cardPanel_tang = new JPanel();
		cardPanel_tang.setBounds(0, 47, 1070, 334);
		cardPanel_TrangOder.add(cardPanel_tang);
		cardPanel_tang.setLayout(new CardLayout(0, 0));
		
		panel_tang1 = new JPanel();
		panel_tang1.setLayout(null);
		panel_tang1.setBackground(Color.RED);
		cardPanel_tang.add(panel_tang1, "name_1003797966362000");
		panel_tang1.setVisible(true);
		
		butonban1 = new JButton("Bàn 1");
		butonban1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban1.setBounds(60, 24, 94, 86);
		panel_tang1.add(butonban1);
		
		butonban2 = new JButton("Bàn 2");
		butonban2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban2.setBounds(274, 24, 94, 86);
		panel_tang1.add(butonban2);
		
		butonban3 = new JButton("Bàn 3");
		butonban3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban3.setBounds(488, 24, 94, 86);
		panel_tang1.add(butonban3);
		
		butonban4 = new JButton("Bàn 4");
		butonban4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		butonban4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban4.setBounds(702, 24, 94, 86);
		panel_tang1.add(butonban4);
		
		butonban5 = new JButton("Bàn 5");
		butonban5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban5.setBounds(916, 24, 94, 86);
		panel_tang1.add(butonban5);
		
		butonban6 = new JButton("Bàn 6");
		butonban6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		butonban6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban6.setBounds(60, 176, 94, 86);
		panel_tang1.add(butonban6);
		
		butonban7 = new JButton("Bàn 7");
		butonban7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban7.setBounds(274, 176, 94, 86);
		panel_tang1.add(butonban7);
		
		butonban9 = new JButton("Bàn 9");
		butonban9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban9.setBounds(702, 176, 94, 86);
		panel_tang1.add(butonban9);
		
		butonban8 = new JButton("Bàn 8");
		butonban8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban8.setBounds(488, 176, 94, 86);
		panel_tang1.add(butonban8);
		
		butonban10 = new JButton("Bàn 10");
		butonban10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		butonban10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban10.setBounds(916, 176, 94, 86);
		panel_tang1.add(butonban10);
		
		panel_tang2 = new JPanel();
		panel_tang2.setLayout(null);
		panel_tang2.setBackground(new Color(0, 64, 0));
		cardPanel_tang.add(panel_tang2, "name_1003797975289700");
		panel_tang2.setVisible(false);
		
		butonban1_2 = new JButton("Bàn 11");
		butonban1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban1_2.setBounds(60, 24, 94, 86);
		panel_tang2.add(butonban1_2);
		
		butonban2_2 = new JButton("Bàn 12");
		butonban2_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban2_2.setBounds(274, 24, 94, 86);
		panel_tang2.add(butonban2_2);
		
		butonban3_2 = new JButton("Bàn 13");
		butonban3_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban3_2.setBounds(488, 24, 94, 86);
		panel_tang2.add(butonban3_2);
		
		butonban4_2 = new JButton("Bàn 14");
		butonban4_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban4_2.setBounds(702, 24, 94, 86);
		panel_tang2.add(butonban4_2);
		
		butonban5_2 = new JButton("Bàn 15");
		butonban5_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban5_2.setBounds(916, 24, 94, 86);
		panel_tang2.add(butonban5_2);
		
		butonban6_2 = new JButton("Bàn 16");
		butonban6_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban6_2.setBounds(60, 176, 94, 86);
		panel_tang2.add(butonban6_2);
		
		butonban7_2 = new JButton("Bàn 17");
		butonban7_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban7_2.setBounds(274, 176, 94, 86);
		panel_tang2.add(butonban7_2);
		
		butonban9_2 = new JButton("Bàn 19");
		butonban9_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban9_2.setBounds(702, 176, 94, 86);
		panel_tang2.add(butonban9_2);
		
		butonban8_2 = new JButton("Bàn 18");
		butonban8_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban8_2.setBounds(488, 176, 94, 86);
		panel_tang2.add(butonban8_2);
		
		butonban10_2 = new JButton("Bàn 20");
		butonban10_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		butonban10_2.setBounds(916, 176, 94, 86);
		panel_tang2.add(butonban10_2);
		
		panel_tang = new JPanel();
		panel_tang.setBounds(0, 0, 1070, 48);
		cardPanel_TrangOder.add(panel_tang);
		panel_tang.setBackground(new Color(255, 128, 0));
		panel_tang.setLayout(null);
		
		bt_Tang1 = new JButton(" Tầng 1");
		bt_Tang1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_tang1.setVisible(true);
				panel_tang2.setVisible(false);
			}
		});
		bt_Tang1.setBounds(0, 0, 151, 48);
		panel_tang.add(bt_Tang1);
		
		bt_Tang2 = new JButton("Tầng 2");
		bt_Tang2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_tang1.setVisible(false);
				panel_tang2.setVisible(true);
			}
		});
		bt_Tang2.setBounds(151, 0, 151, 48);
		panel_tang.add(bt_Tang2);
		
		panel_Mon = new JPanel();
		panel_Mon.setLayout(null);
		panel_Mon.setBounds(0, 381, 1070, 48);
		cardPanel_TrangOder.add(panel_Mon);
		
		bt_Nuoc = new JButton("Nước");
		bt_Nuoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_Nuoc.setVisible(true);
				panel_Lau.setVisible(false);
				panel_MonChinh.setVisible(false);
				panel_Nuong.setVisible(false);
				panel_TrangMieng.setVisible(false);
			}
		});
		bt_Nuoc.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bt_Nuoc.setBackground(new Color(255, 128, 128));
		bt_Nuoc.setBounds(0, 0, 152, 48);
		panel_Mon.add(bt_Nuoc);
		
		bt_Nuong = new JButton("Nướng");
		bt_Nuong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_Nuoc.setVisible(false);
				panel_Lau.setVisible(false);
				panel_MonChinh.setVisible(false);
				panel_Nuong.setVisible(true);
				panel_TrangMieng.setVisible(false);
			}
		});
		bt_Nuong.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bt_Nuong.setBackground(new Color(255, 128, 128));
		bt_Nuong.setBounds(152, 0, 152, 48);
		panel_Mon.add(bt_Nuong);
		
		bt_Lau = new JButton("Lẩu");
		bt_Lau.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_Nuoc.setVisible(false);
				panel_Lau.setVisible(true);
				panel_MonChinh.setVisible(false);
				panel_Nuong.setVisible(false);
				panel_TrangMieng.setVisible(false);
			}
		});
		bt_Lau.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bt_Lau.setBackground(new Color(255, 128, 128));
		bt_Lau.setBounds(304, 0, 152, 48);
		panel_Mon.add(bt_Lau);
		
		bt_MonChinh = new JButton("Món Chính");
		bt_MonChinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_Nuoc.setVisible(false);
				panel_Lau.setVisible(false);
				panel_MonChinh.setVisible(true);
				panel_Nuong.setVisible(false);
				panel_TrangMieng.setVisible(false);
			}
		});
		bt_MonChinh.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bt_MonChinh.setBackground(new Color(255, 128, 128));
		bt_MonChinh.setBounds(456, 0, 152, 48);
		panel_Mon.add(bt_MonChinh);
		
		bt_TrangMieng = new JButton("Tráng Miệng");
		bt_TrangMieng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_Nuoc.setVisible(false);
				panel_Lau.setVisible(false);
				panel_MonChinh.setVisible(false);
				panel_Nuong.setVisible(false);
				panel_TrangMieng.setVisible(true);
			}
		});
		bt_TrangMieng.setFont(new Font("Tahoma", Font.PLAIN, 17));
		bt_TrangMieng.setBackground(new Color(255, 128, 128));
		bt_TrangMieng.setBounds(608, 0, 152, 48);
		panel_Mon.add(bt_TrangMieng);
		
		cardPanel_mon = new JPanel();
		cardPanel_mon.setBounds(0, 427, 1070, 306);
		cardPanel_TrangOder.add(cardPanel_mon);
		cardPanel_mon.setLayout(new CardLayout(0, 0));
		
		panel_Nuong = new JPanel();
		panel_Nuong.setBackground(new Color(128, 128, 0));
		panel_Nuong.setLayout(null);
		cardPanel_mon.add(panel_Nuong, "name_1003838081420800");
		panel_Nuong.setVisible(false);
		
		panel_Lau = new JPanel();
		panel_Lau.setBackground(new Color(64, 128, 128));
		panel_Lau.setLayout(null);
		cardPanel_mon.add(panel_Lau, "name_1003838090254500");
		panel_Lau.setVisible(false);
		
		
		panel_MonChinh = new JPanel();
		panel_MonChinh.setBackground(new Color(64, 0, 0));
		panel_MonChinh.setLayout(null);
		cardPanel_mon.add(panel_MonChinh, "name_1003838098481500");
		panel_MonChinh.setVisible(false);
		
		panel_TrangMieng = new JPanel();
		panel_TrangMieng.setBackground(new Color(0, 64, 64));
		panel_TrangMieng.setLayout(null);
		cardPanel_mon.add(panel_TrangMieng, "name_1003838108290000");
		panel_TrangMieng.setVisible(false);
		
		panel_Nuoc = new JPanel();
		panel_Nuoc.setBackground(new Color(64, 0, 64));
		panel_Nuoc.setLayout(null);
		cardPanel_mon.add(panel_Nuoc, "name_1003838116760100");
		
		JPanel card_Panel_bill = new JPanel();
		card_Panel_bill.setBounds(1070, 0, 486, 733);
		cardPanel_TrangOder.add(card_Panel_bill);
		card_Panel_bill.setLayout(new CardLayout(0, 0));
		panel_Nuoc.setVisible(true);
		panel_tang.setVisible(true);
		
		cardPanel_Kho = new JPanel();
		cardPanel_Kho.setBackground(new Color(64, 128, 128));
		cardPanel_Kho.setLayout(null);
		cardPanel_2.add(cardPanel_Kho, "name_1003617367221200");
		cardPanel_Kho.setVisible(false);
		
		cardPanel_QLNV = new JPanel();
		cardPanel_QLNV.setBackground(new Color(0, 255, 0));
		cardPanel_QLNV.setLayout(null);
		cardPanel_2.add(cardPanel_QLNV, "name_1003617377031400");
		cardPanel_QLNV.setVisible(false);
		
		
		table_BangLuong = new JTable();
		table_BangLuong.setForeground(new Color(0, 0, 0));
		table_BangLuong.setFont(new Font("Tahoma", Font.PLAIN, 13));
        JScrollPane spBL = new JScrollPane(table_BangLuong);
        spBL.setBounds(812, 78, 736, 350);
        cardPanel_QLNV.add(spBL);
        table_BangLuong.setEnabled(false);
        
        JLabel lbl_BangLuong = new JLabel("BẢNG LƯƠNG");
        lbl_BangLuong.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lbl_BangLuong.setBounds(1119, 11, 164, 56);
        cardPanel_QLNV.add(lbl_BangLuong);          
        
        JLabel lbl_MucLuong = new JLabel("MỨC LƯƠNG");
        lbl_MucLuong.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lbl_MucLuong.setBounds(1245, 458, 164, 56);
        cardPanel_QLNV.add(lbl_MucLuong);
        
        table_MucLuong = new JTable();
        table_MucLuong.setForeground(new Color(0, 0, 0));
        table_MucLuong.setFont(new Font("Tahoma", Font.PLAIN, 13));
        JScrollPane spML = new JScrollPane(table_MucLuong);
        spML.setBounds(1039, 514, 509, 208);
        cardPanel_QLNV.add(spML);
	}
	
	public JTable getTable_BangLuong() {
	    return table_BangLuong;
	}
	
	public JTable getTable_MucLuong() {
	    return table_MucLuong;
	}
}
