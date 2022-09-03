package LAB;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LAB1 extends JFrame implements ActionListener{
	private JPanel p;
	private JTextField tf;
	
	public LAB1() {
		tf = new JTextField(30);
		add(tf, BorderLayout.NORTH);
		p = new JPanel();
		p.setLayout(new GridLayout(0,3));
		add(p, BorderLayout.CENTER);
		
		for(int i=1;i<=9;i++) {
			JButton b = new JButton("" + i);
			b.addActionListener(this);
			b.setPreferredSize(new Dimension(100,100));
			p.add(b);
		}
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String ac = e.getActionCommand();
		tf.setText(tf.getText() + ac);
	}
	public static void main(String[] args) {
		new LAB1();
	}

	
}