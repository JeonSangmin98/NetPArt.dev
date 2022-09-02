package LAB;

import javax.swing.*;

public class LAB1 extends JFrame{
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		JLabel l1 = new JLabel("화씨 온도");
		JLabel l2 = new JLabel("섭씨 온도");
		JTextField tf1 = new JTextField(15);
		JTextField tf2 = new JTextField(15);
		JButton b = new JButton("변환");
		
		f.add(p);
		p.add(l1);
		p.add(tf1);
		p.add(l2);
		p.add(tf2);
		p.add(b);
		
		f.setSize(250, 150);
		f.setTitle("온도 변환기");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}