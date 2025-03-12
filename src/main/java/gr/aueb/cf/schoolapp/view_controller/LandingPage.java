package gr.aueb.cf.schoolapp.view_controller;


import gr.aueb.cf.schoolapp.Main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LandingPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public LandingPage() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(LandingPage.class.getResource("/images/eduv2.png")));
		setTitle("Ποιότητα στην Εκπαιδευση");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel header = new JPanel();
		header.setBackground(new Color(0, 52, 117));
		header.setBounds(0, 0, 664, 41);
		contentPane.add(header);
		header.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 0, 100, 41);
		header.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(LandingPage.class.getResource("/images/gov_logo_small.png")));
		
		JLabel lblAuthRequired = new JLabel("Απαιτείται ταυτοποίηση");
		lblAuthRequired.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAuthRequired.setBounds(31, 79, 203, 31);
		contentPane.add(lblAuthRequired);
		
		JLabel lblMustConnect = new JLabel("Για να προχωρήσετε πρέπει να συνδεθειτε");
		lblMustConnect.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		lblMustConnect.setBounds(31, 123, 302, 41);
		contentPane.add(lblMustConnect);
		
		JButton btnConnect = new JButton("Συνδεση");
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getLandingpage().setVisible(false);
				Main.getLoginpage().setVisible(true);
			}
		});
		btnConnect.setEnabled(false);
		btnConnect.setBackground(new Color(0, 128, 0));
		btnConnect.setBounds(31, 206, 89, 23);
		
		
		
		JCheckBox privacyCheckBox = new JCheckBox("Δηλώνω ότι αποδέχομαι τη");
		privacyCheckBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange()== ItemEvent.SELECTED) {
					btnConnect.setEnabled(true);	
				} else {
					btnConnect.setEnabled(false);
				}
			}
		});
		privacyCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		privacyCheckBox.setBounds(31, 171, 176, 23);
		contentPane.add(privacyCheckBox);
		
		JLabel lblPrivacy = new JLabel("Δήλωση Ιδιωτικότητας");
		lblPrivacy.setForeground(new Color(0, 52, 117));
		lblPrivacy.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPrivacy.setBounds(219, 171, 130, 23);
		contentPane.add(lblPrivacy);
		
	
		contentPane.add(btnConnect);
		
		JPanel footer = new JPanel();
		footer.setBounds(0, 244, 664, 86);
		contentPane.add(footer);
		footer.setLayout(null);
		
		JLabel lblManual = new JLabel("Εγχειρίδιο Χρησης");
		lblManual.setForeground(new Color(0, 52, 117));
		lblManual.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblManual.setBounds(27, 33, 107, 19);
		footer.add(lblManual);
		
		JLabel lblNewLabel_1 = new JLabel("Συχνές Ερωτήσεις");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(new Color(0, 52, 117));
		lblNewLabel_1.setBounds(254, 33, 107, 19);
		footer.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Υποστήριξη Πολιτών");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setForeground(new Color(0, 52, 117));
		lblNewLabel_1_1.setBounds(479, 33, 130, 19);
		footer.add(lblNewLabel_1_1);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 128, 255));
		separator.setBounds(0, 2, 664, 1);
		footer.add(separator);
	}
}
