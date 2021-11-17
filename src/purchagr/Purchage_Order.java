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
import javax.swing.text.DateFormatter;
import javax.xml.crypto.Data;

import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

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
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.demo.DateChooserPanel;
import barcode.Qr_code;
import com.mysql.cj.protocol.Resultset;
import com.toedter.calendar.JCalendar;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import com.toedter.components.JLocaleChooser;
import java.awt.BorderLayout;

public class Purchage_Order  extends code
{

	private JFrame frmPurchageOrder;
	private JTextField Phone_Number,Item_Discription,HSN_Code,Barcode,Current_Discunt,Current_Dist_Amt,Total_Amount,GST_Amt;
	private JTable table;JButton btnNewButton_3;
	JComboBox Suppilier_name, Item_Name,Unit, textslab, texttype ;
	private JTextField QTY;
	private JTextField PRice,PONO,textField_3,
	textField_4,textField_5,textField_6,textField_7,
	textField_8,textField_9;ResultSet rs;
	String selectdata,concat,all,out;
	PreparedStatement pst;
	JTextArea Address;
	String price,dist,dist1,price2,comboboxinput,qty; 
	float dist2,dist3;
	double price1,price12;//JDateChooser dateChooser;
	int comboboxinput1,select_valueOftexttype;
	Object [] row;
	Object [] Column;DefaultTableModel model;
private JTextField texttypetext;
private JTextField textslabtext;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Purchage_Order window = new Purchage_Order();
					window.frmPurchageOrder.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Purchage_Order() 
	{
		
		Unit();
		initialize();
		clock();
		AutoCompleteDecorator.decorate(Suppilier_name);
		AutoCompleteDecorator.decorate(Item_Name);
		AutoCompleteDecorator.decorate(Unit);
		AutoCompleteDecorator.decorate(textslab);
		AutoCompleteDecorator.decorate(texttype);
	}
	public void clock()
	{
		Calendar cal = new GregorianCalendar();
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);	
	}
	public void random_number()
	{
			Random C=new Random();
			int n;
			n = C.nextInt(10000)+1;
			String data=String.valueOf(n);
			String s="PN";
			String value=String.valueOf(s.concat(data));
			PONO.setText(value);
	}
	/*public void totalamout()
	{
		String qty=textField.getText();System.out.println("1");
		int qtyint=Integer.parseInt(qty);System.out.println("2");
		String price=textField_1.getText();System.out.println("3");
		int priceint=Integer.parseInt(price);System.out.println("4");
		double total=qtyint*priceint;System.out.println("5");
		String totalshow=String.valueOf(total);System.out.println("6");
		t10.setText(totalshow);System.out.println("7");
		
	}*/
	public void clear()
		{
		
		Barcode.setText("");
		Item_Name.addItem("");
		Item_Discription.setText("");
		HSN_Code.setText("");
		Unit.addItem("");
		QTY.setText("");
		PRice.setText("");
		GST_Amt.setText("");
		Current_Discunt.setText("");
		Current_Dist_Amt.setText("");
		Total_Amount.setText("");
		}
	public void Mobile_number()
	{
		try
		{
		int index_of_suppilier_select =Suppilier_name.getSelectedIndex();
		Class.forName("com.mysql.cj.jdbc.Driver");
		String s="select Mobile_Number from suppilierdetails where suppilier_id= ";
		String selectIndex_change_in_to_string=String.valueOf(index_of_suppilier_select);
		concat=s.concat(selectIndex_change_in_to_string)+";";
		all=concat;
		Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306"
		+ "/project","root","Durgesh@123");
		pst=Connection.prepareStatement(all);
		rs=pst.executeQuery();
		while(rs.next())
		{
			Phone_Number.setText(rs.getString("Mobile_Number"));
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void Adress()
	{
		try
		{
		
		int index_of_suppilier_select =Suppilier_name.getSelectedIndex();
		Class.forName("com.mysql.cj.jdbc.Driver");
		String s="select Adress_line1,Adress_line2 from suppilierdetails where suppilier_id= ";
		String selectIndex_change_in_to_string=String.valueOf(index_of_suppilier_select);
		concat=s.concat(selectIndex_change_in_to_string)+";";
		all=concat;
		Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306"
		+ "/project","root","Durgesh@123");
		pst=Connection.prepareStatement(all);
		rs=pst.executeQuery();
		while(rs.next())
		{
			String con=rs.getString("Adress_line1");
			String space=" ";
			String con1=rs.getString("Adress_line2");
			String add=con.concat(space).concat(con1);
			
			Address.setText(add);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void item()
	{
		try
		{
		
		int index_of_suppilier_select =Item_Name.getSelectedIndex();
		Class.forName("com.mysql.cj.jdbc.Driver");
		String s="select Item_Discription from add_item_details where item_id= ";
		String selectIndex_change_in_to_string=String.valueOf(index_of_suppilier_select);
		concat=s.concat(selectIndex_change_in_to_string)+";";
		all=concat;
		Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306"
		+ "/project","root","Durgesh@123");
		pst=Connection.prepareStatement(all);
		rs=pst.executeQuery();
		while(rs.next())
		{
			Item_Discription.setText(rs.getString("Item_Discription"));
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void Barcode()
	{
		try
		{
		
		int index_of_suppilier_select =Item_Name.getSelectedIndex();
		Class.forName("com.mysql.cj.jdbc.Driver");
		String s="select Bar_code from add_item_details where item_id= ";
		String selectIndex_change_in_to_string=String.valueOf(index_of_suppilier_select);
		concat=s.concat(selectIndex_change_in_to_string)+";";
		all=concat;
		Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306"
		+ "/project","root","Durgesh@123");
		pst=Connection.prepareStatement(all);
		rs=pst.executeQuery();
		while(rs.next())
		{
			Barcode.setText(rs.getString("Bar_code"));
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void hsncode()
	{
		try
		{
		
		int index_of_suppilier_select =Item_Name.getSelectedIndex();
		Class.forName("com.mysql.cj.jdbc.Driver");
		String s="select HSN_Code from add_item_details where item_id= ";
		String selectIndex_change_in_to_string=String.valueOf(index_of_suppilier_select);
		concat=s.concat(selectIndex_change_in_to_string)+";";
		all=concat;
		Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306"
		+ "/project","root","Durgesh@123");
		pst=Connection.prepareStatement(all);
		rs=pst.executeQuery();
		while(rs.next())
		{
			HSN_Code.setText(rs.getString("HSN_Code"));
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void gst()
	{
		try
		{
		
		int index_of_suppilier_select =Item_Name.getSelectedIndex();
		Class.forName("com.mysql.cj.jdbc.Driver");
		String s="select Purchage_GST_Amt from add_item_details where item_id= ";
		String selectIndex_change_in_to_string=String.valueOf(index_of_suppilier_select);
		concat=s.concat(selectIndex_change_in_to_string)+";";
		all=concat;
		Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306"
		+ "/project","root","Durgesh@123");
		pst=Connection.prepareStatement(all);
		rs=pst.executeQuery();
		while(rs.next())
		{
			GST_Amt.setText(rs.getString("Purchage_GST_Amt"));
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void texttype()
	{
		try
		{
		
		int index_of_suppilier_select =Item_Name.getSelectedIndex();
		Class.forName("com.mysql.cj.jdbc.Driver");
		String s="select Text_type from add_item_details where item_id= ";
		String selectIndex_change_in_to_string=String.valueOf(index_of_suppilier_select);
		concat=s.concat(selectIndex_change_in_to_string)+";";
		all=concat;
		Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306"
		+ "/project","root","Durgesh@123");
		pst=Connection.prepareStatement(all);
		rs=pst.executeQuery();
		while(rs.next())
		{
			texttypetext.setText(rs.getString("Text_type"));
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void textslab()
	{
		try
		{
			int index_of_suppilier_select =Item_Name.getSelectedIndex();
			Class.forName("com.mysql.cj.jdbc.Driver");
			String s="select Tex_slab from add_item_details where item_id=";
			String selectIndex_change_in_to_string=String.valueOf(index_of_suppilier_select);
			concat=s.concat(selectIndex_change_in_to_string)+";";
			all=concat;
			Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306"
			+ "/project","root","Durgesh@123");
			pst=Connection.prepareStatement(all);
			rs=pst.executeQuery();
			while(rs.next())
			{
				textslabtext.setText(rs.getString("Tex_slab"));
			}
		}
		catch (Exception e) 
		{
			System.out.println(e);
			e.printStackTrace();
			
		}
		
		
	}
	public void price()
	{
		try
		{
		
		int index_of_suppilier_select =Item_Name.getSelectedIndex();
		Class.forName("com.mysql.cj.jdbc.Driver");
		String s="select Base_purchage_price from add_item_details where item_id= ";
		String selectIndex_change_in_to_string=String.valueOf(index_of_suppilier_select);
		concat=s.concat(selectIndex_change_in_to_string)+";";
		all=concat;
		Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306"
		+ "/project","root","Durgesh@123");
		pst=Connection.prepareStatement(all);
		rs=pst.executeQuery();
		while(rs.next())
		{
			PRice.setText(rs.getString("Base_purchage_price"));
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * Create the application.
	 */
	public void per() {
		price=PRice.getText();
		price1=Double.parseDouble(price);
		
		dist=Current_Discunt.getText();
		System.out.println(dist);
		dist2=Float.parseFloat(dist);
		double ss=(price1/100)*dist2;
		double zz=(price1-ss);
		 String sss= String.format("%.2f", zz);
		 String aa= String.format("%.2f", ss);
		 PRice.setText(sss);
		 Current_Dist_Amt.setText(aa);
	}
	public void amt() {
		price=PRice.getText();
		price1=Double.parseDouble(price);
		dist1=Current_Dist_Amt.getText();
		dist3=Float.parseFloat(dist1);
		double ss1=(dist3*100)/price1;
		
		double zz1=(price1-dist3);
		 String sss1= String.format("%.2f", zz1);
		 String zzz1= String.format("%.2f", ss1);
		 PRice.setText(sss1);
		 Current_Discunt.setText(zzz1);
	}
	public void gst1() {
		price2=PRice.getText();
		price12=Double.parseDouble(price2);
		qty=QTY.getText();
		System.out.println(qty);
		int qty1=Integer.parseInt(qty);
		int select_valueOftexttype= texttype.getSelectedIndex();
		
		if(select_valueOftexttype==0)
		{
			double a=100+comboboxinput1;
			double ab=((price12/a)*comboboxinput1);
			 double bb=(price12);
			 double tamt=(bb*qty1);
			 String aaa= String.format("%.2f", tamt);
			 String aaa1=  String.format("%.2f", ab);
			 Total_Amount.setText(aaa);
			 GST_Amt.setText(aaa1);
		}
		else
		{
			double bc=(price12/100)*comboboxinput1;
			 double aa=(price12+bc);
			 double tamt1=(aa*qty1);
			 String ss= String.format("%.2f", bc);
			 String bbb= String.format("%.2f", tamt1);
			 Total_Amount.setText(bbb);
			 GST_Amt.setText(ss);
		}
	}


	public void Unit() 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306"
			+ "/project","root","Durgesh@123");
			String s="select * from mesurmentdetails";
			PreparedStatement pst=Connection.prepareStatement(s);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				Unit.addItem(rs.getString("Mesurment_Unit"));
			}
			//JOptionPane.showMessageDialog(null, "DATA saved ");
			}
			catch (Exception e1) 
			{
				System.out.println();
			}
		}
	public void Item_name() 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306"
			+ "/project","root","Durgesh@123");
			String s="select * from add_item_details";
			PreparedStatement pst=Connection.prepareStatement(s);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				Item_Name.addItem(rs.getString("Item_name"));
			}
			//JOptionPane.showMessageDialog(null, "DATA saved ");
			}
			catch (Exception e1) 
			{
			}
		}
	public void SupplierName () 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Durgesh@123");
			String s="select * from suppilierdetails";
			PreparedStatement pst=Connection.prepareStatement(s);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				
				Suppilier_name.addItem(rs.getString("Suppilier_Name"));
			}
			//JOptionPane.showMessageDialog(null, "DATA saved ");
			}
			catch (Exception e1) 
			{	
				System.out.println(e1);
			}
		}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPurchageOrder = new JFrame();
		frmPurchageOrder.setAlwaysOnTop(true);
		frmPurchageOrder.getContentPane().setBackground(Color.GRAY);
		frmPurchageOrder.setTitle("PURCHAGE ORDER");
		frmPurchageOrder.setBounds(100, 100, 1238, 708);
		frmPurchageOrder.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPurchageOrder.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(10, 21, 1202, 51);
		frmPurchageOrder.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Po. Date");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(597, 11, 74, 24);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Phone No.");
		lblNewLabel_1_2.setBackground(Color.PINK);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(351, 11, 86, 24);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Supplier Name ");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(10, 11, 123, 24);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Address");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_4.setBounds(780, 11, 56, 24);
		panel.add(lblNewLabel_1_4);
		
		Phone_Number = new JTextField();
		Phone_Number.setForeground(UIManager.getColor("ColorChooser.foreground"));
		Phone_Number.setBackground(UIManager.getColor("ColorChooser.swatchesDefaultRecentColor"));
		Phone_Number.setColumns(10);
		Phone_Number.setBounds(447, 11, 132, 28);
		panel.add(Phone_Number);
		
		Suppilier_name = new JComboBox();
		Suppilier_name.setBackground(UIManager.getColor("ComboBox.buttonBackground"));
		Suppilier_name.setModel(new DefaultComboBoxModel(new String[] {"Select"}));
		Suppilier_name.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String fatch_row="select Mobile_Number from suppilierdetails where suppilier_id= ?";
				//pst=Connection.PreparedStatement();
				Mobile_number();
				Adress();
				
			}
		});
		Suppilier_name.setBounds(119, 11, 222, 28);
		panel.add(Suppilier_name);
		
		JLabel lblNewLabel_3 = new JLabel("PO. NO.");
		lblNewLabel_3.setBounds(1048, 11, 62, 24);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		PONO = new JTextField();
		PONO.setBackground(Color.GRAY);
		PONO.setBounds(1118, 11, 74, 28);
		panel.add(PONO);
		PONO.setColumns(10);
		
		Address = new JTextArea();
		Address.setLineWrap(true);
		Address.setBackground(UIManager.getColor("ComboBox.buttonBackground"));
		Address.setForeground(UIManager.getColor("ColorChooser.foreground"));
		Address.setBounds(849, 11, 171, 29);
		panel.add(Address);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(667, 15, 107, 20);
		panel.add(dateChooser);
		
		/*dateChooser = new JDateChooser();
		dateChooser.setBounds(668, 15, 112, 20);
		panel.add(dateChooser);*/
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(10, 0, 1202, 24);
		frmPurchageOrder.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SUPPLIER DETAILS");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBackground(Color.YELLOW);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 4, 1131, 13);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(10, 72, 1202, 24);
		panel_1_1.setLayout(null);
		frmPurchageOrder.getContentPane().add(panel_1_1);
		
		JLabel lblItemDetails = new JLabel("ITEM DETAILS");
		lblItemDetails.setBounds(0, 0, 1140, 24);
		panel_1_1.add(lblItemDetails);
		lblItemDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblItemDetails.setForeground(Color.BLUE);
		lblItemDetails.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblItemDetails.setBackground(Color.BLUE);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GRAY);
		panel_2.setBounds(10, 95, 1202, 151);
		panel_2.setLayout(null);
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
		lblNewLabel_1_3_1.setBounds(297, 11, 83, 24);
		panel_2.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Text Slab");
		lblNewLabel_1_4_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_4_1.setBounds(297, 57, 71, 24);
		panel_2.add(lblNewLabel_1_4_1);
		
		Item_Discription = new JTextField();
		Item_Discription.setBackground(UIManager.getColor("ComboBox.buttonBackground"));
		Item_Discription.setColumns(10);
		Item_Discription.setBounds(685, 11, 159, 28);
		panel_2.add(Item_Discription);
		
		HSN_Code = new JTextField();
		HSN_Code.setBackground(UIManager.getColor("ComboBox.buttonBackground"));
		HSN_Code.setColumns(10);
		HSN_Code.setBounds(947, 11, 103, 28);
		panel_2.add(HSN_Code);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("UNIT");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1_1.setBounds(1060, 11, 49, 24);
		panel_2.add(lblNewLabel_1_1_1_1);
		
		Unit = new JComboBox();
		Unit.setModel(new DefaultComboBoxModel(new String[] {"Select"}));
		Unit.setBounds(1109, 13, 83, 24);
		panel_2.add(Unit);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("QR/BARCODE");
		lblNewLabel_1_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3_1_1.setBounds(10, 11, 112, 24);
		panel_2.add(lblNewLabel_1_3_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Current Dist(%)");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1_1_1.setBounds(775, 57, 123, 24);
		panel_2.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Current Dist. Amt.");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1_1_1_1.setBounds(947, 57, 133, 24);
		panel_2.add(lblNewLabel_1_1_1_1_1_1);
		
		Barcode = new JTextField();
		Barcode.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e)
			{
				
			}
		});
		Barcode.setBackground(UIManager.getColor("ComboBox.buttonBackground"));
		Barcode.setColumns(10);
		Barcode.setBounds(120, 11, 103, 28);
		panel_2.add(Barcode);
		
		textslab = new JComboBox();
		textslab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboboxinput=textslab.getSelectedItem().toString();
				comboboxinput1=Integer.parseInt(comboboxinput);
				
			}
		});
		textslab.setModel(new DefaultComboBoxModel(new String[] {"Select", "0", "5", "12", "18", "28"}));
		textslab.setBounds(390, 61, 74, 20);
		panel_2.add(textslab);
		
		Current_Discunt = new JTextField();
		Current_Discunt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e)
			{if(e.getKeyCode()==KeyEvent.VK_ENTER) {
				per();
				gst1();
				}
			}
		});
		
		Current_Discunt.setColumns(10);
		Current_Discunt.setBounds(897, 57, 40, 28);
		panel_2.add(Current_Discunt);
		
		Current_Dist_Amt = new JTextField();
		Current_Dist_Amt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
				amt();
				gst1();
				}
			}
		});
		Current_Dist_Amt.setColumns(10);
		Current_Dist_Amt.setBounds(1080, 57, 112, 28);
		panel_2.add(Current_Dist_Amt);
		
		Total_Amount = new JTextField();
		Total_Amount.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				gst1();
			}
		});
		Total_Amount.setColumns(10);
		Total_Amount.setBounds(1013, 104, 183, 28);
		panel_2.add(Total_Amount);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Total Amt.");
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(914, 104, 92, 24);
		panel_2.add(lblNewLabel_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("GST Amt.");
		lblNewLabel_1_5_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_5_1.setBounds(639, 61, 71, 24);
		panel_2.add(lblNewLabel_1_5_1);
		
		JLabel lblNewLabel_1_4_1_1 = new JLabel("Text Type");
		lblNewLabel_1_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_4_1_1.setBounds(466, 57, 71, 24);
		panel_2.add(lblNewLabel_1_4_1_1);
		
		GST_Amt = new JTextField();
		GST_Amt.setBackground(UIManager.getColor("ComboBox.buttonBackground"));
		GST_Amt.setColumns(10);
		GST_Amt.setBounds(705, 57, 60, 28);
		panel_2.add(GST_Amt);
		
		texttype = new JComboBox();
		texttype.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int select_valueOftexttype= texttype.getSelectedIndex();
				System.out.println(select_valueOftexttype);
			}
		});
		texttype.setModel(new DefaultComboBoxModel(new String[] {"Select", "INCLUDE", "EXCLUDE"}));
		texttype.setBounds(573, 61, 56, 20);
		panel_2.add(texttype);
		
		Item_Name = new JComboBox();
		Item_Name.setModel(new DefaultComboBoxModel(new String[] {"Select"}));
		Item_Name.setBackground(UIManager.getColor("ComboBox.buttonBackground"));
		Item_Name.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				item();
				hsncode();
				gst();
				price();
				Barcode();
				textslab();
				texttype();
			}
		});
		Item_Name.setBounds(390, 11, 194, 28);
		panel_2.add(Item_Name);
		
		QTY = new JTextField();
		QTY.setBounds(44, 57, 60, 28);
		panel_2.add(QTY);
		QTY.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Price");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(114, 57, 40, 24);
		panel_2.add(lblNewLabel_2);
		
		PRice = new JTextField();
		PRice.setBackground(UIManager.getColor("ComboBox.buttonBackground"));
		PRice.setBounds(164, 57, 118, 28);
		panel_2.add(PRice);
		PRice.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("ADD");
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
			if(Suppilier_name.getSelectedItem()==null )
			{
			JOptionPane.showMessageDialog(null, "Select Suppilier Name");
			}
			
			if(Item_Name.getSelectedItem()==null)
			{
			JOptionPane.showMessageDialog(null, "Select Item Name");
			}
				
				try {
	
				
					
					String Suppilier=(String)Suppilier_name.getSelectedItem();
					String Item_N=(String) Item_Name.getSelectedItem();
					String unit=(String) Unit.getSelectedItem();
					String comboBox_=(String) textslab.getSelectedItem();
					String comboBox_1_=(String) texttype.getSelectedItem();
					

					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Durgesh@123");
					String s1="insert into purchage_order_details values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
					PreparedStatement pst=Connection.prepareStatement(s1);
					pst.setString(1, null);
					pst.setString(2, Suppilier);
					pst.setString(3, Phone_Number.getText());
					pst.setString(4, (((JTextField) dateChooser.getDateEditor().getUiComponent()).getText()));
					pst.setString(5, Address.getText());
					pst.setString(6, PONO.getText());
					pst.setString(7, Barcode.getText());
					pst.setString(8, Item_N);
					pst.setString(9, Item_Discription.getText());
					pst.setString(10, HSN_Code.getText());
					pst.setString(11, unit);
					pst.setString(12, QTY.getText());
					pst.setString(13, PRice.getText());
					pst.setString(14, comboBox_);
					pst.setString(15, comboBox_1_);					
					pst.setString(16, GST_Amt.getText());
					pst.setString(17, Current_Discunt.getText());
					pst.setString(18, Current_Dist_Amt.getText());
					pst.setString(19, Total_Amount.getText());
					pst.execute();
					Connection.close();
					
					JOptionPane.showMessageDialog(null, "DATA saved ");
					row[0]=Item_Name.getSelectedItem();
					row[1]=Item_Discription.getText();
					row[2]=QTY.getText();
					row[3]=PRice.getText();
					row[4]=Current_Dist_Amt.getText();
					row[5]=Current_Discunt.getText();
					model.addRow(row);
					
					System.out.println("done");
				}
				catch (Exception e1) 
				{
					System.out.println(e1);
					e1.printStackTrace();
					// TODO: handle exception
				}
				System.out.println("Sucssecful");
				clear();
				System.out.println("Removed");
			}
		});
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(434, 104, 103, 32);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("REMOVE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				clear();
				System.out.println("Removed");
			}
		});
		btnNewButton_2.setForeground(Color.RED);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(573, 104, 112, 32);
		panel_2.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(233, 11, 49, 26);
		panel_2.add(btnNewButton_3);
		
		texttypetext = new JTextField();
		texttypetext.setColumns(10);
		texttypetext.setBounds(540, 61, 71, 20);
		panel_2.add(texttypetext);
		
		textslabtext = new JTextField();
		textslabtext.setColumns(10);
		textslabtext.setBounds(378, 61, 71, 20);
		panel_2.add(textslabtext);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 250, 1202, 280);
		frmPurchageOrder.getContentPane().add(scrollPane_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane_1.setColumnHeaderView(scrollPane);
		
		table = new JTable();
		TableModel model = new DefaultTableModel();
		Object[] column = {"S. No.","Item Name ","Item Description","QTY","Price / MRP",
				" Discount Amt.","Discount(%)","GST slab.","IGST","CGST"};
		row=new Object[10];
		((DefaultTableModel) model).setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("GENERATE\r\n");
		btnNewButton.setBounds(497, 627, 135, 31);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{

				
		}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmPurchageOrder.getContentPane().add(btnNewButton);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.setBounds(664, 627, 135, 31);
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmPurchageOrder.getContentPane().add(btnClose);
		
		JLabel lblNewLabel_4 = new JLabel("Amount :");
		lblNewLabel_4.setBounds(31, 549, 75, 24);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmPurchageOrder.getContentPane().add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(138, 549, 144, 28);
		frmPurchageOrder.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Recived Amt :");
		lblNewLabel_5.setBounds(938, 549, 120, 24);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmPurchageOrder.getContentPane().add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(1057, 549, 135, 28);
		frmPurchageOrder.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_4_1 = new JLabel("Discount Amt :");
		lblNewLabel_4_1.setBounds(330, 549, 113, 24);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmPurchageOrder.getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Remarks :");
		lblNewLabel_4_2.setBounds(644, 588, 75, 24);
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmPurchageOrder.getContentPane().add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Total Amt :");
		lblNewLabel_4_3.setBounds(330, 588, 87, 24);
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmPurchageOrder.getContentPane().add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_4 = new JLabel("Tax Amt :");
		lblNewLabel_4_4.setBounds(644, 549, 75, 24);
		lblNewLabel_4_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmPurchageOrder.getContentPane().add(lblNewLabel_4_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(453, 549, 135, 28);
		textField_5.setColumns(10);
		frmPurchageOrder.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBounds(729, 549, 144, 28);
		textField_6.setColumns(10);
		frmPurchageOrder.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setBounds(453, 588, 135, 28);
		textField_7.setColumns(10);
		frmPurchageOrder.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setBounds(729, 588, 483, 28);
		textField_8.setColumns(10);
		frmPurchageOrder.getContentPane().add(textField_8);
		
		JLabel lblNewLabel_4_5 = new JLabel("Balance Amt :");
		lblNewLabel_4_5.setBounds(31, 588, 104, 24);
		lblNewLabel_4_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmPurchageOrder.getContentPane().add(lblNewLabel_4_5);
		
		textField_9 = new JTextField();
		textField_9.setBounds(138, 588, 144, 28);
		textField_9.setColumns(10);
		frmPurchageOrder.getContentPane().add(textField_9);
		Unit();
		Item_name();
		random_number();
		SupplierName();
		//totalamout();
		Barcode();
		clear();
		textslab();
	}
}
