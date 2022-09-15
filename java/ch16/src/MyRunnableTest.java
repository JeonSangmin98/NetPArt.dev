class MyRunnable implements Runnable{
	
//	@Override
//	public void run() {
//		for(int i=10; i>=0; i--) {
//			System.out.print(i + " ");
//		}
//	}
	
	// 멀티스레드
	String myName;
	public MyRunnable(String name) {
		myName = name;
	}
	@Override
	public void run() {
		for(int i=10; i>=0; i--) {
//			System.out.print(i + " ");
			System.out.print(myName + i + " ");
		}
	}
	
}
public class MyRunnableTest {
	public static void main(String[] args) {
//		Thread t = new Thread(new MyRunnable());
//		t.start();
		
		// 멀티스레드
		Thread t1 = new Thread(new MyRunnable("A"));
		Thread t2 = new Thread(new MyRunnable("B"));
		t1.start();
		t2.start();
	}
}