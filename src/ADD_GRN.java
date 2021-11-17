import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JSpinner;
import javax.swing.JEditorPane;
import java.awt.Color;
import javax.swing.UIManager;

public class ADD_GRN {

	private JFrame frmAddGrn;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ADD_GRN window = new ADD_GRN();
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
	public ADD_GRN() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddGrn = new JFrame();
		frmAddGrn.setResizable(false);
		frmAddGrn.setTitle("Add GRN");
		frmAddGrn.setBounds(100, 100, 840, 400);
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
		
		textField = new JTextField();
		textField.setBounds(99, 34, 102, 20);
		frmAddGrn.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(99, 59, 102, 20);
		frmAddGrn.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(99, 84, 119, 20);
		frmAddGrn.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(99, 34, 119, 20);
		frmAddGrn.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(99, 59, 119, 20);
		frmAddGrn.getContentPane().add(comboBox_1);
		
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
		
		textField_3 = new JTextField();
		textField_3.setBounds(301, 34, 111, 20);
		frmAddGrn.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(301, 59, 92, 20);
		frmAddGrn.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(301, 84, 111, 20);
		frmAddGrn.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(301, 59, 111, 20);
		frmAddGrn.getContentPane().add(comboBox_2);
		
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
		
		textField_6 = new JTextField();
		textField_6.setBounds(508, 34, 111, 20);
		frmAddGrn.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(508, 59, 92, 20);
		frmAddGrn.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(508, 84, 39, 20);
		frmAddGrn.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(508, 59, 111, 20);
		frmAddGrn.getContentPane().add(comboBox_3);
		
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
		
		textField_9 = new JTextField();
		textField_9.setBounds(708, 59, 86, 20);
		frmAddGrn.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(708, 34, 86, 20);
		frmAddGrn.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(629, 84, 185, 20);
		frmAddGrn.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(708, 34, 106, 20);
		frmAddGrn.getContentPane().add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(708, 59, 106, 20);
		frmAddGrn.getContentPane().add(comboBox_5);
		
		JLabel lblNewLabel_13 = new JLabel("ITEMS DETAILS");
		lblNewLabel_13.setForeground(Color.WHITE);
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_13.setBounds(359, 128, 123, 14);
		frmAddGrn.getContentPane().add(lblNewLabel_13);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBackground(Color.BLUE);
		editorPane.setBounds(0, 128, 824, 20);
		frmAddGrn.getContentPane().add(editorPane);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBackground(Color.BLUE);
		editorPane_1.setBounds(0, 0, 824, 20);
		frmAddGrn.getContentPane().add(editorPane_1);
		
		JEditorPane editorPane_2 = new JEditorPane();
		editorPane_2.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		editorPane_2.setBounds(0, 21, 824, 107);
		frmAddGrn.getContentPane().add(editorPane_2);
	}
}
