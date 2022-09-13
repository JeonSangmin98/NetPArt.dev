import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaFrame extends JFrame implements ActionListener{

	private JTextField textField;
	private JTextArea textArea;
	
	public TextAreaFrame() {
		setTitle("TextArea Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField(30);
		textField.addActionListener(this);
		
		textArea = new JTextArea(10,30);
		textArea.setEditable(false);	// 수정 불가능
		JScrollPane scrollPane = new JScrollPane(textArea);		// 스크롤바를 생
		
		add(textField, BorderLayout.NORTH);
		add(textArea, BorderLayout.CENTER);
		
		pack();
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String text =  textField.getText();
		textArea.append(text + "\n");	// text를 textArea에 추가
		textField.selectAll();			// 입력하고 전체 선택
//		textArea.setCaretPosition(textField.getDocument().getLength());		// 맨아래로 스크롤한다
	}
	public static void main(String[] args) {
		new TextAreaFrame();
	}
}