import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageLableTest extends JFrame implements ActionListener{
	private JPanel panel;
	private JLabel label;
	private JButton button;
	
	public ImageLableTest() {
		setTitle("이미지 레이블");
		setSize(300,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		label = new JLabel("이미지를 보려면 아래 버튼을 누르시오.");
		button  = new JButton("이미지 레이블");
		ImageIcon icon = new ImageIcon("icon.gif");
		button.setIcon(icon);
		button.addActionListener(this);
		panel.add(label);
		panel.add(button);
		add(panel);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ImageLableTest();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		ImageIcon icon = new ImageIcon("dog.gif");
		label.setIcon(icon);
		label.setText(null);
	}
}
