
public class ThreadTest {

	public static void main(String[] args) {
		// 람다식, Runnable 에는 run() 하나 밖에 없기 때문에 간단히 작성 가능
		Runnable task = () -> {
			for(int i=10; i>=0; i--) 
				System.out.print(i + " ");
		};
		
		new Thread(task).start();
	}
}