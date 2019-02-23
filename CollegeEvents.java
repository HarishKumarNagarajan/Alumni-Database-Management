import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;


public class CollegeEvents {

	private JFrame frmCollegeEvents;
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
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CollegeEvents window = new CollegeEvents();
					window.frmCollegeEvents.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CollegeEvents() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCollegeEvents = new JFrame();
		frmCollegeEvents.setTitle("College Events");
		frmCollegeEvents.setBounds(100, 100, 401, 519);
		frmCollegeEvents.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCollegeEvents.getContentPane().setLayout(null);
		
		JLabel lblCollegeEvents = new JLabel("College Events");
		lblCollegeEvents.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCollegeEvents.setForeground(Color.WHITE);
		lblCollegeEvents.setBounds(113, 11, 160, 14);
		frmCollegeEvents.getContentPane().add(lblCollegeEvents);
		
		JLabel lblCollegeRefrenceNumber = new JLabel("College Refrence Number");
		lblCollegeRefrenceNumber.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCollegeRefrenceNumber.setForeground(Color.WHITE);
		lblCollegeRefrenceNumber.setBounds(10, 115, 220, 16);
		frmCollegeEvents.getContentPane().add(lblCollegeRefrenceNumber);
		
		textField = new JTextField();
		
		textField.setBounds(254, 116, 86, 19);
		frmCollegeEvents.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCollegeName = new JLabel("College Name");
		lblCollegeName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCollegeName.setForeground(Color.WHITE);
		lblCollegeName.setBounds(10, 146, 220, 14);
		frmCollegeEvents.getContentPane().add(lblCollegeName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(254, 146, 86, 20);
		frmCollegeEvents.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblProgramName = new JLabel("Program Name");
		lblProgramName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblProgramName.setForeground(Color.WHITE);
		lblProgramName.setBounds(10, 171, 220, 14);
		frmCollegeEvents.getContentPane().add(lblProgramName);
		
		textField_2 = new JTextField();
		textField_2.setBounds(254, 171, 86, 20);
		frmCollegeEvents.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblConductingDepartment = new JLabel("Conducting Department");
		lblConductingDepartment.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblConductingDepartment.setForeground(Color.WHITE);
		lblConductingDepartment.setBounds(10, 202, 220, 14);
		frmCollegeEvents.getContentPane().add(lblConductingDepartment);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(254, 202, 86, 20);
		frmCollegeEvents.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblLocation = new JLabel("Location");
		lblLocation.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblLocation.setForeground(Color.WHITE);
		lblLocation.setBounds(10, 240, 220, 14);
		frmCollegeEvents.getContentPane().add(lblLocation);
		
		textField_4 = new JTextField();
		textField_4.setBounds(254, 240, 86, 20);
		frmCollegeEvents.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblStaylocation = new JLabel("Stay Location");
		lblStaylocation.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblStaylocation.setForeground(Color.WHITE);
		lblStaylocation.setBounds(10, 278, 220, 14);
		frmCollegeEvents.getContentPane().add(lblStaylocation);
		
		textField_5 = new JTextField();
		textField_5.setBounds(254, 278, 86, 20);
		frmCollegeEvents.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblDurationInA = new JLabel("Duration in a day");
		lblDurationInA.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblDurationInA.setForeground(Color.WHITE);
		lblDurationInA.setBounds(10, 315, 220, 14);
		frmCollegeEvents.getContentPane().add(lblDurationInA);
		
		textField_6 = new JTextField();
		textField_6.setBounds(254, 315, 86, 20);
		frmCollegeEvents.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNoOfDays = new JLabel("No of Days");
		lblNoOfDays.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNoOfDays.setForeground(Color.WHITE);
		lblNoOfDays.setBounds(10, 346, 220, 14);
		frmCollegeEvents.getContentPane().add(lblNoOfDays);
		
		textField_7 = new JTextField();
		textField_7.setBounds(254, 346, 86, 20);
		frmCollegeEvents.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblTravelTime = new JLabel("Travel Time");
		lblTravelTime.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblTravelTime.setForeground(Color.WHITE);
		lblTravelTime.setBounds(10, 380, 220, 14);
		frmCollegeEvents.getContentPane().add(lblTravelTime);
		
		textField_8 = new JTextField();
		textField_8.setBounds(254, 380, 86, 20);
		frmCollegeEvents.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		final JLabel label = new JLabel("");
		label.setForeground(Color.RED);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(30, 93, 331, 14);
		frmCollegeEvents.getContentPane().add(label);
		
		JLabel lblConductingStudent = new JLabel("Conducting Student");
		lblConductingStudent.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblConductingStudent.setForeground(Color.WHITE);
		lblConductingStudent.setBounds(10, 59, 220, 14);
		frmCollegeEvents.getContentPane().add(lblConductingStudent);
		
		textField_9 = new JTextField();
		textField_9.addMouseListener(new MouseAdapter() {
			public void mouseExited(MouseEvent arg0) {
				
				int flag=0;
				try
				{
				int g=Integer.parseInt(textField_9.getText());
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pk1631037");
				Statement st=con.createStatement();
				int f=0;
				//String sql="select * from Alumni_Details";
				ResultSet rs=st.executeQuery("select * from Student_Details" );
				if(rs!=null)
				{
					while(rs.next())
					{
						f=rs.getInt(2);
						if(f==g)
						{
							textField_3.setText(rs.getString(5));
							label.setText("");
							flag=1;
						}
					}
				}
				
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				if(flag==0)
				{
					label.setText("Sorry no match students found..");
				}
				
			}
		});
		//int g=Integer.parseInt(textField_9.getText());
		textField_9.setBounds(254, 59, 86, 20);
		frmCollegeEvents.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		
		
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					int ref=Integer.parseInt(textField.getText());
					String clgname=textField_1.getText();
					String pname=textField_2.getText();
					String condepart=textField_3.getText();
					String loc=textField_4.getText();
					String stay=textField_5.getText();
					int duration=Integer.parseInt(textField_6.getText());
					int nodays=Integer.parseInt(textField_7.getText());
					int travel=Integer.parseInt(textField_8.getText());
					int conductor=Integer.parseInt(textField_9.getText());
					//Date date=Date.valueOf(textField_10.getText());
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pk1631037");
					PreparedStatement ps=con.prepareStatement("insert into College_Events values(?,?,?,?,?,?,?,?,?,?,?)");
					ps.setInt(1,conductor);
					ps.setInt(2, ref);
					ps.setString(3, clgname);
					//ps.setString(4,compname);
					ps.setString(4, pname);
					ps.setString(5,condepart);
					ps.setString(6, loc);
					//ps.setString(8,year);
					ps.setString(7,stay);
					ps.setInt(8,duration);
					ps.setInt(9,nodays);
					ps.setInt(10,travel);
					ps.setString(11, "");
					int res=ps.executeUpdate();
					if(res==0)
						System.out.println(" not inserted");
					else
						System.out.println("inserted into College_Events Details");
						frmCollegeEvents.dispose();
						first n=new first();
						n.main(null);
					ps.close();
					con.close();
					//sc.close();
					}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(91, 446, 89, 23);
		frmCollegeEvents.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CLEAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
			}
		});
		btnNewButton_1.setBounds(223, 446, 89, 23);
		frmCollegeEvents.getContentPane().add(btnNewButton_1);
		
		JLabel lblDateOfProg = new JLabel("Date of prog");
		lblDateOfProg.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblDateOfProg.setForeground(Color.WHITE);
		lblDateOfProg.setBounds(20, 412, 200, 23);
		frmCollegeEvents.getContentPane().add(lblDateOfProg);
		
		textField_10 = new JTextField();
		textField_10.setBounds(254, 411, 86, 20);
		frmCollegeEvents.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("F:\\alumni project\\Alumni\\Verre02_Micael_Reynaud_800_p0.gif"));
		label_1.setBounds(0, -69, 385, 549);
		frmCollegeEvents.getContentPane().add(label_1);
		
		
	}
}
