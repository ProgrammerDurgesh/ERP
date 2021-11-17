package GRN;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;

import org.jdesktop.swingx.autocomplete.AutoCompleteComboBoxEditor;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class combobox {

	private JFrame frame;
	JComboBox ComboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					combobox window = new combobox();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public combobox() 
	{
		initialize();
		AutoCompleteDecorator.decorate(ComboBox);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
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
				ComboBox.addItem(rs.getString("Suppilier_Name"));
			}
			//JOptionPane.showMessageDialog(null, "DATA saved ");
			}
			catch (Exception e1) 
			{	
				System.out.println(e1);
			}
		}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ComboBox = new JComboBox();
		ComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				SupplierName () ;
			}
		});
		ComboBox.setBounds(80, 126, 199, 22);
		frame.getContentPane().add(ComboBox);
		SupplierName () ;
	}
}
