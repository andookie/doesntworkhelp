package JFrames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import javax.swing.*;
import java.io.*;
import javax.swing.border.Border;
import javax.swing.BorderFactory;

public class passwordManager {
	
	
	
	public static JFrame ourFrame = new JFrame("Password Manager");
	
		
	passwordManager(){
		
		
		
	
		
		ourFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ourFrame.setBounds(200, 100, 400, 300);
		
		Container container = ourFrame.getContentPane();
		container.setLayout(null);
		
		JLabel logo = new JLabel("Enter Email and Password into Boxes");
		logo.setBounds(110,5,250,30);
		
		
		JLabel email_label = new JLabel("Email :");
		email_label.setBounds(40,30,250,30);
		JLabel password_label = new JLabel("Password :");
		password_label.setBounds(20,60,250,30);
		
		JLabel savedPasswordHeading = new JLabel("Saved Passwords ");
		savedPasswordHeading.setBounds(140, 140, 250, 30);
		JLabel savedEmails = new JLabel("Emails :");
		savedEmails.setBounds(60, 180, 250, 30);
		JLabel savedPasswords = new JLabel("Passwords :");
		savedPasswords.setBounds(250, 180, 250, 30);
		
		JTextField emailText;
		emailText = new JTextField(30);
		emailText.setBounds(90,30,250,30);
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        emailText.setBorder(border);
        
        JPasswordField passwordText;
		passwordText = new JPasswordField(30);
		passwordText.setBounds(90, 61, 250, 30);
		 Border border1 = BorderFactory.createLineBorder(Color.BLACK);
	        passwordText.setBorder(border1);

		JButton savePassword = new JButton("Save Password");
		savePassword.setBounds(110, 93, 190, 30);
		
		savePassword.addActionListener(new ActionListener()
				{
			
				@Override
			public void actionPerformed(ActionEvent e)
			{
				
					  
					  
		String string = emailText.getText();
		char[] pswrd = passwordText.getPassword();
		String fileName = "emailsAndPasswords.txt";
		
		
		System.out.println("Username: ");
		System.out.println(string);
		System.out.println("Password: ");
		System.out.println(pswrd);
		
		
		
						
					  
		PrintWriter writer = null;
		
		try {
			
			FileWriter w;
		w = new FileWriter(fileName);
		writer = new PrintWriter(w);
		writer.write(string);
		writer.close();
		
		
		Component parentComponent = null;
		JOptionPane.showMessageDialog(parentComponent, "Password Saved!");
		
		
		} catch (FileNotFoundException error1) {
			error1.printStackTrace();
		} catch (IOException error1) {
			error1.printStackTrace();
			
	
		PrintWriter writer2 = null;
		try {
		FileWriter wasd;
		wasd = new FileWriter(fileName);
		writer2 = new PrintWriter(wasd);
		writer2.write(pswrd);
		writer2.close();
		

				

		} catch (FileNotFoundException error) {
			error.printStackTrace();
		} catch (IOException error) {
			error.printStackTrace();
			}
		}
			container.add(logo);
			container.add(email_label);
			container.add(password_label);
			container.add(emailText);
			container.add(passwordText);
			container.add(savedPasswordHeading);
			container.add(savedEmails);
			container.add(savedPasswords);
			container.add(savePassword);
			
		
			
			
			
		};
		});
	
			}}