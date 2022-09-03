package LAB;

import java.awt.*;
import javax.swing.*;

public class LAB3 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JPanel p1 = new JPanel();
		f.add(p1);
		
		JPanel p2 = new JPanel();
		p1.add(p2,BorderLayout.CENTER);
		
		JTextField tf = new JTextField(50);
		p2.add(tf);
		
		JPanel p3 = new JPanel(new GridLayout(5,5,5,5));
		f.add(p3,BorderLayout.SOUTH);
		
		String[] list = {"BackSpace","","","CE","C","7","8","9","/","sqrt","4",
			"5","6","x","%","1","2","3","-","1/x","0","+/-",".","+","="};
	
		for(String ele : list) {
			p3.add(new JButton(ele));
		}
		
		f.pack();
		f.setVisible(true);
	}
}
