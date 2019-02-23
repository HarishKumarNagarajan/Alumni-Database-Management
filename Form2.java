import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import java.awt.event.*;


import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;

public class Form2 {

	private JFrame frmStudentLogin;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form2 window = new Form2();
					window.frmStudentLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Form2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudentLogin = new JFrame();
		frmStudentLogin.setTitle("Student Login");
		frmStudentLogin.setBounds(100, 100, 487, 363);
		frmStudentLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/login.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(22, 61, 128, 137);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(186, 95, 71, 24);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(188, 158, 77, 24);
		
		textField = new JTextField();
		textField.setBounds(292, 92, 102, 27);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(292, 155, 102, 27);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String user=textField.getText();
				String pass=passwordField.getText();
				try
				{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pk1631037");
				Statement st=con.createStatement();
				String sql="select * from Student_Login";
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
					i=rs.getInt("student_user_name");
					j=rs.getString("student_password");
					if(i==use && j.equals(pass2))
					{
						JOptionPane.showMessageDialog(null, "success");
						flag=1;
						frmStudentLogin.dispose();
						Home ob=new Home(use);
						ob.frmHome.setVisible(true);
						
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
				/*if(user.equals("Harish") && pass.equals("Kumar"))
				{
					JOptionPane.showMessageDialog(null, "success");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "sorry");
				}*/
			}
		});
		Image img1=new ImageIcon(this.getClass().getResource("/click.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(img1));
		btnNewButton.setBounds(203, 242, 149, 57);
		frmStudentLogin.getContentPane().setLayout(null);
		frmStudentLogin.getContentPane().add(lblNewLabel);
		frmStudentLogin.getContentPane().add(lblNewLabel_1);
		frmStudentLogin.getContentPane().add(lblNewLabel_2);
		frmStudentLogin.getContentPane().add(textField);
		frmStudentLogin.getContentPane().add(passwordField);
		frmStudentLogin.getContentPane().add(btnNewButton);
		
		JLabel lblLoginForm = new JLabel("LOGIN FORM");
		lblLoginForm.setForeground(Color.WHITE);
		lblLoginForm.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLoginForm.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginForm.setBounds(210, 23, 108, 43);
		//JButton btnForgotPassword = new JButton("Forgot password.......");
		//btnForgotPassword.addActionListener(new ActionListener() {
			//public void actionPerformed(ActionEvent arg0) {
		JButton btnForgotPassword_1 = new JButton("Forgot Password.....");
		btnForgotPassword_1.setBackground(SystemColor.menu);
		btnForgotPassword_1.setBounds(203, 207, 142, 24);
//		frmAlumniLogin.getContentPane().add(btnForgotPassword);

		frmStudentLogin.getContentPane().add(lblLoginForm);
		
	
		btnForgotPassword_1.addActionListener(new ActionListener() {
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
				String sql="select * from Student_Login";
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
					i=rs.getInt("student_user_name");
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
		btnForgotPassword_1.setBounds(223, 201, 129, 24);
		frmStudentLogin.getContentPane().add(btnForgotPassword_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("F:\\alumni project\\Alumni\\download-free-250-high-quality-butterfly-wallpaper-the-quotes-land.jpg"));
		lblNewLabel_3.setBounds(4, 5, 457, 319);
		frmStudentLogin.getContentPane().add(lblNewLabel_3);
		
	}
}
