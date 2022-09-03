import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BackgroundColorChange extends JFrame implements ActionListener{
	private JButton b1,b2;
	private JPanel p;
	
	public BackgroundColorChange() {
		setSize(300,200);
		setTitle("이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel();
		b1 = new JButton("노란색");
		b1.addActionListener(this);
		p.add(b1);
		b2 = new JButton("핑크색");
		b2.addActionListener(this);
		p.add(b2);

		add(p);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			p.setBackground(Color.yellow);
		} else if(e.getSource() == b2)
			p.setBackground(Color.pink);
	}
	
	public static void main(String[] args) {
		new BackgroundColorChange();
	}
}