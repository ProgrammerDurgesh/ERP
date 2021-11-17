package Master;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import GRN.Add_GRN;
import purchagr.Purchage_Order;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JToggleButton;
import javax.swing.JWindow;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class admin {

	private JFrame frmMasterModul;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception
	{
		
		EventQueue.invokeLater(new Runnable() {
			public void run() 
			{
				try {
					admin window = new admin();
					First_ First_=new First_();
					First_.create_folder_in_file();
					window.frmMasterModul.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public admin() 
	{
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMasterModul = new JFrame();
		frmMasterModul.setAlwaysOnTop(true);
		frmMasterModul.setResizable(false);
		frmMasterModul.setFont(new Font("Dialog", Font.BOLD, 16));
		frmMasterModul.setTitle("Master Modul");
		frmMasterModul.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 16));
		frmMasterModul.getContentPane().setForeground(new Color(255, 255, 255));
		frmMasterModul.getContentPane().setBackground(new Color(153, 204, 204));
		frmMasterModul.getContentPane().setLayout(null);
		frmMasterModul.setBounds(100, 100, 742, 491);
		
		
		JMenuBar menuBar = new JMenuBar();
		frmMasterModul.setJMenuBar(menuBar);
		JMenu mnNewMenu = new JMenu("Admin");
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 18));
		mnNewMenu.setForeground(Color.BLACK);
		mnNewMenu.setBackground(new Color(240, 240, 240));
		menuBar.add(mnNewMenu);
		
		JButton btnNewButton = new JButton("Mater");
		mnNewMenu.add(btnNewButton);
		
		JMenu mnNewMenu_1 = new JMenu("Master");
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 16));
		mnNewMenu_1.setForeground(Color.BLACK);
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Measurment Unit");
		mntmNewMenuItem_1.setSelected(true);
		mntmNewMenuItem_1.setBackground(Color.RED);
		mntmNewMenuItem_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				Measurment_unit mu=new Measurment_unit();
				mu.main(null);
				First_ First_=new First_();
				try 
				{
					First_.file();
				} 
				catch (IOException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.BOLD, 18));
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Category");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Category Category=new Category();
				Category.main(null);
				First_ First_=new First_();
				try {
					First_.file1();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		mntmNewMenuItem_2.setFont(new Font("Segoe UI", Font.BOLD, 16));
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Company Name");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Compnay_name CompanyName=new Compnay_name();
				Compnay_name.main(null);
			}
		});
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Add Item");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Add_item1 Add_item=new Add_item1();
				Add_item.main(null);
			}
		});
		mntmNewMenuItem_3.setFont(new Font("Segoe UI", Font.BOLD, 16));
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Add Suppilier");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Add_suppilier Add_suppilier=new Add_suppilier();
				Add_suppilier.main(null);
			}
		});
		mntmNewMenuItem_4.setFont(new Font("Segoe UI", Font.BOLD, 16));
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Add Employee");
		mntmNewMenuItem_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				dispose();
			}
		});
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Add_employee Add_employee=new Add_employee();
				Add_employee.main(null);
			}
		});
		mntmNewMenuItem_5.setFont(new Font("Segoe UI", Font.BOLD, 16));
		mnNewMenu_1.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Add Designation");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				add_Dessignation add_Dessignation=new add_Dessignation();
				add_Dessignation.main(null);
			}
		});
		mntmNewMenuItem_6.setFont(new Font("Segoe UI", Font.BOLD, 16));
		mnNewMenu_1.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Add Customer");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Add_customer Add_customer=new Add_customer();
				Add_customer.main(null);
			}
		});
		mntmNewMenuItem_7.setFont(new Font("Segoe UI", Font.BOLD, 16));
		mnNewMenu_1.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Add Size");
		mntmNewMenuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Add_size Add_size=new Add_size();
				Add_size.main(null);
			}
		});
		mntmNewMenuItem_8.setFont(new Font("Segoe UI", Font.BOLD, 16));
		mnNewMenu_1.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Add Department");
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Add_department Add_department=new Add_department();
				Add_department.main(null);
			}
		});
		mntmNewMenuItem_9.setFont(new Font("Segoe UI", Font.BOLD, 16));
		mnNewMenu_1.add(mntmNewMenuItem_9);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Add Rack no");
		mntmNewMenuItem_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Add_rack_no Add_rack_no=new Add_rack_no();
				Add_rack_no.main(null);
			}
		});
		mntmNewMenuItem_10.setFont(new Font("Segoe UI", Font.BOLD, 16));
		mnNewMenu_1.add(mntmNewMenuItem_10);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("Add Color");
		mntmNewMenuItem_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Add_color Add_color=new Add_color();
				Add_color.main(null);
			}
		});
		mntmNewMenuItem_11.setFont(new Font("Segoe UI", Font.BOLD, 16));
		mnNewMenu_1.add(mntmNewMenuItem_11);
		
		JMenu mnNewMenu_3 = new JMenu("Purchase Order");
		
		mnNewMenu_3.setFont(new Font("Segoe UI", Font.BOLD, 16));
		mnNewMenu_3.setForeground(Color.BLACK);
		menuBar.add(mnNewMenu_3);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Purchage_Order");
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Purchage_Order Purchage_Order=new Purchage_Order();
				Purchage_Order.main(null);
			}
		});
		mnNewMenu_3.add(tglbtnNewToggleButton);
		
		JMenu mnNewMenu_2 = new JMenu("GRN");
		mnNewMenu_2.setForeground(Color.BLACK);
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_13 = new JMenuItem("GRN");
		mntmNewMenuItem_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Add_GRN Add_GRN=new Add_GRN();
				Add_GRN.main(null);
				System.out.println("hey durgesh");
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_13);
		
		JMenu mnNewMenu_4 = new JMenu("Issue item");
		mnNewMenu_4.setForeground(Color.BLACK);
		mnNewMenu_4.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("item");
		mnNewMenu_4.add(mntmNewMenuItem_12);
		
		JMenu mnNewMenu_5 = new JMenu("Report");
		mnNewMenu_5.setForeground(Color.BLACK);
		mnNewMenu_5.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnNewMenu_5);
		
		JMenu mnNewMenu_6 = new JMenu("Help");
		mnNewMenu_6.setForeground(Color.BLACK);
		mnNewMenu_6.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnNewMenu_6);
		
		JMenu mnNewMenu_7 = new JMenu("LOGOUT");
		mnNewMenu_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				System.out.println("final");
				Thanks_page Thanks_page=new Thanks_page();
				Thanks_page.main(null);
				//admin admin=new admin();
			}
		});
		
		mnNewMenu_7.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mnNewMenu_7);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar.add(menuBar_1);
	
		
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Add_color Add_color=new Add_color();
				Add_color.main(null);
			}
		});
	}

	protected void dispose() {
		// TODO Auto-generated method stub
		
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
