import java.awt.event.*;
import javax.swing.*;

class TextFieldFrame extends JFrame{
	private JButton button;
	private JTextField text,result;
	
	public TextFieldFrame() {
		setSize(300,130);
		setTitle("제곱 계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 리스너 객체
		ButtonListener listener = new ButtonListener();
		
		JPanel panel = new JPanel();
		panel.add(new JLabel("숫자 입력"));
		text = new JTextField(15);
		panel.add(text);
		
		panel.add(new JLabel("제곱한 값"));
		result = new JTextField(15);
		
		result.setEditable(false);
		panel.add(result);
		
		button = new JButton("OK");
		button.addActionListener(listener);
		panel.add(button);
		add(panel);
		setVisible(true);
	}// TextFieldFrame
	
	public class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button) {
				String name = text.getText();
				int value = Integer.parseInt(name);
				result.setText(""+ value * value);
				text.requestFocus();
			}
		}// actionPerformed
	}// ButtonListener
}// TextFieldFrame

public class TextFieldTest {
	public static void main(String[] args) {
		new TextFieldFrame();
	}// main
}// TextFieldTest