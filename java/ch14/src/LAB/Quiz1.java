package LAB;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Quiz1 extends JFrame implements ActionListener{
	private JPanel p1,p2,p3;
	private JLabel l;
	private JButton b;
	private JTextField tf1,tf2;
	
	public Quiz1() {
		setTitle("마일을 킬로미터로 변환");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350,150);
		
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		l = new JLabel("거리를 마일 단위로 입력하시오 : ");
		tf1 = new JTextField(5);
		tf1.addActionListener(this);
		b = new JButton("변환");
		b.addActionListener(this);
		tf2 = new JTextField(30);
		
		p1.add(l);
		p1.add(tf1);
		p2.add(b);
		p3.add(tf2);
		
		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.CENTER);
		add(p3,BorderLayout.SOUTH);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		double km = 1.60934;
		if(e.getSource() == b) {
			double mile = Double.parseDouble(tf1.getText()) * km;
			tf2.setText(tf1.getText()+"마일 은 " + mile + "킬로미터 입니다.");
		}
	}
	public static void main(String[] args) {
		new Quiz1();
	}
	
}