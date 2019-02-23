import java.awt.EventQueue;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import java.sql.*;
import java.util.regex.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class Registration2 {

	private JFrame frmRegister;
	private JTextField textField;
	private JTextField textField_2;
	private JButton btnNewButton;
	private JPasswordField passwordField;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_8;
	private JTextField textField_6;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration2 window = new Registration2();
					window.frmRegister.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Registration2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegister = new JFrame();
		frmRegister.setTitle("Register");
		frmRegister.setBounds(100, 100, 419, 601);
		frmRegister.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("REGISTRATION");
		lblNewLabel.setBounds(176, 11, 100, 14);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(103, 51, 101, 14);
		
		JLabel lblNewLabel_2 = new JLabel("Course");
		lblNewLabel_2.setBounds(103, 129, 101, 14);
		
		JLabel lblNewLabel_3 = new JLabel("Position in Company");
		lblNewLabel_3.setBounds(103, 264, 101, 14);
		
		JLabel lblNewLabel_4 = new JLabel("Info");
		lblNewLabel_4.setBounds(103, 185, 101, 14);
		
		JLabel lblNewLabel_6 = new JLabel("Password");
		lblNewLabel_6.setBounds(103, 296, 101, 14);
		
		JLabel lblNewLabel_7 = new JLabel("Hint");
		lblNewLabel_7.setBounds(103, 324, 101, 14);
		
		textField = new JTextField();
		textField.setBounds(227, 47, 86, 20);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(227, 262, 86, 20);
		textField_2.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(227, 293, 86, 20);
		final JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(227, 151, 86, 20);
		frmRegister.getContentPane().add(comboBox_3);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setBounds(227, 126, 86, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {" ","BE","MSc","Others"}));
		frmRegister.getContentPane().add(comboBox);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event){
				JComboBox comboBox=(JComboBox)event.getSource();
				Object selected = comboBox.getSelectedItem();
				if(selected.toString().equals("BE"))
				{
					comboBox_3.setModel(new DefaultComboBoxModel(new String[] {" ","Mech","Civil","ECE","CSE","EEE"}));
				}
				if(selected.toString().equals("MSc"))
				{
					comboBox_3.setModel(new DefaultComboBoxModel(new String[] {" ","Software Systems","Data Science","DCS"}));
				}
				if(selected.toString().equals("Others"))
				{
					comboBox_3.setModel(new DefaultComboBoxModel(new String[] {" Part-time"}));
				}
			}});
		
		btnNewButton = new JButton("SUBMIT");
		final JRadioButton rdbtnMale = new JRadioButton("MALE");
		rdbtnMale.setBounds(221, 100, 64, 23);
		frmRegister.getContentPane().add(rdbtnMale);
		
		final JRadioButton rdbtnFemale = new JRadioButton("FEMALE");
		rdbtnFemale.setBounds(300, 100, 86, 23);
		frmRegister.getContentPane().add(rdbtnFemale);
		ButtonGroup group2=new ButtonGroup();
		group2.add(rdbtnFemale);
		group2.add(rdbtnMale);
				btnNewButton.setBounds(113, 474, 86, 23);
		

		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
				frmRegister.dispose();
				main(null);
			}
		});
		btnClear.setBounds(237, 474, 96, 23);
		frmRegister.getContentPane().setLayout(null);
		frmRegister.getContentPane().add(lblNewLabel_1);
		frmRegister.getContentPane().add(lblNewLabel_7);
		frmRegister.getContentPane().add(lblNewLabel_6);
		frmRegister.getContentPane().add(lblNewLabel_4);
		frmRegister.getContentPane().add(lblNewLabel_3);
		frmRegister.getContentPane().add(lblNewLabel_2);
		frmRegister.getContentPane().add(passwordField);
		frmRegister.getContentPane().add(textField);
		frmRegister.getContentPane().add(textField_2);
		frmRegister.getContentPane().add(lblNewLabel);
		frmRegister.getContentPane().add(btnNewButton);
		frmRegister.getContentPane().add(btnClear);
		
		JLabel lblNewLabel_8 = new JLabel("Email");
		lblNewLabel_8.setBounds(103, 349, 101, 14);
		frmRegister.getContentPane().add(lblNewLabel_8);
		
		textField_5 = new JTextField();
		textField_5.setBounds(227, 346, 86, 20);
		frmRegister.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblPhonenum = new JLabel("Phone_num");
		lblPhonenum.setBounds(103, 374, 101, 14);
		frmRegister.getContentPane().add(lblPhonenum);
		
		textField_7 = new JTextField();
		textField_7.setBounds(227, 371, 86, 20);
		frmRegister.getContentPane().add(textField_7);
		textField_7.setColumns(10);

		

		final JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(227, 213, 86, 20);
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {" ","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017"}));
		frmRegister.getContentPane().add(comboBox_4);
		
		
		
		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(227, 182, 86, 20);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"","Alumni", "Student"}));
		frmRegister.getContentPane().add(comboBox_1);
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event){
				JComboBox comboBox_1=(JComboBox)event.getSource();
				Object selected = comboBox_1.getSelectedItem();
				if(selected.toString().equals("Alumni"))
				{
					textField_3.setEditable(true);
					textField_2.setEditable(true);
				}
				else
				{
				if(selected.toString().equals("Student"))
				{
					textField_3.setEditable(false);
					textField_2.setEditable(false);
					comboBox_4.disable();
				}
				}
			}});
		
		JLabel lblMajorSubject = new JLabel("Major subject");
		lblMajorSubject.setBounds(103, 399, 101, 14);
		frmRegister.getContentPane().add(lblMajorSubject);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode()==arg0.VK_ESCAPE)
				{
					frmRegister.dispose();
					first m=new first();
					m.main(null);
				}
			}
		});
		textField_1.setBounds(227, 396, 86, 20);
		frmRegister.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCompanyname = new JLabel("Company_name");
		lblCompanyname.setBounds(103, 239, 101, 14);
		frmRegister.getContentPane().add(lblCompanyname);
		
		textField_3 = new JTextField();
		textField_3.setBounds(227, 236, 86, 20);
		frmRegister.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblHosteldayscholar = new JLabel("Hostel/Dayscholar");
		lblHosteldayscholar.setBounds(103, 424, 96, 14);
		frmRegister.getContentPane().add(lblHosteldayscholar);
		
		JLabel lblCurrentAddress = new JLabel("Current address");
		lblCurrentAddress.setBounds(103, 449, 96, 14);
		frmRegister.getContentPane().add(lblCurrentAddress);
		
		textField_8 = new JTextField();
		textField_8.setBounds(227, 446, 86, 20);
		frmRegister.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setBounds(103, 154, 96, 14);
		frmRegister.getContentPane().add(lblDepartment);
		
		JLabel lblYearPassedOut = new JLabel("Year Passed out");
		lblYearPassedOut.setBounds(103, 216, 101, 14);
		frmRegister.getContentPane().add(lblYearPassedOut);
		
		final JRadioButton rdbtnHosteler = new JRadioButton("HOSTELER");
		rdbtnHosteler.setBounds(212, 423, 86, 23);
		frmRegister.getContentPane().add(rdbtnHosteler);
		
		final JRadioButton rdbtnDayscholar = new JRadioButton("DAYSCHOLAR");
		rdbtnDayscholar.setBounds(300, 423, 102, 23);
		frmRegister.getContentPane().add(rdbtnDayscholar);
		ButtonGroup group=new ButtonGroup();
		group.add(rdbtnDayscholar);
		group.add(rdbtnHosteler);
		
		
		JLabel lblRollNo = new JLabel("Roll no");
		lblRollNo.setBounds(103, 76, 101, 14);
		frmRegister.getContentPane().add(lblRollNo);
		
		textField_6 = new JTextField();
		textField_6.setBounds(227, 73, 86, 20);
		frmRegister.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(103, 104, 101, 14);
		frmRegister.getContentPane().add(lblGender);
		
		textField_9 = new JTextField();
		textField_9.setBounds(227, 321, 86, 20);
		frmRegister.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblAllFields = new JLabel("* ALL FIELDS MUST BE FILLED COMPULSORLY");
		lblAllFields.setHorizontalAlignment(SwingConstants.CENTER);
		lblAllFields.setBounds(77, 501, 280, 50);
		frmRegister.getContentPane().add(lblAllFields);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("F:\\alumni project\\Alumni\\Verre02_Micael_Reynaud_800_p0.gif"));
		label.setBounds(4, 0, 399, 562);
		frmRegister.getContentPane().add(label);
		
		btnNewButton.addActionListener(new ActionListener() {
//			private String info;

			public void actionPerformed(ActionEvent arg0) {
				/*try
				{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pk1631037");
				Statement st=con.createStatement();
				String sql="select * from Alumni_Login";
				ResultSet rs=st.executeQuery(sql);
				//int i=0;
				String j;
				String k;
				if(rs!= null )
				{
				while(rs.next())
				{
					//i=rs.getInt("alumni_roll_no");
					j=rs.getString("alumni_password");
					k=rs.getString("alumni_user_name");
					System.out.println(j+"  "+k);
								}
				}
				con.close();
				}
				catch(Exception e)
				{
					System.out.println(e);
				}*/
				String name=textField.getText();
				//String reg=textField_6.getText();
				//String alname=textField.getText();
				//String alrollno;textField_6.getText();
				String gender=null;
				if(rdbtnMale.isSelected()==true)
				{
					gender="male";
				}
				if(rdbtnFemale.isSelected()==true)
				{
					gender="female";
				}
				String user = textField_6.getText();
				String pass = passwordField.getText();
				String hint=textField_9.getText();
				String course=(String) comboBox.getSelectedItem();
				String Info=(String) comboBox_1.getSelectedItem();
				
				String department=(String) comboBox_3.getSelectedItem();
				//String info = (String) comboBox_1.getSelectedItem();
				String year=(String) comboBox_4.getSelectedItem();
				String compname=textField_3.getText();
				String poscomp=textField_2.getText();
				String email=textField_5.getText();
				String phone=textField_7.getText();
				String major=textField_1.getText();
				String roll = textField_6.getText();
				//String reg=Integer.parseInt(roll);
				String hstl = null;
				if(rdbtnHosteler.isSelected()==true)
				{
					hstl="Hosteler";
				}
				if(rdbtnDayscholar.isSelected()==true)
				{
					hstl="Dayscholar";
				}
				String address=textField_8.getText();
			//Object alumni = null;
				/*	int w=0,x=0;
				if(!(name.matches("^[a-zA-Z]+")))
				{
					w=1;
				}	
				if(!(roll.matches("^[0-9]+")))
				{
					x=1;
				}*/
				/*if(w==0 && x==0)
				{
					JOptionPane.showMessageDialog(null, "success");
					Home h=new Home();
					frmRegister.dispose();
					h.main(null);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "sorry");
					frmRegister.dispose();
					main(null);
				}*/
				int m=0;
				if(Info.equals("Alumni"))
				{
					m=1;
				}
				else if(Info.equals("Student"))
				{
					m=2;
				}
				/*if(name.equals(""))
				{
					JOptionPane.showMessageDialog(null,"ENTER THE NAME");
				}
				if(roll.equals(""))
				{
					JOptionPane.showMessageDialog(null,"ENTER THE ROLL NO");
				}
				if(course.equals(""))
				{
					JOptionPane.showMessageDialog(null,"ENTER THE COURSE NAME");
				}
				if(compname.equals(""))
				{
					JOptionPane.showMessageDialog(null,"ENTER THE COMPANY NAME");
				}
				if(address.equals(""))
				{
					JOptionPane.showMessageDialog(null,"ENTER THE ADDRESS");
				}
				if(department.equals(""))
				{
					JOptionPane.showMessageDialog(null,"ENTER THE DEPARTMENT");
				}
				if(phone.equals(""))
				{
					JOptionPane.showMessageDialog(null,"ENTER THE PHONE NUMBER");
				}
				if(hstl.equals(""))
				{
					JOptionPane.showMessageDialog(null,"ENTER THE HOSTELER/DAYSCHOLAR");
				}
				if(year.equals(""))
				{
					JOptionPane.showMessageDialog(null,"ENTER THE YEAR OF PASS");
				}
				
				if(email.equals(""))
				{
					JOptionPane.showMessageDialog(null,"ENTER THE MAIL ID");
				}
				if(major.equals(""))
				{
					JOptionPane.showMessageDialog(null,"ENTER THE MAJOR SUBJECT");
				}
				if(gender.equals(""))
				{
					JOptionPane.showMessageDialog(null,"ENTER THE GENDER");
				}
				if(hint.equals(""))
				{
					JOptionPane.showMessageDialog(null,"ENTER THE HINT");
				}
				if(poscomp.equals(""))
				{
					JOptionPane.showMessageDialog(null,"ENTER THE POSITION IN COMPANY");
				}
				if(user.equals(""))
				{
					JOptionPane.showMessageDialog(null,"ENTER THE USER NAME");
				}
				if(pass.equals(""))
				{
					JOptionPane.showMessageDialog(null,"ENTER THE PASSWORD");
				}*/
				int w=0;
				if(name.matches("^[a-zA-Z ]+")&& name.length()!=0)
				{
					//System.out.println("hii");
					
					w=1;
				}
				else
				{
					JOptionPane.showMessageDialog(null,"ENTER THE NAME CORRECTLY");
				}
				int u=0;
				if(major.matches("^[a-zA-Z]")&& major.length()!=0)
				{
					u=2;
				}
				else
				{
					JOptionPane.showMessageDialog(null,"ENTER THE MAJOR SUBJECT CORRECTLY");
				}
				int t=0;
				if(hint.matches("^[0-9]+") || hint.matches("^[a-zA-Z]+"))
				{
					t=3;
				}
				else
				{
					JOptionPane.showMessageDialog(null,"ENTER THE HINT CORRECTLY");
				}
				int z=0;
				if(address.matches("^[0-9]+") || address.matches("^[a-zA-Z]+")&& address.length()!=0)
				{
					z=3;
				}
				else
				{
					JOptionPane.showMessageDialog(null,"ENTER THE ADDRESS NAME CORRECTLY");
				}
				/*int v=0;
				if(user.matches("^[0-9]+") )
				{
					v=3;
				}
				else
				{
					JOptionPane.showMessageDialog(null,"ENTER THE USER NAME CORRECTLY");
				}*/
				int p=0;
				if(email.matches("^[a-zA-Z0-9_+&*-]+(?:\\."+
                        "[a-zA-Z0-9_+&*-]+)*@" +
                        "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                        "A-Z]{2,7}$")&& email.length()!=0)
				{
					p=4;
				}
				else
				{
					JOptionPane.showMessageDialog(null,"ENTER THE MAIL ID CORRECTLY");
				}
				int x=0;
				if(roll.matches("^[0-9]+")&& roll.length()!=0)
				{
					x=4;
				}
				else
				{
					JOptionPane.showMessageDialog(null,"ENTER THE ROLL NUMBER CORRECTLY");
				}
				int y=0;
				if((phone.matches("^[0-9]+")) && (phone.length()==10)&& phone.length()!=0)
				{
					y=5;
				}
				else
				{
					JOptionPane.showMessageDialog(null,"ENTER THE PHONE NUMBER CORRECTLY");
				}
				int c=0;
				if(!(pass.length()<=8))
				{
					c=1;
				}
				else
				{
					JOptionPane.showMessageDialog(null,"ENTER THE PASSWORD CORRECTLY");
				}
				if(m==1 && w==1 && u==2 && z==3 && c==1)
				{
					//System.out.println("hii");
					if(x==4 && y==5 && t==3 && p==4)
					{
						int i=0;
						if(compname.matches("^[0-9]+") || compname.matches("^[a-zA-Z]+"))
						{
							i=3;
						}
						else
						{
							JOptionPane.showMessageDialog(null,"ENTER THE COMPANY NAME CORRECTLY");
						}	
						int j=0;
						if(poscomp.matches("^[a-zA-Z]+")&& poscomp.length()!=0)
						{
							j=3;
						}
						else
						{
							JOptionPane.showMessageDialog(null,"ENTER THE POSITION IN COMPANY CORRECTLY");
						}
						if(j==3 && i==3){
				try
				{

					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pk1631037");
					PreparedStatement ps=con.prepareStatement("insert into Alumni_Details values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
					//System.out.println("hii");
					ps.setString(1, name);
					ps.setString(2, roll);
					ps.setString(3, course);
					ps.setString(4,compname);
					ps.setString(5, address);
					ps.setString(6,department);
					ps.setString(7, hstl);
					ps.setString(8,year);
					ps.setString(9,phone);
					ps.setString(10,email);
					ps.setString(11,major);
					ps.setString(12,gender);
					ps.setString(13,hint);
					ps.setString(14,poscomp);
					int res=ps.executeUpdate();
					if(res==0)
						System.out.println(" not inserted");
					else
						System.out.println("inserted into alumni Details");
					ps.close();
					con.close();
					//sc.close();
					}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				try
				{//System.out.println("hii");
				

					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pk1631037");
					PreparedStatement ps=con.prepareStatement("insert into Alumni_Login values(?,?,?)");
					ps.setString(1, user);
					ps.setString(2, pass);
					ps.setString(3,hint);
					
					int res=ps.executeUpdate();
					if(res==0)
						System.out.println(" not inserted");
					else
					{
						System.out.println("inserted into alumni Login");
						frmRegister.dispose();
						first kl=new first();
						kl.main(null);
					}
					ps.close();
					con.close();
					//sc.close();
					}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				}}
				}
				if(m==2 && w==1 && u==2 && z==3 && c==1) 
				{
					if( x==4 && y==5 && t==3 && p==4)
					{
				//	System.out.println("hii");
					
					try
					{

						Class.forName("oracle.jdbc.driver.OracleDriver");
						Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pk1631037");
						PreparedStatement ps=con.prepareStatement("insert into Student_Details values(?,?,?,?,?,?,?,?,?,?,?)");
						ps.setString(1, name);
						ps.setString(2, roll);
						ps.setString(3, course);
						//ps.setString(4,compname);
						ps.setString(4, address);
						ps.setString(5,department);
						ps.setString(6, hstl);
						//ps.setString(8,year);
						ps.setString(7,phone);
						ps.setString(8,email);
						ps.setString(9,major);
						ps.setString(10,gender);
						ps.setString(11,hint);
						//ps.setString(14,poscomp);
						int res=ps.executeUpdate();
						if(res==0)
							System.out.println(" not inserted");
						else
							System.out.println("inserted into Student Details");
						ps.close();
						con.close();
						//sc.close();
						}
					catch(Exception e)
					{
						e.printStackTrace();
					}
					try
					{//System.out.println("hii");
					

						Class.forName("oracle.jdbc.driver.OracleDriver");
						Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pk1631037");
						PreparedStatement ps=con.prepareStatement("insert into Student_Login values(?,?,?)");
						ps.setString(1, user);
						ps.setString(2, pass);
						//ps.setString(3, rol);
						ps.setString(3,hint);
						int res=ps.executeUpdate();
						if(res==0)
							System.out.println(" not inserted");
						else
						{
							System.out.println("inserted into student Login");
							frmRegister.dispose();
							first kl=new first();
							kl.main(null);
						}
						ps.close();
						con.close();
						//sc.close();
						}
					catch(Exception e)
					{
						e.printStackTrace();
					}

				}}
				//String hi = textArea.;
				//String rol = textField_6.getText();
					
					
				}
		});
		

		
	}
}
