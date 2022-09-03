package LAB;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Quiz3 extends JFrame implements ActionListener{
	private JPanel p1,p2;
	private JButton b1,b2;
	static int x = 230, y = 100;
	
	class MyPanel extends JPanel{
		MyPanel(){
			addKeyListener(new KeyListener() {
				@Override
				public void keyPressed(KeyEvent e) {
					int keycode = e.getKeyCode();
					switch(keycode) {
					case KeyEvent.VK_UP : y -= 10; break;
						
					case KeyEvent.VK_DOWN : y += 10; break;
						
					case KeyEvent.VK_LEFT : x -= 10; break;
						
					case KeyEvent.VK_RIGHT : x += 10; break;
					}
					repaint();
				}

				@Override
				public void keyTyped(KeyEvent e) {
					
				}

				@Override
				public void keyReleased(KeyEvent e) {
					
				}
			});
			requestFocus();	// 키보드 포거스 요청
			setFocusable(true);	
		}// MyPanel()

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.fillRect(x, y, 40, 100);
		}
	}
	public Quiz3() {
		setTitle("박스 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,400);
		p1 = new JPanel();
		p1.setBackground(Color.yellow);
		p2 = new JPanel();
		b1 = new JButton("왼쪽으로 이동");
		b1.addActionListener(this);
		b2 = new JButton("오른쪽으로 이동");
		b2.addActionListener(this);
		p2.add(b1);
		p2.add(b2);
		add(p1,BorderLayout.CENTER);
		add(p2,BorderLayout.SOUTH);
		add(new MyPanel());
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			x -= 10;
			repaint();
		} 
		if(e.getSource() == b2) {
			x += 10;
			repaint();
		}
	}
	public static void main(String[] args) {
		new Quiz3();
		
	}
}