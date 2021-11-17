package Master;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.Color;

public class add_method {

	private JFrame frmAddmesurmentunit;
	private JTable table;
	protected JTextField Mesurment_Unit;
	private JTextArea Description;
	DefaultTableModel model;
	int i;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					add_method window = new add_method();
					
					window.frmAddmesurmentunit.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public add_method() {
		initialize();
	}
	public void clear()
	{
		Mesurment_Unit.setText("");
		Description.setText("");
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddmesurmentunit = new JFrame();
		frmAddmesurmentunit.getContentPane().setBackground(Color.GRAY);
		frmAddmesurmentunit.setTitle("ADD_mesurment_unit");
		frmAddmesurmentunit.setBounds(100, 100, 970, 603);
		frmAddmesurmentunit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddmesurmentunit.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(496, 54, 421, 386);
		frmAddmesurmentunit.getContentPane().add(scrollPane);
		
		table = new JTable();
		
		scrollPane.setViewportView(table);
		model=new DefaultTableModel();
		Object[] column = {"Mesurment unit ","Description"};
		Object [] row=new Object[2];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		
		JPanel panel = new JPanel();
		panel.setBounds(23, 54, 436, 387);
		frmAddmesurmentunit.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mesurment Unit");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(20, 31, 137, 34);
		panel.add(lblNewLabel);
		
		Mesurment_Unit = new JTextField();
		Mesurment_Unit.setBounds(203, 22, 195, 43);
		panel.add(Mesurment_Unit);
		Mesurment_Unit.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Description");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(20, 90, 127, 34);
		panel.add(lblNewLabel_1);
		
		Description = new JTextArea();
		Description.setBounds(203, 76, 195, 71);
		panel.add(Description);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(Mesurment_Unit.getText().length()<=0 )
				{
					JOptionPane.showMessageDialog(null, "Please Enter the data in Textfield");
				}
				else
				{
					row[0]=Mesurment_Unit.getText();
					row[1]=Description.getText();
					model.addRow(row);
					String s1=Mesurment_Unit.getText();String s2=Description.getText();
					try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Durgesh@123");
					String s="insert into  mesurmentdetails values(?,?)";	
					PreparedStatement pst=Connection.prepareStatement(s);
					pst.setString(1, s1);
					pst.setString(2, s2);
					pst.execute();
					Connection.close();
					JOptionPane.showMessageDialog(null, "DATA saved ");
					}
					catch (Exception e1) 
					{
						System.out.println("sn");
						// TODO: handle exception
					}
					
				}
				clear();
					}		
			
				}
		
		);
		
		btnNewButton.setBounds(68, 207, 89, 43);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Mesurment_Unit.setText("");
				Description.setText("");
			}
		});
		btnNewButton_1.setBounds(228, 207, 89, 43);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Update");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				int i=table.getSelectedRow();
				if(i>=0) {
				model.setValueAt(Mesurment_Unit.getText(), i, 0);
				model.setValueAt(Description.getText(), i, 1);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "please Select the Row ");
				}
			}
		});
		btnNewButton_2.setBounds(68, 303, 89, 34);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Delete");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{int i = 0;
				if(i >=0)
				{
				 i=table.getSelectedRow();
				 model.removeRow(i);
				 JOptionPane.showMessageDialog(null, "Deleted");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "please Select the Row ");
				}
			}
			
		});
		btnNewButton_3.setBounds(228, 303, 89, 34);
		panel.add(btnNewButton_3);
		clear();
	}
}
