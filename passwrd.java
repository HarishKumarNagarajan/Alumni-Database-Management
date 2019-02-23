import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JPasswordField;

public class passwrd extends JDialog {

	private final JPanel contentPanel = new JPanel();
	int roll1=0;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			passwrd dialog = new passwrd(0);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public passwrd(int roll) {
		roll1=roll;
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblEnterThePassword = new JLabel("Enter the password for complete your action");
			lblEnterThePassword.setHorizontalAlignment(SwingConstants.CENTER);
			lblEnterThePassword.setBounds(83, 41, 260, 50);
			contentPanel.add(lblEnterThePassword);
		}
		
		passwordField = new JPasswordField();
		passwordField.setBounds(137, 109, 153, 20);
		contentPanel.add(passwordField);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						try
						{
						int k=0;
						Class.forName("oracle.jdbc.driver.OracleDriver");
						Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pk1631037");
						Statement st=con.createStatement();
						String sql="select * from Alumni_Login";
						ResultSet rs=st.executeQuery(sql );
						if(rs!= null )
						{
						while(rs.next())
						{
						k=rs.getInt(1);
						if(roll1==k)
						{
						String j=rs.getString(2);
						String comp=passwordField.getText();
						if(j==comp)
						{
							dispose();
							Home1 oj=new Home1(roll1);
							oj.det(1);
							oj.setVisible(true);
							
						}
						else
						{
							JOptionPane.showMessageDialog(null, "sorry no permission..");
							Home1 oj=new Home1(roll1);
							oj.det(2);
							oj.setVisible(true);
						}
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
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
