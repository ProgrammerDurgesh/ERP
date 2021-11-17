package Master;

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
import java.sql.ResultSet;

import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class add_desination {

	private JFrame frmAddmesurmentunit;
	private JTable table;
	private JTextField textField;
	DefaultTableModel model;
	int i;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					add_desination window = new add_desination();
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
	public add_desination() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddmesurmentunit = new JFrame();
		frmAddmesurmentunit.setTitle("Degination");
		frmAddmesurmentunit.setBounds(100, 100, 970, 603);
		frmAddmesurmentunit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddmesurmentunit.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(496, 54, 421, 486);
		frmAddmesurmentunit.getContentPane().add(scrollPane);
		
		table = new JTable();
		
		scrollPane.setViewportView(table);
		model=new DefaultTableModel();
		Object[] column = {"Size of Item"};
		Object [] row=new Object[2];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		
		
		JPanel panel = new JPanel();
		panel.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		panel.setBounds(23, 54, 436, 486);
		frmAddmesurmentunit.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Designation");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(20, 31, 137, 34);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(203, 22, 195, 43);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(textField.getText().length()<=0 )
				{
					JOptionPane.showMessageDialog(null, "Please Enter the data in Textfield");
				}
				else
				{
					try {
						row[0]=textField.getText();
						
						model.addRow(row);
						String s1=textField.getText();
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Durgesh@123");
						String s="insert into designationdetails values(?)";	
						PreparedStatement pst=Connection.prepareStatement(s);
						pst.setString(1, s1);
						pst.execute();
						Connection.close();
						JOptionPane.showMessageDialog(null, "DATA saved ");
					}
						catch (Exception e1) 
						{
						}
					
					
				}
			}
		});
		btnNewButton.setBounds(68, 280, 89, 43);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText("");
				//textArea.setText("");
				textField.setText("");
				
			}
		});
		btnNewButton_1.setBounds(228, 280, 89, 43);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Update");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				int i=table.getSelectedRow();
				if(i>=0) {
				model.setValueAt(textField.getText(), i, 0);
				//model.setValueAt(textArea.getText(), i, 1);
				//model.setValueAt(textField.getText(), i, 2);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "please Select the Row ");
				}
			}
		});
		btnNewButton_2.setBounds(68, 377, 89, 34);
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
		btnNewButton_3.setBounds(228, 377, 89, 34);
		panel.add(btnNewButton_3);
	}
}
