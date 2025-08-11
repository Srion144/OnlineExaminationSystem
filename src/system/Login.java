package system;

import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import javax.swing.*;

public class Login extends JFrame implements ActionListener{
 
    JFrame frame;
	JPasswordField passwordField;
	JTextField usernameField;
    JButton loginButton;

	Login() {

		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 255));
		frame.setBounds(100, 100, 1345, 767);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(255, 255, 255));
		desktopPane.setBounds(23, 31, 1283, 598);
		frame.getContentPane().add(desktopPane);
		
		JLabel label1 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/onlineexam.jpg")).getImage();
		label1.setIcon(new ImageIcon(img));
		label1.setBounds(0, 10, 809, 588);
		desktopPane.add(label1);
		
		JLabel label2 = new JLabel(" Online Examination System");
		label2.setFont(new Font("Times New Roman", Font.BOLD, 36));
		label2.setBounds(819, 28, 442, 77);
		desktopPane.add(label2);
		
		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setForeground(new Color(0, 0, 0));
		desktopPane_1.setBackground(new Color(255, 250, 244));
		desktopPane_1.setBounds(819, 115, 442, 375);
		desktopPane.add(desktopPane_1);
		
		JLabel usernameLabel = new JLabel("Username :");
		usernameLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		usernameLabel.setBounds(34, 34, 220, 35);
		desktopPane_1.add(usernameLabel);
		
		JLabel passwordLabel = new JLabel("Password :");
		passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		passwordLabel.setBounds(34, 148, 220, 35);
		desktopPane_1.add(passwordLabel);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passwordField.setBounds(34, 193, 387, 46);
		desktopPane_1.add(passwordField);
		
		JButton loginButton = new JButton("LOGIN");
		loginButton.setBackground(new Color(0, 255, 0));
		loginButton.setForeground(new Color(0, 0, 0));
		loginButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		loginButton.setHorizontalAlignment(SwingConstants.LEFT);
		loginButton.setBounds(34, 296, 173, 46);
		loginButton.addActionListener(this);
		desktopPane_1.add(loginButton);
	

		usernameField = new JTextField();
		usernameField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		usernameField.setBounds(34, 78, 387, 46);
		desktopPane_1.add(usernameField);
		usernameField.setColumns(10);
        frame.setLocation( 100, 40);	
		frame.setVisible(true);
	}
    @Override
	public void actionPerformed(ActionEvent e) {
		String username = usernameField.getText();
		String password = new String(passwordField.getPassword());
		
		if(username.equals("srishti") && password.equals("1111")||username.equals("sneha") && password.equals("2222")||username.equals("shreya") && password.equals("3333")||username.equals("shurti") && password.equals("4444"))
		{
			setVisible(false);
			
			new Inst();
			dispose();
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Invalid username or password");

			
		}
		
	}
	
	public static void main(String[] args) {
		new Login();
	}

}
