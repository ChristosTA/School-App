package gr.aueb.cf.schoolapp.view_controller;



import gr.aueb.cf.schoolapp.Main;
import gr.aueb.cf.schoolapp.authentication.AuthenticationManager;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LoginPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public LoginPage() {
		setTitle("Αυθεντικοποίηση Χρήστη");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Σύνδεση");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(161, 0, 70, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Παρακαλώ εισάγετε τους κωδικούς σας για να συνδεθείτε");
		lblNewLabel_1.setBounds(69, 33, 280, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Χρήστης:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(94, 78, 57, 14);
		contentPane.add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 65, 380, 2);
		contentPane.add(separator);
		
		username = new JTextField();
		username.setBounds(94, 109, 247, 30);
		contentPane.add(username);
		username.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Κωδικός:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(94, 150, 57, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JButton btnConnecting = new JButton("Σύνδεση");
		btnConnecting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				if (username.getText().matches("[aA]dmin") && (Arrays.equals(password.getPassword(), "12345".toCharArray()))) {
				if (AuthenticationManager.isAuthenticate(username.getText(), password.getPassword())) {
					Main.getLoginpage().setVisible(false);
					Main.getDashboard().setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null , "Λαθος Username ή Password", "Αδυναμια ", JOptionPane.ERROR_MESSAGE);
					username.setText("");
					password.setText("");
				}
			}
		});
		btnConnecting.setBackground(new Color(0, 162, 0));
		btnConnecting.setBounds(94, 216, 247, 30);
		contentPane.add(btnConnecting);
		
		password = new JPasswordField();
		password.setBounds(94, 175, 247, 30);
		contentPane.add(password);
	}
}
