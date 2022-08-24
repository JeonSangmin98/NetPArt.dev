import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;

class MyClass implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("beep");
	}
}
public class CallbackTest {
	public static void main(String[] args) {
		ActionListener listener = new MyClass();
		Timer t = new Timer(1000, listener);
		
		Timer t2 = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("beep");
			}
		});
		
		// 함수를 객체처럼 취급
		Timer t3 = new Timer(1000, e->System.out.println("beep"));	// 매개변수 중괄호 생략 가능
		t.start();
		for(int i = 0; i < 1000; i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
			}
		}
	}
}