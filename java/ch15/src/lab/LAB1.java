package lab;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;


// PizzaTest
public class LAB1 extends JFrame implements ActionListener{
	private JPanel tp,wp,ep,cp,bp;
	private JLabel l;
	private JButton b1,b2;
	private JRadioButton combo,potato,bulgogi,pepper,cheese,pepperoni,bacon,small,medium,large;
	
	public LAB1() {
		setTitle("피자 주문");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tp = new JPanel();
		l = new JLabel("자바 피자에 오신것을 환영합니다.");
		tp.add(l);
		add(tp, BorderLayout.NORTH);
		
		wp = new JPanel(new GridLayout(3,0));
		combo = new JRadioButton("콤보");
		potato = new JRadioButton("포테이토");
		bulgogi = new JRadioButton("불고기");
		
		wp.add(combo);
		wp.add(potato);
		wp.add(bulgogi);
		Border border1 = BorderFactory.createTitledBorder("종류");
		wp.setBorder(border1);
		add(wp, BorderLayout.WEST);
		
		cp = new JPanel(new GridLayout(4,0));
		pepper = new JRadioButton("피망");
		cheese = new JRadioButton("치즈");
		pepperoni = new JRadioButton("페페로니");
		bacon = new JRadioButton("베이컨");
		cp.add(pepper);
		cp.add(cheese);
		cp.add(pepperoni);
		cp.add(bacon);
		Border border2 = BorderFactory.createTitledBorder("추가토핑");
		cp.setBorder(border2);
		add(cp, BorderLayout.CENTER);
		
		ep = new JPanel(new GridLayout(3,0));
		small = new JRadioButton("Small");
		medium = new JRadioButton("Medium");
		large = new JRadioButton("Large");
		ep.add(small);
		ep.add(medium);
		ep.add(large);
		Border border3 = BorderFactory.createTitledBorder("크기");
		ep.setBorder(border3);
		add(ep, BorderLayout.EAST);
		
		bp = new JPanel();
		b1 = new JButton("주문");
		b2 = new JButton("취소");
		
		setSize(500,200);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	public static void main(String[] args) {
		new LAB1();
	}
}