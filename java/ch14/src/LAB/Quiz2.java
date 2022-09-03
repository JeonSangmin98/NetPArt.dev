package LAB;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Quiz2 extends JFrame implements ActionListener{
	private JPanel p1,p2,p3,p4;
	private JLabel l1,l2;
	private JButton b;
	private JTextField tf1,tf2,tf3;
	
	public Quiz2() {
		setTitle("이자 계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350,200);
		setLayout(new GridLayout(4,0));
		
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		
		l1 = new JLabel("월급을 입력하시오 : ");
		l2 = new JLabel("이율을 입력하시오 : ");
		tf1 = new JTextField(5);
		tf1.addActionListener(this);
		b = new JButton("변환");
		b.addActionListener(this);
		tf2 = new JTextField(5);
		tf2.addActionListener(this);
		tf3 = new JTextField(30);
		
		p1.add(l1);
		p1.add(tf1);
		p2.add(l2);
		p2.add(tf2);
		p3.add(b);
		p4.add(tf3);
		
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		float interest = Integer.parseInt(tf1.getText()) * Float.parseFloat(tf2.getText()) / 100;
		if(e.getSource() == b) {
			tf3.setText("이자는 연 "+ (int)interest +"만원입니다.");
		}
	}
	public static void main(String[] args) {
		new Quiz2();
	}
}