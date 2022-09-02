package LAB;

import javax.swing.*;

public class Quiz extends JFrame {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500,100);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		JLabel l = new JLabel("자바는 재미있나요?");
		JButton b1 = new JButton("Yes");
		JButton b2 = new JButton("No");
		p.add(l);
		p.add(b1);
		p.add(b2);
		f.add(p);
		
		f.setVisible(true);
	}
}