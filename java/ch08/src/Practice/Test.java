package Practice;

interface Controllable{
	void play();
	void stop();
}
class VideoPlayer implements Controllable{

	@Override
	public void play() {
		System.out.println("재생");
	}

	@Override
	public void stop() {
		System.out.println("정지");
	}
	
}
public class Test {
	public static void main(String[] args) {
		VideoPlayer vp = new VideoPlayer();
		vp.play();
		vp.stop();
	}
}