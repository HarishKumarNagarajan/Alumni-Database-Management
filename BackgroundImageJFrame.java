import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class BackgroundImageJFrame extends JFrame
{
	JFrame f =new JFrame("IMAGE");
JButton b1;
JLabel l1;
	public BackgroundImageJFrame()
	{
	setTitle("Background Color for JFrame");
	f.setSize(1500,1500);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	f.setVisible(true);
	f.setLayout(null);
	JLabel background=new JLabel(new ImageIcon("alumni.png"));
	f.add(background);
	background.setLayout(new FlowLayout());
	background.setSize(600, 600);
	background.setBounds(100, 100, 400, 400);
	l1=new JLabel("Here is a button");
	b1=new JButton("I am a button");
	background.add(l1);
	background.add(b1);
	}}