import javax.swing.JFrame;

public class FrameTest {
	public static void main(String[] args) {
		JFrame f = new JFrame("Frame Test");
		f.setSize(300,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// close버튼 눌렀을 때 전체 프로그램 종료
		f.setVisible(true);
	}
}