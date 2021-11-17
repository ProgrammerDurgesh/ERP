package purchagr;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.toedter.calendar.JDateChooser;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class datetimestoreinsql extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					datetimestoreinsql frame = new datetimestoreinsql();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public void date() 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Durgesh@123");
			String s="Insert Into datetime values(?)";
			PreparedStatement pst=Connection.prepareStatement(s);
			pst.executeQuery();
			JOptionPane.showMessageDialog(null, "DATA saved ");
		}
			catch (Exception e1) 
			{
			}
		}
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
	public datetimestoreinsql() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.getCalendarButton().setFont(new Font("Tahoma", Font.BOLD, 23));
		dateChooser.setBounds(41, 56, 168, 38);
		contentPane.add(dateChooser);
		
		JButton btnNewButton = new JButton("save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				date();
			}
		});
		btnNewButton.setBounds(227, 56, 110, 39);
		contentPane.add(btnNewButton);
		date();
	}
}
