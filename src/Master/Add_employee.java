package Master;




import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import org.w3c.dom.events.EventTarget;

import com.mysql.cj.protocol.Protocol.ProtocolEventListener.EventType;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Random;
public class Add_employee {

	private JFrame frmAddEmployee;
	int row;
	DefaultTableModel DefaultTableModel;
	String header[]=new String[]{"Employee Code ","Employee Name  *",
	"Mobile Number  *","Department","Designation","Address Line"};
	private JTextField EmployeeCode;
	private JTextField MobileNumber;
	private JTextField EmployeeName;
	private JTextField AddressLine;
	DefaultTableModel model;
	private JTable table;
	JComboBox Desination,Depaertment;
	String mobile_number,status,comboBox1,mb1;
	int mb;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_employee window = new Add_employee();
					window.frmAddEmployee.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public Add_employee() 
	{
		initialize();
		
		
	}
	public void clear()
	{
	
	EmployeeCode.setText("");
	EmployeeName.setText("");
	Depaertment.addItem("");
	Desination.addItem("");
	AddressLine.setText("");
	
	}
	public void random_number()
	{
		Random C=new Random();
		int n;
			n = C.nextInt(100000000)+1;
			String data=String.valueOf(n);
			String s="EC";
			String value=String.valueOf(s.concat(data));
			EmployeeCode.setText(value);
	}
	public void Desination() 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Durgesh@123");
			String s="select * from designationdetails";
			PreparedStatement pst=Connection.prepareStatement(s);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				Desination.addItem(rs.getString("Designation"));
			}
			//JOptionPane.showMessageDialog(null, "DATA saved ");
			}
			catch (Exception e1) 
			{
			}
		}
	public void department()
	{
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Durgesh@123");
		String s1="select * from color_detatils";
		PreparedStatement pst=Connection.prepareStatement(s1);
		ResultSet rs1=pst.executeQuery();
		while(rs1.next())
		{
			Desination.addItem(rs1.getString(""));
		}
		//JOptionPane.showMessageDialog(null, "DATA saved ");
		}
		catch (Exception e1) 
		{
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddEmployee = new JFrame();
		frmAddEmployee.getContentPane().setLayout(null);
		JPanel panel = new JPanel();
		panel.setBounds(10, 87, 715, 369);
		frmAddEmployee.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		JLabel lblNewLabel_1 = new JLabel("Employee Code");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 37, 113, 24);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Mobile Number *");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(10, 89, 130, 24);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Desination ");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(10, 156, 92, 24);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Employee Name *");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(387, 37, 124, 24);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Depaertment");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_4.setBounds(387, 89, 113, 24);
		panel.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Address Line ");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_5.setBounds(388, 162, 92, 24);
		panel.add(lblNewLabel_1_5);
		
		JButton btnNewButton = new JButton("Save");
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				if(EmployeeName.getText().length()<=0 )
				{
					JOptionPane.showMessageDialog(null, "Please Enter Your Name");
				}
				
				else
				{
					model=new DefaultTableModel();
					Object[] column = {"Employee Code","Employee Name","Mobile Number","Depaertment","Desination","Address Line"};
					Object [] row=new Object[6];
					model.setColumnIdentifiers(column);
					table.setModel(model);
					row[0]=EmployeeCode.getText();
					
					row[1]=EmployeeName.getText();
					row[2]=MobileNumber.getText();
					row[3]=comboBox1;
					row[4]=Desination.getSelectedItem();
					row[5]=AddressLine.getText();
					 mb=Integer.parseInt(mobile_number);
					 mb1=String.valueOf(mb);
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Durgesh@123");
						String s="insert into add_employee_details values(?,?,?,?,?,?,?)";	
						PreparedStatement pst=Connection.prepareStatement(s);
						pst.setString(1, null);
						pst.setString(2, EmployeeCode.getText());
						pst.setString(3, EmployeeName.getText());
						pst.setString(4, mb1);
						pst.setString(5, (String) Depaertment.getSelectedItem());
						pst.setString(6, (String) Desination.getSelectedItem());
						pst.setString(7, AddressLine.getText());
						pst.execute();
						Connection.close();
						JOptionPane.showMessageDialog(null, "DATA saved ");
						clear();
						}
						catch (Exception e1) 
						{
							System.out.println("sn");
							// TODO: handle exception
						}	
					
					
					
					
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(93, 276, 120, 49);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(278, 276, 120, 49);
		panel.add(btnNewButton_1);
		
		EmployeeCode = new JTextField();
		EmployeeCode.setBounds(131, 41, 168, 31);
		panel.add(EmployeeCode);
		EmployeeCode.setColumns(10);
		
		MobileNumber = new JTextField();
		MobileNumber.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) 
			{
				char c=e.getKeyChar();
				 mobile_number=MobileNumber.getText();
				int length=mobile_number.length();
				if(e.getKeyChar()>='0' && e.getKeyChar()<='9' )
				{
					if(length<10)
					{
						MobileNumber.setEditable(true);
					}
					else
					{
						MobileNumber.setEditable(false);
						
					}
				}
				else
				{
					if(e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode()==KeyEvent.VK_DELETE)
					{
						MobileNumber.setEditable(true);
					}
					else
					{
						MobileNumber.setEditable(true);
					}
				}
				if(!(Character.isDigit(c)||c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE))
				{
					e.consume();
				}
			}
		});
		MobileNumber.setColumns(10);
		MobileNumber.setBounds(131, 82, 168, 31);
		panel.add(MobileNumber);
		
		EmployeeName = new JTextField();
		EmployeeName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e)
			{
				int position =EmployeeName.getCaretPosition();
				EmployeeName.setText(EmployeeName.getText().toUpperCase());
			}
		});
		EmployeeName.setColumns(10);
		EmployeeName.setBounds(537, 36, 168, 31);
		panel.add(EmployeeName);
		
		AddressLine = new JTextField();
		AddressLine.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e)
			{
				int position =AddressLine.getCaretPosition();
				AddressLine.setText(AddressLine.getText().toUpperCase());
			}
		});
		AddressLine.setColumns(10);
		AddressLine.setBounds(537, 146, 168, 49);
		panel.add(AddressLine);
		
		 Depaertment = new JComboBox();
		Depaertment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				comboBox1=(String) Depaertment.getSelectedItem();
				
			}
		});
		Depaertment.setFont(new Font("Tahoma", Font.BOLD, 14));
		Depaertment.setModel(new DefaultComboBoxModel(new String[] {"Select ", "IT Department ", "HR", "MANGER", "SR. MANGER", "TESTER", "STORE MANGER"}));
		Depaertment.setBounds(536, 86, 169, 31);
		panel.add(Depaertment);
		
		 Desination = new JComboBox();
		 Desination.setModel(new DefaultComboBoxModel(new String[] {"Select"}));
		 Desination.setFont(new Font("Tahoma", Font.BOLD, 14));
		Desination.setBounds(130, 159, 169, 31);
		panel.add(Desination);
		
		JButton btnNewButton_2 = new JButton(".....");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				random_number();
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBounds(310, 37, 44, 31);
		panel.add(btnNewButton_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 810, 38);
		frmAddEmployee.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Details");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 1011, 38);
		panel_1.add(lblNewLabel);
		
		table = new JTable();
		table.setBounds(747, 87, 254, 363);
		frmAddEmployee.getContentPane().add(table);
		Desination() ;
		clear();
	}
}
