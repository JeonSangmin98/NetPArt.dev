public class AutoCarTest {
	public static void main(String[] args) {
		AutoCar ac = new AutoCar();
		
		ac.start();
		ac.setSpeed(30);
		ac.turn(15);
		ac.stop();
	}
}