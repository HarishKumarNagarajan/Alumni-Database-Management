import java.awt.*;
import javax.swing.*;

import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Form1 {

	private JFrame frmAlumniLogin;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form1 window = new Form1();
					window.frmAlumniLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Form1() {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAlumniLogin = new JFrame();
		frmAlumniLogin.setTitle("Alumni Login");
		frmAlumniLogin.setBounds(100, 100, 450, 375);
		frmAlumniLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		JLabel label = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/login.png")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(28, 73, 129, 141);
		frmAlumniLogin.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(167, 101, 82, 14);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(167, 161, 82, 14);
		
		textField = new JTextField();
		textField.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent arg0) {
				textField.setToolTipText("roll no");
			}
		});
		textField.setBounds(279, 96, 115, 28);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("LOGIN FORM");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(140, 37, 170, 14);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Image img1=new ImageIcon(this.getClass().getResource("/click.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(img1));
		btnNewButton.setBounds(163, 240, 170, 57);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					String user=textField.getText();
					String pass=passwordField.getText();
					try
					{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pk1631037");
					Statement st=con.createStatement();
					String sql="select * from Alumni_Login";
					ResultSet rs=st.executeQuery(sql);
					int i=0;
					String j;
					int use=Integer.parseInt(textField.getText());
					String pass2=passwordField.getText();
					int flag=0;
					if(rs!= null )
					{
					while(rs.next())
					{
						i=rs.getInt("alumni_user_name");
						j=rs.getString("alumni_password");
						if(i==use && j.equals(pass2))
						{
							JOptionPane.showMessageDialog(null, "success");
							flag=1;
							frmAlumniLogin.dispose();
							Home1 ob=new Home1(use);
							ob.frmHome.setVisible(true);
							//ob.main(null);
							
						}
						//else
						//{
							//JOptionPane.showMessageDialog(null, "sorry");
						//}
						//System.out.println(i+"  "+j);
					}
					if(flag==0){
						JOptionPane.showMessageDialog(null, "Wrong value");
					}
					}
					
					con.close();
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
			}
		});
		frmAlumniLogin.getContentPane().setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(279, 156, 115, 28);
		frmAlumniLogin.getContentPane().add(passwordField);
		frmAlumniLogin.getContentPane().add(lblNewLabel);
		frmAlumniLogin.getContentPane().add(lblNewLabel_1);
		frmAlumniLogin.getContentPane().add(textField);
		frmAlumniLogin.getContentPane().add(btnNewButton);
		frmAlumniLogin.getContentPane().add(lblNewLabel_2);
		
		JButton btnForgotPassword = new JButton("Forgot Password.......");
		btnForgotPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String user=textField.getText();
					//String pass=passwordField.getText();
				if(user.equals(""))
				{
					JOptionPane.showMessageDialog(null,"PLEASE ENTER THE USER NAME FIRST TO KNOW YOUR HINT");
				}
				else
				{	
				try
					{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pk1631037");
					Statement st=con.createStatement();
					String sql="select * from Alumni_Login";
					ResultSet rs=st.executeQuery(sql);
					int i=0;
					String j;
					int use=Integer.parseInt(textField.getText());
					//String pass2=passwordField.getText();
					int flag=0;
					
					if(rs!= null )
					{
					while(rs.next())
					{
						i=rs.getInt("alumni_user_name");
						j=rs.getString("hint");
						if(i==use)
						{
							//System.out.println(j);
							JOptionPane.showMessageDialog(null,"HINT IS  :"+ j);
							flag=1;
						}
						/*else 
						{
							JOptionPane.showMessageDialog(null,"THERE IS NO USERNAME LIKE THIS");
						}*/
						//else
						//{
							//JOptionPane.showMessageDialog(null, "sorry");
						//}
						//System.out.println(i+"  "+j);
					}
				/*	if(flag==0){
						JOptionPane.showMessageDialog(null, "Wrong value");
					}*/
					}
					
					con.close();
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
			}}
		});
		btnForgotPassword.setBackground(SystemColor.menu);
		btnForgotPassword.setBounds(168, 206, 129, 23);
		frmAlumniLogin.getContentPane().add(btnForgotPassword);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("F:\\alumni project\\Alumni\\download-free-250-high-quality-butterfly-wallpaper-the-quotes-land.jpg"));
		lblNewLabel_3.setBounds(0, 0, 450, 375);
		frmAlumniLogin.getContentPane().add(lblNewLabel_3);
		
	}
}
