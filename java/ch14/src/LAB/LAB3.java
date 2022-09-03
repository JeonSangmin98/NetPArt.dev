package LAB;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LAB3 extends JFrame implements ActionListener{
	private JLabel l1,l2;
	private JPanel p;
	private int cnt = 0;
	public LAB3() {
		setSize(300,200);
		setTitle("My Counter");
		p = new JPanel();
		l1 = new JLabel("Counter");
		p.add(l1);
		l2 = new JLabel(" " + cnt);
		Font f = new Font("Times",Font.PLAIN,80);
		l2.setFont(f);
		p.add(l2);
		JButton b = new JButton("카운터 증가");
		p.add(b);
		b.addActionListener(this);
		add(p);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		cnt++;
		l2.setText(cnt+"");
	}
	public static void main(String[] args) {
		new LAB3();
	}
	
}