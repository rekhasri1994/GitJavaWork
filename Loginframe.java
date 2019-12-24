package myjdbc;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.FlowLayout;
public class Loginframe extends JFrame{
	private String username;
	private String password;
	private JLabel unamelabel;
	private JTextField unametext;
	private JPasswordField passwordtext;
	private JLabel passwordLabel;
	private JButton checkbutton;
	//loginframe constructor
	Loginframe()
	{
		//create components
		unamelabel= new JLabel("User Name");
		unametext=new JTextField(30);
		passwordLabel=new JLabel("Password");
		passwordtext=new JPasswordField(10);
		checkbutton=new JButton("Check in database");
		
		//set bounds-limitation for space specification on gui
		setBounds(250,300,50,80);
		unamelabel.setBounds(10,10,50,40);
		unametext.setBounds(25,75,10,50);
		passwordLabel.setBounds(10,20,50,40);
		passwordtext.setBounds(10,30,10,10);
		checkbutton.setBounds(15,40,10,10);
		//add components to frame
		this.add(unamelabel);
		this.add(unametext);
		add(passwordLabel);
		add(passwordtext);
		add(checkbutton);
		//set the frame visitible
		setVisible(true);
		setTitle("user login form");
		
		
	}

}
