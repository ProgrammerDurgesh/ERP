package GRN;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JSpinner;
import javax.swing.JEditorPane;
import java.awt.Color;
import javax.swing.UIManager;

import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

import purchagr.Purchage_Order;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import com.toedter.calendar.JDateChooser;

public class Add_GRN {
	private JFrame frmAddGrn;
	private JTextField Contact;
	private JTextField Desc;
	private JTextField Address;
	private JTextField Quantity;
	private JTextField Barcode;
	public JComboBox Supplier_Name;
	JComboBox Po_No;JComboBox<String> Item_name,Designation;
	String selectdata,concat,all,out;
	PreparedStatement pst;JButton btnNewButton;
	private JTextField PODATE;
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_GRN window = new Add_GRN();
					window.frmAddGrn.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Add_GRN() {
		initialize();
		AutoCompleteDecorator.decorate(Supplier_Name);
		AutoCompleteDecorator.decorate(Po_No);
		AutoCompleteDecorator.decorate(Item_name);
		AutoCompleteDecorator.decorate(Designation);
		
		table = new JTable();
		table.setBounds(10, 173, 827, 220);
		frmAddGrn.getContentPane().add(table);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(508, 173, 329, 220);
		frmAddGrn.getContentPane().add(scrollBar);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(711, 34, 103, 20);
		frmAddGrn.getContentPane().add(dateChooser);
	}
	public void SupplierName () 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Durgesh@123");
			String s="select * from purchage_order_details";
			PreparedStatement pst=Connection.prepareStatement(s);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				Supplier_Name.addItem(rs.getString("Suppilier_Name"));
			}
			//JOptionPane.showMessageDialog(null, "DATA saved ");
			}
			catch (Exception e1) 
			{	
				System.out.println(e1);
			}
		}
	public void item_Name() 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Durgesh@123");
			String s="select * from purchage_order_details";
			PreparedStatement pst=Connection.prepareStatement(s);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				Item_name.addItem(rs.getString("Item_name"));
			}
			//JOptionPane.showMessageDialog(null, "DATA saved ");
			}
			catch (Exception e1) 
			{	
				System.out.println(e1);
			}
		}
	
	public void item_Description() 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Durgesh@123");
			String s="select * from purchage_order_details";
			PreparedStatement pst=Connection.prepareStatement(s);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				Desc.setText(rs.getString("Item_Discription"));
			}
			//JOptionPane.showMessageDialog(null, "DATA saved ");
			}
			catch (Exception e1) 
			{	
				System.out.println(e1);
			}
		}
	public void Quantity() 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Durgesh@123");
			String s="select * from purchage_order_details";
			PreparedStatement pst=Connection.prepareStatement(s);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				Quantity.setText(rs.getString("Qty"));
				
			}
			//JOptionPane.showMessageDialog(null, "DATA saved ");
			}
			catch (Exception e1) 
			{	
				System.out.println(e1);
			}
		}
	public void PONO() 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Durgesh@123");
			String s="select * from purchage_order_details";
			PreparedStatement pst=Connection.prepareStatement(s);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				Po_No.addItem(rs.getString("PO_NO"));
				
			}
			//JOptionPane.showMessageDialog(null, "DATA saved ");
			}
			catch (Exception e1) 
			{	
				System.out.println(e1);
			}
		}
	public void Bar_code() 
		{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Durgesh@123");
				String s="select * from purchage_order_details";
				PreparedStatement pst=Connection.prepareStatement(s);
				ResultSet rs=pst.executeQuery();
				while(rs.next())
				{
					Barcode.setText(rs.getString("QR_Barcode"));
				}
				//JOptionPane.showMessageDialog(null, "DATA saved ");
				}
				catch (Exception e1) 
				{	
					System.out.println(e1);
				}
			}
	public void Designation() 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Durgesh@123");
			String s="select * from designationdetails";
			PreparedStatement pst=Connection.prepareStatement(s);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				Designation.addItem(rs.getString("Designation"));
			}
			//JOptionPane.showMessageDialog(null, "DATA saved ");
			}
			catch (Exception e1) 
			{	
				System.out.println(e1);
			}
		}
	public void PO_Date() 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Durgesh@123");
			String s="select * from purchage_order_details";
			PreparedStatement pst=Connection.prepareStatement(s);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				PODATE.setText(rs.getString("po_date"));
			}
			//JOptionPane.showMessageDialog(null, "DATA saved ");
			}
			catch (Exception e1) 
			{	
				System.out.println(e1);
			}
		}
	
	public void Mobile_number()
	{
		try
		{
		int index_of_suppilier_select =Supplier_Name.getSelectedIndex();
		Class.forName("com.mysql.cj.jdbc.Driver");
		String s="select Mobile_Number from suppilierdetails where suppilier_id= ";
		String selectIndex_change_in_to_string=String.valueOf(index_of_suppilier_select);
		concat=s.concat(selectIndex_change_in_to_string)+";";
		all=concat;
		Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306"
		+ "/project","root","Durgesh@123");
		pst=Connection.prepareStatement(all);
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			Contact.setText(rs.getString("Mobile_Number"));
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void clear()
	{
	
	Barcode.setText("");
	//item_Name.addItem("");
	PODATE.setText("");
	Desc.setText("");
	
	}
	
	public void Adress()
	{
		try
		{
		
		int index_of_suppilier_select =Supplier_Name.getSelectedIndex();
		Class.forName("com.mysql.cj.jdbc.Driver");
		String s="select Adress_line1,Adress_line2 from suppilierdetails where suppilier_id= ";
		String selectIndex_change_in_to_string=String.valueOf(index_of_suppilier_select);
		concat=s.concat(selectIndex_change_in_to_string)+";";
		all=concat;
		Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306"
		+ "/project","root","Durgesh@123");
		pst=Connection.prepareStatement(all);
		ResultSet rs=pst.executeQuery();
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
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddGrn = new JFrame();
		frmAddGrn.setResizable(false);
		frmAddGrn.setTitle("Add GRN");
		frmAddGrn.setBounds(100, 100, 863, 492);
		frmAddGrn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddGrn.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GRN DETAILS");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(363, 0, 97, 14);
		frmAddGrn.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Supplier Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 37, 81, 14);
		frmAddGrn.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Po. No");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 62, 81, 14);
		frmAddGrn.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Item Name");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(10, 87, 81, 14);
		frmAddGrn.getContentPane().add(lblNewLabel_3);
		
		Supplier_Name = new JComboBox();
		Supplier_Name.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				SupplierName();
				Mobile_number();
				Adress();
				
			}
		});
		Supplier_Name.setModel(new DefaultComboBoxModel(new String[] {"Select"}));
		Supplier_Name.setForeground(new Color(0, 0, 0));
		Supplier_Name.setBounds(99, 34, 119, 20);
		frmAddGrn.getContentPane().add(Supplier_Name);
		
		Po_No = new JComboBox();
		Po_No.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				PONO();
				PO_Date();
				
			}
			

		});
		Po_No.setModel(new DefaultComboBoxModel(new String[] {"Select ", ""}));
		Po_No.setForeground(new Color(0, 0, 0));
		Po_No.setBounds(99, 59, 119, 20);
		frmAddGrn.getContentPane().add(Po_No);
		
		JLabel lblNewLabel_4 = new JLabel("Contact No");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(234, 37, 62, 14);
		frmAddGrn.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Recived By");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(234, 62, 62, 14);
		frmAddGrn.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Desc.");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(234, 87, 62, 14);
		frmAddGrn.getContentPane().add(lblNewLabel_6);
		
		Contact = new JTextField();
		Contact.setBounds(301, 34, 111, 20);
		frmAddGrn.getContentPane().add(Contact);
		Contact.setColumns(10);
		
		Desc = new JTextField();
		Desc.setBounds(301, 84, 111, 20);
		frmAddGrn.getContentPane().add(Desc);
		Desc.setColumns(10);
		
		JComboBox Recived_By = new JComboBox();
		Recived_By.setModel(new DefaultComboBoxModel(new String[] {"Select"}));
		Recived_By.setBounds(301, 59, 111, 20);
		frmAddGrn.getContentPane().add(Recived_By);
		
		JLabel lblNewLabel_7 = new JLabel("Address");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7.setBounds(431, 37, 67, 14);
		frmAddGrn.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Designation");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_8.setBounds(431, 62, 67, 14);
		frmAddGrn.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Quantity");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_9.setBounds(431, 87, 67, 14);
		frmAddGrn.getContentPane().add(lblNewLabel_9);
		
		Address = new JTextField();
		Address.setBounds(508, 34, 111, 20);
		frmAddGrn.getContentPane().add(Address);
		Address.setColumns(10);
		
		Quantity = new JTextField();
		Quantity.setBounds(508, 84, 39, 20);
		frmAddGrn.getContentPane().add(Quantity);
		Quantity.setColumns(10);
		
		Designation = new JComboBox();
		Designation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Designation() ;
			}
		});
		Designation.setModel(new DefaultComboBoxModel(new String[] {"Select"}));
		Designation.setBounds(508, 59, 111, 20);
		frmAddGrn.getContentPane().add(Designation);
		
		JLabel lblNewLabel_10 = new JLabel("Barcode");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_10.setBounds(573, 87, 46, 14);
		frmAddGrn.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("GRN Date");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_11.setBounds(629, 37, 72, 14);
		frmAddGrn.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Po. No. Date");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_12.setBounds(629, 62, 72, 14);
		frmAddGrn.getContentPane().add(lblNewLabel_12);
		
		Barcode = new JTextField();
		Barcode.setBounds(629, 84, 185, 20);
		frmAddGrn.getContentPane().add(Barcode);
		Barcode.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("ITEMS DETAILS");
		lblNewLabel_13.setForeground(Color.WHITE);
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_13.setBounds(359, 128, 123, 14);
		frmAddGrn.getContentPane().add(lblNewLabel_13);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBackground(Color.BLUE);
		editorPane.setBounds(0, 128, 847, 20);
		frmAddGrn.getContentPane().add(editorPane);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBackground(Color.BLUE);
		editorPane_1.setBounds(0, 0, 847, 20);
		frmAddGrn.getContentPane().add(editorPane_1);
		
		btnNewButton = new JButton("SAVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
try {
	
				
					/*
					String Suppilier=(String)Suppilier_name.getSelectedItem();
					String Item_N=(String) Item_Name.getSelectedItem();
					String unit=(String) Unit.getSelectedItem();
					String comboBox_=(String) textslab.getSelectedItem();
					String comboBox_1_=(String) texttype.getSelectedItem();
					*/

					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Durgesh@123");
					String s1="insert into purchage_order_details values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
					PreparedStatement pst=Connection.prepareStatement(s1);
					/*pst.setString(1, null);
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
					pst.execute();
					Connection.close();*/
					
					/*JOptionPane.showMessageDialog(null, "DATA saved ");
					row[0]=Item_Name.getSelectedItem();
					row[1]=Item_Discription.getText();
					row[2]=QTY.getText();
					row[3]=PRice.getText();
					row[4]=Current_Dist_Amt.getText();
					row[5]=Current_Discunt.getText();
					model.addRow(row);*/
					
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
			}
		});
		btnNewButton.setBounds(264, 404, 89, 38);
		frmAddGrn.getContentPane().add(btnNewButton);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.setBounds(437, 404, 89, 38);
		frmAddGrn.getContentPane().add(btnCancel);
		
		Item_name = new JComboBox();
		Item_name.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				item_Name();
				item_Description();
				Quantity();
				Bar_code();
				//PO_Date();
			}
		});
		Item_name.setModel(new DefaultComboBoxModel(new String[] {"Select "}));
		Item_name.setBounds(101, 83, 117, 22);
		frmAddGrn.getContentPane().add(Item_name);
		
		PODATE = new JTextField();
		PODATE.setColumns(10);
		PODATE.setBounds(711, 59, 103, 20);
		frmAddGrn.getContentPane().add(PODATE);
		SupplierName();
		item_Name();
		PONO();
		Designation();
		
		
	}
}
