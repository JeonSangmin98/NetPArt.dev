import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyFrame2 extends JFrame implements ActionListener{
	private JButton button;
	private JLabel label;
	
	public MyFrame2() {
		this.setSize(300,200);	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 객체");
		
		JPanel panel = new JPanel();
		button = new JButton("버튼을 누르시오!");
		label = new JLabel("아직 버튼이 눌러지지 않았습니다.");
		button.addActionListener(this);	
		panel.add(button);
		panel.add(label);
		
		this.add(panel);	
		this.setVisible(true);
	}	// MyFrame()

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			label.setText("버튼이 눌려졌습니다.2");
		}
	}
}// MyFrame