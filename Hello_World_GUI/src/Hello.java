import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Hello {

	private JFrame frame;
	private JTextField textName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hello window = new Hello();
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
	public Hello() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHelloWorld = new JLabel("Hello World GUI Example");
		lblHelloWorld.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHelloWorld.setBounds(98, 38, 200, 20);
		frame.getContentPane().add(lblHelloWorld);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(98, 69, 46, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblHello = new JLabel("");
		lblHello.setBounds(118, 136, 154, 14);
		frame.getContentPane().add(lblHello);
		
		textName = new JTextField();
		textName.setBounds(152, 66, 86, 20);
		frame.getContentPane().add(textName);
		textName.setColumns(10);
		
		JButton btnSubmit = new JButton("Hello!");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblHello.setText("Hello "+textName.getText());
			}
		});
		btnSubmit.setBounds(149, 97, 89, 23);
		frame.getContentPane().add(btnSubmit);
	}
}
