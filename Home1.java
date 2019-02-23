import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JRadioButton;

import net.proteanit.sql.DbUtils;
import java.awt.Color;


public class Home1 extends JFrame {

	private JPanel contentPane;
	JFrame frmHome;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
long rope=0;
private JTextField textField_10;
private JTable table_1;
private JTextField textField_11;
private JTextField textField_12;
private JTextField textField_13;
private JTextField textField_14;
private JTextField textField_15;
private JTextField textField_16;
private JTextField textField_17;
private JTextField textField_18;
	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
			}
		});
	}
public void det(int i)
{

	if(i==1)
	{
	textField.setEditable(true);
	textField_1.setEditable(false);
	textField_2.setEditable(true);
	textField_3.setEditable(true);
	textField_4.setEditable(true);
	textField_5.setEditable(true);
	textField_6.setEditable(true);
	textField_7.setEditable(true);
	textField_8.setEditable(true);
	textField_9.setEditable(true);
	}
	else
	{
		textField.setEditable(false);
		textField_1.setEditable(false);
		textField_2.setEditable(false);
		textField_3.setEditable(false);
		textField_4.setEditable(false);
		textField_5.setEditable(false);
		textField_6.setEditable(false);
		textField_7.setEditable(false);
		textField_8.setEditable(false);
		textField_9.setEditable(false);
	}
}
	/**
	 * Create the frame.
	 */
	public Home1(long temp12) {
		rope=temp12;
		frmHome = new JFrame();
		frmHome.setTitle("Alumni Home");
		frmHome.getContentPane().setForeground(SystemColor.activeCaptionText);
		frmHome.setBounds(100, 100, 1275, 615);
		frmHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frmHome.getContentPane().setLayout(null);
		frmHome.setVisible(true);
		//frmHome.getContentPane().add(lblCollegeAlumniDatabase);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(26, 32, 1223, 533);
		frmHome.getContentPane().add(tabbedPane);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("HOME", null, tabbedPane_1, null);
		//frmHome.getContentPane().add(rdbtnComimg);
		ButtonGroup group2=new ButtonGroup();
		
		JLayeredPane layeredPane = new JLayeredPane();
		tabbedPane_1.addTab("Announcements", null, layeredPane, null);
		
		JLabel lblRefrenceNum = new JLabel("Refrence Num");
		lblRefrenceNum.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRefrenceNum.setForeground(Color.WHITE);
		lblRefrenceNum.setBounds(114, 33, 136, 16);
		layeredPane.add(lblRefrenceNum);
		
		JLabel label_1 = new JLabel("College Name");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(249, 34, 118, 14);
		layeredPane.add(label_1);
		
		JLabel label_2 = new JLabel("Program Name");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_2.setForeground(Color.WHITE);
		label_2.setBounds(366, 34, 118, 14);
		layeredPane.add(label_2);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDepartment.setForeground(Color.WHITE);
		lblDepartment.setBounds(495, 34, 118, 14);
		layeredPane.add(lblDepartment);
		
		JLabel label_4 = new JLabel("Location");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_4.setForeground(Color.WHITE);
		label_4.setBounds(630, 34, 46, 14);
		layeredPane.add(label_4);
		
		JLabel label_6 = new JLabel("Duration in a day");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_6.setForeground(Color.WHITE);
		label_6.setBounds(812, 34, 118, 14);
		layeredPane.add(label_6);
		
		JLabel label_7 = new JLabel("No of Days");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_7.setForeground(Color.WHITE);
		label_7.setBounds(950, 34, 117, 14);
		layeredPane.add(label_7);
		
		JLabel label_8 = new JLabel("Travel Time");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_8.setForeground(Color.WHITE);
		label_8.setBounds(1077, 34, 136, 14);
		layeredPane.add(label_8);
		
		JLabel lblStudent = new JLabel("Student");
		lblStudent.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblStudent.setForeground(Color.WHITE);
		lblStudent.setBounds(10, 34, 107, 14);
		layeredPane.add(lblStudent);
		
		JLabel lblStay = new JLabel("Stay");
		lblStay.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblStay.setForeground(Color.WHITE);
		lblStay.setBounds(743, 34, 46, 14);
		layeredPane.add(lblStay);
		
		table_1 = new JTable();
		table_1.setBounds(10, 52, 1237, 116);
		layeredPane.add(table_1);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("ALUMNI", null, tabbedPane_2, null);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		tabbedPane_2.addTab("Contact requests", null, layeredPane_1, null);
		
		JLabel lblRequests = new JLabel("Requests");
		lblRequests.setForeground(new Color(255, 0, 0));
		lblRequests.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblRequests.setBounds(295, 42, 115, 25);
		layeredPane_1.add(lblRequests);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(241, 78, 200, 151);
		layeredPane_1.add(textArea);
		
		JLabel lblAcceptFor = new JLabel("Accept For");
		lblAcceptFor.setForeground(new Color(255, 0, 0));
		lblAcceptFor.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblAcceptFor.setBounds(121, 256, 97, 25);
		layeredPane_1.add(lblAcceptFor);
		
		textField_10 = new JTextField();
		textField_10.setBounds(274, 262, 86, 20);
		layeredPane_1.add(textField_10);
		textField_10.setColumns(10);
		
		JButton btnClick = new JButton("Click");
	
		btnClick.setBounds(422, 264, 89, 23);
		layeredPane_1.add(btnClick);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("F:\\alumni project\\Alumni\\download-free-250-high-quality-butterfly-wallpaper-the-quotes-land.jpg"));
		lblNewLabel_2.setBounds(0, 0, 1203, 466);
		layeredPane_1.add(lblNewLabel_2);
		
		JLayeredPane layeredPane_2 = new JLayeredPane();
		tabbedPane_2.addTab("Schedule", null, layeredPane_2, null);
		
		JLayeredPane layeredPane_3 = new JLayeredPane();
		tabbedPane.addTab("PROFILE", null, layeredPane_3, null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblName.setForeground(Color.WHITE);
		lblName.setBounds(41, 30, 190, 14);
		layeredPane_3.add(lblName);
		
		JLabel lblRollNo = new JLabel("Roll no");
		lblRollNo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRollNo.setForeground(Color.WHITE);
		lblRollNo.setBounds(41, 74, 190, 14);
		layeredPane_3.add(lblRollNo);
		
		JLabel lblCompanyName = new JLabel("Company name");
		lblCompanyName.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCompanyName.setForeground(Color.WHITE);
		lblCompanyName.setBounds(41, 118, 190, 14);
		layeredPane_3.add(lblCompanyName);
		
		JLabel lblPosition = new JLabel("Position");
		lblPosition.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPosition.setForeground(Color.WHITE);
		lblPosition.setBounds(41, 162, 190, 14);
		layeredPane_3.add(lblPosition);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblGender.setForeground(Color.WHITE);
		lblGender.setBounds(41, 206, 190, 14);
		layeredPane_3.add(lblGender);
		
		JLabel lblYearOfPassed = new JLabel("Year Of Passed out");
		lblYearOfPassed.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblYearOfPassed.setForeground(Color.WHITE);
		lblYearOfPassed.setBounds(41, 250, 190, 14);
		layeredPane_3.add(lblYearOfPassed);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBounds(41, 294, 190, 14);
		layeredPane_3.add(lblEmail);
		
		JLabel lblPhoneNumber = new JLabel("Phone number");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPhoneNumber.setForeground(Color.WHITE);
		lblPhoneNumber.setBounds(41, 338, 190, 14);
		layeredPane_3.add(lblPhoneNumber);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setBounds(41, 382, 190, 14);
		layeredPane_3.add(lblAddress);
		
		JLabel lblMajorSubject = new JLabel("Major subject");
		lblMajorSubject.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMajorSubject.setForeground(Color.WHITE);
		lblMajorSubject.setBounds(41, 426, 190, 14);
		layeredPane_3.add(lblMajorSubject);
		
		textField = new JTextField();
		textField.setBounds(301, 25, 203, 20);
		layeredPane_3.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(301, 70, 203, 20);
		layeredPane_3.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(301, 115, 203, 20);
		layeredPane_3.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(301, 160, 203, 20);
		layeredPane_3.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(301, 205, 203, 20);
		layeredPane_3.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(301, 250, 203, 20);
		layeredPane_3.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(301, 295, 203, 20);
		layeredPane_3.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(301, 340, 203, 20);
		layeredPane_3.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(301, 385, 203, 20);
		layeredPane_3.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(301, 430, 203, 20);
		layeredPane_3.add(textField_9);
		textField_9.setColumns(10);
		String h=String.valueOf(rope);
		System.out.println(rope);
		try
		{
			
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pk1631037");
		Statement st=con.createStatement();
		//String sql="select * from Alumni_Details";
		ResultSet rs=st.executeQuery("select * from Alumni_Details where alumni_roll_no = '" + rope +"'" );
		String i;
		int j;
		String k;
		String l;
		String m;
		String n;
		String o;
		String p;
		String q;
		String r;
		rs.next();
		i=rs.getString(1);
		j=rs.getInt(2);
		String temp1=String.valueOf(j);
		k=rs.getString(4);
		l=rs.getString(14);
		textField.setText(i);
		textField_1.setText(temp1);
		textField_2.setText(k);
		textField_3.setText(l);
		m=rs.getString(12);
		textField_4.setText(m);
		n=rs.getString(8);
		textField_5.setText(n);
		o=rs.getString(10);
		textField_6.setText(o);
	
		//textField_5.setText(n);
		q=rs.getString(5);
		textField_8.setText(q);
		r=rs.getString(11);
		textField_9.setText(r);
		p=rs.getString(9);
		//String temp2=String.valueOf(p);
		textField_7.setText(p);
		textField.setEditable(false);
		textField_1.setEditable(false);
		textField_2.setEditable(false);
		textField_3.setEditable(false);
		textField_4.setEditable(false);
		textField_5.setEditable(false);
		textField_6.setEditable(false);
		textField_7.setEditable(false);
		textField_8.setEditable(false);
		textField_9.setEditable(false);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//passwrd ib=new passwrd(rope);
				//ib.main(null);
				
				textField.setEditable(true);
				textField_1.setEditable(false);
				textField_2.setEditable(true);
				textField_3.setEditable(true);
				textField_4.setEditable(true);
				textField_5.setEditable(true);
				textField_6.setEditable(true);
				textField_7.setEditable(true);
				textField_8.setEditable(true);
				textField_9.setEditable(true);
			
			}
		});
		btnEdit.setBounds(142, 471, 89, 23);
		layeredPane_3.add(btnEdit);
		
		JButton btnDone = new JButton("Done");
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pk1631037");
				Statement st=con.createStatement();
				//String sql="select * from Alumni_Details";
				String i;
				String j;
				String k;
				String l;
				String m;
				String n;
				String o;
				String p;
				String q;
				String r;
				i=textField.getText();
				j=textField_1.getText();
				long temp1=Integer.parseInt(j);
				k=textField_2.getText();
				l=textField_3.getText();
				m=textField_4.getText();
				n=textField_5.getText();
				o=textField_6.getText();
				p=textField_7.getText();
				//long temp=Integer.parseInt(p);
				q=textField_8.getText();
				r=textField_9.getText();
				ResultSet rs=st.executeQuery("update Alumni_Details SET alumni_name='"+i+"',company_name='"+k+"',positionincompany='"+l+"',gender='"+m+"',yearofpass='"+n+"',mail_id='"+o+"',contact_number="+p+",current_area='"+q+"',major_subject='"+r+"' where alumni_roll_no = '" +j+"'" +
						"" );
				JOptionPane.showMessageDialog(null, "changed..");
				Home1 ob=new Home1(temp1);
				ob.main();
				//rs.next();
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				textField.setEditable(false);
				textField_1.setEditable(false);
				textField_2.setEditable(false);
				textField_3.setEditable(false);
				textField_4.setEditable(false);
				textField_5.setEditable(false);
				textField_6.setEditable(false);
				textField_7.setEditable(false);
				textField_8.setEditable(false);
				textField_9.setEditable(false);
			}
		});
		btnDone.setBounds(311, 471, 89, 23);
		layeredPane_3.add(btnDone);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("F:\\alumni project\\Alumni\\5.gif"));
		label.setBounds(0, 0, 812, 494);
		layeredPane_3.add(label);
		
		JLabel label_5 = new JLabel("Stay Location");
		label_5.setBounds(815, 116, 118, 14);
		frmHome.getContentPane().add(label_5);
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");   
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","system","pk1631037"); 
			String query="Select * from College_Events";
			Statement st = con.createStatement();
		      
		      // execute the query, and get a java resultset
		      ResultSet rs = st.executeQuery(query);
			
			table_1.setModel(DbUtils.resultSetToTableModel(rs));
			
			JLabel label = new JLabel("");
			label.setIcon(new ImageIcon("F:\\alumni project\\Alumni\\1.jpg"));
			label.setBounds(0, 0, 1213, 466);
			layeredPane.add(label);
			
			JLayeredPane layeredPane_6 = new JLayeredPane();
			tabbedPane_1.addTab("Invitations", null, layeredPane_6, null);
			layeredPane_6.setLayout(null);
			final JRadioButton rdbtnComing = new JRadioButton("Coming");
			rdbtnComing.setBounds(216, 392, 85, 30);
			layeredPane_6.add(rdbtnComing);
			
			final JRadioButton rdbtnNot = new JRadioButton("Not");
			rdbtnNot.setBounds(374, 386, 96, 37);
			layeredPane_6.add(rdbtnNot);
			ButtonGroup group=new ButtonGroup();
			group.add(rdbtnComing);
			group.add(rdbtnNot);
			
			JButton btnNext = new JButton("Next");
			btnNext.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String status=null;
					if(rdbtnComing.isSelected()==true)
					{
						status="come";
					}
					if(rdbtnNot.isSelected()==true)
					{
						status="not";
					}
					try
					{
						/*Class.forName("oracle.jdbc.driver.OracleDriver");   
	    			Connection con=DriverManager.getConnection(  
	    			"jdbc:oracle:thin:@localhost:1521:xe","system","pk1631037"); 
						String query="Select * from College_Events";
						Statement st = con.createStatement();
					      
					      // execute the query, and get a java resultset
					      ResultSet rs = st.executeQuery(query);
						
						table.setModel(DbUtils.resultSetToTableModel(rs));
						*/
						Class.forName("oracle.jdbc.driver.OracleDriver");
						Connection con1;
						con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pk1631037");
						Statement st1;
						st1 = con1.createStatement();
						String sql1="select * from College_Events";
						ResultSet rs1;
						rs1 = st1.executeQuery(sql1);
						rs1.next();
						String i1=textField.getText();
						String j1=textField_1.getText();
						int k=Integer.parseInt(j1);
						String k1=String.valueOf(k);
						textField_17.setText(i1);
						textField_18.setText(k1);
						int i=0;
						int j=0,dd=0;
						String pp,pp1,pp2;
						//int use=Integer.parseInt(textField.getText());
						//String pass2=passwordField.getText();
						int flag=0;
						
						//if(rs1.next() )
						//{
						//while(rs1.next())
						//{
							i=rs1.getInt(1);
							String ii=String.valueOf(i);
							textField_11.setText(ii);
							//j=rs.getInt(2);
							//String jj=String.valueOf(j);
							//textField_18.setText(jj);
							pp=rs1.getString(4);
							textField_13.setText(pp);
							pp1=rs1.getString(5);
							textField_14.setText(pp1);
							pp2=rs1.getString(6);
							textField_15.setText(pp2);
							dd=rs1.getInt(9);
							String dd1=String.valueOf(dd);
							String n=textField_12.getText();
							textField_16.setText(dd1);
							rs1.next();
							String h=textField_11.getText();
							int h1=Integer.parseInt(h);
							if(h!="")
							{
								try
								{//System.out.println("hii");
								
									n="12-Jan-2019";
									Class.forName("oracle.jdbc.driver.OracleDriver");
									Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pk1631037");
									PreparedStatement ps=con.prepareStatement("insert into Student_Calls values(?,?,?,?,?,?,?,?,?)");
									ps.setInt(1, h1);
									ps.setString(2,n);
									ps.setString(3,pp);
									ps.setString(4,pp1);
									ps.setString(5,pp2);
									ps.setInt(6,dd);
									ps.setString(7, i1);
									ps.setInt(8, k);
									ps.setString(9, status);
									//ps.setString(3,pp2);
									//ps.setString(4,pp);
									//ps.setInt(5,dd);
									
									//ps.setString(1, user);
									//ps.setString(2, pass);
									//ps.setString(3,hint);
									
									int res2=ps.executeUpdate();
									if(res2==0)
										System.out.println(" not inserted");
									else
									{
										System.out.println("inserted into Student_calls");
										JOptionPane.showMessageDialog(null,"INSERTED in Student calls");
										//frmRegister.dispose();
										//first kl=new first();
										//kl.main(null);
									}
									ps.close();
									con.close();
									//sc.close();
									}
								catch(Exception e)
								{
									e.printStackTrace();
								}
								if(h!="" && status.equals("come"))
								{
								try{
									n="12-Jan-2019";
									String oi="free";
									Class.forName("oracle.jdbc.driver.OracleDriver");
									Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pk1631037");
									PreparedStatement ps=con.prepareStatement("insert into Alumni_Schedule values(?,?,?,?,?,?)");
									ps.setInt(1, h1);
									ps.setString(2,n);
									ps.setString(3,pp2);
									ps.setString(4,pp);
									ps.setInt(5,dd);
									ps.setString(6, oi);
									//ps.setString(3,pp2);
									//ps.setString(4,pp);
									//ps.setInt(5,dd);
									
									//ps.setString(1, user);
									//ps.setString(2, pass);
									//ps.setString(3,hint);
									
									int res=ps.executeUpdate();
									if(res==0)
										System.out.println(" not inserted");
									else
									{
										System.out.println("inserted into ");
										JOptionPane.showMessageDialog(null,"INSERTED in Alumni_Schedule");
										//frmRegister.dispose();
										//first kl=new first();
										//kl.main(null);
									}
									ps.close();
									con.close();
									//sc.close();
									}
								catch(Exception e)
								{
									e.printStackTrace();
								}
								try{
									n="12-Jan-2019";
									String oi="free";
									Class.forName("oracle.jdbc.driver.OracleDriver");
									Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pk1631037");
									PreparedStatement ps=con.prepareStatement("insert into Confirm values(?,?,?)");
									ps.setString(1, i1);
									ps.setInt(2,k);
									ps.setString(3,pp);
									//ps.setString(4,pp);
									//ps.setInt(5,dd);
									//ps.setString(6, oi);
									//ps.setString(3,pp2);
									//ps.setString(4,pp);
									//ps.setInt(5,dd);
									
									//ps.setString(1, user);
									//ps.setString(2, pass);
									//ps.setString(3,hint);
									
									int res=ps.executeUpdate();
									if(res==0)
										System.out.println(" not inserted");
									else
									{
										System.out.println("inserted into ");
										JOptionPane.showMessageDialog(null,"INSERTED in Confirm");
										//frmRegister.dispose();
										//first kl=new first();
										//kl.main(null);
									}
									ps.close();
									con.close();
									//sc.close();
									}
								catch(Exception e)
								{
									e.printStackTrace();
								}
							}
							}
						//}
						//}
							
							con1.close();
					}
					catch(Exception y)
					{
						y.printStackTrace();
					}
	
					
				}
			});
			btnNext.setBounds(247, 429, 155, 37);
			layeredPane_6.add(btnNext);
			
			JLabel lblNewLabel = new JLabel("student_roll_no");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setBounds(54, 11, 200, 50);
			layeredPane_6.add(lblNewLabel);
			
			JLabel lblDateofprogram = new JLabel("date_of_program");
			lblDateofprogram.setFont(new Font("Tahoma", Font.PLAIN, 21));
			lblDateofprogram.setForeground(Color.WHITE);
			lblDateofprogram.setBounds(54, 57, 200, 50);
			layeredPane_6.add(lblDateofprogram);
			
			JLabel lblProgramname = new JLabel("program_name");
			lblProgramname.setFont(new Font("Tahoma", Font.PLAIN, 21));
			lblProgramname.setForeground(Color.WHITE);
			lblProgramname.setBounds(54, 105, 200, 50);
			layeredPane_6.add(lblProgramname);
			
			JLabel lblConductingdepartment = new JLabel("conducting_department");
			lblConductingdepartment.setFont(new Font("Tahoma", Font.PLAIN, 21));
			lblConductingdepartment.setForeground(Color.WHITE);
			lblConductingdepartment.setBounds(54, 148, 200, 50);
			layeredPane_6.add(lblConductingdepartment);
			
			JLabel lblLocationofprogram = new JLabel("location_of_program ");
			lblLocationofprogram.setFont(new Font("Tahoma", Font.PLAIN, 21));
			lblLocationofprogram.setForeground(Color.WHITE);
			lblLocationofprogram.setBounds(54, 194, 200, 50);
			layeredPane_6.add(lblLocationofprogram);
			
			JLabel lblNoofdaysofprograms = new JLabel("no_of_days_of_programs ");
			lblNoofdaysofprograms.setBackground(Color.WHITE);
			lblNoofdaysofprograms.setFont(new Font("Tahoma", Font.PLAIN, 21));
			lblNoofdaysofprograms.setForeground(Color.WHITE);
			lblNoofdaysofprograms.setBounds(54, 240, 241, 50);
			layeredPane_6.add(lblNoofdaysofprograms);
			
			JLabel lblAlumniname = new JLabel("alumni_name ");
			lblAlumniname.setFont(new Font("Tahoma", Font.PLAIN, 21));
			lblAlumniname.setForeground(Color.WHITE);
			lblAlumniname.setBounds(54, 281, 200, 50);
			layeredPane_6.add(lblAlumniname);
			
			textField_11 = new JTextField();
			textField_11.setBounds(349, 26, 121, 20);
			layeredPane_6.add(textField_11);
			textField_11.setColumns(10);
			
			textField_12 = new JTextField();
			textField_12.setBounds(349, 72, 121, 20);
			layeredPane_6.add(textField_12);
			textField_12.setColumns(10);
			
			textField_13 = new JTextField();
			textField_13.setBounds(349, 120, 121, 20);
			layeredPane_6.add(textField_13);
			textField_13.setColumns(10);
			
			textField_14 = new JTextField();
			textField_14.setBounds(349, 163, 121, 20);
			layeredPane_6.add(textField_14);
			textField_14.setColumns(10);
			
			textField_15 = new JTextField();
			textField_15.setBounds(349, 209, 121, 20);
			layeredPane_6.add(textField_15);
			textField_15.setColumns(10);
			
			textField_16 = new JTextField();
			textField_16.setBounds(349, 255, 121, 20);
			layeredPane_6.add(textField_16);
			textField_16.setColumns(10);
			
			textField_17 = new JTextField();
			textField_17.setBounds(349, 296, 121, 20);
			layeredPane_6.add(textField_17);
			textField_17.setColumns(10);
			
			JLabel lblAlumniname_1 = new JLabel("alumni_roll_no");
			lblAlumniname_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
			lblAlumniname_1.setForeground(Color.WHITE);
			lblAlumniname_1.setBounds(54, 325, 200, 50);
			layeredPane_6.add(lblAlumniname_1);
			
			textField_18 = new JTextField();
			textField_18.setBounds(349, 340, 121, 20);
			layeredPane_6.add(textField_18);
			textField_18.setColumns(10);
			
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon("F:\\alumni project\\Alumni\\1.jpg"));
			lblNewLabel_1.setBounds(0, 1, 1203, 476);
			layeredPane_6.add(lblNewLabel_1);
			
			JButton btnLogout = new JButton("LOGOUT");
			btnLogout.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					frmHome.dispose();
					first k=new first();
					k.main(null);
				}
			});
			btnLogout.setForeground(Color.BLACK);
			btnLogout.setBounds(908, 11, 152, 23);
			frmHome.getContentPane().add(btnLogout);
			
			JLabel label_3 = new JLabel("");
			label_3.setForeground(Color.GRAY);
			label_3.setIcon(new ImageIcon("F:\\alumni project\\Alumni\\water_dancing_2_by_sed-d4wx667.jpg"));
			label_3.setBounds(0, 0, 1259, 576);
			frmHome.getContentPane().add(label_3);
			
		
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pk1631037");
		Statement st=con.createStatement();
		String sql="select * from Request";
		ResultSet rs=st.executeQuery(sql);
		int i=0;
		//String j;
		if(rs!= null )
		{
		while(rs.next())
		{
			i=rs.getInt("s_roll_no");
			String k=String.valueOf(i);
			textArea.append(k+"\n");
		}
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
		btnClick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String sro=textField_10.getText();
				String ana=textField.getText();
				String aro=textField_1.getText();
				String apo=textField_7.getText();
				int sro1=Integer.parseInt(sro);
				int aro1=Integer.parseInt(aro);
				long apo1=Long.parseLong(apo);
				
				try
				{

					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pk1631037");
					PreparedStatement ps=con.prepareStatement("insert into Alumni_Permitted_Students values(?,?,?,?)");
					//System.out.println("hii");
					ps.setInt(1, aro1);
					ps.setString(2, ana);
					ps.setInt(3, sro1);
					ps.setLong(4, apo1);
					
					int res=ps.executeUpdate();
					if(res==0)
						System.out.println(" not inserted");
					else
						JOptionPane.showMessageDialog(null,"Inserted");
						System.out.println("inserted into Request");
					ps.close();
					con.close();
					//sc.close();
					}
				catch(Exception y)
				{
					y.printStackTrace();
				}


			}
		});
		

	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
