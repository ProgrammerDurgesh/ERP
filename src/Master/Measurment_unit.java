package Master;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.awt.Color;

public class Measurment_unit {

	private JFrame frmMeasurmentUnit;
	private JTextField textField;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Measurment_unit window = new Measurment_unit();
					window.frmMeasurmentUnit.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Measurment_unit() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMeasurmentUnit = new JFrame();
		frmMeasurmentUnit.getContentPane().setBackground(Color.GRAY);
		frmMeasurmentUnit.setResizable(false);
		frmMeasurmentUnit.setAutoRequestFocus(false);
		frmMeasurmentUnit.setTitle("MEASURMENT UNIT");
		frmMeasurmentUnit.setBounds(100, 100, 850, 498);
		frmMeasurmentUnit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMeasurmentUnit.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 834, 10);
		frmMeasurmentUnit.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Search");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(32, 51, 103, 14);
		frmMeasurmentUnit.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(129, 48, 153, 20);
		frmMeasurmentUnit.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				add_method add_method=new add_method();
				add_method.main(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(315, 48, 89, 23);
		frmMeasurmentUnit.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(503, 47, 89, 23);
		frmMeasurmentUnit.getContentPane().add(btnNewButton_1);
	
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(51, 130, 595, 302);
		frmMeasurmentUnit.getContentPane().add(scrollPane);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
	}
}
