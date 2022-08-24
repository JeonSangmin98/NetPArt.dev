package practice;

interface controllable{
	void play();
	void stop();
}
public class Test{
	public static void main(String[] args) {
		controllable c = new controllable() {
			public void play() {
				System.out.println("재생");
			}
			public void stop() {
				System.out.println("정지");
			}
		};
		c.play();
		c.stop();
	}
}