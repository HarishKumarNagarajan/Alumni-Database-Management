import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class first {

	private JFrame frmMain;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					first window = new first();
					window.frmMain.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public first() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMain = new JFrame();
		
		frmMain.setTitle("Main");
		frmMain.getContentPane().setBackground(Color.PINK);
		frmMain.setBounds(100, 100, 450, 300);
		frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMain.getContentPane().setLayout(null);
		
		JButton btnRegistration = new JButton("REGISTRATION");
		btnRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Registration2 p=new Registration2();
				p.main(null);
			}
		});
		btnRegistration.setBounds(143, 120, 126, 23);
		frmMain.getContentPane().add(btnRegistration);
		
		JButton btnLogin = new JButton("STUDENT LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Form2 r=new Form2();
				r.main(null);
			}
		});
		btnLogin.setBounds(255, 154, 134, 23);
		frmMain.getContentPane().add(btnLogin);
		
		JLabel lblNewLabel = new JLabel("Register first before login");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(109, 72, 200, 50);
		frmMain.getContentPane().add(lblNewLabel);
		
		JButton btnAlumnilogin = new JButton("ALUMNI_LOGIN");
		btnAlumnilogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Form1 n=new Form1();
			n.main(null);
			}
		});
		btnAlumnilogin.setBounds(43, 154, 134, 23);
		frmMain.getContentPane().add(btnAlumnilogin);
		
		JLabel lblAlumniDatabaseManagement = new JLabel("ALUMNI DATABASE MANAGEMENT");
		lblAlumniDatabaseManagement.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblAlumniDatabaseManagement.setForeground(new Color(255, 0, 0));
		lblAlumniDatabaseManagement.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlumniDatabaseManagement.setBounds(21, 11, 391, 50);
		frmMain.getContentPane().add(lblAlumniDatabaseManagement);
		
		JButton btnAdminLogin = new JButton("ADMIN LOGIN");
		btnAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmMain.dispose();
				adminlog h=new adminlog();
				h.main(null);
			}
		});
		btnAdminLogin.setBounds(135, 202, 134, 23);
		frmMain.getContentPane().add(btnAdminLogin);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("F:\\alumni project\\Alumni\\8.gif"));
		lblNewLabel_1.setBounds(0, 0, 434, 261);
		frmMain.getContentPane().add(lblNewLabel_1);
	}
}
