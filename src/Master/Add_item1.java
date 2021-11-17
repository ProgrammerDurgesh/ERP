package Master;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Add_item1 {

	private JFrame ADD_item;
	private JTextField ob1;
	private JTextField ob2;
	private JTextField ob3;
	private JTextField ob5;
	private JComboBox obj5;
	private JComboBox obj3;
	private JComboBox obj2;
	private JComboBox obj;
	private JTextField ob6;
	private JTextField ob7;
	private JTextField ob8;
	private JTextField ob9;
	JComboBox obj4,obj6;
	Connection Connection=null;
	private JTextField ob11;
	private JTextField ob10;
	private JTextField ob4;
	String  comboboxinput;int comboboxinput1;
	String  baseprice,value,color,s;
	int select_valueOftexttype;
	double baseprice1;
	 
	
	/**
	 * Launch the application.
	 */
	public Add_item1() {
		Unit();
		Size() ;
		//RackNumber() ;
		color();
		initialize();
	}
	
	public void Unit() 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Durgesh@123");
			String s="select * from mesurmentdetails";
			PreparedStatement pst=Connection.prepareStatement(s);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				obj2.addItem(rs.getString("Mesurment_Unit"));
			}
			//JOptionPane.showMessageDialog(null, "DATA saved ");
			}
			catch (Exception e1) 
			{
			}
		}
	public void RackNumber() 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Durgesh@123");
			String s="select * from Add_rack_number";
			PreparedStatement pst=Connection.prepareStatement(s);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				
				obj6.addItem(rs.getString("Rack_no"));
			}
			//JOptionPane.showMessageDialog(null, "DATA saved ");
			}
			catch (Exception e1) 
			{
			}
		}
	public void Size() 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Durgesh@123");
			String s1="select * from sizedetails;";
			PreparedStatement pst=Connection.prepareStatement(s1);
			ResultSet rs1=pst.executeQuery();
			while(rs1.next())
			{
				obj.addItem(rs1.getString("Size"));
			}
			//JOptionPane.showMessageDialog(null, "DATA saved ");
			}
			catch (Exception e1) 
			{
			}
		}
		
	
	public void color() 
	{
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Durgesh@123");
			String s1="select * from color_detatils";
			PreparedStatement pst=Connection.prepareStatement(s1);
			ResultSet rs1=pst.executeQuery();
			while(rs1.next())
			{
				obj3.addItem(rs1.getString("color"));
			}
			//JOptionPane.showMessageDialog(null, "DATA saved ");
			}
			catch (Exception e1) 
			{
			}
		}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_item1 window = new Add_item1();
					
					//System.out.println("hey");
					window.ADD_item.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @return 
	 */
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ADD_item = new JFrame();
		ADD_item.getContentPane().setBackground(Color.GRAY);
		ADD_item.setFont(new Font("Dialog", Font.BOLD, 14));
		ADD_item.setTitle("ADD_item");
		ADD_item.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		ADD_item.setAlwaysOnTop(true);
		ADD_item.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(10, 52, 962, 266);
		ADD_item.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel t = new JLabel("Item Name");
		t.setForeground(Color.DARK_GRAY);
		t.setFont(new Font("Tahoma", Font.BOLD, 14));
		t.setBounds(10, 23, 107, 22);
		panel.add(t);
		
		JLabel lblNewLabel_1_1 = new JLabel("Item Discription");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(436, 23, 165, 22);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("HSN Code");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(10, 78, 107, 22);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Unit");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(10, 111, 107, 22);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Tax Type");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_4.setBounds(10, 151, 107, 22);
		panel.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("QR Code");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_5.setBounds(10, 230, 107, 22);
		panel.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_7 = new JLabel("Size");
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_7.setBounds(436, 68, 107, 22);
		panel.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("Color");
		lblNewLabel_1_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_8.setBounds(436, 111, 107, 22);
		panel.add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_1_9 = new JLabel("Tex Slab");
		lblNewLabel_1_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_9.setBounds(436, 151, 107, 22);
		panel.add(lblNewLabel_1_9);
		
		JLabel lblNewLabel_1_10 = new JLabel("Rack No.");
		lblNewLabel_1_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_10.setBounds(10, 187, 107, 22);
		panel.add(lblNewLabel_1_10);
		
		JLabel lblNewLabel_1_11 = new JLabel("BAR Code");
		lblNewLabel_1_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_11.setBounds(436, 187, 107, 22);
		panel.add(lblNewLabel_1_11);
		
		ob1 = new JTextField();
		ob1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e)
			{
				int position =ob1.getCaretPosition();
				ob1.setText(ob1.getText().toUpperCase());
			}
		});
		ob1.setBounds(103, 24, 252, 29);
		panel.add(ob1);
		ob1.setColumns(10);
		
		ob2 = new JTextField();
		ob2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e)
			{
				int position =ob2.getCaretPosition();
				ob2.setText(ob2.getText().toUpperCase());
			}
		});
		ob2.setColumns(10);
		ob2.setBounds(690, 22, 252, 29);
		panel.add(ob2);
		
		ob3 = new JTextField();
		ob3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e)
			{
				int position =ob3.getCaretPosition();
				ob3.setText(ob3.getText().toUpperCase());
			}
		});
		ob3.setColumns(10);
		ob3.setBounds(103, 67, 252, 29);
		panel.add(ob3);
		
		ob5 = new JTextField();
		ob5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e)
			{
				int position =ob5.getCaretPosition();
				ob5.setText(ob5.getText().toUpperCase());
			}
		});
		ob5.setColumns(10);
		ob5.setBounds(103, 229, 252, 29);
		panel.add(ob5);
		
		obj2 = new JComboBox();
		obj2.setForeground(Color.BLUE);
		obj2.setModel(new DefaultComboBoxModel(new String[] {"Select"}));
		obj2.setFont(new Font("Tahoma", Font.BOLD, 14));
		obj2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
		}});
		obj2.setBounds(103, 104, 252, 29);
		panel.add(obj2);
		
		obj4 = new JComboBox();
		obj4.setForeground(Color.BLUE);
		obj4.setFont(new Font("Tahoma", Font.BOLD, 14));
		obj4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				select_valueOftexttype=obj4.getSelectedIndex();
				//System.out.println(select_valueOftexttype);
				//s= (String) ob7.getSelectedItem();
				//System.out.println(s);
				
				
			}
		});
		obj4.setModel(new DefaultComboBoxModel(new String[] {"Select", "INCLUDE", "EXCLUDE"}));
		obj4.setBounds(103, 144, 252, 29);
		panel.add(obj4);
		
		 obj6 = new JComboBox();
		obj6.setForeground(Color.BLUE);
		obj6.setFont(new Font("Tahoma", Font.BOLD, 14));
		obj6.setModel(new DefaultComboBoxModel(new String[] {"Select"}));
		obj6.setBounds(103, 184, 252, 29);
		panel.add(obj6);
		
		 obj3 = new JComboBox();
		 obj3.setForeground(Color.BLUE);
		 obj3.setModel(new DefaultComboBoxModel(new String[] {"Select"}));
		 obj3.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e)
		 	{
		 		color=obj3.getSelectedItem().toString();
		 		//System.out.println(comboboxinput1);
		 	}
		 });
		 obj3.setFont(new Font("Tahoma", Font.BOLD, 14));
		obj3.setBounds(690, 108, 252, 29);
		panel.add(obj3);
		
		obj5 = new JComboBox();
		obj5.setForeground(Color.BLUE);
		obj5.setFont(new Font("Tahoma", Font.BOLD, 14));
		obj5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				comboboxinput=obj5.getSelectedItem().toString();
				comboboxinput1=Integer.parseInt(comboboxinput);
				//System.out.println(comboboxinput1);
			}
		});
		obj5.setBounds(690, 148, 252, 29);
		obj5.setModel(new DefaultComboBoxModel(new String[] {"Select", "5", "12", "18", "28"}));
		panel.add(obj5);
		
		 obj = new JComboBox();
		 obj.setForeground(Color.BLUE);
		 obj.setModel(new DefaultComboBoxModel(new String[] {"Select"}));
		 obj.setFont(new Font("Tahoma", Font.BOLD, 14));
		obj.setBounds(690, 70, 252, 29);
		panel.add(obj);
		
		ob4 = new JTextField();
		ob4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e)
			{
				int position =ob4.getCaretPosition();
				ob4.setText(ob4.getText().toUpperCase());
			}
		});
		ob4.setColumns(10);
		ob4.setBounds(690, 186, 252, 29);
		panel.add(ob4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 998, 30);
		ADD_item.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ITEM DETAILS");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 998, 30);
		panel_1.add(lblNewLabel);
		
		JLabel lblItemPriceDetails = new JLabel("ITEM PRICE  DETAILS");
		lblItemPriceDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblItemPriceDetails.setForeground(Color.BLUE);
		lblItemPriceDetails.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblItemPriceDetails.setBounds(0, 324, 1008, 30);
		ADD_item.getContentPane().add(lblItemPriceDetails);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GRAY);
		panel_2.setLayout(null);
		panel_2.setBounds(10, 353, 962, 164);
		ADD_item.getContentPane().add(panel_2);
		
		JLabel lblBasePurchagePrice = new JLabel("Base Purchage Price");
		lblBasePurchagePrice.setForeground(Color.DARK_GRAY);
		lblBasePurchagePrice.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBasePurchagePrice.setBounds(10, 23, 143, 22);
		panel_2.add(lblBasePurchagePrice);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Purchase GST Amt.");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(436, 23, 165, 22);
		panel_2.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Net Purchage Price");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2_1.setBounds(10, 68, 143, 22);
		panel_2.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Open Stock ");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3_1.setBounds(10, 111, 107, 22);
		panel_2.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_7_1 = new JLabel("MRP Amt.");
		lblNewLabel_1_7_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_7_1.setBounds(436, 68, 143, 22);
		panel_2.add(lblNewLabel_1_7_1);
		
		JLabel lblNewLabel_1_8_1 = new JLabel("Maximum  Stock ");
		lblNewLabel_1_8_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_8_1.setBounds(436, 111, 143, 22);
		panel_2.add(lblNewLabel_1_8_1);
		
		ob6 = new JTextField();
		ob6.setColumns(10);
		ob6.setBounds(163, 22, 252, 29);
		panel_2.add(ob6);
		
		ob7 = new JTextField();
		ob7.setColumns(10);
		ob7.setBounds(690, 22, 252, 29);
		panel_2.add(ob7);
		
		ob8 = new JTextField();
		ob8.setColumns(10);
		ob8.setBounds(163, 67, 252, 29);
		panel_2.add(ob8);
		
		ob9 = new JTextField();
		ob9.setColumns(10);
		ob9.setBounds(690, 68, 252, 29);
		panel_2.add(ob9);
		
		ob11 = new JTextField();
		ob11.setColumns(10);
		ob11.setBounds(690, 110, 252, 29);
		panel_2.add(ob11);
		
		ob10 = new JTextField();
		ob10.setColumns(10);
		ob10.setBounds(163, 114, 252, 29);
		panel_2.add(ob10);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String Obj=(String) obj.getSelectedItem();
				String Obj2=(String) obj2.getSelectedItem();
				String Obj3=(String) obj3.getSelectedItem();
				String Obj4=(String) obj4.getSelectedItem();
				String Obj5=(String) obj5.getSelectedItem();
				String Obj6=(String) obj6.getSelectedItem();
				
				try {
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Durgesh@123");
					String s1="insert into add_item_details values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
					PreparedStatement pst=Connection.prepareStatement(s1);
					pst.setString(1, null);
					pst.setString(2, ob1.getText());
					pst.setString(3, ob2.getText());
					pst.setString(4, ob3.getText());
					pst.setString(5, Obj);
					pst.setString(6, Obj2);
					pst.setString(7, Obj3);
					pst.setString(8, Obj4);
					pst.setString(9, Obj5);
					pst.setString(10, Obj6);
					pst.setString(11, ob4.getText());
					pst.setString(12, ob5.getText());
					pst.setString(13, ob6.getText());
					pst.setString(14, ob7.getText());
					pst.setString(15, ob8.getText());					
					pst.setString(16, ob9.getText());
					pst.setString(17, ob10.getText());
					pst.setString(18, ob11.getText());
					pst.execute();
					Connection.close();
					JOptionPane.showMessageDialog(null, "DATA saved ");
					
					
					System.out.println("done");
				}
				catch (Exception e1) 
				{
					System.out.println(e1);
					e1.printStackTrace();
					// TODO: handle exception
				}
					
			}
		});
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(181, 551, 103, 42);
		ADD_item.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CANCEL");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try {
				admin adminclass=new admin();
				adminclass.main(null);
				}
				catch (Exception e1) {
					// TODO: handle exception
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setBounds(403, 551, 103, 42);
		ADD_item.getContentPane().add(btnNewButton_1);
		
		JButton btn = new JButton("CALCULATE");
		btn.addActionListener(new ActionListener() 
		{	
			public void actionPerformed(ActionEvent e)
			{
				baseprice=ob6.getText();
				baseprice1=Double.parseDouble(baseprice);
				
				if(select_valueOftexttype==0)
				{
					System.out.println(baseprice1);
					System.out.println(comboboxinput1);
					double a=100+comboboxinput1;
					double ab=((baseprice1/a)*comboboxinput1);
					System.out.println(ab);
					 double bb=(baseprice1-ab);
					 String aaa= String.format("%.2f", bb);
					 double bb1=(baseprice1-bb);
					 String aaa1= String.valueOf(bb1);
					 ob8.setText(aaa);
					 ob7.setText(aaa1);
				}
				else
				{
					double bc=(baseprice1/100)*comboboxinput1;
					 double aa=(baseprice1+bc);
					 double Purchage_Amount=(baseprice1-bc);
					 String ss=String.valueOf(Purchage_Amount);
					 String bbb= String.format("%.2f", aa);
					 ob8.setText(bbb);
					 ob7.setText(ss);
				}
			}
		});
		btn.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn.setForeground(Color.MAGENTA);
		btn.setBounds(632, 551, 143, 42);
		ADD_item.getContentPane().add(btn);
		Unit() ;
		Size();
		RackNumber() ;
		color();
	}
}
