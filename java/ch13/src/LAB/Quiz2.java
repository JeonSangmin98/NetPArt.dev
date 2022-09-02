package LAB;

import java.awt.*;
import javax.swing.*;

public class Quiz2 extends JFrame {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		f.setSize(600,150);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("테스트 프레임");
		f.setLayout(new GridLayout(2,0));
		
		JPanel p = new JPanel();
		JPanel pa = new JPanel();
		JPanel pb = new JPanel();
		
		JLabel l = new JLabel("자바 호텔에 오신 것을 환영합니다. 숙박일수를 입력하세요.");
		pa.add(l);
		
		JButton b1 = new JButton("1명");
		JButton b2 = new JButton("2명");
		JButton b3 = new JButton("3명");
		JButton b4 = new JButton("4명");
		JButton b5 = new JButton("5명");
		
		pb.add(b1);
		pb.add(b2);
		pb.add(b3);
		pb.add(b4);
		pb.add(b5);
		p.add(pa);
		p.add(pb);
		f.add(p);
		
		f.setVisible(true);
	}
}