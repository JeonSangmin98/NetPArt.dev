import java.awt.*;
import javax.swing.*;


// FlowLayout
public class MyFrame3 extends JFrame {
	public MyFrame3() {
		setTitle("FlowLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel;
		panel = new JPanel();
		// LEADING,LEFT : 왼쪽 정렬 배치 | TRAILING,RIGHT : 오른쪽 정렬 배치 | CENTER : 가운데 배치(기본값) 
//		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		panel.add(new JButton("Button1"));
		panel.add(new JButton("Button2"));
		panel.add(new JButton("Button3"));
		panel.add(new JButton("B4"));
		panel.add(new JButton("LongButton5"));
		add(panel);
		
//		pack();
		setSize(500,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame3();
	}
}
