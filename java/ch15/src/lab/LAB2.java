package lab;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class LAB2 extends JFrame implements ActionListener{
	private JTextArea text1, text2;
	private JButton b1,b2;
	private JPanel p1,p2;
	
	public LAB2() {
		setSize(500,200);
		setTitle("텍스트 변환");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		text1 = new JTextArea(10,20);
		text2 = new JTextArea(10,20);
		text2.setEditable(false);
		p1.add(text1);
		p1.add(text2);
		add(p1);
		
		p2 = new JPanel();
		b1 = new JButton("변환");
		b2 = new JButton("취소");
		p2.add(b1);
		p2.add(b2);
		add(p2, BorderLayout.SOUTH);
		
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == b1) {
			
		}
		if(e.getSource() == b2) {
			text1.setText("");
			text2.setText("");
		}
	}
	public static void main(String[] args) {
		new LAB2();
	}
	
}