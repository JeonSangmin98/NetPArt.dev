import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class CheckBoxPanel extends JPanel implements ItemListener{
	
	JCheckBox[] button = new JCheckBox[3];
	String[] fruits = {"apple","grape","orange"};
	JLabel[] pictureLabel = new JLabel[3];
	ImageIcon[] icon = new ImageIcon[3];
	
	public CheckBoxPanel() {
		super(new GridLayout(0,4));	// 여기서 super는 JPanel
		
		for(int i = 0; i < 3; i++) {
			button[i] = new JCheckBox(fruits[i]);
			button[i].addItemListener(this);
			pictureLabel[i] = new JLabel(fruits[i] + ".gif");
			icon[i] = new ImageIcon(fruits[i] + ".gif");
		}// for
		
		JPanel checkPanel = new JPanel(new GridLayout(0,1));
		for(int i = 0; i < 3; i++) {
			checkPanel.add(button[i]);
		}
		
		add(checkPanel);
		add(pictureLabel[0]);
		add(pictureLabel[1]);
		add(pictureLabel[2]);
	}// CheckBoxPanel
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("checkboxDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new CheckBoxPanel());
		frame.setSize(500,200);
		frame.setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Object source = e.getItemSelectable();	// 버튼객체
		for(int i = 0; i < 3; i++) {
			if(source == button[i]) {
				if(e.getStateChange() == ItemEvent.DESELECTED) 	// 상태가 바뀌엇을때
					pictureLabel[i].setIcon(null);
				else 
					pictureLabel[i].setIcon(icon[i]);
			}
		}
	}// itemStateChanged
}