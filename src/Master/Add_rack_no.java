package Master;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class Add_rack_no {

	private JFrame frmAddRackNumber;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_rack_no window = new Add_rack_no();
					window.frmAddRackNumber.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Add_rack_no() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddRackNumber = new JFrame();
		frmAddRackNumber.setTitle("ADD RACK NUMBER");
		frmAddRackNumber.setBounds(100, 100, 578, 494);
		frmAddRackNumber.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddRackNumber.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(53, 11, 436, 387);
		frmAddRackNumber.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Rack No.");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(20, 31, 137, 34);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(203, 22, 195, 43);
		panel.add(textField);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Durgesh@123");
				String s1="insert into Add_rack_number values(?)";System.out.println("2");
				PreparedStatement pst=Connection.prepareStatement(s1);
				pst.setString(1, textField.getText());
				pst.execute();
				Connection.close();
				JOptionPane.showMessageDialog(null, "DATA saved ");
				System.out.println("4");
				}
				catch(Exception e1)
				{
					
				}
			}
		});
		
		btnNewButton.setBounds(68, 207, 89, 43);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				admin admin=new admin();
				try {
					admin.main(null);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(228, 207, 89, 43);
		panel.add(btnNewButton_1);
	}
}
