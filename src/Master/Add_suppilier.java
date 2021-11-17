package Master;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;

public class Add_suppilier {

	private JFrame frmAddSuppilier;
	private final JPanel panel = new JPanel();
	private JTextField textField;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField MN;
	private JTextField tf8;
	private JTextField tf10;
	private JTextField tf12;
	private JTextField tf14;
	private JTextField tf11;
	private JTextField tf13;
	JTextArea tf16;String mobile_number;
	JTextArea textArea;
	JComboBox comboBox3_1;JComboBox comboBox3;
	String comboboxinput,Country;
	private JTextField tf5;
	private JTextField tf6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_suppilier window = new Add_suppilier();
					window.frmAddSuppilier.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Add_suppilier() {
		
		initialize();
	}

	public void random_number()
	{
		Random C=new Random();
		int n;
			n = C.nextInt(100000000)+1;
			String data=String.valueOf(n);
			String s="SUPC";
			String value=String.valueOf(s.concat(data));
			textField.setText(value);
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddSuppilier = new JFrame();
		frmAddSuppilier.getContentPane().setLayout(null);
		panel.setBounds(10, 11, 1073, 556);
		frmAddSuppilier.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(10, 33, 1053, 512);
		panel.add(panel_1);
		
		JLabel lblSuppilierCode = new JLabel("Suppilier Code");
		lblSuppilierCode.setForeground(Color.DARK_GRAY);
		lblSuppilierCode.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSuppilierCode.setBounds(10, 23, 119, 22);
		panel_1.add(lblSuppilierCode);
		
		JLabel lblNewLabel_1_1 = new JLabel("Supplier Name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(436, 23, 165, 22);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Address Line 1");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(10, 78, 107, 22);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("State");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(10, 111, 107, 22);
		panel_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Country");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_4.setBounds(10, 151, 107, 22);
		panel_1.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Mobile No.");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_5.setBounds(10, 187, 107, 22);
		panel_1.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_7 = new JLabel("Address Line 2");
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_7.setBounds(436, 68, 107, 22);
		panel_1.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("District");
		lblNewLabel_1_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_8.setBounds(436, 111, 107, 22);
		panel_1.add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_1_9 = new JLabel("PIN Code");
		lblNewLabel_1_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_9.setBounds(436, 151, 107, 22);
		panel_1.add(lblNewLabel_1_9);
		
		JLabel lblNewLabel_1_10 = new JLabel("Bank Name");
		lblNewLabel_1_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_10.setBounds(10, 230, 107, 22);
		panel_1.add(lblNewLabel_1_10);
		
		JLabel lblNewLabel_1_11 = new JLabel("GSTIN No.");
		lblNewLabel_1_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_11.setBounds(436, 187, 107, 22);
		panel_1.add(lblNewLabel_1_11);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(124, 22, 252, 29);
		panel_1.add(textField);
		
		tf2 = new JTextField();
		tf2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(tf2.getText().length()<=0)
				{
					JOptionPane.showMessageDialog(null, "Enter the Suppilier Name ");
				}
			}
		});
		tf2.setColumns(10);
		tf2.setBounds(690, 22, 252, 29);
		panel_1.add(tf2);
		
		tf3 = new JTextField();
		tf3.setColumns(10);
		tf3.setBounds(124, 60, 252, 40);
		panel_1.add(tf3);
		
		MN = new JTextField();
		MN.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) 
			{
				char c=e.getKeyChar();
				 mobile_number=MN.getText();
				int length=mobile_number.length();
				if(e.getKeyChar()>='0' && e.getKeyChar()<='9' )
				{
					if(length<10)
					{
						MN.setEditable(true);
					}
					else
					{
						MN.setEditable(false);
						
					}
				}
				else
				{
					if(e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode()==KeyEvent.VK_DELETE)
					{
						MN.setEditable(true);
					}
					else
					{
						MN.setEditable(false);
					}
				}
				if(!(Character.isDigit(c)||c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE))
				{
					e.consume();
				}
			}
		});
		MN.setColumns(10);
		MN.setBounds(124, 186, 252, 29);
		panel_1.add(MN);
		
		comboBox3 = new JComboBox();
		comboBox3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Country=comboBox3.getSelectedItem().toString();
				System.out.println(Country);
			}
		});
		comboBox3.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBox3.setModel(new DefaultComboBoxModel(new String[] {"Select", "INDIA"}));
		comboBox3.setBounds(124, 150, 252, 29);
		panel_1.add(comboBox3);
		
		JLabel lblNewLabel_1_11_1 = new JLabel("Account No.");
		lblNewLabel_1_11_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_11_1.setBounds(436, 230, 107, 26);
		panel_1.add(lblNewLabel_1_11_1);
		
		 textArea = new JTextArea();
		textArea.setBounds(690, 62, 252, 38);
		panel_1.add(textArea);
		
		tf8 = new JTextField();
		tf8.setColumns(10);
		tf8.setBounds(690, 154, 252, 29);
		panel_1.add(tf8);
		
		tf10 = new JTextField();
		tf10.setColumns(10);
		tf10.setBounds(690, 190, 252, 29);
		panel_1.add(tf10);
		
		tf12 = new JTextField();
		tf12.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e)
			{
				char c=e.getKeyChar();
				if(!(Character.isDigit(c)||c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE))
				{
					e.consume();
				}
			}
		});
		
		tf12.setColumns(10);
		tf12.setBounds(690, 233, 252, 29);
		panel_1.add(tf12);
		
		tf14 = new JTextField();
		tf14.setColumns(10);
		tf14.setBounds(690, 286, 252, 29);
		panel_1.add(tf14);
		
		tf16 = new JTextArea();
		tf16.setBounds(690, 333, 252, 58);
		panel_1.add(tf16);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("IFSC Code");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(436, 282, 165, 22);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Remark");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_2.setBounds(436, 338, 165, 22);
		panel_1.add(lblNewLabel_1_1_2);
		
		tf11 = new JTextField();
		tf11.setColumns(10);
		tf11.setBounds(124, 229, 252, 29);
		panel_1.add(tf11);
		
		tf13 = new JTextField();
		tf13.setColumns(10);
		tf13.setBounds(124, 286, 252, 29);
		panel_1.add(tf13);
		
		 comboBox3_1 = new JComboBox();
		comboBox3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				comboboxinput = comboBox3_1.getSelectedItem().toString();
				System.out.println(comboboxinput);
			}
		});
		comboBox3_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox3_1.setModel(new DefaultComboBoxModel(new String[] {"SAVING ACCOUNT ", "CURRENT ACCOUNT "}));
		
		comboBox3_1.setBounds(124, 337, 252, 29);
		panel_1.add(comboBox3_1);
		
		JLabel lblNewLabel_1_10_1 = new JLabel("Branch Name ");
		lblNewLabel_1_10_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_10_1.setBounds(10, 293, 107, 22);
		panel_1.add(lblNewLabel_1_10_1);
		
		JLabel lblNewLabel_1_10_2 = new JLabel("Account type");
		lblNewLabel_1_10_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_10_2.setBounds(10, 338, 107, 22);
		panel_1.add(lblNewLabel_1_10_2);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				int n=Integer.parseInt(mobile_number);
				String Account1=tf12.getText();
				Double account2=(double) Integer.parseInt(Account1);
				
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Durgesh@123");
					System.out.println("2");
					String s1="insert into suppilierdetails values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
					PreparedStatement pst=Connection.prepareStatement(s1);
					pst.setString(1, null);
					pst.setString(2, textField.getText());pst.setString(3, tf2.getText());
					pst.setString(4, tf3.getText());pst.setString(5, textArea.getText());
					pst.setString(6, tf5.getText());pst.setString(7, tf6.getText());
					pst.setString(8, Country);pst.setString(9, tf8.getText());
					pst.setInt(10, n);pst.setString(11, tf10.getText());
					pst.setString(12, tf11.getText());pst.setDouble(13, account2);
					pst.setString(14, tf13.getText());pst.setString(15, tf14.getText());
					pst.setString(16, comboboxinput);pst.setString(17, tf16.getText());
					pst.execute();
					Connection.close();
					JOptionPane.showMessageDialog(null, "DATA saved ");
					
					
					System.out.println("done");
				}
				catch (Exception e1) 
				{
					System.out.println(e1);
					// TODO: handle exception
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(212, 427, 119, 40);
		panel_1.add(btnNewButton);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCancel.setBounds(464, 427, 119, 40);
		panel_1.add(btnCancel);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				random_number();
			}
		});
		btnNewButton_1.setBounds(382, 25, 44, 23);
		panel_1.add(btnNewButton_1);
		
		tf5 = new JTextField();
		tf5.setColumns(10);
		tf5.setBounds(124, 111, 252, 29);
		panel_1.add(tf5);
		
		tf6 = new JTextField();
		tf6.setColumns(10);
		tf6.setBounds(690, 111, 252, 29);
		panel_1.add(tf6);
		//random_number();
	}
}
