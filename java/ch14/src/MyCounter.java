import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyCounter extends JFrame implements ActionListener{
	JLabel label1, label2;
	private int count = 0;
	JButton button1 = new JButton("카운터 증가");
	JButton button2 = new JButton("카운터 감소");
	
	public MyCounter() {
		JPanel panel = new JPanel();
		label1 = new JLabel("Counter");
		panel.add(label1);
		label2 = new JLabel("" + count);	// "1" 같은 형식
		
		label2.setFont(new Font("serif", Font.BOLD|Font.ITALIC, 100));
		panel.add(label2);
		button1.addActionListener(this);
		button2.addActionListener(this);
		panel.add(button1);
		panel.add(button2);
		add(panel);
		setSize(400,200);
		setTitle("My Counter");
		setVisible(true);
	}// end MyCounter
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {
			count++;
			label2.setText(count + "");
		}
		if(e.getSource() == button2) {
			count--;
			label2.setText(count + "");
		}
	}
	public static void main(String[] args) {
		new MyCounter();
	}
 }