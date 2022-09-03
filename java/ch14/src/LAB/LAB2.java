package LAB;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LAB2 extends JFrame implements ActionListener{
	static final int ROCK = 0;
	static final int PAPER = 1;
	static final int SCISSOR = 2;
	
	private JPanel p;
	private JTextField output,infomation;
	private JButton rock,paper,scissor;
	
	public LAB2() {
		setTitle("가위 바위 보");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p = new JPanel();
		p.setLayout(new GridLayout(0,3));
		infomation = new JTextField("아래의 버튼중에서 하나를 클릭 하시오!");
		output = new JTextField(20);
		
		rock = new JButton("ROCK");
		rock.addActionListener(this);
		p.add(rock);
		paper = new JButton("PAPER");
		paper.addActionListener(this);
		p.add(paper);
		scissor = new JButton("SCISSOR");
		scissor.addActionListener(this);
		p.add(scissor);
		
		add(infomation, BorderLayout.NORTH);
		add(p, BorderLayout.CENTER);
		add(output, BorderLayout.SOUTH);
		setVisible(true);
	} //LAB2
	
	public void actionPerformed(ActionEvent e) {
		int n = (int)(Math.random()*3);
		if(e.getSource() == rock) {
			if(n == ROCK)
				output.setText("DRAW");
			else if(n == PAPER)
				output.setText("COMPUTER WIN");
			else
				output.setText("USER WIN");
		} else if(e.getSource() == paper) {
			if(n == ROCK)
				output.setText("USER WIN");
			else if(n == PAPER)
				output.setText("DRAW");
			else
				output.setText("COMPUTER WIN");
		} else {
			if(n == ROCK)
				output.setText("COMPUTER WIN");
			else if(n == PAPER)
				output.setText("USER WIN");
			else
				output.setText("DRAW");
		}
	} //actionPerformed
	
	public static void main(String[] args) {
		new LAB2();
	}
}