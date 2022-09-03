package LAB;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Quiz4 extends JFrame{
	private JLabel label = new JLabel("Don't cry before you are hurt.");
	
	Quiz4(){
		label.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				label.setText("다치기도 전에 울지 말라");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				label.setText("Don't cry before you are hurt.");
			}
		});
		Font f = new Font("Times",Font.ITALIC,80);
		label.setFont(f);
		label.setHorizontalAlignment(JLabel.CENTER);
		setSize(1100,300);
		add(label,BorderLayout.CENTER);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Quiz4();
	}
}