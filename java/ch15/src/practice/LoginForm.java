package practice;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginForm extends JFrame implements ActionListener{
	private JLabel mail, pwd;
	private JButton login, cancle;
	private JPanel p1,p2;
	private JTextField email,password;
	private JOptionPane alert;
	
	public LoginForm() {
		setTitle("LOGIN FORM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		
		p1 = new JPanel(new GridLayout(2,2));
		mail = new JLabel("이메일");
		email = new JTextField(10);
		pwd = new JLabel("비밀번호");
		password = new JTextField(10);
		
		p1.add(mail);
		p1.add(email);
		p1.add(pwd);
		p1.add(password);
		add(p1, BorderLayout.NORTH);
		
		p2 = new JPanel(new GridLayout());
		login = new JButton("로그인");
		cancle = new  JButton("취소");
		
		p2.add(login);
		p2.add(cancle);
		
		add(p2, BorderLayout.CENTER);
		
		pack();
		setVisible(true);
	}
	public static void main(String[] args) {
		new LoginForm();
	}
	
	private String id = "hong@google.com";
	private String pw = "1234";
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == login) {
			if(id.equals(email.getText())) {
				if(pw.equals(password.getText())) {
					JOptionPane.showMessageDialog(alert, "Logn Sucess");
				}
			}else {
				JOptionPane.showMessageDialog(alert, "Login Fail");
			}
		}
		if(e.getSource() == cancle) {
			email.setText("");
			password.setText("");
		}
	}
}