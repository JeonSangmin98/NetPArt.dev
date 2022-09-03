package LAB;

import java.awt.*;
import javax.swing.*;

public class LAB4 extends JFrame{
	JPanel p = new JPanel();
	JLabel[] labels = new JLabel[30];
	public LAB4() {
		p.setLayout(null);
		p.setBackground(Color.YELLOW);
		for(int i=0; i<labels.length; i++) {
			labels[i] = new JLabel("" + i);
			int x = (int)(Math.random()*500);
			int y = (int)(Math.random()*300);
			labels[i].setForeground(Color.MAGENTA);
			labels[i].setLocation(x,y);
			labels[i].setSize(20,20);
			p.add(labels[i]);
		}
		setTitle("난수 발생기");
		setSize(500,300);
		add(p);
		setVisible(true);
	}
	public static void main(String[] args) {
		new LAB4();
	}
}