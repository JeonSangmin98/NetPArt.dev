import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
class MyPanel1  extends JPanel implements ActionListener{
	private int light_number = 0;
	
	public MyPanel1(){
		setLayout(new BorderLayout());
		JButton b = new JButton("Traffic light Turn On");
		b.addActionListener(this);
		add(b,BorderLayout.SOUTH);
	}// MyPanel1()

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.black);
		g.drawOval(100, 100, 100, 100);
		g.drawOval(100, 200, 100, 100);
		g.drawOval(100, 300, 100, 100);
		if(light_number == 0) {
			g.setColor(Color.red);
			g.fillOval(100, 100, 100, 100);
		}else if(light_number == 1) {
			g.setColor(Color.green);
			g.fillOval(100, 200, 100, 100);
		}else {
			g.setColor(Color.yellow);
			g.fillOval(100, 300, 100, 100);
		}
	}// paintComponent

	@Override
	public void actionPerformed(ActionEvent e) {
//		if(e.getSource() == b) {
//			light_number++;
//			if(light_number == 3)
//				light_number = 0;
//		} 
		if(++light_number >= 3) {
			light_number = 0;
		} 
		repaint();
	}// actionPerformed
}// MyPanel2
public class TrafficLightTest extends JFrame{
	public TrafficLightTest() {
		add(new MyPanel1());
		setTitle("신호등");
		setSize(300,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TrafficLightTest();
	}
}