package Week4;



import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LoginWindow {
	
	//Control shift o to import library automatically
	
	JFrame frame;
	JLabel label, loginlbl, loginlbl1;
	JPanel panel;
	
	public LoginWindow() {
		frame=new JFrame();
		frame.setTitle("Login Form");
		frame.setSize(750,550);
		frame.setResizable(true);
		frame.setLocation(450,150);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("nitesh.png")));
		frame.getContentPane().setBackground(new Color(27, 188, 155));
		frame.setResizable(false);
		frame.setLayout(null);
		
		panel=new JPanel();
		panel.setBounds(50,50,640,400);
		panel.setBackground(new Color(238,238,228));
		panel.setBorder(new EmptyBorder(50,50,50,50));
		panel.setLayout(null);
		frame.add(panel);
		
		JPanel panel1=new JPanel();
		panel1.setBackground(new Color(21, 159, 133));
		panel1.setBounds(0,0,640,45);
		
		panel.add(panel1);
		
		
		label=new JLabel("Login Form",label.CENTER);
		label.setBounds(220,10,200,35);		
		label.setBackground(new Color(21, 159, 133));
		label.setOpaque(true);
		label.setFont(new Font("Verdana", Font.BOLD, 25));
		label.setForeground(Color.WHITE);
		panel1.add(label);
		
		loginlbl=new JLabel("Username:");
		loginlbl.setBounds(170,100,200,35);
		loginlbl.setFont(new Font("Verdana", Font.BOLD, 18));
		panel.add(loginlbl);
		
		loginlbl1=new JLabel("Password:");
		loginlbl1.setBounds(170,150,200,35);
		loginlbl1.setFont(new Font("Verdana", Font.BOLD, 18));
		panel.add(loginlbl1);
		
		JTextField txtField=new JTextField();
		txtField.setBounds(290,100,200,35);
		txtField.setFont(new Font("Verdana", Font.BOLD, 18));
		panel.add(txtField);
		
		JPasswordField txtField1=new JPasswordField();
		txtField1.setFont(new Font("Verdana", Font.BOLD, 18));
		txtField1.setBounds(290,150,200,35);
		panel.add(txtField1);
		
		JButton btn=new JButton("Login");
		btn.setBounds(270,250,100,35);
		btn.setBackground(new Color(21, 159, 133));
		btn.setForeground(Color.WHITE);
		btn.setFont(new Font("Verdana", Font.BOLD, 15));
		panel.add(btn);
		
		
		
		
		frame.setVisible(true);
		
		
	}
	

	public static void main(String[] args) {
		new LoginWindow();

	}

}
