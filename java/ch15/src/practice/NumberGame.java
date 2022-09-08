package practice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NumberGame extends JFrame implements ActionListener{
	private JPanel tp,mp,sp;
	private JLabel l1,l2;
	private JButton b1,b2;
	private JTextField tf = new JTextField(15);
	
	public NumberGame() {
		setTitle("숫자 게임");
		setSize(300,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tp = new JPanel();
		l1 = new JLabel("숫자를 추측하시오: ");
		Random random = new Random();
		int answer = random.nextInt(100);
		int n = Integer.parseInt(tf.getText());
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() == tf) {
					if(answer != n) {
						if(answer > n) {
							l2.setText("높습니다.");
						} else if(answer < n) {
							l2.setText("낮습니다.");
						} else if((answer-n) > 30) {
							l2.setText("너무 낮습니다.");
						} else if((answer-n) < n) {
							l2.setText("너무 높습니다.");
						} else if(answer == n) {
							l2.setText("정답 입니다.");
						}
					}
				}
			}
		});
		tp.add(l1);
		tp.add(tf);
		add(tp, BorderLayout.NORTH);
		
		mp = new JPanel();
		l2 = new JLabel("힌트");
		l2.setOpaque(true);
		l2.setBackground(Color.red);
		mp.add(l2);
		add(mp, BorderLayout.CENTER);
		
		sp = new JPanel();
		b1 = new JButton("다시 한번");
		b1.addActionListener(this);
		b2 = new JButton("종료");
		b2.addActionListener(this);
		sp.add(b1);
		sp.add(b2);
		add(sp, BorderLayout.SOUTH);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			tf.setText("");
		}
		
		if(e.getSource() == b2) {
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		new NumberGame();
	}
}