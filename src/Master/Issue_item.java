package Master;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JEditorPane;
import javax.swing.JProgressBar;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.JSeparator;
import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTree;
import java.awt.Scrollbar;
import javax.swing.JTextArea;
import java.awt.Component;
import javax.swing.JTable;
import java.awt.List;
import javax.swing.JButton;

public class Issue_item {

	private JFrame frmIssueItems;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Issue_item window = new Issue_item();
					window.frmIssueItems.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Issue_item() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmIssueItems = new JFrame();
		frmIssueItems.setResizable(false);
		frmIssueItems.getContentPane().setForeground(new Color(0, 0, 0));
		frmIssueItems.setBackground(new Color(143, 188, 143));
		frmIssueItems.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmIssueItems.setBounds(100, 100, 792, 447);
		frmIssueItems.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIssueItems.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ISSUE ITEMS");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(328, 0, 95, 14);
		frmIssueItems.getContentPane().add(lblNewLabel);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBackground(Color.BLUE);
		editorPane.setBounds(0, 0, 776, 20);
		frmIssueItems.getContentPane().add(editorPane);
		
		JLabel lblNewLabel_1 = new JLabel("Project Code");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(29, 49, 76, 14);
		frmIssueItems.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Prepared By");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(29, 87, 76, 14);
		frmIssueItems.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Item Name");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(29, 127, 76, 14);
		frmIssueItems.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Quantity");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(29, 163, 76, 14);
		frmIssueItems.getContentPane().add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(115, 46, 384, 20);
		frmIssueItems.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(115, 84, 128, 20);
		frmIssueItems.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(115, 124, 384, 20);
		frmIssueItems.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(115, 160, 86, 20);
		frmIssueItems.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(115, 46, 403, 20);
		frmIssueItems.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_5 = new JLabel("Date");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(542, 49, 95, 14);
		frmIssueItems.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Authorised By");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(542, 87, 95, 14);
		frmIssueItems.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Item Description");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7.setBounds(542, 127, 95, 14);
		frmIssueItems.getContentPane().add(lblNewLabel_7);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalGlue.setBounds(167, 313, 76, -19);
		frmIssueItems.getContentPane().add(horizontalGlue);
		
		textField_4 = new JTextField();
		textField_4.setBounds(647, 46, 86, 20);
		frmIssueItems.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(647, 84, 86, 20);
		frmIssueItems.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(647, 121, 105, 20);
		frmIssueItems.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(115, 84, 145, 20);
		frmIssueItems.getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel_8 = new JLabel("Recived By");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_8.setBounds(270, 87, 62, 14);
		frmIssueItems.getContentPane().add(lblNewLabel_8);
		
		textField_7 = new JTextField();
		textField_7.setBounds(342, 84, 157, 20);
		frmIssueItems.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(342, 84, 176, 20);
		frmIssueItems.getContentPane().add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(115, 124, 403, 20);
		frmIssueItems.getContentPane().add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(647, 84, 105, 20);
		frmIssueItems.getContentPane().add(comboBox_4);
		
		JLabel lblNewLabel_9 = new JLabel("Remarks");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_9.setBounds(270, 163, 62, 14);
		frmIssueItems.getContentPane().add(lblNewLabel_9);
		
		textField_8 = new JTextField();
		textField_8.setBounds(342, 160, 176, 20);
		frmIssueItems.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("ADDED ITEMS DETAILS");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setBackground(Color.WHITE);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_10.setBounds(295, 223, 141, 14);
		frmIssueItems.getContentPane().add(lblNewLabel_10);
		
		JEditorPane editorPane_2 = new JEditorPane();
		editorPane_2.setBackground(Color.BLUE);
		editorPane_2.setBounds(0, 223, 776, 20);
		frmIssueItems.getContentPane().add(editorPane_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 264, 776, 14);
		frmIssueItems.getContentPane().add(separator);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(256, 188, 76, 23);
		frmIssueItems.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(372, 188, 76, 23);
		frmIssueItems.getContentPane().add(btnNewButton_1);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		editorPane_1.setBounds(-2, 18, 778, 206);
		frmIssueItems.getContentPane().add(editorPane_1);
	}
}
