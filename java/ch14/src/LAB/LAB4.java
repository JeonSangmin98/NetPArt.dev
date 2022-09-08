package LAB;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LAB4 extends JFrame{
	JLabel l1,l2;
	JButton b;
	JTextField tf1,tf2;
	
	public LAB4(){
		JPanel p = new JPanel();
		add(p);
		
		l1 = new JLabel("화씨온도");
		l2 = new JLabel("섭씨온도");
		b = new JButton("변환");
		tf1 = new JTextField(15);
		tf2 = new JTextField(15);
		
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String num1 = tf1.getText();
				int f1 = Integer.parseInt(num1);
				double c1 = 5 / 9.0 * (f1 - 32);
//				tf2.setText(c + "");
				DecimalFormat format1 = new DecimalFormat("#.##");
				tf2.setText(format1.format(c1) + "");
				
				String num2 = tf2.getText();
				int f2 = Integer.parseInt(num2);
				double c2 = f2 * 1.8 + 32;
				DecimalFormat format2 = new DecimalFormat("#.##");
				tf1.setText(format2.format(c2) + "");
			}
		});
		
		p.add(l1);
		p.add(tf1);
		p.add(l2);
		p.add(tf2);
		p.add(b);
		setSize(250,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("온도변환기");
		setVisible(true);
		
	}
	public static void main(String[] args) throws NumberFormatException{
		new LAB4();
	}
}