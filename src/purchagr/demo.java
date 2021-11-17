package purchagr;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.JProgressBar;
import javax.swing.JTree;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JCalendar;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class demo {

	private JFrame frmPurchageOrder;
	private JTextField t1;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JTable table;
	private JTextField t7;
	private JTextField t8;
	private JTextField t9;
	private JTextField t10;
	private JTextField t12;
	JComboBox comboBox;
	private JTextField tf2;
	private JTextField tf1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JDateChooser dateChooser;
	JComboBox comboBox_1_1 ;
	String price,price2,dist,dist1,comboboxinput,qty; 
	float dist2,dist3;
	double price1,price12;
	int comboboxinput1,select_valueOftexttype;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					demo window = new demo();
					window.frmPurchageOrder.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void clock()
	{
		Calendar cal = new GregorianCalendar();
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		String[] mont= {"Jan","Fab","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		String livedate = (day+"-"+mont[month]+"-"+year);
		//(dateChooser).setToolTipText(livedate);
		
		
		
	}
	public void per() {
		price=tf1.getText();
		price1=Double.parseDouble(price);
		
		dist=t8.getText();
		System.out.println(dist);
		dist2=Float.parseFloat(dist);
		double ss=(price1/100)*dist2;
		double zz=(price1-ss);
		 String sss= String.format("%.2f", zz);
		 String aa= String.format("%.2f", ss);
		 tf1.setText(sss);
		 t9.setText(aa);
	}
	public void amt() {
		price=tf1.getText();
		price1=Double.parseDouble(price);
		dist1=t9.getText();
		dist3=Float.parseFloat(dist1);
		double ss1=(dist3*100)/price1;
		
		double zz1=(price1-dist3);
		 String sss1= String.format("%.2f", zz1);
		 String zzz1= String.format("%.2f", ss1);
		 tf1.setText(sss1);
		 t8.setText(zzz1);
	}
	public void gst1() {
		price2=tf1.getText();
		price12=Double.parseDouble(price2);
		qty=tf2.getText();
		int qty1=Integer.parseInt(qty);
		int select_valueOftexttype= comboBox_1_1.getSelectedIndex();
		
		if(select_valueOftexttype==0)
		{
			double a=100+comboboxinput1;
			double ab=((price12/a)*comboboxinput1);
			 double bb=(price12);
			 double tamt=(bb*qty1);
			 String aaa= String.format("%.2f", tamt);
			 String aaa1=  String.format("%.2f", ab);
			 t10.setText(aaa);
			 t12.setText(aaa1);
		}
		else
		{
			double bc=(price12/100)*comboboxinput1;
			 double aa=(price12+bc);
			 double tamt1=(aa*qty1);
			 String ss= String.format("%.2f", bc);
			 String bbb= String.format("%.2f", tamt1);
			 t10.setText(bbb);
			 t12.setText(ss);
		}
	}

	/**
	 * Create the application.
	 */
	public void Unit() 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1");
			Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306"
			+ "/project","root","Durgesh@123");
			System.out.println("2");
			String s="select * from mesurmentdetails";
			System.out.println("3");
			PreparedStatement pst=Connection.prepareStatement(s);
			System.out.println("4");
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				comboBox.addItem(rs.getString("Mesurment_Unit"));
			}
			//JOptionPane.showMessageDialog(null, "DATA saved ");
			}
			catch (Exception e1) 
			{
			}
		}
	public demo() 
	{
		Unit();
		System.out.println("hey");
		initialize();
		clock();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPurchageOrder = new JFrame();
		frmPurchageOrder.setResizable(false);
		frmPurchageOrder.setTitle("PURCHAGE ORDER");
		frmPurchageOrder.setBounds(100, 100, 1238, 708);
		frmPurchageOrder.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPurchageOrder.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 24, 1202, 51);
		frmPurchageOrder.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Po. Date");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(597, 11, 74, 24);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Phone No.");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(351, 11, 86, 24);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Supplier Name ");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(10, 11, 123, 24);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Address");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_4.setBounds(780, 11, 74, 24);
		panel.add(lblNewLabel_1_4);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(850, 13, 188, 28);
		panel.add(textArea);
		
		t1 = new JTextField();
		t1.setColumns(10);
		t1.setBounds(447, 11, 132, 28);
		panel.add(t1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(119, 11, 222, 28);
		panel.add(comboBox_2);
		
		JLabel lblNewLabel_3 = new JLabel("PO. NO.");
		lblNewLabel_3.setBounds(1048, 11, 62, 24);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		textField_2 = new JTextField();
		textField_2.setBounds(1118, 11, 74, 28);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(667, 11, 103, 28);
		panel.add(dateChooser);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 0, 1202, 24);
		frmPurchageOrder.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SUPPLIER DETAILS");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBackground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(95, 0, 1046, 22);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(10, 72, 1202, 24);
		frmPurchageOrder.getContentPane().add(panel_1_1);
		
		JLabel lblItemDetails = new JLabel("ITEM DETAILS");
		lblItemDetails.setBounds(94, 0, 1046, 24);
		panel_1_1.add(lblItemDetails);
		lblItemDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblItemDetails.setForeground(Color.BLUE);
		lblItemDetails.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblItemDetails.setBackground(Color.BLUE);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(10, 99, 1202, 132);
		frmPurchageOrder.getContentPane().add(panel_2);
		
		JLabel lblNewLabel_1_5 = new JLabel("Qty.");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_5.setBounds(10, 57, 34, 24);
		panel_2.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("HSN CODE");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(854, 11, 83, 24);
		panel_2.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("ITEM DESC.");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2_1.setBounds(593, 11, 92, 24);
		panel_2.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Item Name ");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3_1.setBounds(285, 11, 83, 24);
		panel_2.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Text Slab");
		lblNewLabel_1_4_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_4_1.setBounds(285, 57, 71, 24);
		panel_2.add(lblNewLabel_1_4_1);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(379, 11, 185, 28);
		panel_2.add(t3);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(685, 11, 159, 28);
		panel_2.add(t4);
		
		t5 = new JTextField();
		t5.setColumns(10);
		t5.setBounds(947, 11, 103, 28);
		panel_2.add(t5);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("UNIT");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1_1.setBounds(1060, 11, 49, 24);
		panel_2.add(lblNewLabel_1_1_1_1);
		
		comboBox = new JComboBox();
		comboBox.setBounds(1109, 13, 83, 24);
		panel_2.add(comboBox);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("QR/BARCODE");
		lblNewLabel_1_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3_1_1.setBounds(10, 11, 112, 24);
		panel_2.add(lblNewLabel_1_3_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Current Dist(%)");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1_1_1.setBounds(778, 57, 123, 24);
		panel_2.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Current Dist. Amt.");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1_1_1_1.setBounds(970, 57, 129, 24);
		panel_2.add(lblNewLabel_1_1_1_1_1_1);
		
		t7 = new JTextField();
		t7.setColumns(10);
		t7.setBounds(120, 11, 159, 28);
		panel_2.add(t7);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboboxinput=comboBox_1.getSelectedItem().toString();
				comboboxinput1=Integer.parseInt(comboboxinput);
				
			}
		});
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select", "5", "12", "18", "28"}));
		comboBox_1.setBounds(379, 59, 60, 24);
		panel_2.add(comboBox_1);
		
		t8 = new JTextField();
		t8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					per();
					gst1();
				}
			}
		});
		t8.setColumns(10);
		t8.setBounds(900, 57, 60, 28);
		panel_2.add(t8);
		
		t9 = new JTextField();
		t9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					amt();
					gst1();
					}
				}
		});
		
		t9.setColumns(10);
		t9.setBounds(1109, 57, 83, 28);
		panel_2.add(t9);
		
		t10 = new JTextField();
		t10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				gst1();
			}
		});
		t10.setColumns(10);
		t10.setBounds(1063, 96, 129, 28);
		panel_2.add(t10);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Total Amt.");
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(970, 96, 92, 24);
		panel_2.add(lblNewLabel_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("GST Amt.");
		lblNewLabel_1_5_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_5_1.setBounds(624, 57, 71, 24);
		panel_2.add(lblNewLabel_1_5_1);
		
		JLabel lblNewLabel_1_4_1_1 = new JLabel("Text Type");
		lblNewLabel_1_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_4_1_1.setBounds(449, 57, 71, 24);
		panel_2.add(lblNewLabel_1_4_1_1);
		
		t12 = new JTextField();
		t12.setColumns(10);
		t12.setBounds(695, 57, 76, 28);
		panel_2.add(t12);
		
		comboBox_1_1 = new JComboBox();
		comboBox_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int select_valueOftexttype= comboBox_1_1.getSelectedIndex();
				System.out.println(select_valueOftexttype);
				//s= (String) ob7.getSelectedItem();
				//System.out.println(s);
			}
		});
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"INCLUDE","EXCLUDE",}));
		comboBox_1_1.setBounds(530, 59, 84, 24);
		panel_2.add(comboBox_1_1);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(390, 11, 194, 28);
		panel_2.add(comboBox_3);
		
		tf2 = new JTextField();
		tf2.setBounds(44, 57, 60, 28);
		panel_2.add(tf2);
		tf2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Price");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(120, 57, 40, 24);
		panel_2.add(lblNewLabel_2);
		
		tf1 = new JTextField();
		tf1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tf1.setBounds(164, 57, 115, 28);
		panel_2.add(tf1);
		tf1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("ADD");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(491, 94, 103, 32);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("REMOVE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setForeground(Color.RED);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(659, 94, 112, 32);
		panel_2.add(btnNewButton_2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 250, 1202, 280);
		frmPurchageOrder.getContentPane().add(scrollPane_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane_1.setColumnHeaderView(scrollPane);
		
		table = new JTable();
		TableModel model = new DefaultTableModel();
		Object[] column = {"Supplier Name ","GST IN","GRN Date","Item Name ","HSN Code","GST IN","UNIT",
				"Current Dist(%)","Current Dist. Amt.","GST Amt.","Phone No.","Texable Amt."};
		Object [] row=new Object[12];
		((DefaultTableModel) model).setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("GENERATE\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{

				
		}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(497, 627, 135, 31);
		frmPurchageOrder.getContentPane().add(btnNewButton);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClose.setBounds(664, 627, 135, 31);
		frmPurchageOrder.getContentPane().add(btnClose);
		
		JLabel lblNewLabel_4 = new JLabel("Amount :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(31, 549, 75, 24);
		frmPurchageOrder.getContentPane().add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(138, 549, 144, 28);
		frmPurchageOrder.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Recived Amt :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(938, 549, 120, 24);
		frmPurchageOrder.getContentPane().add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(1057, 549, 135, 28);
		frmPurchageOrder.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_4_1 = new JLabel("Discount Amt :");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4_1.setBounds(330, 549, 113, 24);
		frmPurchageOrder.getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Remarks :");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4_2.setBounds(644, 588, 75, 24);
		frmPurchageOrder.getContentPane().add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Total Amt :");
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4_3.setBounds(330, 588, 87, 24);
		frmPurchageOrder.getContentPane().add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_4 = new JLabel("Tax Amt :");
		lblNewLabel_4_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4_4.setBounds(644, 549, 75, 24);
		frmPurchageOrder.getContentPane().add(lblNewLabel_4_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(453, 549, 135, 28);
		frmPurchageOrder.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(729, 549, 144, 28);
		frmPurchageOrder.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(453, 588, 135, 28);
		frmPurchageOrder.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(729, 588, 483, 28);
		frmPurchageOrder.getContentPane().add(textField_8);
		
		JLabel lblNewLabel_4_5 = new JLabel("Balance Amt :");
		lblNewLabel_4_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4_5.setBounds(31, 588, 104, 24);
		frmPurchageOrder.getContentPane().add(lblNewLabel_4_5);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(138, 588, 144, 28);
		frmPurchageOrder.getContentPane().add(textField_9);
		Unit();
	}
}
