package gr.aueb.cf.schoolapp.view_controller;

import gr.aueb.cf.schoolapp.Main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dashboard extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static Connection connection;

	/**
	 * Create the frame.
	 */
	public Dashboard() {
//		addWindowListener(new WindowAdapter() {
//			@Override
//			public void windowOpened(WindowEvent e) {
//				String sql = "jdbc:mysql://localhost:3306/school7dbpro?serverTimezone=UTC";
//				String username ="user7pro";
//				String password ="12345";
//				try {
////					Class.forName("com.mysql.cj.jdbc.Driver");
//					connection = DriverManager.getConnection(sql, username, password);
//					System.out.println("Connection Success");
//				} catch(SQLException e1) {
//					e1.printStackTrace();
//				}
////				catch (ClassNotFoundException e1) {
////					// TODO Auto-generated catch block
////					e1.printStackTrace();
////				}
//			}
//		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 890, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel header = new JPanel();
		header.setLayout(null);
		header.setBackground(new Color(0, 52, 117));
		header.setBounds(0, 0, 874, 53);
		contentPane.add(header);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Dashboard.class.getResource("/images/gov_logo_small.png")));
		lblNewLabel.setBounds(10, 11, 100, 41);
		header.add(lblNewLabel);
		
		JLabel lblNewLabel_8 = new JLabel("ΧΡΗΣΤΟΣ ΤΑΡΤΑΡΙ");
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(660, 11, 185, 31);
		header.add(lblNewLabel_8);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBounds(0, 475, 874, 86);
		contentPane.add(footer);
		
		JLabel lblManual = new JLabel("Εγχειρίδιο Χρησης");
		lblManual.setForeground(new Color(0, 52, 117));
		lblManual.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblManual.setBounds(124, 32, 107, 19);
		footer.add(lblManual);
		
		JLabel lblNewLabel_1 = new JLabel("Συχνές Ερωτήσεις");
		lblNewLabel_1.setForeground(new Color(0, 52, 117));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(356, 32, 107, 19);
		footer.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Υποστήριξη Πολιτών");
		lblNewLabel_1_1.setForeground(new Color(0, 52, 117));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(588, 32, 131, 19);
		footer.add(lblNewLabel_1_1);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 128, 255));
		separator.setBounds(0, 0, 874, 2);
		footer.add(separator);
		
		JPanel leftPanel = new JPanel();
		leftPanel.setBackground(new Color(0, 52, 117));
		leftPanel.setBounds(0, 52, 227, 423);
		contentPane.add(leftPanel);
		leftPanel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Αρχική");
		lblNewLabel_2.setForeground(new Color(255, 255, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 48, 103, 25);
		leftPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Εκπαιδευτες");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(10, 73, 103, 25);
		leftPanel.add(lblNewLabel_3);
		
		JLabel lbl_teachersview = new JLabel("Προβολή Εκπαιδευτών");
		lbl_teachersview.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lbl_teachersview.setText("<html><font color ='blue'> Προβολη Εκπαιδευτών </font></html>");
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lbl_teachersview.setText("Προβολη Εκπαιδευτών");
				
			}
		});
		
		lbl_teachersview.setForeground(new Color(255, 255, 255));
		lbl_teachersview.setBounds(20, 109, 142, 25);
		leftPanel.add(lbl_teachersview);
		
		JLabel lbl_teacherInsert = new JLabel("Εισαγωγή Εκπαιδευτή");
		lbl_teacherInsert.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lbl_teacherInsert.setText("<html><font color ='blue'> Εισαγωγη Εκπαιδευτη </font></html>");
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lbl_teacherInsert.setText("Εισαγωγη Εκπαιδευτη");
				
			}
		});
		lbl_teacherInsert.setForeground(Color.WHITE);
		lbl_teacherInsert.setBounds(20, 145, 142, 25);
		leftPanel.add(lbl_teacherInsert);
		
		JLabel lblNewLabel_5 = new JLabel("Ποιότητα στην Εκπαίδευση");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblNewLabel_5.setBounds(332, 64, 333, 32);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Προβολή Μητρώου Εκπαιδευτών");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(264, 121, 254, 26);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("Εισαγωγη Εκπαιδευτη στο Μητρώου Εκπαιδευτών");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6_1.setBounds(264, 317, 368, 26);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_7 = new JLabel("Προβολή Μητρώου Εγγεγραμμένων Εκπαιδευτών στο Μητρώο του Coding Factory");
		lblNewLabel_7.setBounds(261, 157, 450, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("Εισαγωγη Εκπαιδευτη στο Μητρωο του Coding Factory");
		lblNewLabel_7_1.setBounds(264, 366, 447, 14);
		contentPane.add(lblNewLabel_7_1);
		
		JButton btnNewButton = new JButton("Συνέχεια");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getDashboard().setEnabled(false);
				Main.getViewTeachersPage().setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(0, 127, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(264, 186, 131, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Συνέχεια");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getDashboard().setEnabled(false);
				Main.getInsertTeacherPage().setVisible(true);
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(0, 127, 0));
		btnNewButton_1.setBounds(264, 391, 131, 40);
		contentPane.add(btnNewButton_1);
	}
	
//	public static Connection getConnection() {
//		return connection;
//	}
}
