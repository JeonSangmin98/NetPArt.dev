public class SportsCarTest {
	public static void main(String[] args) {
		SportsCar obj = new SportsCar();
		// 부모클래스 필드,메소드
		obj.speed = 10;
		obj.setSpeed(60);
		// 자식클래스
		obj.setTurbo(true);
	}
}