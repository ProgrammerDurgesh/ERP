package Master;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Add_department {

	private JFrame frmAddDepartment;
	private JTable table;
	JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_department window = new Add_department();
					window.frmAddDepartment.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Add_department() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddDepartment = new JFrame();
		frmAddDepartment.setTitle("ADD DEPARTMENT");
		frmAddDepartment.setBounds(100, 100, 957, 684);
		frmAddDepartment.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddDepartment.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(22, 56, 865, 565);
		frmAddDepartment.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select Department");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 82, 170, 34);
		panel.add(lblNewLabel);
		
		comboBox = new JComboBox();
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"IT Department ", "HR", "MANGER", "SR. MANGER", "TESTER", "STORE MANGER"}));
		comboBox.setBounds(216, 82, 318, 34);
		panel.add(comboBox);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try {
					
					String s1=(String) comboBox.getSelectedItem();
					System.out.println(s1);
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Durgesh@123");
					String s="insert into AddDepartment values(?)";	
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
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(597, 76, 133, 46);
		panel.add(btnNewButton);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(71, 159, 704, 322);
		panel.add(scrollPane_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane_1.setViewportView(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
}
