package Master;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Add_customer {

	private JFrame frmAddCustomer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_customer window = new Add_customer();
					window.frmAddCustomer.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Add_customer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddCustomer = new JFrame();
		frmAddCustomer.setTitle("ADD CUSTOMER");
		frmAddCustomer.setBounds(100, 100, 450, 300);
		frmAddCustomer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
