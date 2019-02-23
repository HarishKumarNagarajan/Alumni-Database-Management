import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;


public class Chat {

	private JFrame frame;
	private JTextField textField;
	private JButton btnSend;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chat window = new Chat();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Chat() {
		initialize();
	}
		
		//String compname=textField_1.getText();
		
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 831, 696);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHAT");
		lblNewLabel.setBounds(30, 11, 55, 23);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(108, 12, 316, 55);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnSend = new JButton("SEND");
		btnSend.setBounds(189, 73, 184, 23);
		frame.getContentPane().add(btnSend);
		
		textArea = new JTextArea();
		textArea.setBounds(118, 107, 306, 561);
		frame.getContentPane().add(textArea);
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String ch=textField.getText();
				int flag=0;
				if(ch.equals(""))
				{
					JOptionPane.showMessageDialog(null,"Chat with your Seniors");
					flag=1;
				}
				if(flag==0)
				{
				try
				{

					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pk1631037");
					PreparedStatement ps=con.prepareStatement("insert into chat values(?)");
					//System.out.println("hii");
					ps.setString(1, ch);
					int res=ps.executeUpdate();
					if(res==0)
						System.out.println(" not inserted");
					else
						//System.out.println("inserted into chat");
					ps.close();
					con.close();
					//sc.close();
					}
				catch(Exception e)
				{
					e.printStackTrace();
				}

			}
				try
				{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pk1631037");
				Statement st=con.createStatement();
				String sql="select * from chat";
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
					//while(true)
					
					chat=rs.getString("chat");
					
					//if((chat.equals(chat)))
					//{
					//System.out.println(chat);
						textArea.append(chat+"\n");
					//}
						//}
					//j=rs.getString("hint");
					//if(i==use)
					//{
						//System.out.println(j);
						//JOptionPane.showMessageDialog(null, chat);
						//textField_1.
						//flag=1;
					//}
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
		
			}
		});
		
}
}
