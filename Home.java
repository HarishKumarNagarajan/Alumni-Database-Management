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
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;


public class Home extends JFrame {

	private JPanel contentPane;
	JFrame frmHome;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
long rope=0;
private JTextField textField_2;
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
	textField_4.setEditable(true);
	textField_6.setEditable(true);
	textField_7.setEditable(true);
	textField_8.setEditable(true);
	textField_9.setEditable(true);
	}
	else
	{
		textField.setEditable(false);
		textField_1.setEditable(false);
		textField_4.setEditable(false);
		textField_6.setEditable(false);
		textField_7.setEditable(false);
		textField_8.setEditable(false);
		textField_9.setEditable(false);
	}
}
	/**
	 * Create the frame.
	 */
	public Home(long temp12) {
		rope=temp12;
		frmHome = new JFrame();
		frmHome.setTitle("Student Home");
		frmHome.getContentPane().setForeground(SystemColor.activeCaptionText);
		frmHome.setBounds(100, 100, 1287, 615);
		frmHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frmHome.getContentPane().setLayout(null);
		frmHome.setVisible(true);
		//frmHome.getContentPane().add(lblCollegeAlumniDatabase);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(24, 32, 1237, 533);
		frmHome.getContentPane().add(tabbedPane);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("HOME", null, tabbedPane_1, null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		tabbedPane_1.addTab("Announcements", null, layeredPane, null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 50, 1159, 182);
		layeredPane.add(textArea);
		
		JLabel label = new JLabel("College Refrence Number");
		label.setFont(new Font("Tahoma", Font.BOLD, 19));
		label.setForeground(Color.WHITE);
		label.setBounds(127, 23, 136, 16);
		layeredPane.add(label);
		
		JLabel label_1 = new JLabel("College Name");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(294, 24, 118, 14);
		layeredPane.add(label_1);
		
		JLabel label_2 = new JLabel("Program Name");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		label_2.setForeground(Color.WHITE);
		label_2.setBounds(401, 24, 118, 14);
		layeredPane.add(label_2);
		
		JLabel label_3 = new JLabel("Conducting Department");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 19));
		label_3.setForeground(Color.WHITE);
		label_3.setBounds(529, 24, 118, 14);
		layeredPane.add(label_3);
		
		JLabel label_4 = new JLabel("Location");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 19));
		label_4.setForeground(Color.WHITE);
		label_4.setBounds(686, 24, 46, 14);
		layeredPane.add(label_4);
		
		JLabel label_5 = new JLabel("Duration in a day");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_5.setForeground(Color.WHITE);
		label_5.setBounds(780, 24, 118, 14);
		layeredPane.add(label_5);
		
		JLabel label_6 = new JLabel("No of Days");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_6.setForeground(Color.WHITE);
		label_6.setBounds(932, 24, 86, 14);
		layeredPane.add(label_6);
		
		JLabel label_7 = new JLabel("Conducting Student");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 19));
		label_7.setForeground(Color.WHITE);
		label_7.setBounds(10, 24, 107, 14);
		layeredPane.add(label_7);
		
		JLabel lblStayLocation = new JLabel("Stay location");
		lblStayLocation.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblStayLocation.setForeground(Color.WHITE);
		lblStayLocation.setBounds(1023, 24, 71, 14);
		layeredPane.add(lblStayLocation);
		
		JLabel lblTravelTime = new JLabel("Travel time");
		lblTravelTime.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTravelTime.setForeground(Color.BLACK);
		lblTravelTime.setBounds(1126, 25, 101, 14);
		layeredPane.add(lblTravelTime);
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon("F:\\alumni project\\Alumni\\water_dancing_2_by_sed-d4wx667.jpg"));
		label_8.setBounds(0, 11, 1180, 455);
		layeredPane.add(label_8);
		
		
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("STUDENT", null, tabbedPane_2, null);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		tabbedPane_2.addTab("Contact requests", null, layeredPane_1, null);
		
		JLabel lblContactsAccepted = new JLabel("Contacts Accepted");
		lblContactsAccepted.setForeground(Color.YELLOW);
		lblContactsAccepted.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblContactsAccepted.setBounds(301, 37, 186, 14);
		layeredPane_1.add(lblContactsAccepted);
		
		final JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(253, 76, 346, 143);
		layeredPane_1.add(textArea_2);
		
		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon("F:\\alumni project\\Alumni\\water_dancing_2_by_sed-d4wx667.jpg"));
		label_9.setBounds(10, 0, 772, 477);
		layeredPane_1.add(label_9);
		
		JLayeredPane layeredPane_6 = new JLayeredPane();
		tabbedPane_2.addTab("Alumni's", null, layeredPane_6, null);
		
		JLabel lblAlumniRegistredYet = new JLabel("ALUMNI REGISTRED YET");
		lblAlumniRegistredYet.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlumniRegistredYet.setBounds(286, 47, 180, 14);
		layeredPane_6.add(lblAlumniRegistredYet);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(296, 72, 164, 198);
		layeredPane_6.add(textArea_1);
		
		JLabel lblNewLabel = new JLabel("Choose Your Alumni");
		lblNewLabel.setBounds(87, 318, 131, 14);
		layeredPane_6.add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setBounds(286, 315, 86, 20);
		layeredPane_6.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnClick = new JButton("Click");

		btnClick.setBounds(492, 314, 89, 23);
		layeredPane_6.add(btnClick);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("F:\\alumni project\\Alumni\\download-free-250-high-quality-butterfly-wallpaper-the-quotes-land.jpg"));
		lblNewLabel_1.setBounds(0, 0, 1217, 477);
		layeredPane_6.add(lblNewLabel_1);
		
		JLayeredPane layeredPane_3 = new JLayeredPane();
		tabbedPane.addTab("PROFILE", null, layeredPane_3, null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(41, 20, 100, 14);
		layeredPane_3.add(lblName);
		
		JLabel lblRollNo = new JLabel("Roll no");
		lblRollNo.setForeground(Color.WHITE);
		lblRollNo.setBounds(41, 88, 100, 14);
		layeredPane_3.add(lblRollNo);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setForeground(Color.WHITE);
		lblGender.setBounds(41, 153, 100, 14);
		layeredPane_3.add(lblGender);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBounds(41, 221, 100, 14);
		layeredPane_3.add(lblEmail);
		
		JLabel lblPhoneNumber = new JLabel("Phone number");
		lblPhoneNumber.setForeground(Color.WHITE);
		lblPhoneNumber.setBounds(41, 289, 100, 14);
		layeredPane_3.add(lblPhoneNumber);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setBounds(41, 357, 100, 14);
		layeredPane_3.add(lblAddress);
		
		JLabel lblMajorSubject = new JLabel("Major subject");
		lblMajorSubject.setForeground(Color.WHITE);
		lblMajorSubject.setBounds(41, 425, 100, 14);
		layeredPane_3.add(lblMajorSubject);
		
		textField = new JTextField();
		textField.setBounds(301, 17, 203, 20);
		layeredPane_3.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(301, 85, 203, 20);
		layeredPane_3.add(textField_1);
		textField_1.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(301, 150, 203, 20);
		layeredPane_3.add(textField_4);
		textField_4.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(301, 218, 203, 20);
		layeredPane_3.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(301, 289, 203, 20);
		layeredPane_3.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(301, 357, 203, 20);
		layeredPane_3.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(301, 422, 203, 20);
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
		ResultSet rs=st.executeQuery("select * from Student_Details where student_roll_no = '" + rope +"'" );
		String i;
		int j;
		String k;
		String l;
		String m;
		String n;
		String o;
		rs.next();
		i=rs.getString(1);
		j=rs.getInt(2);
		String temp1=String.valueOf(j);
		k=rs.getString(10);
		l=rs.getString(8);
		textField.setText(i);
		textField_1.setText(temp1);
		m=rs.getString(7);
		textField_4.setText(k);
		n=rs.getString(4);
		o=rs.getString(9);
		textField_6.setText(l);
	
		//textField_5.setText(n);
		
		textField_8.setText(n);
		
		textField_9.setText(o);
		
		//String temp2=String.valueOf(p);
		textField_7.setText(m);
		textField.setEditable(false);
		textField_1.setEditable(false);
		textField_4.setEditable(false);
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
				textField_4.setEditable(true);
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
				i=textField.getText();
				j=textField_1.getText();
				long temp1=Integer.parseInt(j);
				k=textField_4.getText();
				l=textField_6.getText();
				m=textField_7.getText();
				//long temp=Integer.parseInt(p);
				n=textField_8.getText();
				o=textField_9.getText();
				ResultSet rs=st.executeQuery("update Student_Details SET student_name='"+i+"',gender='"+k+"',mail_id='"+l+"',contact_number="+m+",current_area='"+n+"',major_subject='"+o+"' where student_roll_no = '" +j+"'" +
						"" );
				JOptionPane.showMessageDialog(null, "changed..");
				Home ob=new Home(temp1);
				ob.main();
				//rs.next();
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				textField.setEditable(false);
				textField_1.setEditable(false);
				textField_4.setEditable(false);
				textField_6.setEditable(false);
				textField_7.setEditable(false);
				textField_8.setEditable(false);
				textField_9.setEditable(false);
			}
		});
		btnDone.setBounds(311, 471, 89, 23);
		layeredPane_3.add(btnDone);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("F:\\alumni project\\Alumni\\water_dancing_2_by_sed-d4wx667.jpg"));
		lblNewLabel_2.setBounds(10, 0, 1222, 505);
		layeredPane_3.add(lblNewLabel_2);
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmHome.dispose();
				first k=new first();
				k.main(null);
			}
		});
		btnLogout.setBounds(751, 10, 204, 31);
		frmHome.getContentPane().add(btnLogout);
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
		String sql="select * from College_Events";
		ResultSet rs=st.executeQuery(sql);
		String chat;
		String j;
		//int use=Integer.parseInt(textField.getText());
		//String pass2=passwordField.getText();
		int flag1=0;
		
		if(rs!= null )
		{
		while(rs.next())
		{
			
			int Conductor=rs.getInt(1);
			int ref=rs.getInt(2);
			String clg=rs.getString(3);
			String pname=rs.getString(4);
			String dep=rs.getString(5);
			String loc=rs.getString(6);
			String stay=rs.getString(7);
			int dur=rs.getInt(8);
			int nodays=rs.getInt(9);
			int tra=rs.getInt(10);
			textArea.append(Conductor+" "+ref+" "+clg+" "+pname+" "+dep+" "+loc+" "+stay+" "+dur+" "+nodays+" "+tra+"\n");
		}
		}
		
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
		String sql="select * from Alumni_Login";
		ResultSet rs=st.executeQuery(sql);
		int i=0;
		//String j;
		//int use=Integer.parseInt(textField.getText());
		//String pass2=passwordField.getText();
		//int flag=0;
		
		if(rs!= null )
		{
		while(rs.next())
		{
			i=rs.getInt("alumni_user_name");
			String j=String.valueOf(i);
			textArea_1.append(j+"\n");
			//j=rs.getString("hint");
			//if(i==use)
			//{
				//System.out.println(j);
				//JOptionPane.showMessageDialog(null,"HINT IS  :"+ j);
				//flag=1;
			//}
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
		btnClick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
		String q=textField_2.getText();
		int w=Integer.parseInt(q);
		String e=textField_1.getText();
		int r=Integer.parseInt(e);
		try
		{

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pk1631037");
			PreparedStatement ps=con.prepareStatement("insert into Request values(?,?)");
			//System.out.println("hii");
			ps.setInt(1, w);
			ps.setInt(2, r);
			int res=ps.executeUpdate();
			if(res==0)
				System.out.println(" not inserted");
			else
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
		//btnClick_1.addActionListener(new ActionListener() {
			//public void actionPerformed(ActionEvent arg0) {

			
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pk1631037");
		Statement st=con.createStatement();
		String sql="select * from Alumni_Permitted_Students";
		ResultSet rs=st.executeQuery(sql);
		int i=0,o=0;
		long k=0;
		String j;
		//int use=Integer.parseInt(textField.getText());
		//String pass2=passwordField.getText();
		//int flag=0;
		if(rs!= null )
		{
		while(rs.next())
		{
			i=rs.getInt("alumni_roll_no");
			String i1=String.valueOf(i);
			j=rs.getString("alumni_name");
			o=rs.getInt("student_roll_no");
			k=rs.getLong("alumni_contact_number");
			Long k1=Long.valueOf(k);
			String g=textField_1.getText();
			int u=Integer.parseInt(g);
			String u1=String.valueOf(u);
			if(u==o)
			{
				textArea_2.append(i1+ "\t" +j+ "\t" +k1+ "\n");
			}
			
		}
		}
		
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
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
