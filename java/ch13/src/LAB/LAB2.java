package LAB;

import java.awt.*;
import javax.swing.*;

public class LAB2 extends JFrame{
	public LAB2() {
		setSize(600,200);
		setTitle("피자 주문하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,1));
		JPanel p = new JPanel();
		JPanel ap = new JPanel();
		JPanel bp = new JPanel();
		JLabel l1 = new JLabel("자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하시오.");
		JLabel l2 = new JLabel("개수");
		JButton b1 = new JButton("콤보 피자");
		JButton b2 = new JButton("포테이토 피자");
		JButton b3 = new JButton("불고기 피자");
		JTextField tf = new JTextField(10);
		
		add(p);
		p.add(ap);
		ap.add(l1);
		p.add(bp);
		bp.add(b1);
		bp.add(b2);
		bp.add(b3);
		bp.add(l2);
		bp.add(tf);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new LAB2();
	}
}