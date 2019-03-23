package com.srivastava.apps.aopdemo;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class UserView extends JFrame {
	JTextField useridTxt = new JTextField();
	JPasswordField pwdTxt = new JPasswordField();
	@Autowired
	private IUserService service;
	@Autowired
	private UserDTO userDTO;
	
	private void register() {
		userDTO.setUserid(useridTxt.getText());
		userDTO.setPassword(pwdTxt.getText());
		String message = service.add(userDTO);
		JOptionPane.showMessageDialog(this,message, "", JOptionPane.INFORMATION_MESSAGE);
	}
	private void login() {
		userDTO.setUserid(useridTxt.getText());
		userDTO.setPassword(pwdTxt.getText());
		String message = service.read(userDTO);
		JOptionPane.showMessageDialog(this,message, "", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void design() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,400);
		Container panel = this.getContentPane();
		panel.setLayout(null);
		JLabel userid = new JLabel("Enter the Userid");
		userid.setBounds(30, 40, 190,40);
		JLabel password = new JLabel("Enter the Password");
		password.setBounds(30, 90, 190,40);
		panel.add(userid);
		panel.add(password);
		useridTxt.setBounds(210,40,190,40);
		pwdTxt.setBounds(210,90,190,40);
		panel.add(useridTxt);
		panel.add(pwdTxt);
		JButton login = new JButton("Login");
		JButton register = new JButton("Register");
		panel.add(login);
		panel.add(register);
		login.setBounds(30, 270, 90, 40);
		register.setBounds(110, 270, 90, 40);
		login.addActionListener((e)->{
			login();
		});
		register.addActionListener((e)->{
			register();
		});
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		UserView userView = (UserView)ac.getBean("userView");
		userView.design();
		//UserView userView = new UserView();
	}
}
