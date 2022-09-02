import javax.swing.*;

// LAB2 sol
public class PizzaFrame extends JFrame {
	public PizzaFrame() {
		setSize(600,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("피자 주문하기");
		
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		
		JLabel label1 = new JLabel("자바 피자에 오신것을 환영합니다. 피자의 종류를 선택하시오.");
		panelA.add(label1);
		
		JButton button1 = new JButton("콤보 피자");
		JButton button2 = new JButton("포테이토 피자");
		JButton button3 = new JButton("불고기 피자");
		
		
		JLabel label2 = new JLabel("개수");
		JTextField field = new JTextField(10);
		panelB.add(button1);
		panelB.add(button2);
		panelB.add(button3);
		panelB.add(label2);
		panelB.add(field);
		// 패널에 패널A,B 추가
		panel.add(panelA);
		panel.add(panelB);
		// 프레임에 패널 추가
		add(panel);
		setVisible(true);
	}
}
