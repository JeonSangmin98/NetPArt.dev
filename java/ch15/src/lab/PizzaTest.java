package lab;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class PizzaFrame extends JFrame implements ActionListener{
	private JButton order_button, cancle_button;
	private JPanel down_panel;
	private JTextField text;
	
	WelcomePanel welcom_panel = new WelcomePanel();
	TypePanel TypePanel = new TypePanel();
	ToppingPanel ToppingPanel = new ToppingPanel();
	SizePanel SizePanel = new SizePanel();
	
	public PizzaFrame() {
		setSize(500,200);
		setTitle("피자 주문");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		order_button = new JButton("주문");
		order_button.addActionListener(this);
		cancle_button = new JButton("취소");
		cancle_button.addActionListener(this);
		
		text = new JTextField();
		text.setEditable(false);	// 수정 불가
		text.setColumns(6);	// 길이 6
		
		down_panel = new JPanel();
		down_panel.add(order_button);
		down_panel.add(cancle_button);
		down_panel.add(text);
		
		setLayout(new BorderLayout());
		add(welcom_panel, BorderLayout.NORTH);
		add(TypePanel, BorderLayout.WEST);
		add(ToppingPanel, BorderLayout.CENTER);
		add(SizePanel, BorderLayout.EAST);
		add(down_panel, BorderLayout.SOUTH);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == order_button) {
			text.setText("" + 20000);
		}
		if(e.getSource() == cancle_button) {
			text.setText("" + 0);
		}
	}
	
	class WelcomePanel extends JPanel{
		private JLabel message;
		
		public WelcomePanel() {
			message = new JLabel("자바 피자에 오신것을 환영합니다.");
			add(message);
		}
	}// WelcomePanel
	
	class TypePanel extends JPanel{
		private JRadioButton combo, potato, bulgogi;
		private ButtonGroup bg;
		
		public TypePanel() {
			setLayout(new GridLayout(3,1));
			
			combo = new JRadioButton("콤보", true);
			potato = new JRadioButton("포테이토");
			bulgogi = new JRadioButton("불고기");
			
			bg = new ButtonGroup();
			bg.add(combo);
			bg.add(potato);
			bg.add(bulgogi);
			
			setBorder(BorderFactory.createTitledBorder("종류"));
			
			add(combo);
			add(potato);
			add(bulgogi);
		}
	}// TypePanel
	
	class ToppingPanel extends JPanel{
		private JRadioButton pepper, cheese, pepperoni, bacon;
		private ButtonGroup bg;
		
		public ToppingPanel() {
			setLayout(new GridLayout(4,1));
			
			pepper = new JRadioButton("피망", true);
			cheese = new JRadioButton("치즈");
			pepperoni = new JRadioButton("페페로니");
			bacon = new JRadioButton("베이컨");
			
			bg = new ButtonGroup();
			bg.add(pepper);
			bg.add(cheese);
			bg.add(pepperoni);
			bg.add(bacon);
			
			setBorder(BorderFactory.createTitledBorder("추가토핑"));
			
			add(pepper);
			add(cheese);
			add(pepperoni);
			add(bacon);
		}
	}// ToppingPanel
	
	class SizePanel extends JPanel{
		private JRadioButton small, medium, large;
		private ButtonGroup bg;
		
		public SizePanel() {
			setLayout(new GridLayout(3,1));
			
			small = new JRadioButton("Small", true);
			medium = new JRadioButton("Medium");
			large = new JRadioButton("Large");
			
			bg = new ButtonGroup();
			bg.add(small);
			bg.add(medium);
			bg.add(large);
			
			setBorder(BorderFactory.createTitledBorder("크기"));
			
			add(small);
			add(medium);
			add(large);
		}
	}// SizePanel
}// PizzaFrame

public class PizzaTest {
	public static void main(String[] args) {
		new PizzaFrame();
	}
}