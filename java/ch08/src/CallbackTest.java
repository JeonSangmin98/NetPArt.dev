import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;

class MyClass implements ActionListener{
	
//	void beep() {
//		System.out.println("beep");
//	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("beep");
	}
}
public class CallbackTest {
	public static void main(String[] args) {
		ActionListener listener = new MyClass();
		Timer t = new Timer(1000, listener);
		t.start();
		for(int i = 0; i < 1000; i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
			}
		}
	}
}